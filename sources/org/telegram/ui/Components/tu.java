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
public final class tu extends FrameLayout {
    public final bv E;
    public final Paint f40098a;
    public final Path f40099b;
    public Boolean f40100c;
    public boolean d;
    public final SparseArray f40101e;
    public final ArrayList f40102f;
    public final ArrayList h;
    public final ArrayList f40103n;
    public final ArrayList f40104r;
    public final c6 f40105s;
    public ImageReceiver f40106w;
    public boolean f40107x;
    public final c6 f40108y;

    public tu(bv bvVar, Context context) {
        super(context);
        this.E = bvVar;
        this.f40098a = new Paint();
        this.f40099b = new Path();
        this.f40100c = null;
        this.f40101e = new SparseArray();
        this.f40102f = new ArrayList();
        this.h = new ArrayList();
        this.f40103n = new ArrayList();
        this.f40104r = new ArrayList();
        lr lrVar = lr.h;
        this.f40105s = new c6(this, 0L, 350L, lrVar);
        this.f40108y = new c6(this, 0L, 320L, lrVar);
    }

    public final void a() {
        x5[] x5VarArr;
        bv bvVar = this.E;
        hi.w wVar = bvVar.f33788r1;
        if (wVar == null) {
            x5VarArr = new x5[0];
        } else {
            x5[] x5VarArr2 = new x5[wVar.getChildCount()];
            for (int i7 = 0; i7 < wVar.getChildCount(); i7++) {
                View childAt = wVar.getChildAt(i7);
                if (childAt instanceof uu) {
                    x5VarArr2[i7] = ((uu) childAt).f40419c;
                }
            }
            x5VarArr = x5VarArr2;
        }
        bvVar.f33784m1 = x5.update(3, this, x5VarArr, bvVar.f33784m1);
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
        su suVar;
        float f12;
        float f13;
        x5 x5Var;
        Canvas canvas2 = canvas;
        bv bvVar = this.E;
        sp spVar = bvVar.A1;
        hi.w wVar = bvVar.f33788r1;
        if (!this.d) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, bvVar.J0);
        Paint paint = this.f40098a;
        paint.setColor(w02);
        org.telegram.ui.ActionBar.n6.n(paint);
        Path path = this.f40099b;
        path.reset();
        float J0 = bvVar.J0();
        if (J0 <= bvVar.f30192b.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.f40105s.d(z10);
        float T1 = org.telegram.messenger.g0.T1(J0, 0.0f, d);
        if (this.f40106w != null) {
            float L = org.telegram.messenger.g0.L(140.0f);
            f10 = 20.0f;
            float L2 = org.telegram.messenger.g0.L(20.0f);
            if (T1 < L + L2) {
                this.f40107x = false;
            }
            f11 = 2.0f;
            this.f40106w.setAlpha(this.f40108y.d(this.f40107x));
            if (this.f40106w.getAlpha() > 0.0f) {
                float alpha = ((this.f40106w.getAlpha() * 0.4f) + 0.6f) * L;
                float f14 = alpha / 2.0f;
                this.f40106w.y0((getWidth() / 2.0f) - f14, ((T1 - L2) - (L / 2.0f)) - f14, alpha, alpha);
                this.f40106w.h(canvas2, null);
            } else {
                this.f40106w.R();
                this.f40106w = null;
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
        Boolean bool = this.f40100c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f40100c = Boolean.valueOf(z11);
            bvVar.P0(z11);
        }
        org.telegram.ui.ActionBar.n6.f29687t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, bvVar.J0));
        org.telegram.ui.ActionBar.n6.f29687t0.setAlpha((int) (c8.l9.a(T1 / org.telegram.messenger.g0.L(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.n6.f29687t0.getAlpha()));
        int L4 = org.telegram.messenger.g0.L(36.0f);
        float L5 = T1 + org.telegram.messenger.g0.L(10.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.n6.f29687t0);
        View view = bvVar.f33790t1;
        if (!wVar.canScrollVertically(1) && bvVar.f33793w1.getVisibility() != 0) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        view.setVisibility(i7);
        if (wVar != null) {
            canvas2.save();
            canvas2.translate(wVar.getLeft(), wVar.getY() + 0.0f);
            canvas2.clipRect(0, 0, wVar.getWidth(), wVar.getHeight());
            float f16 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, wVar.getWidth(), wVar.getHeight(), (int) (wVar.getAlpha() * 255.0f), 31);
            int i10 = 0;
            while (true) {
                sparseArray = this.f40101e;
                int size = sparseArray.size();
                arrayList = this.f40103n;
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
            while (i11 < wVar.getChildCount()) {
                View childAt = wVar.getChildAt(i11);
                if (childAt instanceof uu) {
                    uu uuVar = (uu) childAt;
                    if (uuVar.isPressed()) {
                        float f17 = uuVar.f40420e;
                        if (f17 != f15) {
                            uuVar.f40420e = Utilities.i(f17 + 0.16f, f15, 0.0f);
                            uuVar.invalidate();
                        }
                    }
                    if (bvVar.f33784m1 == null || (x5Var = uuVar.f40419c) == null) {
                        f12 = f15;
                    } else {
                        f12 = f15;
                        o5 o5Var = (o5) bvVar.f33784m1.get(x5Var.getDocumentId());
                        if (o5Var != null) {
                            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, bvVar.J0);
                            if (w03 == bvVar.P1 && bvVar.O1 != null) {
                                f13 = f16;
                            } else {
                                bvVar.P1 = w03;
                                f13 = f16;
                                bvVar.O1 = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                            }
                            o5Var.setColorFilter(bvVar.O1);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) p5.c.g(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(uuVar);
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
            ArrayList arrayList6 = this.f40102f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f40104r;
                if (i12 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
                View view2 = (View) arrayList7.get(0);
                wVar.getClass();
                int R = RecyclerView.R(view2);
                long j3 = currentTimeMillis;
                int i13 = 0;
                while (true) {
                    if (i13 < arrayList5.size()) {
                        if (((su) arrayList5.get(i13)).N == R) {
                            suVar = (su) arrayList5.get(i13);
                            arrayList5.remove(i13);
                            break;
                        }
                        i13++;
                    } else {
                        suVar = null;
                        break;
                    }
                }
                if (suVar == null) {
                    if (!arrayList2.isEmpty()) {
                        suVar = (su) p5.c.g(1, arrayList2);
                    } else {
                        suVar = new su(this);
                        suVar.l(7);
                    }
                    suVar.N = R;
                    suVar.e();
                }
                arrayList6.add(suVar);
                suVar.O = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                su suVar2 = suVar;
                currentTimeMillis = j3;
                suVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i12++;
            }
            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((su) arrayList5.get(i14));
                    ((su) arrayList5.get(i14)).O = null;
                    ((su) arrayList5.get(i14)).k();
                } else {
                    ((su) arrayList5.get(i14)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (wVar.getAlpha() < f18) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) L5)) / 2;
                int L6 = org.telegram.messenger.g0.L(16.0f);
                spVar.setAlpha((int) ((f18 - wVar.getAlpha()) * f19));
                spVar.setBounds(width - L6, height - L6, width + L6, height + L6);
                spVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            bv bvVar = this.E;
            if (y10 < bvVar.J0() - org.telegram.messenger.g0.L(6.0f)) {
                bvVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        ImageReceiver imageReceiver = this.f40106w;
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
            arrayList = this.f40102f;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((su) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.f40104r;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ((su) arrayList2.get(i7)).f();
            i7++;
        }
        arrayList.clear();
        x5.release(this, this.E.f33784m1);
        ImageReceiver imageReceiver = this.f40106w;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }
}
