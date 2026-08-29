package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jr;
public class g3 extends FrameLayout {
    public boolean f24386a;
    public final e3 f24387b;
    public final int f24388c;
    public boolean d;
    public int f24389e;
    public boolean f24390f;
    public boolean h;
    public boolean f24391n;
    public final org.telegram.ui.Components.f5 f24392r;
    public int f24393s;
    public final org.telegram.ui.Components.n6 v;
    public boolean f24394w;

    public g3(Context context, String str, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i11;
        int i12;
        this.f24389e = -1;
        this.f24392r = new org.telegram.ui.Components.f5(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.v = n6Var;
        n6Var.k(0.2f, 160L, jr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.f30862b = 5;
        this.f24388c = i10;
        e3 e3Var = new e3(this, context, c6Var, i10, c6Var, z11);
        this.f24387b = e3Var;
        n6Var.setCallback(e3Var);
        e3Var.setTextSize(1, 17.0f);
        e3Var.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        e3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        e3Var.setBackground(null);
        if (z10) {
            e3Var.setMaxLines(5);
            e3Var.setSingleLine(false);
        } else {
            e3Var.setMaxLines(1);
            e3Var.setSingleLine(true);
        }
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(15.0f);
        if (i10 > 0) {
            i11 = 42;
        } else {
            i11 = 0;
        }
        e3Var.setPadding(dp, dp2, AndroidUtilities.dp(i11 + 21), AndroidUtilities.dp(15.0f));
        e3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (z10) {
            i12 = 131072;
        } else {
            i12 = 0;
        }
        e3Var.setInputType(i12 | 573441);
        e3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        e3Var.setHint(str);
        e3Var.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        e3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        e3Var.setCursorWidth(1.5f);
        e3Var.addTextChangedListener(new f3(this, i10, z10));
        e3Var.setOnFocusChangeListener(new m.s2(this, 2));
        addView(e3Var, i7.f6.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i10;
        if (this.f24387b == null) {
            return;
        }
        this.f24393s = this.f24388c - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f24390f || (this.f24391n && !this.h)) && ((i10 = this.f24389e) == -1 || this.f24393s <= i10))) {
            str = "" + this.f24393s;
        }
        this.v.q(str, true, true);
    }

    public CharSequence getText() {
        return this.f24387b.getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f24394w) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    public void setDivider(boolean z10) {
        this.f24394w = z10;
        setWillNotDraw(!z10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f24390f = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.d = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.f24389e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f24386a = true;
        e3 e3Var = this.f24387b;
        e3Var.setText(charSequence);
        e3Var.setSelection(e3Var.getText().length());
        this.f24386a = false;
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f24386a = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        e3 e3Var = this.f24387b;
        e3Var.setText(formatTextWithEntities);
        e3Var.setSelection(e3Var.getText().length());
        this.f24386a = false;
    }

    public void a(boolean z10) {
    }

    public void b(Editable editable) {
    }
}
