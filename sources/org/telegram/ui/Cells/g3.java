package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.tr;
public abstract class g3 extends FrameLayout {
    public boolean f22135a;
    public final e3 f22136b;
    public final int f22137c;
    public boolean d;
    public int f22138e;
    public boolean f22139f;
    public boolean h;
    public boolean f22140n;
    public final org.telegram.ui.Components.h5 f22141r;
    public int f22142s;
    public final org.telegram.ui.Components.o6 v;
    public boolean f22143w;

    public g3(Context context, mw0 mw0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f22138e = -1;
        this.f22140n = true;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, true, true, false);
        this.v = o6Var;
        o6Var.k(0.2f, 160L, tr.h);
        o6Var.t(AndroidUtilities.dp(15.33f));
        o6Var.f29354b = 5;
        this.f22137c = i10;
        e3 e3Var = new e3(this, context, mw0Var, d6Var, z10);
        this.f22136b = e3Var;
        eu editText = e3Var.getEditText();
        editText.setDelegate(new n7.z0(this, editText, false, 3));
        e3Var.setWillNotDraw(false);
        this.f22141r = new org.telegram.ui.Components.h5(e3Var);
        o6Var.setCallback(e3Var);
        editText.setTextSize(1, 17.0f);
        editText.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H6, d6Var));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        editText.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
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
        editText.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new f3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.r2(this, 1));
        addView(e3Var, w7.z5.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.q5.g();
    }

    public final void c() {
        int i10;
        e3 e3Var = this.f22136b;
        if (e3Var != null && e3Var.getEditText() != null) {
            this.f22142s = this.f22137c - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f22139f || this.h) && ((i10 = this.f22138e) == -1 || this.f22142s <= i10))) {
                str = "" + this.f22142s;
            }
            this.v.q(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f22136b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f22143w) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20950k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f22143w = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f22136b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f22139f = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.d = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.f22138e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f22135a = true;
        e3 e3Var = this.f22136b;
        e3Var.setText(charSequence);
        e3Var.setSelection(e3Var.getText().length());
        this.f22135a = false;
    }

    public void b() {
    }
}
