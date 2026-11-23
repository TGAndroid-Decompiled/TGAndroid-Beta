package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class wu extends FrameLayout {
    public final ev E;
    public final Paint f41892a;
    public final Path f41893b;
    public Boolean f41894c;
    public boolean d;
    public final SparseArray f41895e;
    public final ArrayList f41896f;
    public final ArrayList h;
    public final ArrayList f41897n;
    public final ArrayList f41898r;
    public final d6 f41899s;
    public ImageReceiver f41900w;
    public boolean f41901x;
    public final d6 f41902y;

    public wu(ev evVar, Context context) {
        super(context);
        this.E = evVar;
        this.f41892a = new Paint();
        this.f41893b = new Path();
        this.f41894c = null;
        this.f41895e = new SparseArray();
        this.f41896f = new ArrayList();
        this.h = new ArrayList();
        this.f41897n = new ArrayList();
        this.f41898r = new ArrayList();
        nr nrVar = nr.h;
        this.f41899s = new d6(this, 0L, 350L, nrVar);
        this.f41902y = new d6(this, 0L, 320L, nrVar);
    }

    public final void a() {
        y5[] y5VarArr;
        ev evVar = this.E;
        hi.x xVar = evVar.f34994r1;
        if (xVar == null) {
            y5VarArr = new y5[0];
        } else {
            y5[] y5VarArr2 = new y5[xVar.getChildCount()];
            for (int i7 = 0; i7 < xVar.getChildCount(); i7++) {
                View childAt = xVar.getChildAt(i7);
                if (childAt instanceof xu) {
                    y5VarArr2[i7] = ((xu) childAt).f42220c;
                }
            }
            y5VarArr = y5VarArr2;
        }
        evVar.f34990m1 = y5.update(3, this, y5VarArr, evVar.f34990m1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        boolean z11;
        int i7;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        vu vuVar;
        float f12;
        float f13;
        y5 y5Var;
        Canvas canvas2 = canvas;
        ev evVar = this.E;
        up upVar = evVar.A1;
        hi.x xVar = evVar.f34994r1;
        if (!this.d) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, evVar.J0);
        Paint paint = this.f41892a;
        paint.setColor(w02);
        org.telegram.ui.ActionBar.m6.n(paint);
        Path path = this.f41893b;
        path.reset();
        float J0 = evVar.J0();
        if (J0 <= evVar.f30176b.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.f41899s.d(z10);
        float T1 = org.telegram.messenger.g0.T1(J0, 0.0f, d);
        if (this.f41900w != null) {
            float L = org.telegram.messenger.g0.L(140.0f);
            f10 = 20.0f;
            float L2 = org.telegram.messenger.g0.L(20.0f);
            if (T1 < L + L2) {
                this.f41901x = false;
            }
            f11 = 2.0f;
            this.f41900w.setAlpha(this.f41902y.d(this.f41901x));
            if (this.f41900w.getAlpha() > 0.0f) {
                float alpha = ((this.f41900w.getAlpha() * 0.4f) + 0.6f) * L;
                float f14 = alpha / 2.0f;
                this.f41900w.y0((getWidth() / 2.0f) - f14, ((T1 - L2) - (L / 2.0f)) - f14, alpha, alpha);
                this.f41900w.h(canvas2, null);
            } else {
                this.f41900w.R();
                this.f41900w = null;
            }
        } else {
            f10 = 20.0f;
            f11 = 2.0f;
        }
        float f15 = 1.0f;
        float L3 = org.telegram.messenger.g0.L((1.0f - d) * 14.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPaddingLeft(), T1, getWidth() - getPaddingRight(), getBottom() + L3);
        path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        if (d > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f41894c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f41894c = Boolean.valueOf(z11);
            evVar.P0(z11);
        }
        org.telegram.ui.ActionBar.m6.f29672t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, evVar.J0));
        org.telegram.ui.ActionBar.m6.f29672t0.setAlpha((int) (c8.l9.a(T1 / org.telegram.messenger.g0.L(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.m6.f29672t0.getAlpha()));
        int L4 = org.telegram.messenger.g0.L(36.0f);
        float L5 = T1 + org.telegram.messenger.g0.L(10.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.m6.f29672t0);
        View view = evVar.f34996t1;
        if (!xVar.canScrollVertically(1) && evVar.f34999w1.getVisibility() != 0) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        view.setVisibility(i7);
        if (xVar != null) {
            canvas2.save();
            canvas2.translate(xVar.getLeft(), xVar.getY() + 0.0f);
            canvas2.clipRect(0, 0, xVar.getWidth(), xVar.getHeight());
            float f16 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, xVar.getWidth(), xVar.getHeight(), (int) (xVar.getAlpha() * 255.0f), 31);
            int i10 = 0;
            while (true) {
                sparseArray = this.f41895e;
                int size = sparseArray.size();
                arrayList = this.f41897n;
                if (i10 >= size) {
                    break;
                }
                ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i10);
                arrayList3.clear();
                arrayList.add(arrayList3);
                i10++;
            }
            sparseArray.clear();
            int i11 = 0;
            while (i11 < xVar.getChildCount()) {
                View childAt = xVar.getChildAt(i11);
                if (childAt instanceof xu) {
                    xu xuVar = (xu) childAt;
                    if (xuVar.isPressed()) {
                        float f17 = xuVar.f42221e;
                        if (f17 != f15) {
                            xuVar.f42221e = Utilities.i(f17 + 0.16f, f15, 0.0f);
                            xuVar.invalidate();
                        }
                    }
                    if (evVar.f34990m1 == null || (y5Var = xuVar.f42220c) == null) {
                        f12 = f15;
                    } else {
                        f12 = f15;
                        p5 p5Var = (p5) evVar.f34990m1.get(y5Var.getDocumentId());
                        if (p5Var != null) {
                            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, evVar.J0);
                            if (w03 == evVar.P1 && evVar.O1 != null) {
                                f13 = f16;
                            } else {
                                evVar.P1 = w03;
                                f13 = f16;
                                evVar.O1 = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                            }
                            p5Var.setColorFilter(evVar.O1);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) p5.c.g(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(xuVar);
                        }
                    }
                    f13 = f16;
                } else {
                    f12 = f15;
                    f13 = f16;
                    canvas2.save();
                    canvas2.translate(childAt.getLeft(), childAt.getTop());
                    childAt.draw(canvas2);
                    canvas2.restore();
                }
                i11++;
                f15 = f12;
                f16 = f13;
            }
            float f18 = f15;
            float f19 = f16;
            ArrayList arrayList5 = this.h;
            arrayList5.clear();
            ArrayList arrayList6 = this.f41896f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f41898r;
                if (i12 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
                View view2 = (View) arrayList7.get(0);
                xVar.getClass();
                int R = RecyclerView.R(view2);
                long j3 = currentTimeMillis;
                int i13 = 0;
                while (true) {
                    if (i13 < arrayList5.size()) {
                        if (((vu) arrayList5.get(i13)).N == R) {
                            vuVar = (vu) arrayList5.get(i13);
                            arrayList5.remove(i13);
                            break;
                        }
                        i13++;
                    } else {
                        vuVar = null;
                        break;
                    }
                }
                if (vuVar == null) {
                    if (!arrayList2.isEmpty()) {
                        vuVar = (vu) p5.c.g(1, arrayList2);
                    } else {
                        vuVar = new vu(this);
                        vuVar.l(7);
                    }
                    vuVar.N = R;
                    vuVar.e();
                }
                arrayList6.add(vuVar);
                vuVar.O = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                vu vuVar2 = vuVar;
                currentTimeMillis = j3;
                vuVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i12++;
            }
            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((vu) arrayList5.get(i14));
                    ((vu) arrayList5.get(i14)).O = null;
                    ((vu) arrayList5.get(i14)).k();
                } else {
                    ((vu) arrayList5.get(i14)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (xVar.getAlpha() < f18) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) L5)) / 2;
                int L6 = org.telegram.messenger.g0.L(16.0f);
                upVar.setAlpha((int) ((f18 - xVar.getAlpha()) * f19));
                upVar.setBounds(width - L6, height - L6, width + L6, height + L6);
                upVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            ev evVar = this.E;
            if (y10 < evVar.J0() - org.telegram.messenger.g0.L(6.0f)) {
                evVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        ImageReceiver imageReceiver = this.f41900w;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        int i7 = 0;
        this.d = false;
        int i10 = 0;
        while (true) {
            arrayList = this.f41896f;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((vu) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.f41898r;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ((vu) arrayList2.get(i7)).f();
            i7++;
        }
        arrayList.clear();
        y5.release(this, this.E.f34990m1);
        ImageReceiver imageReceiver = this.f41900w;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }
}
