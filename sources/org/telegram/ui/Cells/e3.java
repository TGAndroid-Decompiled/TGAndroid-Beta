package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.ut;
public abstract class e3 extends FrameLayout {
    public boolean f20985a;
    public final c3 f20986b;
    public final int f20987c;
    public boolean d;
    public int e;
    public boolean f20988f;
    public boolean h;
    public boolean f20989n;
    public final org.telegram.ui.Components.c5 f20990r;
    public int f20991s;
    public final org.telegram.ui.Components.j6 v;
    public boolean f20992w;

    public e3(Context context, qv0 qv0Var, String str, boolean z4, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = -1;
        this.f20989n = true;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.v = j6Var;
        j6Var.k(0.2f, 160L, mr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.f25847b = 5;
        this.f20987c = i10;
        c3 c3Var = new c3(this, context, qv0Var, f6Var, z4);
        this.f20986b = c3Var;
        ut editText = c3Var.getEditText();
        editText.setDelegate(new n7.qa(10, this, editText));
        c3Var.setWillNotDraw(false);
        this.f20990r = new org.telegram.ui.Components.c5(c3Var);
        j6Var.setCallback(c3Var);
        editText.setTextSize(1, 17.0f);
        editText.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        editText.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        editText.setBackground(null);
        if (z4) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), AndroidUtilities.dp(0.0f), editText.getPaddingBottom());
        editText.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        editText.setInputType((z4 ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        editText.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new d3(this, i10, editText, z4));
        editText.setOnFocusChangeListener(new m.s2(this, 1));
        addView(c3Var, k7.b6.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.l5.g();
    }

    public final void c() {
        int i10;
        c3 c3Var = this.f20986b;
        if (c3Var != null && c3Var.getEditText() != null) {
            this.f20991s = this.f20987c - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f20988f || this.h) && ((i10 = this.e) == -1 || this.f20991s <= i10))) {
                str = "" + this.f20991s;
            }
            this.v.q(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f20986b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f20992w) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z4) {
        this.f20992w = z4;
        setWillNotDraw(!z4);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f20986b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z4) {
        this.f20988f = z4;
    }

    public void setShowLimitWhenEmpty(boolean z4) {
        this.d = z4;
        if (z4) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f20985a = true;
        c3 c3Var = this.f20986b;
        c3Var.setText(charSequence);
        c3Var.setSelection(c3Var.getText().length());
        this.f20985a = false;
    }

    public void b() {
    }
}
