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
    public final Paint f34783a;
    public final Path f34784b;
    public Boolean f34785c;
    public boolean d;
    public final SparseArray f34786e;
    public final ArrayList f34787f;
    public final ArrayList h;
    public final ArrayList f34788n;
    public final ArrayList f34789r;
    public final w5 f34790s;
    public ImageReceiver f34791w;
    public boolean f34792x;
    public final w5 f34793y;

    public iu(qu quVar, Context context) {
        super(context);
        this.D = quVar;
        this.f34783a = new Paint();
        this.f34784b = new Path();
        this.f34785c = null;
        this.f34786e = new SparseArray();
        this.f34787f = new ArrayList();
        this.h = new ArrayList();
        this.f34788n = new ArrayList();
        this.f34789r = new ArrayList();
        xq xqVar = xq.h;
        this.f34790s = new w5(this, 0L, 350L, xqVar);
        this.f34793y = new w5(this, 0L, 320L, xqVar);
    }

    public final void a() {
        r5[] r5VarArr;
        qu quVar = this.D;
        fi.v vVar = quVar.n1;
        if (vVar == null) {
            r5VarArr = new r5[0];
        } else {
            r5[] r5VarArr2 = new r5[vVar.getChildCount()];
            for (int i7 = 0; i7 < vVar.getChildCount(); i7++) {
                View childAt = vVar.getChildAt(i7);
                if (childAt instanceof ju) {
                    r5VarArr2[i7] = ((ju) childAt).f35072c;
                }
            }
            r5VarArr = r5VarArr2;
        }
        quVar.f37390i1 = r5.update(3, this, r5VarArr, quVar.f37390i1);
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
        r5 r5Var;
        Canvas canvas2 = canvas;
        qu quVar = this.D;
        cp cpVar = quVar.f37402w1;
        fi.v vVar = quVar.n1;
        if (!this.d) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27922h5, quVar.I0);
        Paint paint = this.f34783a;
        paint.setColor(w02);
        org.telegram.ui.ActionBar.k6.n(paint);
        Path path = this.f34784b;
        path.reset();
        float I0 = quVar.I0();
        if (I0 <= quVar.f28616b.getPaddingTop()) {
            z9 = true;
        } else {
            z9 = false;
        }
        float d = this.f34790s.d(z9);
        float T1 = org.telegram.messenger.g0.T1(I0, 0.0f, d);
        if (this.f34791w != null) {
            float L = org.telegram.messenger.g0.L(140.0f);
            f10 = 20.0f;
            float L2 = org.telegram.messenger.g0.L(20.0f);
            if (T1 < L + L2) {
                this.f34792x = false;
            }
            f11 = 2.0f;
            this.f34791w.setAlpha(this.f34793y.d(this.f34792x));
            if (this.f34791w.getAlpha() > 0.0f) {
                float alpha = ((this.f34791w.getAlpha() * 0.4f) + 0.6f) * L;
                float f14 = alpha / 2.0f;
                this.f34791w.y0((getWidth() / 2.0f) - f14, ((T1 - L2) - (L / 2.0f)) - f14, alpha, alpha);
                this.f34791w.h(canvas2, null);
            } else {
                this.f34791w.R();
                this.f34791w = null;
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
        Boolean bool = this.f34785c;
        if (bool == null || z10 != bool.booleanValue()) {
            this.f34785c = Boolean.valueOf(z10);
            quVar.O0(z10);
        }
        org.telegram.ui.ActionBar.k6.f28140t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, quVar.I0));
        org.telegram.ui.ActionBar.k6.f28140t0.setAlpha((int) (c8.j9.a(T1 / org.telegram.messenger.g0.L(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.k6.f28140t0.getAlpha()));
        int L4 = org.telegram.messenger.g0.L(36.0f);
        float L5 = T1 + org.telegram.messenger.g0.L(10.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.k6.f28140t0);
        View view = quVar.f37395p1;
        if (!vVar.canScrollVertically(1) && quVar.f37398s1.getVisibility() != 0) {
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
                sparseArray = this.f34786e;
                int size = sparseArray.size();
                arrayList = this.f34788n;
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
                        float f17 = juVar.f35073e;
                        if (f17 != f15) {
                            juVar.f35073e = Utilities.i(f17 + 0.16f, f15, 0.0f);
                            juVar.invalidate();
                        }
                    }
                    if (quVar.f37390i1 == null || (r5Var = juVar.f35072c) == null) {
                        f12 = f15;
                    } else {
                        f12 = f15;
                        i5 i5Var = (i5) quVar.f37390i1.get(r5Var.getDocumentId());
                        if (i5Var != null) {
                            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, quVar.I0);
                            if (w03 == quVar.L1 && quVar.K1 != null) {
                                f13 = f16;
                            } else {
                                quVar.L1 = w03;
                                f13 = f16;
                                quVar.K1 = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                            }
                            i5Var.setColorFilter(quVar.K1);
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
            ArrayList arrayList6 = this.f34787f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f34789r;
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
        ImageReceiver imageReceiver = this.f34791w;
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
            arrayList = this.f34787f;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((hu) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.f34789r;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ((hu) arrayList2.get(i7)).f();
            i7++;
        }
        arrayList.clear();
        r5.release(this, this.D.f37390i1);
        ImageReceiver imageReceiver = this.f34791w;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }
}
