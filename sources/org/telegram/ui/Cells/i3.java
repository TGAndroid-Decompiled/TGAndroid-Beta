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
import org.telegram.ui.Components.wr;
public class i3 extends FrameLayout {
    public boolean f19292a;
    public final g3 f19293b;
    public final int f19294c;
    public boolean d;
    public int e;
    public boolean f19295f;
    public boolean h;
    public boolean f19296n;
    public final org.telegram.ui.Components.g5 f19297r;
    public int f19298s;
    public final org.telegram.ui.Components.n6 v;
    public boolean f19299w;

    public i3(Context context, String str, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i11;
        int i12;
        this.e = -1;
        this.f19297r = new org.telegram.ui.Components.g5(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.v = n6Var;
        n6Var.k(0.2f, 160L, wr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.f25425b = 5;
        this.f19294c = i10;
        g3 g3Var = new g3(this, context, f6Var, i10, f6Var, z11);
        this.f19293b = g3Var;
        n6Var.setCallback(g3Var);
        g3Var.setTextSize(1, 17.0f);
        g3Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        g3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        g3Var.setBackground(null);
        if (z10) {
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
        if (z10) {
            i12 = 131072;
        } else {
            i12 = 0;
        }
        g3Var.setInputType(i12 | 573441);
        g3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        g3Var.setHint(str);
        g3Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        g3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        g3Var.setCursorWidth(1.5f);
        g3Var.addTextChangedListener(new h3(this, i10, z10));
        g3Var.setOnFocusChangeListener(new m.r2(this, 2));
        addView(g3Var, w7.a6.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i10;
        if (this.f19293b == null) {
            return;
        }
        this.f19298s = this.f19294c - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f19295f || (this.f19296n && !this.h)) && ((i10 = this.e) == -1 || this.f19298s <= i10))) {
            str = "" + this.f19298s;
        }
        this.v.q(str, true, true);
    }

    public CharSequence getText() {
        return this.f19293b.getText();
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
        if (this.f19299w) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
        }
    }

    public void setDivider(boolean z10) {
        this.f19299w = z10;
        setWillNotDraw(!z10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f19295f = z10;
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
        this.f19292a = true;
        g3 g3Var = this.f19293b;
        g3Var.setText(charSequence);
        g3Var.setSelection(g3Var.getText().length());
        this.f19292a = false;
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f19292a = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        g3 g3Var = this.f19293b;
        g3Var.setText(formatTextWithEntities);
        g3Var.setSelection(g3Var.getText().length());
        this.f19292a = false;
    }

    public void a(boolean z10) {
    }

    public void b(Editable editable) {
    }
}
