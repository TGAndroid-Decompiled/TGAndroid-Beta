package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.ow0;
public abstract class g3 extends FrameLayout {
    public boolean f20904a;
    public final e3 f20905b;
    public final int f20906c;
    public boolean d;
    public int e;
    public boolean f20907f;
    public boolean h;
    public boolean f20908n;
    public final org.telegram.ui.Components.j5 f20909r;
    public int f20910s;
    public final org.telegram.ui.Components.r6 v;
    public boolean f20911w;

    public g3(Context context, ow0 ow0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = -1;
        this.f20908n = true;
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.v = r6Var;
        r6Var.n(0.2f, 160L, es.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.f28435b = 5;
        this.f20906c = i10;
        e3 e3Var = new e3(this, context, ow0Var, c6Var, z10);
        this.f20905b = e3Var;
        nu editText = e3Var.getEditText();
        editText.setDelegate(new m2.t(this, editText, false, 11));
        e3Var.setWillNotDraw(false);
        this.f20909r = new org.telegram.ui.Components.j5(e3Var);
        r6Var.setCallback(e3Var);
        editText.setTextSize(1, 17.0f);
        editText.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.H6, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        editText.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
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
        editText.setCursorColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new f3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.t2(this, 1));
        addView(e3Var, w7.z5.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.s5.g();
    }

    public final void c() {
        int i10;
        e3 e3Var = this.f20905b;
        if (e3Var != null && e3Var.getEditText() != null) {
            this.f20910s = this.f20906c - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f20907f || this.h) && ((i10 = this.e) == -1 || this.f20910s <= i10))) {
                str = "" + this.f20910s;
            }
            this.v.t(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f20905b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f20911w) {
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f19722k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f20911w = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f20905b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f20907f = z10;
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
        this.f20904a = true;
        e3 e3Var = this.f20905b;
        e3Var.setText(charSequence);
        e3Var.setSelection(e3Var.getText().length());
        this.f20904a = false;
    }

    public void b() {
    }
}
