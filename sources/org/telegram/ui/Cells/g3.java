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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
public class g3 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f24147a;
    public int f24148b;
    public boolean f24149c;
    public final e3 d;
    public final int e;
    public boolean f24150f;
    public int h;
    public boolean f24151n;
    public boolean f24152r;
    public boolean f24153s;
    public final org.telegram.ui.Components.j5 v;
    public int f24154w;
    public final org.telegram.ui.Components.r6 f24155x;
    public boolean f24156y;

    public g3(Context context, String str, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i11;
        int i12;
        this.h = -1;
        this.v = new org.telegram.ui.Components.j5(this);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.f24155x = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.f32142b = 5;
        this.e = i10;
        e3 e3Var = new e3(this, context, u6Var, i10, u6Var, z11);
        this.d = e3Var;
        r6Var.setCallback(e3Var);
        e3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.f7.E(e3Var, org.telegram.ui.ActionBar.y6.H6, u6Var);
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(e3Var, i13, u6Var);
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
        this.f24147a = u6Var;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
        this.f24148b = w02;
        e3Var.setCursorColor(w02);
        e3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        e3Var.setCursorWidth(1.5f);
        e3Var.addTextChangedListener(new f3(this, i10, z10));
        e3Var.setOnFocusChangeListener(new m.r2(this, 2));
        addView(e3Var, kb1.i(-1, -1, 48));
        c();
    }

    public final void c() {
        int i10;
        if (this.d == null) {
            return;
        }
        this.f24154w = this.e - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.f24150f) && ((!this.f24151n || (this.f24153s && !this.f24152r)) && ((i10 = this.h) == -1 || this.f24154w <= i10))) {
            str = "" + this.f24154w;
        }
        this.f24155x.t(str, true, true);
    }

    public final void d(Runnable runnable) {
        e3 e3Var = this.d;
        e3Var.setImeOptions(6);
        e3Var.setOnEditorActionListener(new m.s2(runnable, 2));
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
        if (this.f24156y) {
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

    public void setDivider(boolean z10) {
        this.f24156y = z10;
        setWillNotDraw(!z10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f24151n = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.f24150f = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.h = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f24149c = true;
        e3 e3Var = this.d;
        e3Var.setText(charSequence);
        e3Var.setSelection(e3Var.getText().length());
        this.f24149c = false;
    }

    @Override
    public final void updateColors() {
        e3 e3Var = this.d;
        if (e3Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.f24147a);
                if (w02 != this.f24148b) {
                    this.f24148b = w02;
                    e3Var.setCursorColor(w02);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f24149c = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        e3 e3Var = this.d;
        e3Var.setText(formatTextWithEntities);
        e3Var.setSelection(e3Var.getText().length());
        this.f24149c = false;
    }

    public void a(boolean z10) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
