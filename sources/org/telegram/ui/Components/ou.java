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
public final class ou extends FrameLayout {
    public final wu E;
    public final Paint f38077a;
    public final Path f38078b;
    public Boolean f38079c;
    public boolean d;
    public final SparseArray f38080e;
    public final ArrayList f38081f;
    public final ArrayList h;
    public final ArrayList f38082n;
    public final ArrayList f38083r;
    public final u5 f38084s;
    public ImageReceiver f38085w;
    public boolean f38086x;
    public final u5 f38087y;

    public ou(wu wuVar, Context context) {
        super(context);
        this.E = wuVar;
        this.f38077a = new Paint();
        this.f38078b = new Path();
        this.f38079c = null;
        this.f38080e = new SparseArray();
        this.f38081f = new ArrayList();
        this.h = new ArrayList();
        this.f38082n = new ArrayList();
        this.f38083r = new ArrayList();
        er erVar = er.h;
        this.f38084s = new u5(this, 0L, 350L, erVar);
        this.f38087y = new u5(this, 0L, 320L, erVar);
    }

    public final void a() {
        p5[] p5VarArr;
        wu wuVar = this.E;
        hi.v vVar = wuVar.f41450r1;
        if (vVar == null) {
            p5VarArr = new p5[0];
        } else {
            p5[] p5VarArr2 = new p5[vVar.getChildCount()];
            for (int i7 = 0; i7 < vVar.getChildCount(); i7++) {
                View childAt = vVar.getChildAt(i7);
                if (childAt instanceof pu) {
                    p5VarArr2[i7] = ((pu) childAt).f38411c;
                }
            }
            p5VarArr = p5VarArr2;
        }
        wuVar.f41446m1 = p5.update(3, this, p5VarArr, wuVar.f41446m1);
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
        nu nuVar;
        float f12;
        float f13;
        p5 p5Var;
        Canvas canvas2 = canvas;
        wu wuVar = this.E;
        lp lpVar = wuVar.A1;
        hi.v vVar = wuVar.f41450r1;
        if (!this.d) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, wuVar.J0);
        Paint paint = this.f38077a;
        paint.setColor(w02);
        org.telegram.ui.ActionBar.j6.n(paint);
        Path path = this.f38078b;
        path.reset();
        float I0 = wuVar.I0();
        if (I0 <= wuVar.f29682b.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.f38084s.d(z10);
        float T1 = org.telegram.messenger.g0.T1(I0, 0.0f, d);
        if (this.f38085w != null) {
            float L = org.telegram.messenger.g0.L(140.0f);
            f10 = 20.0f;
            float L2 = org.telegram.messenger.g0.L(20.0f);
            if (T1 < L + L2) {
                this.f38086x = false;
            }
            f11 = 2.0f;
            this.f38085w.setAlpha(this.f38087y.d(this.f38086x));
            if (this.f38085w.getAlpha() > 0.0f) {
                float alpha = ((this.f38085w.getAlpha() * 0.4f) + 0.6f) * L;
                float f14 = alpha / 2.0f;
                this.f38085w.y0((getWidth() / 2.0f) - f14, ((T1 - L2) - (L / 2.0f)) - f14, alpha, alpha);
                this.f38085w.h(canvas2, null);
            } else {
                this.f38085w.R();
                this.f38085w = null;
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
        Boolean bool = this.f38079c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f38079c = Boolean.valueOf(z11);
            wuVar.O0(z11);
        }
        org.telegram.ui.ActionBar.j6.f29140t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.zj, wuVar.J0));
        org.telegram.ui.ActionBar.j6.f29140t0.setAlpha((int) (c8.i9.a(T1 / org.telegram.messenger.g0.L(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.j6.f29140t0.getAlpha()));
        int L4 = org.telegram.messenger.g0.L(36.0f);
        float L5 = T1 + org.telegram.messenger.g0.L(10.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.j6.f29140t0);
        View view = wuVar.f41452t1;
        if (!vVar.canScrollVertically(1) && wuVar.f41455w1.getVisibility() != 0) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        view.setVisibility(i7);
        if (vVar != null) {
            canvas2.save();
            canvas2.translate(vVar.getLeft(), vVar.getY() + 0.0f);
            canvas2.clipRect(0, 0, vVar.getWidth(), vVar.getHeight());
            float f16 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, vVar.getWidth(), vVar.getHeight(), (int) (vVar.getAlpha() * 255.0f), 31);
            int i10 = 0;
            while (true) {
                sparseArray = this.f38080e;
                int size = sparseArray.size();
                arrayList = this.f38082n;
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
            while (i11 < vVar.getChildCount()) {
                View childAt = vVar.getChildAt(i11);
                if (childAt instanceof pu) {
                    pu puVar = (pu) childAt;
                    if (puVar.isPressed()) {
                        float f17 = puVar.f38412e;
                        if (f17 != f15) {
                            puVar.f38412e = Utilities.i(f17 + 0.16f, f15, 0.0f);
                            puVar.invalidate();
                        }
                    }
                    if (wuVar.f41446m1 == null || (p5Var = puVar.f38411c) == null) {
                        f12 = f15;
                    } else {
                        f12 = f15;
                        g5 g5Var = (g5) wuVar.f41446m1.get(p5Var.getDocumentId());
                        if (g5Var != null) {
                            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, wuVar.J0);
                            if (w03 == wuVar.P1 && wuVar.O1 != null) {
                                f13 = f16;
                            } else {
                                wuVar.P1 = w03;
                                f13 = f16;
                                wuVar.O1 = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                            }
                            g5Var.setColorFilter(wuVar.O1);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) r.b.g(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(puVar);
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
            ArrayList arrayList6 = this.f38081f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f38083r;
                if (i12 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
                View view2 = (View) arrayList7.get(0);
                vVar.getClass();
                int R = RecyclerView.R(view2);
                long j3 = currentTimeMillis;
                int i13 = 0;
                while (true) {
                    if (i13 < arrayList5.size()) {
                        if (((nu) arrayList5.get(i13)).N == R) {
                            nuVar = (nu) arrayList5.get(i13);
                            arrayList5.remove(i13);
                            break;
                        }
                        i13++;
                    } else {
                        nuVar = null;
                        break;
                    }
                }
                if (nuVar == null) {
                    if (!arrayList2.isEmpty()) {
                        nuVar = (nu) r.b.g(1, arrayList2);
                    } else {
                        nuVar = new nu(this);
                        nuVar.l(7);
                    }
                    nuVar.N = R;
                    nuVar.e();
                }
                arrayList6.add(nuVar);
                nuVar.O = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                nu nuVar2 = nuVar;
                currentTimeMillis = j3;
                nuVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i12++;
            }
            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((nu) arrayList5.get(i14));
                    ((nu) arrayList5.get(i14)).O = null;
                    ((nu) arrayList5.get(i14)).k();
                } else {
                    ((nu) arrayList5.get(i14)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (vVar.getAlpha() < f18) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) L5)) / 2;
                int L6 = org.telegram.messenger.g0.L(16.0f);
                lpVar.setAlpha((int) ((f18 - vVar.getAlpha()) * f19));
                lpVar.setBounds(width - L6, height - L6, width + L6, height + L6);
                lpVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            wu wuVar = this.E;
            if (y10 < wuVar.I0() - org.telegram.messenger.g0.L(6.0f)) {
                wuVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        ImageReceiver imageReceiver = this.f38085w;
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
            arrayList = this.f38081f;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((nu) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.f38083r;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ((nu) arrayList2.get(i7)).f();
            i7++;
        }
        arrayList.clear();
        p5.release(this, this.E.f41446m1);
        ImageReceiver imageReceiver = this.f38085w;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }
}
