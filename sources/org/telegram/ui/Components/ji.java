package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ji extends View {
    public final int f36015a = 0;
    public final int f36016b;
    public final Object f36017c;
    public final Object d;
    public Object f36018e;

    public ji(ViewGroup viewGroup, int i7) {
        super(viewGroup.getContext());
        this.f36017c = new ArrayList();
        this.f36018e = new org.telegram.ui.ef0(this, 0);
        this.d = viewGroup;
        this.f36016b = i7;
    }

    public void a() {
        org.telegram.ui.ef0 ef0Var = (org.telegram.ui.ef0) this.f36018e;
        ArrayList arrayList = (ArrayList) this.f36017c;
        boolean isEmpty = arrayList.isEmpty();
        int i7 = this.f36016b;
        if (isEmpty && getVisibility() != 8) {
            org.telegram.messenger.ns.f(i7).f25623e.remove(ef0Var);
            org.telegram.messenger.ns.f(i7).d(ef0Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            org.telegram.messenger.ns.f(i7).f25623e.remove(ef0Var);
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
        if (isAttachedToWindow() && (cVar3 = (sh.c) this.f36018e) != null) {
            cVar3.b();
        }
        this.f36018e = cVar;
        if (isAttachedToWindow() && (cVar2 = (sh.c) this.f36018e) != null) {
            cVar2.a(this);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f36015a) {
            case 2:
                super.onAttachedToWindow();
                sh.c cVar = (sh.c) this.f36018e;
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
        switch (this.f36015a) {
            case 2:
                super.onDetachedFromWindow();
                sh.c cVar = (sh.c) this.f36018e;
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
        switch (this.f36015a) {
            case 0:
                bg.c0 c0Var = (bg.c0) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f36017c;
                int i7 = this.f36016b;
                c0Var.b(org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)));
                c0Var.draw(canvas);
                bg.c0 c0Var2 = (bg.c0) this.f36018e;
                c0Var2.b(org.telegram.ui.ActionBar.j6.r1(0.95f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)));
                c0Var2.draw(canvas);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f36017c;
                if (!arrayList.isEmpty()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((org.telegram.ui.ff0) arrayList.get(i10)).a(canvas);
                    }
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f10 = ((te.a) this.d).f57081e;
                if (f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    canvas.scale(f11, f11, width, height);
                    ((Drawable) this.f36017c).draw(canvas);
                    canvas.restore();
                }
                if (f10 > 0.0f) {
                    float f12 = this.f36016b;
                    int L = org.telegram.messenger.g0.L(f12);
                    canvas.save();
                    canvas.translate((getWidth() - L) / 2, (getHeight() - L) / 2);
                    canvas.scale(f10, f10, org.telegram.messenger.g0.L(f12) / 2.0f, org.telegram.messenger.g0.L(f12) / 2.0f);
                    sh.c cVar = (sh.c) this.f36018e;
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
        switch (this.f36015a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                int i13 = org.telegram.messenger.g0.f23603m;
                bg.c0 c0Var = (bg.c0) this.d;
                c0Var.c(org.telegram.messenger.g0.L(12.0f) + i13, 0);
                c0Var.setBounds(0, 0, i7, org.telegram.messenger.g0.L(52.0f) + i13);
                bg.c0 c0Var2 = (bg.c0) this.f36018e;
                c0Var2.c(i13 / 3, 0);
                c0Var2.setBounds(0, 0, i7, i13);
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
                ((Drawable) this.f36017c).setBounds(i14, i15, i14 + L, L + i15);
                return;
        }
    }

    public ji(Context context, int i7) {
        super(context);
        this.d = new te.a(this, er.h, 380L);
        this.f36016b = i7;
        Drawable g10 = i5.c.g(context, 2131232490);
        this.f36017c = g10;
        org.telegram.ui.ActionBar.q6.x(this, g10, org.telegram.ui.ActionBar.j6.f29050o7, null, PorterDuff.Mode.SRC_IN);
    }

    public ji(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = new bg.c0(2);
        this.f36018e = new bg.c0(2);
        this.f36017c = e6Var;
        this.f36016b = i7;
    }
}
