package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
public class l3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public final org.telegram.ui.ActionBar.i6 f30969a;
    public int f30970b;
    public boolean f30971c;
    public final j3 d;
    public final int f30972e;
    public boolean f30973f;
    public int h;
    public boolean f30974n;
    public boolean f30975r;
    public boolean f30976s;
    public final org.telegram.ui.Components.f5 f30977w;
    public int f30978x;
    public final org.telegram.ui.Components.m6 f30979y;

    public l3(Context context, String str, boolean z10, boolean z11, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i10;
        int i11;
        this.h = -1;
        this.f30977w = new org.telegram.ui.Components.f5(this);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.f30979y = m6Var;
        m6Var.n(0.2f, 160L, lr.h);
        m6Var.w(org.telegram.messenger.g0.L(15.33f));
        m6Var.f37377b = 5;
        this.f30972e = i7;
        j3 j3Var = new j3(this, context, i6Var, i7, i6Var, z11);
        this.d = j3Var;
        m6Var.setCallback(j3Var);
        j3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.u6.D(j3Var, org.telegram.ui.ActionBar.n6.H6, i6Var);
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(j3Var, i12, i6Var);
        j3Var.setBackground(null);
        if (z10) {
            j3Var.setMaxLines(5);
            j3Var.setSingleLine(false);
        } else {
            j3Var.setMaxLines(1);
            j3Var.setSingleLine(true);
        }
        int L = org.telegram.messenger.g0.L(21.0f);
        int L2 = org.telegram.messenger.g0.L(15.0f);
        if (i7 > 0) {
            i10 = 42;
        } else {
            i10 = 0;
        }
        j3Var.setPadding(L, L2, org.telegram.messenger.g0.L(i10 + 21), org.telegram.messenger.g0.L(15.0f));
        j3Var.setGravity((gd.f24213a0 ? 5 : 3) | 48);
        if (z10) {
            i11 = 131072;
        } else {
            i11 = 0;
        }
        j3Var.setInputType(i11 | 573441);
        j3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        j3Var.setHint(str);
        this.f30969a = i6Var;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
        this.f30970b = w02;
        j3Var.setCursorColor(w02);
        j3Var.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        j3Var.setCursorWidth(1.5f);
        j3Var.addTextChangedListener(new k3(this, i7, z10));
        j3Var.setOnFocusChangeListener(new hi.u6(this, 3));
        addView(j3Var, c8.ma.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i7;
        if (this.d == null) {
            return;
        }
        this.f30978x = this.f30972e - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.f30973f) && ((!this.f30974n || (this.f30976s && !this.f30975r)) && ((i7 = this.h) == -1 || this.f30978x <= i7))) {
            str = "" + this.f30978x;
        }
        this.f30979y.t(str, true, true);
    }

    public CharSequence getText() {
        return this.d.getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = ri.d0(j10.f24770t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.E) {
            if (gd.f24213a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24213a0) {
                i7 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29517k0);
        }
    }

    public void setDivider(boolean z10) {
        this.E = z10;
        setWillNotDraw(!z10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f30974n = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.f30973f = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i7) {
        this.h = i7;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f30971c = true;
        j3 j3Var = this.d;
        j3Var.setText(charSequence);
        j3Var.setSelection(j3Var.getText().length());
        this.f30971c = false;
    }

    @Override
    public final void updateColors() {
        j3 j3Var = this.d;
        if (j3Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.f30969a);
                if (w02 != this.f30970b) {
                    this.f30970b = w02;
                    j3Var.setCursorColor(w02);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f30971c = true;
        CharSequence h02 = fj.h0(tL_textWithEntities, false);
        j3 j3Var = this.d;
        j3Var.setText(h02);
        j3Var.setSelection(j3Var.getText().length());
        this.f30971c = false;
    }

    public void a(boolean z10) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
