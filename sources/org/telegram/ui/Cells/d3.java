package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.st;
public abstract class d3 extends FrameLayout {
    public boolean f24217a;
    public final b3 f24218b;
    public final int f24219c;
    public boolean d;
    public int f24220e;
    public boolean f24221f;
    public boolean h;
    public boolean f24222n;
    public final org.telegram.ui.Components.f5 f24223r;
    public int f24224s;
    public final org.telegram.ui.Components.n6 v;
    public boolean f24225w;

    public d3(Context context, hv0 hv0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24220e = -1;
        this.f24222n = true;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.v = n6Var;
        n6Var.k(0.2f, 160L, jr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.f30862b = 5;
        this.f24219c = i10;
        b3 b3Var = new b3(this, context, hv0Var, c6Var, z10);
        this.f24218b = b3Var;
        st editText = b3Var.getEditText();
        editText.setDelegate(new oc.i(this, editText, false, 3));
        b3Var.setWillNotDraw(false);
        this.f24223r = new org.telegram.ui.Components.f5(b3Var);
        n6Var.setCallback(b3Var);
        editText.setTextSize(1, 17.0f);
        editText.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        editText.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
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
        editText.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new c3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.s2(this, 1));
        addView(b3Var, i7.f6.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.p5.g();
    }

    public final void c() {
        int i10;
        b3 b3Var = this.f24218b;
        if (b3Var != null && b3Var.getEditText() != null) {
            this.f24224s = this.f24219c - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f24221f || this.h) && ((i10 = this.f24220e) == -1 || this.f24224s <= i10))) {
                str = "" + this.f24224s;
            }
            this.v.q(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f24218b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f24225w) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f24225w = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f24218b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f24221f = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.d = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.f24220e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f24217a = true;
        b3 b3Var = this.f24218b;
        b3Var.setText(charSequence);
        b3Var.setSelection(b3Var.getText().length());
        this.f24217a = false;
    }

    public void b() {
    }
}
