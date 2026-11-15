package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
public class k3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public final org.telegram.ui.ActionBar.e6 f30544a;
    public int f30545b;
    public boolean f30546c;
    public final i3 d;
    public final int f30547e;
    public boolean f30548f;
    public int h;
    public boolean f30549n;
    public boolean f30550r;
    public boolean f30551s;
    public final org.telegram.ui.Components.x4 f30552w;
    public int f30553x;
    public final org.telegram.ui.Components.g6 f30554y;

    public k3(Context context, String str, boolean z10, boolean z11, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        this.h = -1;
        this.f30552w = new org.telegram.ui.Components.x4(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f30554y = g6Var;
        g6Var.n(0.2f, 160L, er.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.f34833b = 5;
        this.f30547e = i7;
        i3 i3Var = new i3(this, context, e6Var, i7, e6Var, z11);
        this.d = i3Var;
        g6Var.setCallback(i3Var);
        i3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.q6.D(i3Var, org.telegram.ui.ActionBar.j6.H6, e6Var);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(i3Var, i12, e6Var);
        i3Var.setBackground(null);
        if (z10) {
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
        i3Var.setGravity((hd.f24104a0 ? 5 : 3) | 48);
        if (z10) {
            i11 = 131072;
        } else {
            i11 = 0;
        }
        i3Var.setInputType(i11 | 573441);
        i3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        i3Var.setHint(str);
        this.f30544a = e6Var;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i12, e6Var);
        this.f30545b = w02;
        i3Var.setCursorColor(w02);
        i3Var.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        i3Var.setCursorWidth(1.5f);
        i3Var.addTextChangedListener(new j3(this, i7, z10));
        i3Var.setOnFocusChangeListener(new hi.u6(this, 3));
        addView(i3Var, c8.ja.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i7;
        if (this.d == null) {
            return;
        }
        this.f30553x = this.f30547e - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.f30548f) && ((!this.f30549n || (this.f30551s && !this.f30550r)) && ((i7 = this.h) == -1 || this.f30553x <= i7))) {
            str = "" + this.f30553x;
        }
        this.f30554y.t(str, true, true);
    }

    public CharSequence getText() {
        return this.d.getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = si.b0(m10.f24940t0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.E) {
            if (hd.f24104a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24104a0) {
                i7 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    public void setDivider(boolean z10) {
        this.E = z10;
        setWillNotDraw(!z10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f30549n = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.f30548f = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i7) {
        this.h = i7;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f30546c = true;
        i3 i3Var = this.d;
        i3Var.setText(charSequence);
        i3Var.setSelection(i3Var.getText().length());
        this.f30546c = false;
    }

    @Override
    public final void updateColors() {
        i3 i3Var = this.d;
        if (i3Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.f30544a);
                if (w02 != this.f30545b) {
                    this.f30545b = w02;
                    i3Var.setCursorColor(w02);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f30546c = true;
        CharSequence h02 = gj.h0(tL_textWithEntities, false);
        i3 i3Var = this.d;
        i3Var.setText(h02);
        i3Var.setSelection(i3Var.getText().length());
        this.f30546c = false;
    }

    public void a(boolean z10) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
