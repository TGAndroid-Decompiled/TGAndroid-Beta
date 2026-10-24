package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zr;
public class h3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f22451a;
    public int f22452b;
    public boolean f22453c;
    public final f3 d;
    public final int e;
    public boolean f22454f;
    public int h;
    public boolean f22455n;
    public boolean f22456r;
    public boolean f22457s;
    public final org.telegram.ui.Components.g5 v;
    public int f22458w;
    public final org.telegram.ui.Components.n6 f22459x;
    public boolean f22460y;

    public h3(Context context, String str, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i11;
        int i12;
        this.h = -1;
        this.v = new org.telegram.ui.Components.g5(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.f22459x = n6Var;
        n6Var.n(0.2f, 160L, zr.h);
        n6Var.w(AndroidUtilities.dp(15.33f));
        n6Var.f28797b = 5;
        this.e = i10;
        f3 f3Var = new f3(this, context, g6Var, i10, g6Var, z11);
        this.d = f3Var;
        n6Var.setCallback(f3Var);
        f3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.F(f3Var, org.telegram.ui.ActionBar.k6.H6, g6Var);
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(f3Var, i13, g6Var);
        f3Var.setBackground(null);
        if (z10) {
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
        if (z10) {
            i12 = 131072;
        } else {
            i12 = 0;
        }
        f3Var.setInputType(i12 | 573441);
        f3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        f3Var.setHint(str);
        this.f22451a = g6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i13, g6Var);
        this.f22452b = w02;
        f3Var.setCursorColor(w02);
        f3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        f3Var.setCursorWidth(1.5f);
        f3Var.addTextChangedListener(new g3(this, i10, z10));
        f3Var.setOnFocusChangeListener(new m.s2(this, 2));
        addView(f3Var, w7.z5.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i10;
        if (this.d == null) {
            return;
        }
        this.f22458w = this.e - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.f22454f) && ((!this.f22455n || (this.f22457s && !this.f22456r)) && ((i10 = this.h) == -1 || this.f22458w <= i10))) {
            str = "" + this.f22458w;
        }
        this.f22459x.t(str, true, true);
    }

    public CharSequence getText() {
        return this.d.getText();
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
        if (this.f22460y) {
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

    public void setDivider(boolean z10) {
        this.f22460y = z10;
        setWillNotDraw(!z10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f22455n = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.f22454f = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.h = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f22453c = true;
        f3 f3Var = this.d;
        f3Var.setText(charSequence);
        f3Var.setSelection(f3Var.getText().length());
        this.f22453c = false;
    }

    @Override
    public final void updateColors() {
        f3 f3Var = this.d;
        if (f3Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f22451a);
                if (w02 != this.f22452b) {
                    this.f22452b = w02;
                    f3Var.setCursorColor(w02);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f22453c = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        f3 f3Var = this.d;
        f3Var.setText(formatTextWithEntities);
        f3Var.setSelection(f3Var.getText().length());
        this.f22453c = false;
    }

    public void a(boolean z10) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
