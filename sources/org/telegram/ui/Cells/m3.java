package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
public class m3 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public final org.telegram.ui.ActionBar.p6 f22290a;
    public int f22291b;
    public boolean f22292c;
    public final k3 d;
    public final int e;
    public boolean f22293f;
    public int h;
    public boolean f22294n;
    public boolean f22295r;
    public boolean f22296s;
    public final org.telegram.ui.Components.w4 f22297w;
    public int f22298x;
    public final org.telegram.ui.Components.e6 f22299y;

    public m3(Context context, String str, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i11;
        int i12;
        this.h = -1;
        this.f22297w = new org.telegram.ui.Components.w4(this);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.f22299y = e6Var;
        e6Var.n(0.2f, 160L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(15.33f));
        e6Var.f25695b = 5;
        this.e = i10;
        k3 k3Var = new k3(this, context, p6Var, i10, p6Var, z11);
        this.d = k3Var;
        e6Var.setCallback(k3Var);
        k3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.a7.E(k3Var, org.telegram.ui.ActionBar.t6.H6, p6Var);
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(k3Var, i13, p6Var);
        k3Var.setBackground(null);
        if (z10) {
            k3Var.setMaxLines(5);
            k3Var.setSingleLine(false);
        } else {
            k3Var.setMaxLines(1);
            k3Var.setSingleLine(true);
        }
        int L = org.telegram.messenger.i0.L(21.0f);
        int L2 = org.telegram.messenger.i0.L(15.0f);
        if (i10 > 0) {
            i11 = 42;
        } else {
            i11 = 0;
        }
        k3Var.setPadding(L, L2, org.telegram.messenger.i0.L(i11 + 21), org.telegram.messenger.i0.L(15.0f));
        k3Var.setGravity((cd.X ? 5 : 3) | 48);
        if (z10) {
            i12 = 131072;
        } else {
            i12 = 0;
        }
        k3Var.setInputType(i12 | 573441);
        k3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        k3Var.setHint(str);
        this.f22290a = p6Var;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
        this.f22291b = w02;
        k3Var.setCursorColor(w02);
        k3Var.setCursorSize(org.telegram.messenger.i0.L(19.0f));
        k3Var.setCursorWidth(1.5f);
        k3Var.addTextChangedListener(new l3(this, i10, z10));
        k3Var.setOnFocusChangeListener(new m.r2(this, 2));
        addView(k3Var, w7.b6.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i10;
        if (this.d == null) {
            return;
        }
        this.f22298x = this.e - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.f22293f) && ((!this.f22294n || (this.f22296s && !this.f22295r)) && ((i10 = this.h) == -1 || this.f22298x <= i10))) {
            str = "" + this.f22298x;
        }
        this.f22299y.t(str, true, true);
    }

    public CharSequence getText() {
        return this.d.getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = ui.b0(d20.f15147s0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        super.onDraw(canvas);
        if (this.D) {
            if (cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(22.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(22.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    public void setDivider(boolean z10) {
        this.D = z10;
        setWillNotDraw(!z10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f22294n = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.f22293f = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.h = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f22292c = true;
        k3 k3Var = this.d;
        k3Var.setText(charSequence);
        k3Var.setSelection(k3Var.getText().length());
        this.f22292c = false;
    }

    @Override
    public final void updateColors() {
        k3 k3Var = this.d;
        if (k3Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.f22290a);
                if (w02 != this.f22291b) {
                    this.f22291b = w02;
                    k3Var.setCursorColor(w02);
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f22292c = true;
        Spannable h02 = jj.h0(tL_textWithEntities, false);
        k3 k3Var = this.d;
        k3Var.setText(h02);
        k3Var.setSelection(k3Var.getText().length());
        this.f22292c = false;
    }

    public void a(boolean z10) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
