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
import org.telegram.ui.Components.tr;
public class j3 extends FrameLayout {
    public boolean f22305a;
    public final h3 f22306b;
    public final int f22307c;
    public boolean d;
    public int f22308e;
    public boolean f22309f;
    public boolean h;
    public boolean f22310n;
    public final org.telegram.ui.Components.h5 f22311r;
    public int f22312s;
    public final org.telegram.ui.Components.o6 v;
    public boolean f22313w;

    public j3(Context context, String str, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i11;
        int i12;
        this.f22308e = -1;
        this.f22311r = new org.telegram.ui.Components.h5(this);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, true, true, false);
        this.v = o6Var;
        o6Var.k(0.2f, 160L, tr.h);
        o6Var.t(AndroidUtilities.dp(15.33f));
        o6Var.f29239b = 5;
        this.f22307c = i10;
        h3 h3Var = new h3(this, context, d6Var, i10, d6Var, z11);
        this.f22306b = h3Var;
        o6Var.setCallback(h3Var);
        h3Var.setTextSize(1, 17.0f);
        h3Var.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H6, d6Var));
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        h3Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, d6Var));
        h3Var.setBackground(null);
        if (z10) {
            h3Var.setMaxLines(5);
            h3Var.setSingleLine(false);
        } else {
            h3Var.setMaxLines(1);
            h3Var.setSingleLine(true);
        }
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(15.0f);
        if (i10 > 0) {
            i11 = 42;
        } else {
            i11 = 0;
        }
        h3Var.setPadding(dp, dp2, AndroidUtilities.dp(i11 + 21), AndroidUtilities.dp(15.0f));
        h3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (z10) {
            i12 = 131072;
        } else {
            i12 = 0;
        }
        h3Var.setInputType(i12 | 573441);
        h3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        h3Var.setHint(str);
        h3Var.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i13, d6Var));
        h3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        h3Var.setCursorWidth(1.5f);
        h3Var.addTextChangedListener(new i3(this, i10, z10));
        h3Var.setOnFocusChangeListener(new m.r2(this, 2));
        addView(h3Var, w7.z5.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i10;
        if (this.f22306b == null) {
            return;
        }
        this.f22312s = this.f22307c - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f22309f || (this.f22310n && !this.h)) && ((i10 = this.f22308e) == -1 || this.f22312s <= i10))) {
            str = "" + this.f22312s;
        }
        this.v.q(str, true, true);
    }

    public CharSequence getText() {
        return this.f22306b.getText();
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
        if (this.f22313w) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20940k0);
        }
    }

    public void setDivider(boolean z10) {
        this.f22313w = z10;
        setWillNotDraw(!z10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f22309f = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.d = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.f22308e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f22305a = true;
        h3 h3Var = this.f22306b;
        h3Var.setText(charSequence);
        h3Var.setSelection(h3Var.getText().length());
        this.f22305a = false;
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f22305a = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        h3 h3Var = this.f22306b;
        h3Var.setText(formatTextWithEntities);
        h3Var.setSelection(h3Var.getText().length());
        this.f22305a = false;
    }

    public void a(boolean z10) {
    }

    public void b(Editable editable) {
    }
}
