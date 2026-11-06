package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ci extends View {
    public final int f32575a = 0;
    public final int f32576b;
    public final Object f32577c;
    public final Object d;
    public Object f32578e;

    public ci(ViewGroup viewGroup, int i7) {
        super(viewGroup.getContext());
        this.f32577c = new ArrayList();
        this.f32578e = new org.telegram.ui.ef0(this, 0);
        this.d = viewGroup;
        this.f32576b = i7;
    }

    public void a() {
        org.telegram.ui.ef0 ef0Var = (org.telegram.ui.ef0) this.f32578e;
        ArrayList arrayList = (ArrayList) this.f32577c;
        boolean isEmpty = arrayList.isEmpty();
        int i7 = this.f32576b;
        if (isEmpty && getVisibility() != 8) {
            org.telegram.messenger.qs.f(i7).f25110e.remove(ef0Var);
            org.telegram.messenger.qs.f(i7).d(ef0Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            org.telegram.messenger.qs.f(i7).f25110e.remove(ef0Var);
            setVisibility(0);
        }
    }

    public void b(sh.c cVar, boolean z9) {
        boolean z10;
        sh.c cVar2;
        sh.c cVar3;
        te.a aVar = (te.a) this.d;
        if (cVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, z9);
        if (isAttachedToWindow() && (cVar3 = (sh.c) this.f32578e) != null) {
            cVar3.b();
        }
        this.f32578e = cVar;
        if (isAttachedToWindow() && (cVar2 = (sh.c) this.f32578e) != null) {
            cVar2.a(this);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f32575a) {
            case 2:
                super.onAttachedToWindow();
                sh.c cVar = (sh.c) this.f32578e;
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
        switch (this.f32575a) {
            case 2:
                super.onDetachedFromWindow();
                sh.c cVar = (sh.c) this.f32578e;
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
        switch (this.f32575a) {
            case 0:
                bg.c0 c0Var = (bg.c0) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f32577c;
                int i7 = this.f32576b;
                c0Var.b(org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var)));
                c0Var.draw(canvas);
                bg.c0 c0Var2 = (bg.c0) this.f32578e;
                c0Var2.b(org.telegram.ui.ActionBar.k6.r1(0.95f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var)));
                c0Var2.draw(canvas);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f32577c;
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
                float f10 = ((te.a) this.d).f55370e;
                if (f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    canvas.scale(f11, f11, width, height);
                    ((Drawable) this.f32577c).draw(canvas);
                    canvas.restore();
                }
                if (f10 > 0.0f) {
                    float f12 = this.f32576b;
                    int L = org.telegram.messenger.g0.L(f12);
                    canvas.save();
                    canvas.translate((getWidth() - L) / 2, (getHeight() - L) / 2);
                    canvas.scale(f10, f10, org.telegram.messenger.g0.L(f12) / 2.0f, org.telegram.messenger.g0.L(f12) / 2.0f);
                    sh.c cVar = (sh.c) this.f32578e;
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
        switch (this.f32575a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                int i13 = org.telegram.messenger.g0.f22531m;
                bg.c0 c0Var = (bg.c0) this.d;
                c0Var.c(org.telegram.messenger.g0.L(12.0f) + i13, 0);
                c0Var.setBounds(0, 0, i7, org.telegram.messenger.g0.L(52.0f) + i13);
                bg.c0 c0Var2 = (bg.c0) this.f32578e;
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
                ((Drawable) this.f32577c).setBounds(i14, i15, i14 + L, L + i15);
                return;
        }
    }

    public ci(Context context, int i7) {
        super(context);
        this.d = new te.a(this, xq.h, 380L);
        this.f32576b = i7;
        Drawable h = jg.g.h(context, 2131232489);
        this.f32577c = h;
        org.telegram.ui.ActionBar.r6.y(this, h, org.telegram.ui.ActionBar.k6.f28049o7, null, PorterDuff.Mode.SRC_IN);
    }

    public ci(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = new bg.c0(2);
        this.f32578e = new bg.c0(2);
        this.f32577c = f6Var;
        this.f32576b = i7;
    }
}
