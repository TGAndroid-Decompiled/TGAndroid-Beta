package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public abstract class zu extends cu {
    public final hv X;
    public final hv Y;
    public final hv[] Z;
    public final boolean f28005a0;

    public zu(iv ivVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(ivVar, rect, i7);
        boolean z10;
        hv hvVar;
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28005a0 = z10;
        hv hvVar2 = new hv(ivVar, spannableStringBuilder, this.f22943c, alignment);
        this.X = hvVar2;
        if (!TextUtils.isEmpty(spannableStringBuilder2)) {
            hvVar = new hv(ivVar, spannableStringBuilder2, this.f22943c, alignment);
        } else {
            hvVar = null;
        }
        this.Y = hvVar;
        this.Z = hvVar == null ? new hv[]{hvVar2} : new hv[]{hvVar2, hvVar};
    }

    @Override
    public final int I() {
        int i7;
        Rect rect = this.f22942b;
        int i02 = i0() + this.X.f24222b.getHeight() + rect.top;
        hv hvVar = this.Y;
        if (hvVar != null) {
            i7 = hvVar.f24222b.getHeight();
        } else {
            i7 = 0;
        }
        return i02 + i7 + rect.bottom;
    }

    @Override
    public final int J() {
        hv hvVar = this.Y;
        if (hvVar == null) {
            hvVar = this.X;
        }
        Rect rect = this.f22942b;
        return hvVar.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        int i7;
        Rect rect = this.f22942b;
        int i10 = rect.left;
        int r10 = this.X.r();
        hv hvVar = this.Y;
        if (hvVar != null) {
            i7 = hvVar.r();
        } else {
            i7 = 0;
        }
        return Math.max(r10, i7) + i10 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Z;
    }

    @Override
    public final void T() {
        this.X.i(this.W);
        hv hvVar = this.Y;
        if (hvVar != null) {
            hvVar.i(this.W);
        }
    }

    @Override
    public final void V() {
        this.X.f(this.W);
        hv hvVar = this.Y;
        if (hvVar != null) {
            hvVar.f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        canvas.save();
        hv hvVar = this.X;
        canvas.translate(j0(hvVar), 0.0f);
        hvVar.d(canvas, hvVar.T);
        canvas.restore();
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            canvas.save();
            canvas.translate(j0(hvVar2), i0() + hvVar.f24222b.getHeight());
            hvVar2.d(canvas, hvVar2.T);
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        hv hvVar = this.X;
        int height = hvVar.f24222b.getHeight();
        float y10 = motionEvent.getY();
        int i10 = 0;
        if (y10 >= 0.0f && y10 < height) {
            i7 = j0(hvVar);
        } else {
            hvVar = this.Y;
            if (hvVar == null || y10 < i0() + height) {
                return false;
            }
            int j02 = j0(hvVar);
            i10 = i0() + height;
            i7 = j02;
        }
        motionEvent.offsetLocation(-i7, -i10);
        boolean t6 = hvVar.t(motionEvent);
        motionEvent.offsetLocation(i7, i10);
        return t6;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        hv hvVar = this.X;
        hvVar.f24223c = (j0(hvVar) + i7) - hvVar.f24225f;
        hvVar.d = i10;
        hvVar.f24224e = i11;
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            hvVar2.f24223c = (j0(hvVar2) + i7) - hvVar2.f24225f;
            hvVar2.d = i0() + hvVar.f24222b.getHeight() + i10;
            hvVar2.f24224e = i11;
        }
    }

    @Override
    public final Layout a() {
        return this.X.f24222b;
    }

    public final int i0() {
        if (this.Y != null) {
            return g0.L(2.0f);
        }
        return 0;
    }

    public final int j0(hv hvVar) {
        int L;
        int r10;
        boolean z10 = this.f28005a0;
        Rect rect = this.f22942b;
        iv ivVar = this.f22941a;
        if (z10) {
            L = (((ivVar.C + ivVar.T) - ivVar.S) - hvVar.r()) / 2;
            r10 = rect.left;
        } else if (!ivVar.I()) {
            return 0;
        } else {
            L = (((ivVar.C + ivVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
            r10 = hvVar.r();
        }
        return L - r10;
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        cu.l(spannableStringBuilder, null, this.Z);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, tt ttVar) {
        hv hvVar = this.X;
        boolean o4 = hvVar.o(characterStyle, ttVar);
        Rect rect = this.f22942b;
        if (o4) {
            ttVar.f26733e = (j0(hvVar) + rect.left) - hvVar.f24225f;
            ttVar.f26734f = i7 + rect.top;
            return true;
        }
        hv hvVar2 = this.Y;
        if (hvVar2 != null && hvVar2.o(characterStyle, ttVar)) {
            ttVar.f26733e = (j0(hvVar2) + rect.left) - hvVar2.f24225f;
            ttVar.f26734f = i0() + hvVar.f24222b.getHeight() + i7 + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.f28005a0;
    }
}
