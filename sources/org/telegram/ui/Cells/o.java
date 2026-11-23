package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
public final class o extends View {
    public final int f31146a;
    public final int f31147b;
    public final int f31148c;
    public int d;
    public final ArrayList f31149e;
    public float f31150f;
    public float h;
    public Integer f31151n;

    public o(Context context) {
        super(context);
        this.f31149e = new ArrayList();
        this.f31146a = 20;
        this.f31147b = 60;
        this.f31148c = 60;
    }

    public final void a(ch.p0 p0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        TLRPC.Document document;
        org.telegram.ui.Components.p5 l10;
        String V;
        if (p0Var.f5470f != null) {
            tL_availableReaction = (TLRPC.TL_availableReaction) si.d0(k10.f24932t0).f26811r.get(p0Var.f5470f);
        } else {
            tL_availableReaction = null;
        }
        if (tL_availableReaction == null) {
            document = org.telegram.ui.Components.p5.e(k10.f24932t0, p0Var.f5471g);
            if (document != null && (V = gj.V(document, null, null)) != null) {
                tL_availableReaction = (TLRPC.TL_availableReaction) si.d0(k10.f24932t0).f26811r.get(V);
            }
            tL_availableReaction2 = tL_availableReaction;
        } else {
            tL_availableReaction2 = tL_availableReaction;
            document = null;
        }
        ArrayList arrayList = this.f31149e;
        if (document == null && tL_availableReaction2 != null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.H0(this);
            int i7 = this.d;
            this.d = i7 + 1;
            imageReceiver.f22665w1 = Integer.toString(i7);
            gc b10 = gc.b(tL_availableReaction2.around_animation);
            StringBuilder sb2 = new StringBuilder();
            int i10 = this.f31147b;
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
            l10 = org.telegram.ui.Components.p5.m(2, p0Var.f5471g, null, k10.f24932t0);
        } else {
            l10 = org.telegram.ui.Components.p5.l(2, k10.f24932t0, document);
        }
        if (this.f31151n != null) {
            l10.setColorFilter(new PorterDuffColorFilter(this.f31151n.intValue(), PorterDuff.Mode.MULTIPLY));
        }
        ch.d a10 = ch.d.a(l10, false, !l10.c());
        a10.f(this);
        arrayList.add(a10);
        invalidate();
    }

    public final void b(float f10, float f11) {
        setTranslationX(f10 - (getMeasuredWidth() / 2.0f));
        float measuredHeight = f11 - (getMeasuredHeight() / 2.0f);
        this.f31150f = measuredHeight;
        setTranslationY(measuredHeight + this.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(this.f31148c);
        int L2 = org.telegram.messenger.g0.L(this.f31147b);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f31149e;
            if (i7 < arrayList.size()) {
                Object obj = arrayList.get(i7);
                if (obj instanceof ImageReceiver) {
                    ImageReceiver imageReceiver = (ImageReceiver) obj;
                    float f10 = L2;
                    imageReceiver.y0((getMeasuredWidth() - L2) / 2.0f, (getMeasuredHeight() - L2) / 2.0f, f10, f10);
                    imageReceiver.h(canvas, null);
                } else if (obj instanceof ch.d) {
                    ch.d dVar = (ch.d) obj;
                    dVar.e((int) ((getMeasuredWidth() - L) / 2.0f), (int) ((getMeasuredHeight() - L) / 2.0f), (int) ((getMeasuredWidth() + L) / 2.0f), (int) ((getMeasuredHeight() + L) / 2.0f));
                    dVar.b(canvas);
                    if (dVar.c()) {
                        dVar.d(this);
                        arrayList.remove(dVar);
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f31149e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).R();
                } else if (obj instanceof ch.d) {
                    ((ch.d) obj).d(this);
                }
            }
        }
        arrayList.clear();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.f31146a;
        int i12 = this.f31147b;
        int max = Math.max(i11, i12);
        int i13 = this.f31148c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.max(i13, max)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.max(i13, Math.max(i11, i12))), 1073741824));
    }

    public void setColor(int i7) {
        this.f31151n = Integer.valueOf(i7);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f31149e;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).f22648p1 = porterDuffColorFilter;
                } else if (obj instanceof ch.d) {
                    ((ch.d) obj).f5325a.setColorFilter(porterDuffColorFilter2);
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
