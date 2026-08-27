package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.zu0;

public abstract class d3 extends FrameLayout {

    public boolean f24195a;

    public final b3 f24196b;

    public final int f24197c;
    public boolean d;

    public int f24198e;

    public boolean f24199f;
    public boolean h;

    public boolean f24200n;

    public final org.telegram.ui.Components.b5 f24201r;

    public int f24202s;
    public final org.telegram.ui.Components.i6 v;

    public boolean f24203w;

    public d3(Context context, zu0 zu0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24198e = -1;
        this.f24200n = true;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.v = i6Var;
        i6Var.k(0.2f, 160L, er.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.f29239b = 5;
        this.f24197c = i10;
        b3 b3Var = new b3(this, context, zu0Var, c6Var, z10);
        this.f24196b = b3Var;
        lt editText = b3Var.getEditText();
        editText.setDelegate(new org.telegram.ui.i6(1, this, editText));
        b3Var.setWillNotDraw(false);
        this.f24201r = new org.telegram.ui.Components.b5(b3Var);
        i6Var.setCallback(b3Var);
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
        addView(b3Var, h7.z5.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.k5.g();
    }

    public final void c() {
        int i10;
        b3 b3Var = this.f24196b;
        if (b3Var == null || b3Var.getEditText() == null) {
            return;
        }
        this.f24202s = this.f24197c - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f24199f || this.h) && ((i10 = this.f24198e) == -1 || this.f24202s <= i10))) {
            str = "" + this.f24202s;
        }
        this.v.q(str, true, true);
    }

    public CharSequence getText() {
        return this.f24196b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f24203w) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f24203w = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f24196b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f24199f = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.d = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.f24198e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f24195a = true;
        b3 b3Var = this.f24196b;
        b3Var.setText(charSequence);
        b3Var.setSelection(b3Var.getText().length());
        this.f24195a = false;
    }

    public void b() {
    }
}
