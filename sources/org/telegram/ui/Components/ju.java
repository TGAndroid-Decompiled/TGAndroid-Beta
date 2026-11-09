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
public final class ju extends FrameLayout {
    public final ru D;
    public final Paint f35153a;
    public final Path f35154b;
    public Boolean f35155c;
    public boolean d;
    public final SparseArray f35156e;
    public final ArrayList f35157f;
    public final ArrayList h;
    public final ArrayList f35158n;
    public final ArrayList f35159r;
    public final w5 f35160s;
    public ImageReceiver f35161w;
    public boolean f35162x;
    public final w5 f35163y;

    public ju(ru ruVar, Context context) {
        super(context);
        this.D = ruVar;
        this.f35153a = new Paint();
        this.f35154b = new Path();
        this.f35155c = null;
        this.f35156e = new SparseArray();
        this.f35157f = new ArrayList();
        this.h = new ArrayList();
        this.f35158n = new ArrayList();
        this.f35159r = new ArrayList();
        xq xqVar = xq.h;
        this.f35160s = new w5(this, 0L, 350L, xqVar);
        this.f35163y = new w5(this, 0L, 320L, xqVar);
    }

    public final void a() {
        r5[] r5VarArr;
        ru ruVar = this.D;
        fi.v vVar = ruVar.n1;
        if (vVar == null) {
            r5VarArr = new r5[0];
        } else {
            r5[] r5VarArr2 = new r5[vVar.getChildCount()];
            for (int i7 = 0; i7 < vVar.getChildCount(); i7++) {
                View childAt = vVar.getChildAt(i7);
                if (childAt instanceof ku) {
                    r5VarArr2[i7] = ((ku) childAt).f35486c;
                }
            }
            r5VarArr = r5VarArr2;
        }
        ruVar.f37806i1 = r5.update(3, this, r5VarArr, ruVar.f37806i1);
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
        iu iuVar;
        float f12;
        float f13;
        r5 r5Var;
        Canvas canvas2 = canvas;
        ru ruVar = this.D;
        cp cpVar = ruVar.f37818w1;
        fi.v vVar = ruVar.n1;
        if (!this.d) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, ruVar.I0);
        Paint paint = this.f35153a;
        paint.setColor(w02);
        org.telegram.ui.ActionBar.l6.n(paint);
        Path path = this.f35154b;
        path.reset();
        float I0 = ruVar.I0();
        if (I0 <= ruVar.f28624b.getPaddingTop()) {
            z9 = true;
        } else {
            z9 = false;
        }
        float d = this.f35160s.d(z9);
        float T1 = org.telegram.messenger.g0.T1(I0, 0.0f, d);
        if (this.f35161w != null) {
            float L = org.telegram.messenger.g0.L(140.0f);
            f10 = 20.0f;
            float L2 = org.telegram.messenger.g0.L(20.0f);
            if (T1 < L + L2) {
                this.f35162x = false;
            }
            f11 = 2.0f;
            this.f35161w.setAlpha(this.f35163y.d(this.f35162x));
            if (this.f35161w.getAlpha() > 0.0f) {
                float alpha = ((this.f35161w.getAlpha() * 0.4f) + 0.6f) * L;
                float f14 = alpha / 2.0f;
                this.f35161w.y0((getWidth() / 2.0f) - f14, ((T1 - L2) - (L / 2.0f)) - f14, alpha, alpha);
                this.f35161w.h(canvas2, null);
            } else {
                this.f35161w.R();
                this.f35161w = null;
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
        Boolean bool = this.f35155c;
        if (bool == null || z10 != bool.booleanValue()) {
            this.f35155c = Boolean.valueOf(z10);
            ruVar.O0(z10);
        }
        org.telegram.ui.ActionBar.l6.f28156t0.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.wj, ruVar.I0));
        org.telegram.ui.ActionBar.l6.f28156t0.setAlpha((int) (c8.j9.a(T1 / org.telegram.messenger.g0.L(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.l6.f28156t0.getAlpha()));
        int L4 = org.telegram.messenger.g0.L(36.0f);
        float L5 = T1 + org.telegram.messenger.g0.L(10.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.l6.f28156t0);
        View view = ruVar.f37811p1;
        if (!vVar.canScrollVertically(1) && ruVar.f37814s1.getVisibility() != 0) {
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
                sparseArray = this.f35156e;
                int size = sparseArray.size();
                arrayList = this.f35158n;
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
                if (childAt instanceof ku) {
                    ku kuVar = (ku) childAt;
                    if (kuVar.isPressed()) {
                        float f17 = kuVar.f35487e;
                        if (f17 != f15) {
                            kuVar.f35487e = Utilities.i(f17 + 0.16f, f15, 0.0f);
                            kuVar.invalidate();
                        }
                    }
                    if (ruVar.f37806i1 == null || (r5Var = kuVar.f35486c) == null) {
                        f12 = f15;
                    } else {
                        f12 = f15;
                        i5 i5Var = (i5) ruVar.f37806i1.get(r5Var.getDocumentId());
                        if (i5Var != null) {
                            int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, ruVar.I0);
                            if (w03 == ruVar.L1 && ruVar.K1 != null) {
                                f13 = f16;
                            } else {
                                ruVar.L1 = w03;
                                f13 = f16;
                                ruVar.K1 = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                            }
                            i5Var.setColorFilter(ruVar.K1);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) org.telegram.ui.Cells.f1.k(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(kuVar);
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
            ArrayList arrayList6 = this.f35157f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f35159r;
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
                        if (((iu) arrayList5.get(i13)).M == R) {
                            iuVar = (iu) arrayList5.get(i13);
                            arrayList5.remove(i13);
                            break;
                        }
                        i13++;
                    } else {
                        iuVar = null;
                        break;
                    }
                }
                if (iuVar == null) {
                    if (!arrayList2.isEmpty()) {
                        iuVar = (iu) org.telegram.ui.Cells.f1.k(1, arrayList2);
                    } else {
                        iuVar = new iu(this);
                        iuVar.l(7);
                    }
                    iuVar.M = R;
                    iuVar.e();
                }
                arrayList6.add(iuVar);
                iuVar.N = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                iu iuVar2 = iuVar;
                currentTimeMillis = j3;
                iuVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i12++;
            }
            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((iu) arrayList5.get(i14));
                    ((iu) arrayList5.get(i14)).N = null;
                    ((iu) arrayList5.get(i14)).k();
                } else {
                    ((iu) arrayList5.get(i14)).f();
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
            ru ruVar = this.D;
            if (y10 < ruVar.I0() - org.telegram.messenger.g0.L(6.0f)) {
                ruVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        ImageReceiver imageReceiver = this.f35161w;
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
            arrayList = this.f35157f;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((iu) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.f35159r;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ((iu) arrayList2.get(i7)).f();
            i7++;
        }
        arrayList.clear();
        r5.release(this, this.D.f37806i1);
        ImageReceiver imageReceiver = this.f35161w;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }
}
