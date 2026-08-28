package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.xu0;
public abstract class g3 extends FrameLayout {
    public boolean f24372a;
    public final d3 f24373b;
    public final int f24374c;
    public boolean d;
    public int f24375e;
    public boolean f24376f;
    public boolean h;
    public boolean f24377n;
    public final org.telegram.ui.Components.b5 f24378r;
    public int f24379s;
    public final org.telegram.ui.Components.i6 v;
    public boolean f24380w;

    public g3(Context context, xu0 xu0Var, String str, boolean z10, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f24375e = -1;
        this.f24377n = true;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.v = i6Var;
        i6Var.k(0.2f, 160L, gr.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.f29333b = 5;
        this.f24374c = i9;
        d3 d3Var = new d3(this, context, xu0Var, b6Var, z10);
        this.f24373b = d3Var;
        mt editText = d3Var.getEditText();
        editText.setDelegate(new e3(0, this, editText));
        d3Var.setWillNotDraw(false);
        this.f24378r = new org.telegram.ui.Components.b5(d3Var);
        i6Var.setCallback(d3Var);
        editText.setTextSize(1, 17.0f);
        editText.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H6, b6Var));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        editText.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
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
        editText.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new f3(this, i9, editText, z10));
        editText.setOnFocusChangeListener(new m.s2(this, 1));
        addView(d3Var, g7.e6.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.k5.g();
    }

    public final void c() {
        int i9;
        d3 d3Var = this.f24373b;
        if (d3Var != null && d3Var.getEditText() != null) {
            this.f24379s = this.f24374c - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f24376f || this.h) && ((i9 = this.f24375e) == -1 || this.f24379s <= i9))) {
                str = "" + this.f24379s;
            }
            this.v.q(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f24373b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        super.onDraw(canvas);
        if (this.f24380w) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(22.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(22.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }

    public void setDivider(boolean z10) {
        this.f24380w = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i9) {
        this.f24373b.setEmojiViewCacheType(i9);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f24376f = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.d = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i9) {
        this.f24375e = i9;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f24372a = true;
        d3 d3Var = this.f24373b;
        d3Var.setText(charSequence);
        d3Var.setSelection(d3Var.getText().length());
        this.f24372a = false;
    }

    public void b() {
    }
}
