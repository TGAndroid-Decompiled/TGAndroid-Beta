package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
public class k3 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public boolean D;
    public final org.telegram.ui.ActionBar.f6 f29406a;
    public int f29407b;
    public boolean f29408c;
    public final i3 d;
    public final int f29409e;
    public boolean f29410f;
    public int h;
    public boolean f29411n;
    public boolean f29412r;
    public boolean f29413s;
    public final org.telegram.ui.Components.z4 f29414w;
    public int f29415x;
    public final org.telegram.ui.Components.i6 f29416y;

    public k3(Context context, String str, boolean z9, boolean z10, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        int i11;
        this.h = -1;
        this.f29414w = new org.telegram.ui.Components.z4(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.f29416y = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.f34508b = 5;
        this.f29409e = i7;
        i3 i3Var = new i3(this, context, f6Var, i7, f6Var, z10);
        this.d = i3Var;
        i6Var.setCallback(i3Var);
        i3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.E(i3Var, org.telegram.ui.ActionBar.k6.H6, f6Var);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(i3Var, i12, f6Var);
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
        i3Var.setGravity((hd.f22878a0 ? 5 : 3) | 48);
        if (z9) {
            i11 = 131072;
        } else {
            i11 = 0;
        }
        i3Var.setInputType(i11 | 573441);
        i3Var.setRawInputType((z9 ? 131072 : 0) | 573441);
        i3Var.setHint(str);
        this.f29406a = f6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, f6Var);
        this.f29407b = w02;
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
        this.f29415x = this.f29409e - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.f29410f) && ((!this.f29411n || (this.f29413s && !this.f29412r)) && ((i7 = this.h) == -1 || this.f29415x <= i7))) {
            str = "" + this.f29415x;
        }
        this.f29416y.t(str, true, true);
    }

    public CharSequence getText() {
        return this.d.getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = ui.b0(p10.f24467s0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.D) {
            if (hd.f22878a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f22878a0) {
                i7 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27972k0);
        }
    }

    public void setDivider(boolean z9) {
        this.D = z9;
        setWillNotDraw(!z9);
    }

    public void setShowLimitOnFocus(boolean z9) {
        this.f29411n = z9;
    }

    public void setShowLimitWhenEmpty(boolean z9) {
        this.f29410f = z9;
        if (z9) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i7) {
        this.h = i7;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f29408c = true;
        i3 i3Var = this.d;
        i3Var.setText(charSequence);
        i3Var.setSelection(i3Var.getText().length());
        this.f29408c = false;
    }

    @Override
    public final void updateColors() {
        i3 i3Var = this.d;
        if (i3Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f29406a);
                if (w02 != this.f29407b) {
                    this.f29407b = w02;
                    i3Var.setCursorColor(w02);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f29408c = true;
        CharSequence h02 = ij.h0(tL_textWithEntities, false);
        i3 i3Var = this.d;
        i3Var.setText(h02);
        i3Var.setSelection(i3Var.getText().length());
        this.f29408c = false;
    }

    public void a(boolean z9) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
