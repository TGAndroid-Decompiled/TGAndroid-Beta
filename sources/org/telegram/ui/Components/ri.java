package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ri extends View {
    public final int f39151a = 0;
    public final int f39152b;
    public final Object f39153c;
    public final Object d;
    public Object f39154e;

    public ri(ViewGroup viewGroup, int i7) {
        super(viewGroup.getContext());
        this.f39153c = new ArrayList();
        this.f39154e = new org.telegram.ui.if0(this, 0);
        this.d = viewGroup;
        this.f39152b = i7;
    }

    public void a() {
        org.telegram.ui.if0 if0Var = (org.telegram.ui.if0) this.f39154e;
        ArrayList arrayList = (ArrayList) this.f39153c;
        boolean isEmpty = arrayList.isEmpty();
        int i7 = this.f39152b;
        if (isEmpty && getVisibility() != 8) {
            org.telegram.messenger.ks.f(i7).f25241e.remove(if0Var);
            org.telegram.messenger.ks.f(i7).d(if0Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            org.telegram.messenger.ks.f(i7).f25241e.remove(if0Var);
            setVisibility(0);
        }
    }

    public void b(sh.d dVar, boolean z10) {
        boolean z11;
        sh.d dVar2;
        sh.d dVar3;
        te.a aVar = (te.a) this.d;
        if (dVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.a(z11, z10);
        if (isAttachedToWindow() && (dVar3 = (sh.d) this.f39154e) != null) {
            dVar3.b();
        }
        this.f39154e = dVar;
        if (isAttachedToWindow() && (dVar2 = (sh.d) this.f39154e) != null) {
            dVar2.a(this);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f39151a) {
            case 2:
                super.onAttachedToWindow();
                sh.d dVar = (sh.d) this.f39154e;
                if (dVar != null) {
                    dVar.a(this);
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
        switch (this.f39151a) {
            case 2:
                super.onDetachedFromWindow();
                sh.d dVar = (sh.d) this.f39154e;
                if (dVar != null) {
                    dVar.b();
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
        switch (this.f39151a) {
            case 0:
                bg.d0 d0Var = (bg.d0) this.d;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f39153c;
                int i7 = this.f39152b;
                d0Var.b(org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
                d0Var.draw(canvas);
                bg.d0 d0Var2 = (bg.d0) this.f39154e;
                d0Var2.b(org.telegram.ui.ActionBar.n6.r1(0.95f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
                d0Var2.draw(canvas);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f39153c;
                if (!arrayList.isEmpty()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((org.telegram.ui.jf0) arrayList.get(i10)).a(canvas);
                    }
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f10 = ((te.a) this.d).f57657e;
                if (f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    canvas.scale(f11, f11, width, height);
                    ((Drawable) this.f39153c).draw(canvas);
                    canvas.restore();
                }
                if (f10 > 0.0f) {
                    float f12 = this.f39152b;
                    int L = org.telegram.messenger.g0.L(f12);
                    canvas.save();
                    canvas.translate((getWidth() - L) / 2, (getHeight() - L) / 2);
                    canvas.scale(f10, f10, org.telegram.messenger.g0.L(f12) / 2.0f, org.telegram.messenger.g0.L(f12) / 2.0f);
                    sh.d dVar = (sh.d) this.f39154e;
                    if (dVar != null) {
                        dVar.c(canvas, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12));
                    }
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f39151a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                int i13 = org.telegram.messenger.g0.f24112m;
                bg.d0 d0Var = (bg.d0) this.d;
                d0Var.c(org.telegram.messenger.g0.L(12.0f) + i13, 0);
                d0Var.setBounds(0, 0, i7, org.telegram.messenger.g0.L(52.0f) + i13);
                bg.d0 d0Var2 = (bg.d0) this.f39154e;
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
                ((Drawable) this.f39153c).setBounds(i14, i15, i14 + L, L + i15);
                return;
        }
    }

    public ri(Context context, int i7) {
        super(context);
        this.d = new te.a(this, lr.h, 380L);
        this.f39152b = i7;
        Drawable g10 = i5.c.g(context, 2131232491);
        this.f39153c = g10;
        org.telegram.ui.ActionBar.u6.x(this, g10, org.telegram.ui.ActionBar.n6.f29595o7, null, PorterDuff.Mode.SRC_IN);
    }

    public ri(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.d = new bg.d0(2);
        this.f39154e = new bg.d0(2);
        this.f39153c = i6Var;
        this.f39152b = i7;
    }
}
