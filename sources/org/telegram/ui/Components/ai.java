package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ai extends View {
    public final int f31848a = 0;
    public final int f31849b;
    public final Object f31850c;
    public final Object d;
    public Object f31851e;

    public ai(ViewGroup viewGroup, int i3) {
        super(viewGroup.getContext());
        this.f31850c = new ArrayList();
        this.f31851e = new org.telegram.ui.fz(this, 29);
        this.d = viewGroup;
        this.f31849b = i3;
    }

    public void a() {
        org.telegram.ui.fz fzVar = (org.telegram.ui.fz) this.f31851e;
        ArrayList arrayList = (ArrayList) this.f31850c;
        boolean isEmpty = arrayList.isEmpty();
        int i3 = this.f31849b;
        if (isEmpty && getVisibility() != 8) {
            org.telegram.messenger.hs.f(i3).f23356e.remove(fzVar);
            org.telegram.messenger.hs.f(i3).d(fzVar);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            org.telegram.messenger.hs.f(i3).f23356e.remove(fzVar);
            setVisibility(0);
        }
    }

    public void b(th.c cVar, boolean z10) {
        boolean z11;
        th.c cVar2;
        th.c cVar3;
        qe.a aVar = (qe.a) this.d;
        if (cVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.a(z11, z10);
        if (isAttachedToWindow() && (cVar3 = (th.c) this.f31851e) != null) {
            cVar3.b();
        }
        this.f31851e = cVar;
        if (isAttachedToWindow() && (cVar2 = (th.c) this.f31851e) != null) {
            cVar2.a(this);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f31848a) {
            case 2:
                super.onAttachedToWindow();
                th.c cVar = (th.c) this.f31851e;
                if (cVar != null) {
                    cVar.a(this);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f31848a) {
            case 2:
                super.onDetachedFromWindow();
                th.c cVar = (th.c) this.f31851e;
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f31848a) {
            case 0:
                cg.b0 b0Var = (cg.b0) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f31850c;
                int i3 = this.f31849b;
                b0Var.b(org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
                b0Var.draw(canvas);
                cg.b0 b0Var2 = (cg.b0) this.f31851e;
                b0Var2.b(org.telegram.ui.ActionBar.k6.r1(0.95f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
                b0Var2.draw(canvas);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f31850c;
                if (!arrayList.isEmpty()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((org.telegram.ui.ze0) arrayList.get(i10)).a(canvas);
                    }
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f10 = ((qe.a) this.d).f53840e;
                if (f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    canvas.scale(f11, f11, width, height);
                    ((Drawable) this.f31850c).draw(canvas);
                    canvas.restore();
                }
                if (f10 > 0.0f) {
                    float f12 = this.f31849b;
                    int L = org.telegram.messenger.g0.L(f12);
                    canvas.save();
                    canvas.translate((getWidth() - L) / 2, (getHeight() - L) / 2);
                    canvas.scale(f10, f10, org.telegram.messenger.g0.L(f12) / 2.0f, org.telegram.messenger.g0.L(f12) / 2.0f);
                    th.c cVar = (th.c) this.f31851e;
                    if (cVar != null) {
                        cVar.c(canvas, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12));
                    }
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f31848a) {
            case 0:
                super.onSizeChanged(i3, i10, i11, i12);
                int i13 = org.telegram.messenger.g0.f22602m;
                cg.b0 b0Var = (cg.b0) this.d;
                b0Var.c(org.telegram.messenger.g0.L(12.0f) + i13, 0);
                b0Var.setBounds(0, 0, i3, org.telegram.messenger.g0.L(52.0f) + i13);
                cg.b0 b0Var2 = (cg.b0) this.f31851e;
                b0Var2.c(i13 / 3, 0);
                b0Var2.setBounds(0, 0, i3, i13);
                return;
            case 1:
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
            case 2:
                super.onSizeChanged(i3, i10, i11, i12);
                int L = org.telegram.messenger.g0.L(24.0f);
                int i14 = (i3 - L) / 2;
                int i15 = (i10 - L) / 2;
                ((Drawable) this.f31850c).setBounds(i14, i15, i14 + L, L + i15);
                return;
        }
    }

    public ai(Context context, int i3) {
        super(context);
        this.d = new qe.a(this, xq.h, 380L);
        this.f31849b = i3;
        Drawable g7 = k2.p1.g(context, 2131232489);
        this.f31850c = g7;
        org.telegram.ui.ActionBar.r6.y(this, g7, org.telegram.ui.ActionBar.k6.f28082o7, null, PorterDuff.Mode.SRC_IN);
    }

    public ai(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = new cg.b0(2);
        this.f31851e = new cg.b0(2);
        this.f31850c = e6Var;
        this.f31849b = i3;
    }
}
