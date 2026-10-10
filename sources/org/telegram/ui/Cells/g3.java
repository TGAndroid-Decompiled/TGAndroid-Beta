package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.tw0;
public abstract class g3 extends FrameLayout {
    public boolean f22117a;
    public final e3 f22118b;
    public final int f22119c;
    public boolean d;
    public int f22120e;
    public boolean f22121f;
    public boolean h;
    public boolean f22122n;
    public final org.telegram.ui.Components.j5 f22123r;
    public int f22124s;
    public final org.telegram.ui.Components.q6 v;
    public boolean f22125w;

    public g3(Context context, tw0 tw0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f22120e = -1;
        this.f22122n = true;
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, true, true);
        this.v = q6Var;
        q6Var.n(0.2f, 160L, is.h);
        q6Var.w(AndroidUtilities.dp(15.33f));
        q6Var.f30031b = 5;
        this.f22119c = i10;
        e3 e3Var = new e3(this, context, tw0Var, e6Var, z10);
        this.f22118b = e3Var;
        su editText = e3Var.getEditText();
        editText.setDelegate(new org.telegram.ui.ActionBar.b5(2, this, editText));
        e3Var.setWillNotDraw(false);
        this.f22123r = new org.telegram.ui.Components.j5(e3Var);
        q6Var.setCallback(e3Var);
        editText.setTextSize(1, 17.0f);
        editText.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.H6, e6Var));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        editText.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
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
        editText.setCursorColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new f3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.r2(this, 1));
        addView(e3Var, w7.x5.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.s5.g();
    }

    public final void c() {
        int i10;
        e3 e3Var = this.f22118b;
        if (e3Var != null && e3Var.getEditText() != null) {
            this.f22124s = this.f22119c - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f22121f || this.h) && ((i10 = this.f22120e) == -1 || this.f22124s <= i10))) {
                str = "" + this.f22124s;
            }
            this.v.t(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f22118b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f22125w) {
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20923k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f22125w = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f22118b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f22121f = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.d = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.f22120e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f22117a = true;
        e3 e3Var = this.f22118b;
        e3Var.setText(charSequence);
        e3Var.setSelection(e3Var.getText().length());
        this.f22117a = false;
    }

    public void b() {
    }
}
