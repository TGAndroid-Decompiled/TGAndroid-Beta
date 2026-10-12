package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.yw0;
public abstract class g3 extends FrameLayout {
    public boolean f21886a;
    public final e3 f21887b;
    public final int f21888c;
    public boolean d;
    public int f21889e;
    public boolean f21890f;
    public boolean h;
    public boolean f21891n;
    public final org.telegram.ui.Components.j5 f21892r;
    public int f21893s;
    public final org.telegram.ui.Components.q6 v;
    public boolean f21894w;

    public g3(Context context, yw0 yw0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f21889e = -1;
        this.f21891n = true;
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, true, true);
        this.v = q6Var;
        q6Var.n(0.2f, 160L, js.h);
        q6Var.w(AndroidUtilities.dp(15.33f));
        q6Var.f29690b = 5;
        this.f21888c = i10;
        e3 e3Var = new e3(this, context, yw0Var, c6Var, z10);
        this.f21887b = e3Var;
        uu editText = e3Var.getEditText();
        editText.setDelegate(new n7.z0(this, editText, false, 3));
        e3Var.setWillNotDraw(false);
        this.f21892r = new org.telegram.ui.Components.j5(e3Var);
        q6Var.setCallback(e3Var);
        editText.setTextSize(1, 17.0f);
        editText.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, c6Var));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        editText.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
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
        editText.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new f3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.s2(this, 1));
        addView(e3Var, w7.w5.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.s5.g();
    }

    public final void c() {
        int i10;
        e3 e3Var = this.f21887b;
        if (e3Var != null && e3Var.getEditText() != null) {
            this.f21893s = this.f21888c - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f21890f || this.h) && ((i10 = this.f21889e) == -1 || this.f21893s <= i10))) {
                str = "" + this.f21893s;
            }
            this.v.t(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f21887b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f21894w) {
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f20682k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f21894w = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f21887b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f21890f = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.d = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.f21889e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f21886a = true;
        e3 e3Var = this.f21887b;
        e3Var.setText(charSequence);
        e3Var.setSelection(e3Var.getText().length());
        this.f21886a = false;
    }

    public void b() {
    }
}
