package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.rr;
public abstract class g3 extends FrameLayout {
    public boolean f20328a;
    public final e3 f20329b;
    public final int f20330c;
    public boolean d;
    public int e;
    public boolean f20331f;
    public boolean h;
    public boolean f20332n;
    public final org.telegram.ui.Components.h5 f20333r;
    public int f20334s;
    public final org.telegram.ui.Components.o6 v;
    public boolean f20335w;

    public g3(Context context, aw0 aw0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = -1;
        this.f20332n = true;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, true, true, false);
        this.v = o6Var;
        o6Var.k(0.2f, 160L, rr.h);
        o6Var.t(AndroidUtilities.dp(15.33f));
        o6Var.f26930b = 5;
        this.f20330c = i10;
        e3 e3Var = new e3(this, context, aw0Var, d6Var, z10);
        this.f20329b = e3Var;
        cu editText = e3Var.getEditText();
        editText.setDelegate(new n7.z0(this, editText, false, 3));
        e3Var.setWillNotDraw(false);
        this.f20333r = new org.telegram.ui.Components.h5(e3Var);
        o6Var.setCallback(e3Var);
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
        editText.addTextChangedListener(new f3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.r2(this, 1));
        addView(e3Var, w7.y5.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.q5.g();
    }

    public final void c() {
        int i10;
        e3 e3Var = this.f20329b;
        if (e3Var != null && e3Var.getEditText() != null) {
            this.f20334s = this.f20330c - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f20331f || this.h) && ((i10 = this.e) == -1 || this.f20334s <= i10))) {
                str = "" + this.f20334s;
            }
            this.v.q(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f20329b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f20335w) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f19181k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f20335w = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f20329b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f20331f = z10;
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
        this.f20328a = true;
        e3 e3Var = this.f20329b;
        e3Var.setText(charSequence);
        e3Var.setSelection(e3Var.getText().length());
        this.f20328a = false;
    }

    public void b() {
    }
}
