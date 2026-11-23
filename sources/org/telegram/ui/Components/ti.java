package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ti extends View {
    public final int f39871a = 0;
    public final int f39872b;
    public final Object f39873c;
    public final Object d;
    public Object f39874e;

    public ti(ViewGroup viewGroup, int i7) {
        super(viewGroup.getContext());
        this.f39873c = new ArrayList();
        this.f39874e = new org.telegram.ui.hf0(this, 0);
        this.d = viewGroup;
        this.f39872b = i7;
    }

    public void a() {
        org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) this.f39874e;
        ArrayList arrayList = (ArrayList) this.f39873c;
        boolean isEmpty = arrayList.isEmpty();
        int i7 = this.f39872b;
        if (isEmpty && getVisibility() != 8) {
            org.telegram.messenger.ls.f(i7).f25399e.remove(hf0Var);
            org.telegram.messenger.ls.f(i7).d(hf0Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            org.telegram.messenger.ls.f(i7).f25399e.remove(hf0Var);
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
        if (isAttachedToWindow() && (cVar3 = (sh.c) this.f39874e) != null) {
            cVar3.b();
        }
        this.f39874e = cVar;
        if (isAttachedToWindow() && (cVar2 = (sh.c) this.f39874e) != null) {
            cVar2.a(this);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f39871a) {
            case 2:
                super.onAttachedToWindow();
                sh.c cVar = (sh.c) this.f39874e;
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
        switch (this.f39871a) {
            case 2:
                super.onDetachedFromWindow();
                sh.c cVar = (sh.c) this.f39874e;
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
        switch (this.f39871a) {
            case 0:
                bg.d0 d0Var = (bg.d0) this.d;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f39873c;
                int i7 = this.f39872b;
                d0Var.b(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
                d0Var.draw(canvas);
                bg.d0 d0Var2 = (bg.d0) this.f39874e;
                d0Var2.b(org.telegram.ui.ActionBar.m6.r1(0.95f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
                d0Var2.draw(canvas);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f39873c;
                if (!arrayList.isEmpty()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((org.telegram.ui.if0) arrayList.get(i10)).a(canvas);
                    }
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f10 = ((te.a) this.d).f57665e;
                if (f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    canvas.scale(f11, f11, width, height);
                    ((Drawable) this.f39873c).draw(canvas);
                    canvas.restore();
                }
                if (f10 > 0.0f) {
                    float f12 = this.f39872b;
                    int L = org.telegram.messenger.g0.L(f12);
                    canvas.save();
                    canvas.translate((getWidth() - L) / 2, (getHeight() - L) / 2);
                    canvas.scale(f10, f10, org.telegram.messenger.g0.L(f12) / 2.0f, org.telegram.messenger.g0.L(f12) / 2.0f);
                    sh.c cVar = (sh.c) this.f39874e;
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
        switch (this.f39871a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                int i13 = org.telegram.messenger.g0.f24004m;
                bg.d0 d0Var = (bg.d0) this.d;
                d0Var.c(org.telegram.messenger.g0.L(12.0f) + i13, 0);
                d0Var.setBounds(0, 0, i7, org.telegram.messenger.g0.L(52.0f) + i13);
                bg.d0 d0Var2 = (bg.d0) this.f39874e;
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
                ((Drawable) this.f39873c).setBounds(i14, i15, i14 + L, L + i15);
                return;
        }
    }

    public ti(Context context, int i7) {
        super(context);
        this.d = new te.a(this, nr.h, 380L);
        this.f39872b = i7;
        Drawable g10 = i5.c.g(context, 2131232491);
        this.f39873c = g10;
        org.telegram.ui.ActionBar.t6.x(this, g10, org.telegram.ui.ActionBar.m6.f29548o7, null, PorterDuff.Mode.SRC_IN);
    }

    public ti(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = new bg.d0(2);
        this.f39874e = new bg.d0(2);
        this.f39873c = h6Var;
        this.f39872b = i7;
    }
}
