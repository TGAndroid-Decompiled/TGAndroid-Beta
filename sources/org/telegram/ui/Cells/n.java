package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
public final class n extends View {
    public final int f22323a;
    public final int f22324b;
    public final int f22325c;
    public int d;
    public final ArrayList e;
    public float f22326f;
    public float h;
    public Integer f22327n;

    public n(Context context) {
        super(context);
        this.e = new ArrayList();
        this.f22323a = 20;
        this.f22324b = 60;
        this.f22325c = 60;
    }

    public final void a(sg.o0 o0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        TLRPC.Document document;
        org.telegram.ui.Components.f5 l4;
        String V;
        if (o0Var.f48434f != null) {
            tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(d20.f15147s0).f18341r.get(o0Var.f48434f);
        } else {
            tL_availableReaction = null;
        }
        if (tL_availableReaction == null) {
            document = org.telegram.ui.Components.f5.e(d20.f15147s0, o0Var.f48435g);
            if (document != null && (V = jj.V(document, null, null)) != null) {
                tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(d20.f15147s0).f18341r.get(V);
            }
            tL_availableReaction2 = tL_availableReaction;
        } else {
            tL_availableReaction2 = tL_availableReaction;
            document = null;
        }
        ArrayList arrayList = this.e;
        if (document == null && tL_availableReaction2 != null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.H0(this);
            int i10 = this.d;
            this.d = i10 + 1;
            imageReceiver.f14413v1 = Integer.toString(i10);
            ic b10 = ic.b(tL_availableReaction2.around_animation);
            StringBuilder sb2 = new StringBuilder();
            int i11 = this.f22324b;
            sb2.append(i11);
            sb2.append("_");
            sb2.append(i11);
            sb2.append("_nolimit");
            imageReceiver.q0(b10, sb2.toString(), null, "tgs", tL_availableReaction2, 1);
            imageReceiver.W(0);
            imageReceiver.P();
            arrayList.add(imageReceiver);
            invalidate();
            return;
        }
        if (document == null) {
            l4 = org.telegram.ui.Components.f5.m(2, o0Var.f48435g, null, d20.f15147s0);
        } else {
            l4 = org.telegram.ui.Components.f5.l(2, d20.f15147s0, document);
        }
        if (this.f22327n != null) {
            l4.setColorFilter(new PorterDuffColorFilter(this.f22327n.intValue(), PorterDuff.Mode.MULTIPLY));
        }
        sg.d a2 = sg.d.a(l4, false, !l4.c());
        a2.f(this);
        arrayList.add(a2);
        invalidate();
    }

    public final void b(float f7, float f10) {
        setTranslationX(f7 - (getMeasuredWidth() / 2.0f));
        float measuredHeight = f10 - (getMeasuredHeight() / 2.0f);
        this.f22326f = measuredHeight;
        setTranslationY(measuredHeight + this.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(this.f22325c);
        int L2 = org.telegram.messenger.i0.L(this.f22324b);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                if (obj instanceof ImageReceiver) {
                    ImageReceiver imageReceiver = (ImageReceiver) obj;
                    float f7 = L2;
                    imageReceiver.y0((getMeasuredWidth() - L2) / 2.0f, (getMeasuredHeight() - L2) / 2.0f, f7, f7);
                    imageReceiver.h(canvas, null);
                } else if (obj instanceof sg.d) {
                    sg.d dVar = (sg.d) obj;
                    dVar.e((int) ((getMeasuredWidth() - L) / 2.0f), (int) ((getMeasuredHeight() - L) / 2.0f), (int) ((getMeasuredWidth() + L) / 2.0f), (int) ((getMeasuredHeight() + L) / 2.0f));
                    dVar.b(canvas);
                    if (dVar.c()) {
                        dVar.d(this);
                        arrayList.remove(dVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).R();
                } else if (obj instanceof sg.d) {
                    ((sg.d) obj).d(this);
                }
            }
        }
        arrayList.clear();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f22323a;
        int i13 = this.f22324b;
        int max = Math.max(i12, i13);
        int i14 = this.f22325c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(Math.max(i14, max)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(Math.max(i14, Math.max(i12, i13))), 1073741824));
    }

    public void setColor(int i10) {
        this.f22327n = Integer.valueOf(i10);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i11 < arrayList.size()) {
                Object obj = arrayList.get(i11);
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).f14397o1 = porterDuffColorFilter;
                } else if (obj instanceof sg.d) {
                    ((sg.d) obj).f48307a.setColorFilter(porterDuffColorFilter2);
                }
                i11++;
            } else {
                return;
            }
        }
    }
}
