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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.ww0;
public abstract class d3 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public boolean f24002a;
    public final b3 f24003b;
    public final org.telegram.ui.ActionBar.u6 f24004c;
    public final int d;
    public boolean e;
    public int f24005f;
    public boolean h;
    public boolean f24006n;
    public boolean f24007r;
    public final org.telegram.ui.Components.j5 f24008s;
    public int v;
    public final org.telegram.ui.Components.r6 f24009w;
    public boolean f24010x;

    public d3(Context context, ww0 ww0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f24005f = -1;
        this.f24007r = true;
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.f24009w = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.f32142b = 5;
        this.d = i10;
        b3 b3Var = new b3(this, context, ww0Var, u6Var, z10);
        this.f24003b = b3Var;
        ju editText = b3Var.getEditText();
        editText.setDelegate(new m4.w1(this, editText, false, 10));
        b3Var.setWillNotDraw(false);
        this.f24008s = new org.telegram.ui.Components.j5(b3Var);
        r6Var.setCallback(b3Var);
        editText.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.f7.E(editText, org.telegram.ui.ActionBar.y6.H6, u6Var);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(editText, i11, u6Var);
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
        org.telegram.ui.ActionBar.f7.m(editText, 30, i11, u6Var);
        this.f24004c = u6Var;
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new c3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.r2(this, 1));
        addView(b3Var, kb1.i(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.t5.g();
    }

    public final void c() {
        int i10;
        b3 b3Var = this.f24003b;
        if (b3Var != null && b3Var.getEditText() != null) {
            this.v = this.d - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.e) && ((!this.h || this.f24006n) && ((i10 = this.f24005f) == -1 || this.v <= i10))) {
                str = "" + this.v;
            }
            this.f24009w.t(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f24003b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f24010x) {
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f24010x = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f24003b.setEmojiViewCacheType(i10);
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
        this.f24005f = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f24002a = true;
        b3 b3Var = this.f24003b;
        b3Var.setText(charSequence);
        b3Var.setSelection(b3Var.getText().length());
        this.f24002a = false;
    }

    @Override
    public final void updateColors() {
        b3 b3Var = this.f24003b;
        if (b3Var != null) {
            try {
                if (b3Var.getEditText() != null) {
                    b3Var.getEditText().setCursorColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.f24004c));
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
