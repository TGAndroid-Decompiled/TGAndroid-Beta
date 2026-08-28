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
import org.telegram.ui.Components.gr;
public class j3 extends FrameLayout {
    public boolean f24543a;
    public final h3 f24544b;
    public final int f24545c;
    public boolean d;
    public int f24546e;
    public boolean f24547f;
    public boolean h;
    public boolean f24548n;
    public final org.telegram.ui.Components.b5 f24549r;
    public int f24550s;
    public final org.telegram.ui.Components.i6 v;
    public boolean f24551w;

    public j3(Context context, String str, boolean z10, boolean z11, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i10;
        int i11;
        this.f24546e = -1;
        this.f24549r = new org.telegram.ui.Components.b5(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.v = i6Var;
        i6Var.k(0.2f, 160L, gr.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.f29333b = 5;
        this.f24545c = i9;
        h3 h3Var = new h3(this, context, b6Var, i9, b6Var, z11);
        this.f24544b = h3Var;
        i6Var.setCallback(h3Var);
        h3Var.setTextSize(1, 17.0f);
        h3Var.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H6, b6Var));
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        h3Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
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
        if (i9 > 0) {
            i10 = 42;
        } else {
            i10 = 0;
        }
        h3Var.setPadding(dp, dp2, AndroidUtilities.dp(i10 + 21), AndroidUtilities.dp(15.0f));
        h3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (z10) {
            i11 = 131072;
        } else {
            i11 = 0;
        }
        h3Var.setInputType(i11 | 573441);
        h3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        h3Var.setHint(str);
        h3Var.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        h3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        h3Var.setCursorWidth(1.5f);
        h3Var.addTextChangedListener(new i3(this, i9, z10));
        h3Var.setOnFocusChangeListener(new m.s2(this, 2));
        addView(h3Var, g7.e6.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i9;
        if (this.f24544b == null) {
            return;
        }
        this.f24550s = this.f24545c - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f24547f || (this.f24548n && !this.h)) && ((i9 = this.f24546e) == -1 || this.f24550s <= i9))) {
            str = "" + this.f24550s;
        }
        this.v.q(str, true, true);
    }

    public CharSequence getText() {
        return this.f24544b.getText();
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
        int i9;
        super.onDraw(canvas);
        if (this.f24551w) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(22.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(22.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    public void setDivider(boolean z10) {
        this.f24551w = z10;
        setWillNotDraw(!z10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f24547f = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.d = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i9) {
        this.f24546e = i9;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f24543a = true;
        h3 h3Var = this.f24544b;
        h3Var.setText(charSequence);
        h3Var.setSelection(h3Var.getText().length());
        this.f24543a = false;
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f24543a = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        h3 h3Var = this.f24544b;
        h3Var.setText(formatTextWithEntities);
        h3Var.setSelection(h3Var.getText().length());
        this.f24543a = false;
    }

    public void a(boolean z10) {
    }

    public void b(Editable editable) {
    }
}
