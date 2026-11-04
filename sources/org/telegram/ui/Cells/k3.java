package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
public class k3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public final org.telegram.ui.ActionBar.e6 f29483a;
    public int f29484b;
    public boolean f29485c;
    public final i3 d;
    public final int f29486e;
    public boolean f29487f;
    public int h;
    public boolean f29488n;
    public boolean f29489r;
    public boolean f29490s;
    public final org.telegram.ui.Components.x4 f29491w;
    public int f29492x;
    public final org.telegram.ui.Components.g6 f29493y;

    public k3(Context context, String str, boolean z10, boolean z11, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        this.h = -1;
        this.f29491w = new org.telegram.ui.Components.x4(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f29493y = g6Var;
        g6Var.n(0.2f, 160L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.f33983b = 5;
        this.f29486e = i3;
        i3 i3Var = new i3(this, context, e6Var, i3, e6Var, z11);
        this.d = i3Var;
        g6Var.setCallback(i3Var);
        i3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.E(i3Var, org.telegram.ui.ActionBar.k6.H6, e6Var);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(i3Var, i12, e6Var);
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
        if (i3 > 0) {
            i10 = 42;
        } else {
            i10 = 0;
        }
        i3Var.setPadding(L, L2, org.telegram.messenger.g0.L(i10 + 21), org.telegram.messenger.g0.L(15.0f));
        i3Var.setGravity((bd.f21784a0 ? 5 : 3) | 48);
        if (z10) {
            i11 = 131072;
        } else {
            i11 = 0;
        }
        i3Var.setInputType(i11 | 573441);
        i3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        i3Var.setHint(str);
        this.f29483a = e6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, e6Var);
        this.f29484b = w02;
        i3Var.setCursorColor(w02);
        i3Var.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        i3Var.setCursorWidth(1.5f);
        i3Var.addTextChangedListener(new j3(this, i3, z10));
        i3Var.setOnFocusChangeListener(new gi.w6(this, 3));
        addView(i3Var, mf.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i3;
        if (this.d == null) {
            return;
        }
        this.f29492x = this.f29486e - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.f29487f) && ((!this.f29488n || (this.f29490s && !this.f29489r)) && ((i3 = this.h) == -1 || this.f29492x <= i3))) {
            str = "" + this.f29492x;
        }
        this.f29493y.t(str, true, true);
    }

    public CharSequence getText() {
        return this.d.getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = li.b0(h10.f22829t0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        super.onDraw(canvas);
        if (this.E) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    public void setDivider(boolean z10) {
        this.E = z10;
        setWillNotDraw(!z10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f29488n = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.f29487f = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i3) {
        this.h = i3;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f29485c = true;
        i3 i3Var = this.d;
        i3Var.setText(charSequence);
        i3Var.setSelection(i3Var.getText().length());
        this.f29485c = false;
    }

    @Override
    public final void updateColors() {
        i3 i3Var = this.d;
        if (i3Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f29483a);
                if (w02 != this.f29484b) {
                    this.f29484b = w02;
                    i3Var.setCursorColor(w02);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f29485c = true;
        CharSequence h02 = zi.h0(tL_textWithEntities, false);
        i3 i3Var = this.d;
        i3Var.setText(h02);
        i3Var.setSelection(i3Var.getText().length());
        this.f29485c = false;
    }

    public void a(boolean z10) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
