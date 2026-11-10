package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class bi extends View {
    public final int f32270a = 0;
    public final int f32271b;
    public final Object f32272c;
    public final Object d;
    public Object f32273e;

    public bi(ViewGroup viewGroup, int i7) {
        super(viewGroup.getContext());
        this.f32272c = new ArrayList();
        this.f32273e = new org.telegram.ui.hf0(this, 0);
        this.d = viewGroup;
        this.f32271b = i7;
    }

    public void a() {
        org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) this.f32273e;
        ArrayList arrayList = (ArrayList) this.f32272c;
        boolean isEmpty = arrayList.isEmpty();
        int i7 = this.f32271b;
        if (isEmpty && getVisibility() != 8) {
            org.telegram.messenger.qs.f(i7).f25131e.remove(hf0Var);
            org.telegram.messenger.qs.f(i7).d(hf0Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            org.telegram.messenger.qs.f(i7).f25131e.remove(hf0Var);
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
        if (isAttachedToWindow() && (dVar3 = (sh.d) this.f32273e) != null) {
            dVar3.b();
        }
        this.f32273e = dVar;
        if (isAttachedToWindow() && (dVar2 = (sh.d) this.f32273e) != null) {
            dVar2.a(this);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f32270a) {
            case 2:
                super.onAttachedToWindow();
                sh.d dVar = (sh.d) this.f32273e;
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
        switch (this.f32270a) {
            case 2:
                super.onDetachedFromWindow();
                sh.d dVar = (sh.d) this.f32273e;
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
        switch (this.f32270a) {
            case 0:
                bg.c0 c0Var = (bg.c0) this.d;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f32272c;
                int i7 = this.f32271b;
                c0Var.b(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
                c0Var.draw(canvas);
                bg.c0 c0Var2 = (bg.c0) this.f32273e;
                c0Var2.b(org.telegram.ui.ActionBar.m6.r1(0.95f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
                c0Var2.draw(canvas);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f32272c;
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
                float f10 = ((te.a) this.d).f55498e;
                if (f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    canvas.scale(f11, f11, width, height);
                    ((Drawable) this.f32272c).draw(canvas);
                    canvas.restore();
                }
                if (f10 > 0.0f) {
                    float f12 = this.f32271b;
                    int L = org.telegram.messenger.g0.L(f12);
                    canvas.save();
                    canvas.translate((getWidth() - L) / 2, (getHeight() - L) / 2);
                    canvas.scale(f10, f10, org.telegram.messenger.g0.L(f12) / 2.0f, org.telegram.messenger.g0.L(f12) / 2.0f);
                    sh.d dVar = (sh.d) this.f32273e;
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
        switch (this.f32270a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                int i13 = org.telegram.messenger.g0.f22561m;
                bg.c0 c0Var = (bg.c0) this.d;
                c0Var.c(org.telegram.messenger.g0.L(12.0f) + i13, 0);
                c0Var.setBounds(0, 0, i7, org.telegram.messenger.g0.L(52.0f) + i13);
                bg.c0 c0Var2 = (bg.c0) this.f32273e;
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
                ((Drawable) this.f32272c).setBounds(i14, i15, i14 + L, L + i15);
                return;
        }
    }

    public bi(Context context, int i7) {
        super(context);
        this.d = new te.a(this, wq.h, 380L);
        this.f32271b = i7;
        Drawable h = jg.g.h(context, 2131232489);
        this.f32272c = h;
        org.telegram.ui.ActionBar.t6.x(this, h, org.telegram.ui.ActionBar.m6.f28091o7, null, PorterDuff.Mode.SRC_IN);
    }

    public bi(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = new bg.c0(2);
        this.f32273e = new bg.c0(2);
        this.f32272c = h6Var;
        this.f32271b = i7;
    }
}
