package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wq;
public class k3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean D;
    public final org.telegram.ui.ActionBar.h6 f29424a;
    public int f29425b;
    public boolean f29426c;
    public final i3 d;
    public final int f29427e;
    public boolean f29428f;
    public int h;
    public boolean f29429n;
    public boolean f29430r;
    public boolean f29431s;
    public final org.telegram.ui.Components.y4 f29432w;
    public int f29433x;
    public final org.telegram.ui.Components.h6 f29434y;

    public k3(Context context, String str, boolean z9, boolean z10, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i10;
        int i11;
        this.h = -1;
        this.f29432w = new org.telegram.ui.Components.y4(this);
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(false, true, true);
        this.f29434y = h6Var2;
        h6Var2.n(0.2f, 160L, wq.h);
        h6Var2.w(org.telegram.messenger.g0.L(15.33f));
        h6Var2.f34187b = 5;
        this.f29427e = i7;
        i3 i3Var = new i3(this, context, h6Var, i7, h6Var, z10);
        this.d = i3Var;
        h6Var2.setCallback(i3Var);
        i3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.t6.D(i3Var, org.telegram.ui.ActionBar.m6.H6, h6Var);
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(i3Var, i12, h6Var);
        i3Var.setBackground(null);
        if (z9) {
            i3Var.setMaxLines(5);
            i3Var.setSingleLine(false);
        } else {
            i3Var.setMaxLines(1);
            i3Var.setSingleLine(true);
        }
        int L = org.telegram.messenger.g0.L(21.0f);
        int L2 = org.telegram.messenger.g0.L(15.0f);
        if (i7 > 0) {
            i10 = 42;
        } else {
            i10 = 0;
        }
        i3Var.setPadding(L, L2, org.telegram.messenger.g0.L(i10 + 21), org.telegram.messenger.g0.L(15.0f));
        i3Var.setGravity((id.f23161a0 ? 5 : 3) | 48);
        if (z9) {
            i11 = 131072;
        } else {
            i11 = 0;
        }
        i3Var.setInputType(i11 | 573441);
        i3Var.setRawInputType((z9 ? 131072 : 0) | 573441);
        i3Var.setHint(str);
        this.f29424a = h6Var;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var);
        this.f29425b = w02;
        i3Var.setCursorColor(w02);
        i3Var.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        i3Var.setCursorWidth(1.5f);
        i3Var.addTextChangedListener(new j3(this, i7, z9));
        i3Var.setOnFocusChangeListener(new fi.v6(this, 3));
        addView(i3Var, c8.ha.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i7;
        if (this.d == null) {
            return;
        }
        this.f29433x = this.f29427e - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.f29428f) && ((!this.f29429n || (this.f29431s && !this.f29430r)) && ((i7 = this.h) == -1 || this.f29433x <= i7))) {
            str = "" + this.f29433x;
        }
        this.f29434y.t(str, true, true);
    }

    public CharSequence getText() {
        return this.d.getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = ui.b0(p10.f24474s0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.D) {
            if (id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    public void setDivider(boolean z9) {
        this.D = z9;
        setWillNotDraw(!z9);
    }

    public void setShowLimitOnFocus(boolean z9) {
        this.f29429n = z9;
    }

    public void setShowLimitWhenEmpty(boolean z9) {
        this.f29428f = z9;
        if (z9) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i7) {
        this.h = i7;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f29426c = true;
        i3 i3Var = this.d;
        i3Var.setText(charSequence);
        i3Var.setSelection(i3Var.getText().length());
        this.f29426c = false;
    }

    @Override
    public final void updateColors() {
        i3 i3Var = this.d;
        if (i3Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.f29424a);
                if (w02 != this.f29425b) {
                    this.f29425b = w02;
                    i3Var.setCursorColor(w02);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f29426c = true;
        CharSequence h02 = ij.h0(tL_textWithEntities, false);
        i3 i3Var = this.d;
        i3Var.setText(h02);
        i3Var.setSelection(i3Var.getText().length());
        this.f29426c = false;
    }

    public void a(boolean z9) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
