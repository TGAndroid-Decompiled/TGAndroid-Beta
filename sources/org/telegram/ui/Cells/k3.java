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
import org.telegram.ui.Components.qr;
public class k3 extends FrameLayout {
    public boolean f20541a;
    public final i3 f20542b;
    public final int f20543c;
    public boolean d;
    public int e;
    public boolean f20544f;
    public boolean h;
    public boolean f20545n;
    public final org.telegram.ui.Components.g5 f20546r;
    public int f20547s;
    public final org.telegram.ui.Components.n6 v;
    public boolean f20548w;

    public k3(Context context, String str, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i11;
        int i12;
        this.e = -1;
        this.f20546r = new org.telegram.ui.Components.g5(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.v = n6Var;
        n6Var.k(0.2f, 160L, qr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.f26643b = 5;
        this.f20543c = i10;
        i3 i3Var = new i3(this, context, f6Var, i10, f6Var, z11);
        this.f20542b = i3Var;
        n6Var.setCallback(i3Var);
        i3Var.setTextSize(1, 17.0f);
        i3Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        i3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        i3Var.setBackground(null);
        if (z10) {
            i3Var.setMaxLines(5);
            i3Var.setSingleLine(false);
        } else {
            i3Var.setMaxLines(1);
            i3Var.setSingleLine(true);
        }
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(15.0f);
        if (i10 > 0) {
            i11 = 42;
        } else {
            i11 = 0;
        }
        i3Var.setPadding(dp, dp2, AndroidUtilities.dp(i11 + 21), AndroidUtilities.dp(15.0f));
        i3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (z10) {
            i12 = 131072;
        } else {
            i12 = 0;
        }
        i3Var.setInputType(i12 | 573441);
        i3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        i3Var.setHint(str);
        i3Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        i3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        i3Var.setCursorWidth(1.5f);
        i3Var.addTextChangedListener(new j3(this, i10, z10));
        i3Var.setOnFocusChangeListener(new m.r2(this, 2));
        addView(i3Var, w7.y5.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i10;
        if (this.f20542b == null) {
            return;
        }
        this.f20547s = this.f20543c - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f20544f || (this.f20545n && !this.h)) && ((i10 = this.e) == -1 || this.f20547s <= i10))) {
            str = "" + this.f20547s;
        }
        this.v.q(str, true, true);
    }

    public CharSequence getText() {
        return this.f20542b.getText();
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
        if (this.f20548w) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f19231k0);
        }
    }

    public void setDivider(boolean z10) {
        this.f20548w = z10;
        setWillNotDraw(!z10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f20544f = z10;
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
        this.f20541a = true;
        i3 i3Var = this.f20542b;
        i3Var.setText(charSequence);
        i3Var.setSelection(i3Var.getText().length());
        this.f20541a = false;
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f20541a = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        i3 i3Var = this.f20542b;
        i3Var.setText(formatTextWithEntities);
        i3Var.setSelection(i3Var.getText().length());
        this.f20541a = false;
    }

    public void a(boolean z10) {
    }

    public void b(Editable editable) {
    }
}
