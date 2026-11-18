package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
public final class o extends View {
    public final int f31149a;
    public final int f31150b;
    public final int f31151c;
    public int d;
    public final ArrayList f31152e;
    public float f31153f;
    public float h;
    public Integer f31154n;

    public o(Context context) {
        super(context);
        this.f31152e = new ArrayList();
        this.f31149a = 20;
        this.f31150b = 60;
        this.f31151c = 60;
    }

    public final void a(ch.p0 p0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        TLRPC.Document document;
        org.telegram.ui.Components.o5 l10;
        String V;
        if (p0Var.f5475f != null) {
            tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(j10.f24770t0).f26633r.get(p0Var.f5475f);
        } else {
            tL_availableReaction = null;
        }
        if (tL_availableReaction == null) {
            document = org.telegram.ui.Components.o5.e(j10.f24770t0, p0Var.f5476g);
            if (document != null && (V = fj.V(document, null, null)) != null) {
                tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(j10.f24770t0).f26633r.get(V);
            }
            tL_availableReaction2 = tL_availableReaction;
        } else {
            tL_availableReaction2 = tL_availableReaction;
            document = null;
        }
        ArrayList arrayList = this.f31152e;
        if (document == null && tL_availableReaction2 != null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.H0(this);
            int i7 = this.d;
            this.d = i7 + 1;
            imageReceiver.f22670w1 = Integer.toString(i7);
            fc b10 = fc.b(tL_availableReaction2.around_animation);
            StringBuilder sb2 = new StringBuilder();
            int i10 = this.f31150b;
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
            l10 = org.telegram.ui.Components.o5.m(2, p0Var.f5476g, null, j10.f24770t0);
        } else {
            l10 = org.telegram.ui.Components.o5.l(2, j10.f24770t0, document);
        }
        if (this.f31154n != null) {
            l10.setColorFilter(new PorterDuffColorFilter(this.f31154n.intValue(), PorterDuff.Mode.MULTIPLY));
        }
        ch.d a10 = ch.d.a(l10, false, !l10.c());
        a10.f(this);
        arrayList.add(a10);
        invalidate();
    }

    public final void b(float f10, float f11) {
        setTranslationX(f10 - (getMeasuredWidth() / 2.0f));
        float measuredHeight = f11 - (getMeasuredHeight() / 2.0f);
        this.f31153f = measuredHeight;
        setTranslationY(measuredHeight + this.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(this.f31151c);
        int L2 = org.telegram.messenger.g0.L(this.f31150b);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f31152e;
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
        ArrayList arrayList = this.f31152e;
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
        int i11 = this.f31149a;
        int i12 = this.f31150b;
        int max = Math.max(i11, i12);
        int i13 = this.f31151c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.max(i13, max)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.max(i13, Math.max(i11, i12))), 1073741824));
    }

    public void setColor(int i7) {
        this.f31154n = Integer.valueOf(i7);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f31152e;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).f22653p1 = porterDuffColorFilter;
                } else if (obj instanceof ch.d) {
                    ((ch.d) obj).f5330a.setColorFilter(porterDuffColorFilter2);
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
