package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public class zu extends fu {
    public final jv W;
    public final jv[] X;
    public final boolean Y;
    public int Z;
    public int f26922a0;
    public int f26923b0;

    public zu(kv kvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(kvVar, rect, i7);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f26923b0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Y = false;
        jv jvVar = new jv(kvVar, spannableStringBuilder, this.f22445c, alignment);
        this.W = jvVar;
        this.X = r3;
        jv[] jvVarArr = {jvVar};
    }

    @Override
    public final int H() {
        return this.Z;
    }

    @Override
    public int I() {
        Rect rect = this.f22444b;
        return this.W.f23586b.getHeight() + rect.top + this.Z + this.f26922a0 + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f22444b;
        return this.W.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        Rect rect = this.f22444b;
        return this.W.r() + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.t9[] L() {
        return this.X;
    }

    @Override
    public final void T() {
        this.W.i(this.V);
    }

    @Override
    public final void V() {
        this.W.f(this.V);
    }

    @Override
    public void W(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.Z);
        int i02 = i0();
        jv jvVar = this.W;
        if (i02 != 0) {
            jvVar.f23587c = (this.f22444b.left + i02) - jvVar.f23589f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            jvVar.d(canvas, jvVar.S);
            canvas.restore();
        } else {
            jvVar.d(canvas, jvVar.S);
        }
        canvas.restore();
    }

    @Override
    public final void X(Canvas canvas, int i7, float f10) {
        canvas.save();
        canvas.translate(0.0f, this.Z);
        int i02 = i0();
        jv jvVar = this.W;
        if (i02 != 0) {
            jvVar.f23587c = (this.f22444b.left + i02) - jvVar.f23589f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            jvVar.m(canvas, i7, f10);
            canvas.restore();
        } else {
            jvVar.m(canvas, i7, f10);
        }
        canvas.restore();
    }

    @Override
    public boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -this.Z);
        boolean t6 = this.W.t(motionEvent);
        motionEvent.offsetLocation(i02, this.Z);
        return t6;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10 + this.Z, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            jv jvVar = this.W;
            jvVar.f23587c = i12 - jvVar.f23589f;
        }
    }

    @Override
    public final Layout a() {
        return this.W.f23586b;
    }

    public final int i0() {
        int L;
        int r10;
        boolean z9 = this.Y;
        Rect rect = this.f22444b;
        jv jvVar = this.W;
        kv kvVar = this.f22443a;
        if (z9) {
            L = (((kvVar.C + kvVar.T) - kvVar.S) - jvVar.r()) / 2;
            r10 = rect.left;
        } else if (!kvVar.I()) {
            return 0;
        } else {
            L = (((kvVar.C + kvVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
            r10 = jvVar.r();
        }
        return L - r10;
    }

    public final void j0(int i7, int i10) {
        this.Z = i7;
        this.f26922a0 = i10;
        g0();
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        fu.l(spannableStringBuilder, this.W, this.X);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, wt wtVar) {
        jv jvVar = this.W;
        if (jvVar.o(characterStyle, wtVar)) {
            Rect rect = this.f22444b;
            wtVar.f26360e = (i0() + rect.left) - jvVar.f23589f;
            wtVar.f26361f = i7 + rect.top + this.Z;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.Y;
    }
}
