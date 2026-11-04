package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
public final class o extends View {
    public final int f29717a;
    public final int f29718b;
    public final int f29719c;
    public int d;
    public final ArrayList f29720e;
    public float f29721f;
    public float h;
    public Integer f29722n;

    public o(Context context) {
        super(context);
        this.f29720e = new ArrayList();
        this.f29717a = 20;
        this.f29718b = 60;
        this.f29719c = 60;
    }

    public final void a(dh.n0 n0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        TLRPC.Document document;
        org.telegram.ui.Components.g5 l10;
        String V;
        if (n0Var.f9097f != null) {
            tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(h10.f22829t0).f24045r.get(n0Var.f9097f);
        } else {
            tL_availableReaction = null;
        }
        if (tL_availableReaction == null) {
            document = org.telegram.ui.Components.g5.e(h10.f22829t0, n0Var.f9098g);
            if (document != null && (V = zi.V(document, null, null)) != null) {
                tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(h10.f22829t0).f24045r.get(V);
            }
            tL_availableReaction2 = tL_availableReaction;
        } else {
            tL_availableReaction2 = tL_availableReaction;
            document = null;
        }
        ArrayList arrayList = this.f29720e;
        if (document == null && tL_availableReaction2 != null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.H0(this);
            int i3 = this.d;
            this.d = i3 + 1;
            imageReceiver.f21278w1 = Integer.toString(i3);
            ac b10 = ac.b(tL_availableReaction2.around_animation);
            StringBuilder sb2 = new StringBuilder();
            int i10 = this.f29718b;
            sb2.append(i10);
            sb2.append("_");
            sb2.append(i10);
            sb2.append("_nolimit");
            imageReceiver.q0(b10, sb2.toString(), null, "tgs", tL_availableReaction2, 1);
            imageReceiver.W(0);
            imageReceiver.P();
            arrayList.add(imageReceiver);
            invalidate();
            return;
        }
        if (document == null) {
            l10 = org.telegram.ui.Components.g5.m(2, n0Var.f9098g, null, h10.f22829t0);
        } else {
            l10 = org.telegram.ui.Components.g5.l(2, h10.f22829t0, document);
        }
        if (this.f29722n != null) {
            l10.setColorFilter(new PorterDuffColorFilter(this.f29722n.intValue(), PorterDuff.Mode.MULTIPLY));
        }
        dh.d a10 = dh.d.a(l10, false, !l10.c());
        a10.f(this);
        arrayList.add(a10);
        invalidate();
    }

    public final void b(float f10, float f11) {
        setTranslationX(f10 - (getMeasuredWidth() / 2.0f));
        float measuredHeight = f11 - (getMeasuredHeight() / 2.0f);
        this.f29721f = measuredHeight;
        setTranslationY(measuredHeight + this.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(this.f29719c);
        int L2 = org.telegram.messenger.g0.L(this.f29718b);
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f29720e;
            if (i3 < arrayList.size()) {
                Object obj = arrayList.get(i3);
                if (obj instanceof ImageReceiver) {
                    ImageReceiver imageReceiver = (ImageReceiver) obj;
                    float f10 = L2;
                    imageReceiver.y0((getMeasuredWidth() - L2) / 2.0f, (getMeasuredHeight() - L2) / 2.0f, f10, f10);
                    imageReceiver.h(canvas, null);
                } else if (obj instanceof dh.d) {
                    dh.d dVar = (dh.d) obj;
                    dVar.e((int) ((getMeasuredWidth() - L) / 2.0f), (int) ((getMeasuredHeight() - L) / 2.0f), (int) ((getMeasuredWidth() + L) / 2.0f), (int) ((getMeasuredHeight() + L) / 2.0f));
                    dVar.b(canvas);
                    if (dVar.c()) {
                        dVar.d(this);
                        arrayList.remove(dVar);
                    }
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f29720e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).R();
                } else if (obj instanceof dh.d) {
                    ((dh.d) obj).d(this);
                }
            }
        }
        arrayList.clear();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11 = this.f29717a;
        int i12 = this.f29718b;
        int max = Math.max(i11, i12);
        int i13 = this.f29719c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.max(i13, max)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.max(i13, Math.max(i11, i12))), 1073741824));
    }

    public void setColor(int i3) {
        this.f29722n = Integer.valueOf(i3);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY);
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29720e;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).f21261p1 = porterDuffColorFilter;
                } else if (obj instanceof dh.d) {
                    ((dh.d) obj).f8972a.setColorFilter(porterDuffColorFilter2);
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
