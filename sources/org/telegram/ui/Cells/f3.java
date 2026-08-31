package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.xt;
public abstract class f3 extends FrameLayout {
    public boolean f22792a;
    public final d3 f22793b;
    public final int f22794c;
    public boolean d;
    public int f22795e;
    public boolean f22796f;
    public boolean h;
    public boolean f22797n;
    public final org.telegram.ui.Components.c5 f22798r;
    public int f22799s;
    public final org.telegram.ui.Components.j6 v;
    public boolean f22800w;

    public f3(Context context, qv0 qv0Var, String str, boolean z4, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22795e = -1;
        this.f22797n = true;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.v = j6Var;
        j6Var.k(0.2f, 160L, pr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.f28029b = 5;
        this.f22794c = i10;
        d3 d3Var = new d3(this, context, qv0Var, g6Var, z4);
        this.f22793b = d3Var;
        xt editText = d3Var.getEditText();
        editText.setDelegate(new n7.qa(this, editText, false, 10));
        d3Var.setWillNotDraw(false);
        this.f22798r = new org.telegram.ui.Components.c5(d3Var);
        j6Var.setCallback(d3Var);
        editText.setTextSize(1, 17.0f);
        editText.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H6, g6Var));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        editText.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        editText.setBackground(null);
        if (z4) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), AndroidUtilities.dp(0.0f), editText.getPaddingBottom());
        editText.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        editText.setInputType((z4 ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        editText.setCursorColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new e3(this, i10, editText, z4));
        editText.setOnFocusChangeListener(new m.r2(this, 1));
        addView(d3Var, k7.c6.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.l5.g();
    }

    public final void c() {
        int i10;
        d3 d3Var = this.f22793b;
        if (d3Var != null && d3Var.getEditText() != null) {
            this.f22799s = this.f22794c - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f22796f || this.h) && ((i10 = this.f22795e) == -1 || this.f22799s <= i10))) {
                str = "" + this.f22799s;
            }
            this.v.q(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f22793b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f22800w) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21779k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z4) {
        this.f22800w = z4;
        setWillNotDraw(!z4);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f22793b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z4) {
        this.f22796f = z4;
    }

    public void setShowLimitWhenEmpty(boolean z4) {
        this.d = z4;
        if (z4) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.f22795e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f22792a = true;
        d3 d3Var = this.f22793b;
        d3Var.setText(charSequence);
        d3Var.setSelection(d3Var.getText().length());
        this.f22792a = false;
    }

    public void b() {
    }
}
