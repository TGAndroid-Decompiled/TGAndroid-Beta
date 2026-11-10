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
public final class iu extends FrameLayout {
    public final qu D;
    public final Paint f34760a;
    public final Path f34761b;
    public Boolean f34762c;
    public boolean d;
    public final SparseArray f34763e;
    public final ArrayList f34764f;
    public final ArrayList h;
    public final ArrayList f34765n;
    public final ArrayList f34766r;
    public final v5 f34767s;
    public ImageReceiver f34768w;
    public boolean f34769x;
    public final v5 f34770y;

    public iu(qu quVar, Context context) {
        super(context);
        this.D = quVar;
        this.f34760a = new Paint();
        this.f34761b = new Path();
        this.f34762c = null;
        this.f34763e = new SparseArray();
        this.f34764f = new ArrayList();
        this.h = new ArrayList();
        this.f34765n = new ArrayList();
        this.f34766r = new ArrayList();
        wq wqVar = wq.h;
        this.f34767s = new v5(this, 0L, 350L, wqVar);
        this.f34770y = new v5(this, 0L, 320L, wqVar);
    }

    public final void a() {
        q5[] q5VarArr;
        qu quVar = this.D;
        fi.v vVar = quVar.f37399q1;
        if (vVar == null) {
            q5VarArr = new q5[0];
        } else {
            q5[] q5VarArr2 = new q5[vVar.getChildCount()];
            for (int i7 = 0; i7 < vVar.getChildCount(); i7++) {
                View childAt = vVar.getChildAt(i7);
                if (childAt instanceof ju) {
                    q5VarArr2[i7] = ((ju) childAt).f35077c;
                }
            }
            q5VarArr = q5VarArr2;
        }
        quVar.l1 = q5.update(3, this, q5VarArr, quVar.l1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        float f10;
        float f11;
        boolean z10;
        int i7;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        hu huVar;
        float f12;
        float f13;
        q5 q5Var;
        Canvas canvas2 = canvas;
        qu quVar = this.D;
        cp cpVar = quVar.f37408z1;
        fi.v vVar = quVar.f37399q1;
        if (!this.d) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, quVar.I0);
        Paint paint = this.f34760a;
        paint.setColor(w02);
        org.telegram.ui.ActionBar.m6.n(paint);
        Path path = this.f34761b;
        path.reset();
        float I0 = quVar.I0();
        if (I0 <= quVar.f28672b.getPaddingTop()) {
            z9 = true;
        } else {
            z9 = false;
        }
        float d = this.f34767s.d(z9);
        float T1 = org.telegram.messenger.g0.T1(I0, 0.0f, d);
        if (this.f34768w != null) {
            float L = org.telegram.messenger.g0.L(140.0f);
            f10 = 20.0f;
            float L2 = org.telegram.messenger.g0.L(20.0f);
            if (T1 < L + L2) {
                this.f34769x = false;
            }
            f11 = 2.0f;
            this.f34768w.setAlpha(this.f34770y.d(this.f34769x));
            if (this.f34768w.getAlpha() > 0.0f) {
                float alpha = ((this.f34768w.getAlpha() * 0.4f) + 0.6f) * L;
                float f14 = alpha / 2.0f;
                this.f34768w.y0((getWidth() / 2.0f) - f14, ((T1 - L2) - (L / 2.0f)) - f14, alpha, alpha);
                this.f34768w.h(canvas2, null);
            } else {
                this.f34768w.R();
                this.f34768w = null;
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
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f34762c;
        if (bool == null || z10 != bool.booleanValue()) {
            this.f34762c = Boolean.valueOf(z10);
            quVar.O0(z10);
        }
        org.telegram.ui.ActionBar.m6.f28181t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, quVar.I0));
        org.telegram.ui.ActionBar.m6.f28181t0.setAlpha((int) (c8.j9.a(T1 / org.telegram.messenger.g0.L(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.m6.f28181t0.getAlpha()));
        int L4 = org.telegram.messenger.g0.L(36.0f);
        float L5 = T1 + org.telegram.messenger.g0.L(10.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.m6.f28181t0);
        View view = quVar.f37401s1;
        if (!vVar.canScrollVertically(1) && quVar.f37404v1.getVisibility() != 0) {
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
                sparseArray = this.f34763e;
                int size = sparseArray.size();
                arrayList = this.f34765n;
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
                if (childAt instanceof ju) {
                    ju juVar = (ju) childAt;
                    if (juVar.isPressed()) {
                        float f17 = juVar.f35078e;
                        if (f17 != f15) {
                            juVar.f35078e = Utilities.i(f17 + 0.16f, f15, 0.0f);
                            juVar.invalidate();
                        }
                    }
                    if (quVar.l1 == null || (q5Var = juVar.f35077c) == null) {
                        f12 = f15;
                    } else {
                        f12 = f15;
                        h5 h5Var = (h5) quVar.l1.get(q5Var.getDocumentId());
                        if (h5Var != null) {
                            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, quVar.I0);
                            if (w03 == quVar.O1 && quVar.N1 != null) {
                                f13 = f16;
                            } else {
                                quVar.O1 = w03;
                                f13 = f16;
                                quVar.N1 = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                            }
                            h5Var.setColorFilter(quVar.N1);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) org.telegram.ui.Cells.f1.k(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(juVar);
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
            ArrayList arrayList6 = this.f34764f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f34766r;
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
                        if (((hu) arrayList5.get(i13)).M == R) {
                            huVar = (hu) arrayList5.get(i13);
                            arrayList5.remove(i13);
                            break;
                        }
                        i13++;
                    } else {
                        huVar = null;
                        break;
                    }
                }
                if (huVar == null) {
                    if (!arrayList2.isEmpty()) {
                        huVar = (hu) org.telegram.ui.Cells.f1.k(1, arrayList2);
                    } else {
                        huVar = new hu(this);
                        huVar.l(7);
                    }
                    huVar.M = R;
                    huVar.e();
                }
                arrayList6.add(huVar);
                huVar.N = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                hu huVar2 = huVar;
                currentTimeMillis = j3;
                huVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i12++;
            }
            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((hu) arrayList5.get(i14));
                    ((hu) arrayList5.get(i14)).N = null;
                    ((hu) arrayList5.get(i14)).k();
                } else {
                    ((hu) arrayList5.get(i14)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (vVar.getAlpha() < f18) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) L5)) / 2;
                int L6 = org.telegram.messenger.g0.L(16.0f);
                cpVar.setAlpha((int) ((f18 - vVar.getAlpha()) * f19));
                cpVar.setBounds(width - L6, height - L6, width + L6, height + L6);
                cpVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            qu quVar = this.D;
            if (y10 < quVar.I0() - org.telegram.messenger.g0.L(6.0f)) {
                quVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        ImageReceiver imageReceiver = this.f34768w;
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
            arrayList = this.f34764f;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((hu) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.f34766r;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ((hu) arrayList2.get(i7)).f();
            i7++;
        }
        arrayList.clear();
        q5.release(this, this.D.l1);
        ImageReceiver imageReceiver = this.f34768w;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }
}
