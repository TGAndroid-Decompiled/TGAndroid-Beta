package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ci extends View {
    public final int f32694a = 0;
    public final int f32695b;
    public final Object f32696c;
    public final Object d;
    public Object f32697e;

    public ci(ViewGroup viewGroup, int i7) {
        super(viewGroup.getContext());
        this.f32696c = new ArrayList();
        this.f32697e = new org.telegram.ui.gf0(this, 0);
        this.d = viewGroup;
        this.f32695b = i7;
    }

    public void a() {
        org.telegram.ui.gf0 gf0Var = (org.telegram.ui.gf0) this.f32697e;
        ArrayList arrayList = (ArrayList) this.f32696c;
        boolean isEmpty = arrayList.isEmpty();
        int i7 = this.f32695b;
        if (isEmpty && getVisibility() != 8) {
            org.telegram.messenger.qs.f(i7).f25127e.remove(gf0Var);
            org.telegram.messenger.qs.f(i7).d(gf0Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            org.telegram.messenger.qs.f(i7).f25127e.remove(gf0Var);
            setVisibility(0);
        }
    }

    public void b(sh.d dVar, boolean z9) {
        boolean z10;
        sh.d dVar2;
        sh.d dVar3;
        te.a aVar = (te.a) this.d;
        if (dVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, z9);
        if (isAttachedToWindow() && (dVar3 = (sh.d) this.f32697e) != null) {
            dVar3.b();
        }
        this.f32697e = dVar;
        if (isAttachedToWindow() && (dVar2 = (sh.d) this.f32697e) != null) {
            dVar2.a(this);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f32694a) {
            case 2:
                super.onAttachedToWindow();
                sh.d dVar = (sh.d) this.f32697e;
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
        switch (this.f32694a) {
            case 2:
                super.onDetachedFromWindow();
                sh.d dVar = (sh.d) this.f32697e;
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
        switch (this.f32694a) {
            case 0:
                bg.c0 c0Var = (bg.c0) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f32696c;
                int i7 = this.f32695b;
                c0Var.b(org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.w0(i7, g6Var)));
                c0Var.draw(canvas);
                bg.c0 c0Var2 = (bg.c0) this.f32697e;
                c0Var2.b(org.telegram.ui.ActionBar.l6.r1(0.95f, org.telegram.ui.ActionBar.l6.w0(i7, g6Var)));
                c0Var2.draw(canvas);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f32696c;
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
                float f10 = ((te.a) this.d).f55499e;
                if (f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    canvas.scale(f11, f11, width, height);
                    ((Drawable) this.f32696c).draw(canvas);
                    canvas.restore();
                }
                if (f10 > 0.0f) {
                    float f12 = this.f32695b;
                    int L = org.telegram.messenger.g0.L(f12);
                    canvas.save();
                    canvas.translate((getWidth() - L) / 2, (getHeight() - L) / 2);
                    canvas.scale(f10, f10, org.telegram.messenger.g0.L(f12) / 2.0f, org.telegram.messenger.g0.L(f12) / 2.0f);
                    sh.d dVar = (sh.d) this.f32697e;
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
        switch (this.f32694a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                int i13 = org.telegram.messenger.g0.f22557m;
                bg.c0 c0Var = (bg.c0) this.d;
                c0Var.c(org.telegram.messenger.g0.L(12.0f) + i13, 0);
                c0Var.setBounds(0, 0, i7, org.telegram.messenger.g0.L(52.0f) + i13);
                bg.c0 c0Var2 = (bg.c0) this.f32697e;
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
                ((Drawable) this.f32696c).setBounds(i14, i15, i14 + L, L + i15);
                return;
        }
    }

    public ci(Context context, int i7) {
        super(context);
        this.d = new te.a(this, xq.h, 380L);
        this.f32695b = i7;
        Drawable h = jg.g.h(context, 2131232489);
        this.f32696c = h;
        org.telegram.ui.ActionBar.s6.x(this, h, org.telegram.ui.ActionBar.l6.f28066o7, null, PorterDuff.Mode.SRC_IN);
    }

    public ci(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = new bg.c0(2);
        this.f32697e = new bg.c0(2);
        this.f32696c = g6Var;
        this.f32695b = i7;
    }
}
