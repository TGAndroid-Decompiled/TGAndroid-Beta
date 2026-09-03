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
import org.telegram.ui.Components.pr;
public class i3 extends FrameLayout {
    public boolean f22956a;
    public final g3 f22957b;
    public final int f22958c;
    public boolean d;
    public int f22959e;
    public boolean f22960f;
    public boolean h;
    public boolean f22961n;
    public final org.telegram.ui.Components.c5 f22962r;
    public int f22963s;
    public final org.telegram.ui.Components.j6 v;
    public boolean f22964w;

    public i3(Context context, String str, boolean z4, boolean z10, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i11;
        int i12;
        this.f22959e = -1;
        this.f22962r = new org.telegram.ui.Components.c5(this);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.v = j6Var;
        j6Var.k(0.2f, 160L, pr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.f27999b = 5;
        this.f22958c = i10;
        g3 g3Var = new g3(this, context, g6Var, i10, g6Var, z10);
        this.f22957b = g3Var;
        j6Var.setCallback(g3Var);
        g3Var.setTextSize(1, 17.0f);
        g3Var.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H6, g6Var));
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        g3Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        g3Var.setBackground(null);
        if (z4) {
            g3Var.setMaxLines(5);
            g3Var.setSingleLine(false);
        } else {
            g3Var.setMaxLines(1);
            g3Var.setSingleLine(true);
        }
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(15.0f);
        if (i10 > 0) {
            i11 = 42;
        } else {
            i11 = 0;
        }
        g3Var.setPadding(dp, dp2, AndroidUtilities.dp(i11 + 21), AndroidUtilities.dp(15.0f));
        g3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (z4) {
            i12 = 131072;
        } else {
            i12 = 0;
        }
        g3Var.setInputType(i12 | 573441);
        g3Var.setRawInputType((z4 ? 131072 : 0) | 573441);
        g3Var.setHint(str);
        g3Var.setCursorColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        g3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        g3Var.setCursorWidth(1.5f);
        g3Var.addTextChangedListener(new h3(this, i10, z4));
        g3Var.setOnFocusChangeListener(new m.r2(this, 2));
        addView(g3Var, k7.c6.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i10;
        if (this.f22957b == null) {
            return;
        }
        this.f22963s = this.f22958c - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f22960f || (this.f22961n && !this.h)) && ((i10 = this.f22959e) == -1 || this.f22963s <= i10))) {
            str = "" + this.f22963s;
        }
        this.v.q(str, true, true);
    }

    public CharSequence getText() {
        return this.f22957b.getText();
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
        if (this.f22964w) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
        }
    }

    public void setDivider(boolean z4) {
        this.f22964w = z4;
        setWillNotDraw(!z4);
    }

    public void setShowLimitOnFocus(boolean z4) {
        this.f22960f = z4;
    }

    public void setShowLimitWhenEmpty(boolean z4) {
        this.d = z4;
        if (z4) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.f22959e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f22956a = true;
        g3 g3Var = this.f22957b;
        g3Var.setText(charSequence);
        g3Var.setSelection(g3Var.getText().length());
        this.f22956a = false;
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f22956a = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        g3 g3Var = this.f22957b;
        g3Var.setText(formatTextWithEntities);
        g3Var.setSelection(g3Var.getText().length());
        this.f22956a = false;
    }

    public void a(boolean z4) {
    }

    public void b(Editable editable) {
    }
}
