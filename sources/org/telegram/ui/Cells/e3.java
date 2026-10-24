package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.zr;
public abstract class e3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean f22315a;
    public final c3 f22316b;
    public final org.telegram.ui.ActionBar.g6 f22317c;
    public final int d;
    public boolean e;
    public int f22318f;
    public boolean h;
    public boolean f22319n;
    public boolean f22320r;
    public final org.telegram.ui.Components.g5 f22321s;
    public int v;
    public final org.telegram.ui.Components.n6 f22322w;
    public boolean f22323x;

    public e3(Context context, nw0 nw0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22318f = -1;
        this.f22320r = true;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.f22322w = n6Var;
        n6Var.n(0.2f, 160L, zr.h);
        n6Var.w(AndroidUtilities.dp(15.33f));
        n6Var.f28797b = 5;
        this.d = i10;
        c3 c3Var = new c3(this, context, nw0Var, g6Var, z10);
        this.f22316b = c3Var;
        gu editText = c3Var.getEditText();
        editText.setDelegate(new n2.e(this, editText, false, 6));
        c3Var.setWillNotDraw(false);
        this.f22321s = new org.telegram.ui.Components.g5(c3Var);
        n6Var.setCallback(c3Var);
        editText.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.F(editText, org.telegram.ui.ActionBar.k6.H6, g6Var);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(editText, i11, g6Var);
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
        org.telegram.ui.ActionBar.r6.m(editText, 30, i11, g6Var);
        this.f22317c = g6Var;
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new d3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.s2(this, 1));
        addView(c3Var, w7.z5.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.p5.g();
    }

    public final void c() {
        int i10;
        c3 c3Var = this.f22316b;
        if (c3Var != null && c3Var.getEditText() != null) {
            this.v = this.d - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.e) && ((!this.h || this.f22319n) && ((i10 = this.f22318f) == -1 || this.v <= i10))) {
                str = "" + this.v;
            }
            this.f22322w.t(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f22316b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f22323x) {
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21305k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f22323x = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f22316b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.h = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.e = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.f22318f = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f22315a = true;
        c3 c3Var = this.f22316b;
        c3Var.setText(charSequence);
        c3Var.setSelection(c3Var.getText().length());
        this.f22315a = false;
    }

    @Override
    public final void updateColors() {
        c3 c3Var = this.f22316b;
        if (c3Var != null) {
            try {
                if (c3Var.getEditText() != null) {
                    c3Var.getEditText().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f22317c));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
