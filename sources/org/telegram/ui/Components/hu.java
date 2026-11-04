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
public final class hu extends FrameLayout {
    public final pu E;
    public final Paint f34505a;
    public final Path f34506b;
    public Boolean f34507c;
    public boolean d;
    public final SparseArray f34508e;
    public final ArrayList f34509f;
    public final ArrayList h;
    public final ArrayList f34510n;
    public final ArrayList f34511r;
    public final u5 f34512s;
    public ImageReceiver f34513w;
    public boolean f34514x;
    public final u5 f34515y;

    public hu(pu puVar, Context context) {
        super(context);
        this.E = puVar;
        this.f34505a = new Paint();
        this.f34506b = new Path();
        this.f34507c = null;
        this.f34508e = new SparseArray();
        this.f34509f = new ArrayList();
        this.h = new ArrayList();
        this.f34510n = new ArrayList();
        this.f34511r = new ArrayList();
        xq xqVar = xq.h;
        this.f34512s = new u5(this, 0L, 350L, xqVar);
        this.f34515y = new u5(this, 0L, 320L, xqVar);
    }

    public final void a() {
        p5[] p5VarArr;
        pu puVar = this.E;
        gi.v vVar = puVar.f37243o1;
        if (vVar == null) {
            p5VarArr = new p5[0];
        } else {
            p5[] p5VarArr2 = new p5[vVar.getChildCount()];
            for (int i3 = 0; i3 < vVar.getChildCount(); i3++) {
                View childAt = vVar.getChildAt(i3);
                if (childAt instanceof iu) {
                    p5VarArr2[i3] = ((iu) childAt).f34827c;
                }
            }
            p5VarArr = p5VarArr2;
        }
        puVar.f37240j1 = p5.update(3, this, p5VarArr, puVar.f37240j1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        boolean z11;
        int i3;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        gu guVar;
        float f12;
        float f13;
        p5 p5Var;
        Canvas canvas2 = canvas;
        pu puVar = this.E;
        cp cpVar = puVar.f37252x1;
        gi.v vVar = puVar.f37243o1;
        if (!this.d) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, puVar.J0);
        Paint paint = this.f34505a;
        paint.setColor(w02);
        org.telegram.ui.ActionBar.k6.n(paint);
        Path path = this.f34506b;
        path.reset();
        float I0 = puVar.I0();
        if (I0 <= puVar.f28586b.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.f34512s.d(z10);
        float T1 = org.telegram.messenger.g0.T1(I0, 0.0f, d);
        if (this.f34513w != null) {
            float L = org.telegram.messenger.g0.L(140.0f);
            f10 = 20.0f;
            float L2 = org.telegram.messenger.g0.L(20.0f);
            if (T1 < L + L2) {
                this.f34514x = false;
            }
            f11 = 2.0f;
            this.f34513w.setAlpha(this.f34515y.d(this.f34514x));
            if (this.f34513w.getAlpha() > 0.0f) {
                float alpha = ((this.f34513w.getAlpha() * 0.4f) + 0.6f) * L;
                float f14 = alpha / 2.0f;
                this.f34513w.y0((getWidth() / 2.0f) - f14, ((T1 - L2) - (L / 2.0f)) - f14, alpha, alpha);
                this.f34513w.h(canvas2, null);
            } else {
                this.f34513w.R();
                this.f34513w = null;
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
        Boolean bool = this.f34507c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f34507c = Boolean.valueOf(z11);
            puVar.O0(z11);
        }
        org.telegram.ui.ActionBar.k6.f28171t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, puVar.J0));
        org.telegram.ui.ActionBar.k6.f28171t0.setAlpha((int) (b8.be.a(T1 / org.telegram.messenger.g0.L(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.k6.f28171t0.getAlpha()));
        int L4 = org.telegram.messenger.g0.L(36.0f);
        float L5 = T1 + org.telegram.messenger.g0.L(10.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.k6.f28171t0);
        View view = puVar.f37245q1;
        if (!vVar.canScrollVertically(1) && puVar.f37248t1.getVisibility() != 0) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        view.setVisibility(i3);
        if (vVar != null) {
            canvas2.save();
            canvas2.translate(vVar.getLeft(), vVar.getY() + 0.0f);
            canvas2.clipRect(0, 0, vVar.getWidth(), vVar.getHeight());
            float f16 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, vVar.getWidth(), vVar.getHeight(), (int) (vVar.getAlpha() * 255.0f), 31);
            int i10 = 0;
            while (true) {
                sparseArray = this.f34508e;
                int size = sparseArray.size();
                arrayList = this.f34510n;
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
                if (childAt instanceof iu) {
                    iu iuVar = (iu) childAt;
                    if (iuVar.isPressed()) {
                        float f17 = iuVar.f34828e;
                        if (f17 != f15) {
                            iuVar.f34828e = Utilities.i(f17 + 0.16f, f15, 0.0f);
                            iuVar.invalidate();
                        }
                    }
                    if (puVar.f37240j1 == null || (p5Var = iuVar.f34827c) == null) {
                        f12 = f15;
                    } else {
                        f12 = f15;
                        g5 g5Var = (g5) puVar.f37240j1.get(p5Var.getDocumentId());
                        if (g5Var != null) {
                            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, puVar.J0);
                            if (w03 == puVar.M1 && puVar.L1 != null) {
                                f13 = f16;
                            } else {
                                puVar.M1 = w03;
                                f13 = f16;
                                puVar.L1 = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                            }
                            g5Var.setColorFilter(puVar.L1);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) org.telegram.ui.Cells.f1.o(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(iuVar);
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
            ArrayList arrayList6 = this.f34509f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f34511r;
                if (i12 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
                View view2 = (View) arrayList7.get(0);
                vVar.getClass();
                int R = RecyclerView.R(view2);
                long j10 = currentTimeMillis;
                int i13 = 0;
                while (true) {
                    if (i13 < arrayList5.size()) {
                        if (((gu) arrayList5.get(i13)).N == R) {
                            guVar = (gu) arrayList5.get(i13);
                            arrayList5.remove(i13);
                            break;
                        }
                        i13++;
                    } else {
                        guVar = null;
                        break;
                    }
                }
                if (guVar == null) {
                    if (!arrayList2.isEmpty()) {
                        guVar = (gu) org.telegram.ui.Cells.f1.o(1, arrayList2);
                    } else {
                        guVar = new gu(this);
                        guVar.l(7);
                    }
                    guVar.N = R;
                    guVar.e();
                }
                arrayList6.add(guVar);
                guVar.O = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                gu guVar2 = guVar;
                currentTimeMillis = j10;
                guVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i12++;
            }
            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((gu) arrayList5.get(i14));
                    ((gu) arrayList5.get(i14)).O = null;
                    ((gu) arrayList5.get(i14)).k();
                } else {
                    ((gu) arrayList5.get(i14)).f();
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
            float y9 = motionEvent.getY();
            pu puVar = this.E;
            if (y9 < puVar.I0() - org.telegram.messenger.g0.L(6.0f)) {
                puVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        ImageReceiver imageReceiver = this.f34513w;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        int i3 = 0;
        this.d = false;
        int i10 = 0;
        while (true) {
            arrayList = this.f34509f;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((gu) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.f34511r;
            if (i3 >= arrayList2.size()) {
                break;
            }
            ((gu) arrayList2.get(i3)).f();
            i3++;
        }
        arrayList.clear();
        p5.release(this, this.E.f37240j1);
        ImageReceiver imageReceiver = this.f34513w;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }
}
