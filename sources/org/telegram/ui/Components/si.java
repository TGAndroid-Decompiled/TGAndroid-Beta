package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class si extends View {
    public final int f39623a = 0;
    public final int f39624b;
    public final Object f39625c;
    public final Object d;
    public Object f39626e;

    public si(ViewGroup viewGroup, int i7) {
        super(viewGroup.getContext());
        this.f39625c = new ArrayList();
        this.f39626e = new org.telegram.ui.gf0(this, 0);
        this.d = viewGroup;
        this.f39624b = i7;
    }

    public void a() {
        org.telegram.ui.gf0 gf0Var = (org.telegram.ui.gf0) this.f39626e;
        ArrayList arrayList = (ArrayList) this.f39625c;
        boolean isEmpty = arrayList.isEmpty();
        int i7 = this.f39624b;
        if (isEmpty && getVisibility() != 8) {
            org.telegram.messenger.ks.f(i7).f25340e.remove(gf0Var);
            org.telegram.messenger.ks.f(i7).d(gf0Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            org.telegram.messenger.ks.f(i7).f25340e.remove(gf0Var);
            setVisibility(0);
        }
    }

    public void b(sh.c cVar, boolean z10) {
        boolean z11;
        sh.c cVar2;
        sh.c cVar3;
        te.a aVar = (te.a) this.d;
        if (cVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.a(z11, z10);
        if (isAttachedToWindow() && (cVar3 = (sh.c) this.f39626e) != null) {
            cVar3.b();
        }
        this.f39626e = cVar;
        if (isAttachedToWindow() && (cVar2 = (sh.c) this.f39626e) != null) {
            cVar2.a(this);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f39623a) {
            case 2:
                super.onAttachedToWindow();
                sh.c cVar = (sh.c) this.f39626e;
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
        switch (this.f39623a) {
            case 2:
                super.onDetachedFromWindow();
                sh.c cVar = (sh.c) this.f39626e;
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
        switch (this.f39623a) {
            case 0:
                bg.d0 d0Var = (bg.d0) this.d;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f39625c;
                int i7 = this.f39624b;
                d0Var.b(org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
                d0Var.draw(canvas);
                bg.d0 d0Var2 = (bg.d0) this.f39626e;
                d0Var2.b(org.telegram.ui.ActionBar.n6.r1(0.95f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
                d0Var2.draw(canvas);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f39625c;
                if (!arrayList.isEmpty()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((org.telegram.ui.hf0) arrayList.get(i10)).a(canvas);
                    }
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f10 = ((te.a) this.d).f57779e;
                if (f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    canvas.scale(f11, f11, width, height);
                    ((Drawable) this.f39625c).draw(canvas);
                    canvas.restore();
                }
                if (f10 > 0.0f) {
                    float f12 = this.f39624b;
                    int L = org.telegram.messenger.g0.L(f12);
                    canvas.save();
                    canvas.translate((getWidth() - L) / 2, (getHeight() - L) / 2);
                    canvas.scale(f10, f10, org.telegram.messenger.g0.L(f12) / 2.0f, org.telegram.messenger.g0.L(f12) / 2.0f);
                    sh.c cVar = (sh.c) this.f39626e;
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
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f39623a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                int i13 = org.telegram.messenger.g0.f24220m;
                bg.d0 d0Var = (bg.d0) this.d;
                d0Var.c(org.telegram.messenger.g0.L(12.0f) + i13, 0);
                d0Var.setBounds(0, 0, i7, org.telegram.messenger.g0.L(52.0f) + i13);
                bg.d0 d0Var2 = (bg.d0) this.f39626e;
                d0Var2.c(i13 / 3, 0);
                d0Var2.setBounds(0, 0, i7, i13);
                return;
            case 1:
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
            case 2:
                super.onSizeChanged(i7, i10, i11, i12);
                int L = org.telegram.messenger.g0.L(24.0f);
                int i14 = (i7 - L) / 2;
                int i15 = (i10 - L) / 2;
                ((Drawable) this.f39625c).setBounds(i14, i15, i14 + L, L + i15);
                return;
        }
    }

    public si(Context context, int i7) {
        super(context);
        this.d = new te.a(this, kr.h, 380L);
        this.f39624b = i7;
        Drawable g10 = i5.c.g(context, 2131232494);
        this.f39625c = g10;
        org.telegram.ui.ActionBar.u6.x(this, g10, org.telegram.ui.ActionBar.n6.f29652o7, null, PorterDuff.Mode.SRC_IN);
    }

    public si(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.d = new bg.d0(2);
        this.f39626e = new bg.d0(2);
        this.f39625c = i6Var;
        this.f39624b = i7;
    }
}
