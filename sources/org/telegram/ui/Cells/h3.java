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
import org.telegram.ui.Components.mr;
public class h3 extends FrameLayout {
    public boolean f21131a;
    public final f3 f21132b;
    public final int f21133c;
    public boolean d;
    public int e;
    public boolean f21134f;
    public boolean h;
    public boolean f21135n;
    public final org.telegram.ui.Components.c5 f21136r;
    public int f21137s;
    public final org.telegram.ui.Components.j6 v;
    public boolean f21138w;

    public h3(Context context, String str, boolean z4, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i11;
        int i12;
        this.e = -1;
        this.f21136r = new org.telegram.ui.Components.c5(this);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.v = j6Var;
        j6Var.k(0.2f, 160L, mr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.f25847b = 5;
        this.f21133c = i10;
        f3 f3Var = new f3(this, context, f6Var, i10, f6Var, z10);
        this.f21132b = f3Var;
        j6Var.setCallback(f3Var);
        f3Var.setTextSize(1, 17.0f);
        f3Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        f3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        f3Var.setBackground(null);
        if (z4) {
            f3Var.setMaxLines(5);
            f3Var.setSingleLine(false);
        } else {
            f3Var.setMaxLines(1);
            f3Var.setSingleLine(true);
        }
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(15.0f);
        if (i10 > 0) {
            i11 = 42;
        } else {
            i11 = 0;
        }
        f3Var.setPadding(dp, dp2, AndroidUtilities.dp(i11 + 21), AndroidUtilities.dp(15.0f));
        f3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (z4) {
            i12 = 131072;
        } else {
            i12 = 0;
        }
        f3Var.setInputType(i12 | 573441);
        f3Var.setRawInputType((z4 ? 131072 : 0) | 573441);
        f3Var.setHint(str);
        f3Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        f3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        f3Var.setCursorWidth(1.5f);
        f3Var.addTextChangedListener(new g3(this, i10, z4));
        f3Var.setOnFocusChangeListener(new m.s2(this, 2));
        addView(f3Var, k7.b6.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i10;
        if (this.f21132b == null) {
            return;
        }
        this.f21137s = this.f21133c - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f21134f || (this.f21135n && !this.h)) && ((i10 = this.e) == -1 || this.f21137s <= i10))) {
            str = "" + this.f21137s;
        }
        this.v.q(str, true, true);
    }

    public CharSequence getText() {
        return this.f21132b.getText();
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
        if (this.f21138w) {
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

    public void setDivider(boolean z4) {
        this.f21138w = z4;
        setWillNotDraw(!z4);
    }

    public void setShowLimitOnFocus(boolean z4) {
        this.f21134f = z4;
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
        this.f21131a = true;
        f3 f3Var = this.f21132b;
        f3Var.setText(charSequence);
        f3Var.setSelection(f3Var.getText().length());
        this.f21131a = false;
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f21131a = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        f3 f3Var = this.f21132b;
        f3Var.setText(formatTextWithEntities);
        f3Var.setSelection(f3Var.getText().length());
        this.f21131a = false;
    }

    public void a(boolean z4) {
    }

    public void b(Editable editable) {
    }
}
