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
public final class uu extends FrameLayout {
    public final cv D;
    public final Paint f31038a;
    public final Path f31039b;
    public Boolean f31040c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f31041f;
    public final ArrayList h;
    public final ArrayList f31042n;
    public final ArrayList f31043r;
    public final t5 f31044s;
    public ImageReceiver f31045w;
    public boolean f31046x;
    public final t5 f31047y;

    public uu(cv cvVar, Context context) {
        super(context);
        this.D = cvVar;
        this.f31038a = new Paint();
        this.f31039b = new Path();
        this.f31040c = null;
        this.e = new SparseArray();
        this.f31041f = new ArrayList();
        this.h = new ArrayList();
        this.f31042n = new ArrayList();
        this.f31043r = new ArrayList();
        gr grVar = gr.h;
        this.f31044s = new t5(this, 0L, 350L, grVar);
        this.f31047y = new t5(this, 0L, 320L, grVar);
    }

    public final void a() {
        o5[] o5VarArr;
        cv cvVar = this.D;
        org.telegram.ui.g3 g3Var = cvVar.f25165n1;
        if (g3Var == null) {
            o5VarArr = new o5[0];
        } else {
            o5[] o5VarArr2 = new o5[g3Var.getChildCount()];
            for (int i10 = 0; i10 < g3Var.getChildCount(); i10++) {
                View childAt = g3Var.getChildAt(i10);
                if (childAt instanceof vu) {
                    o5VarArr2[i10] = ((vu) childAt).f31844c;
                }
            }
            o5VarArr = o5VarArr2;
        }
        cvVar.f25161i1 = o5.update(3, this, o5VarArr, cvVar.f25161i1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        boolean z11;
        int i10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        tu tuVar;
        float f11;
        float f12;
        o5 o5Var;
        Canvas canvas2 = canvas;
        cv cvVar = this.D;
        kp kpVar = cvVar.f25174w1;
        org.telegram.ui.g3 g3Var = cvVar.f25165n1;
        if (!this.d) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, cvVar.I0);
        Paint paint = this.f31038a;
        paint.setColor(w02);
        org.telegram.ui.ActionBar.t6.n(paint);
        Path path = this.f31039b;
        path.reset();
        float I0 = cvVar.I0();
        if (I0 <= cvVar.f21586b.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.f31044s.d(z10);
        float T1 = org.telegram.messenger.i0.T1(I0, 0.0f, d);
        if (this.f31045w != null) {
            float L = org.telegram.messenger.i0.L(140.0f);
            f7 = 20.0f;
            float L2 = org.telegram.messenger.i0.L(20.0f);
            if (T1 < L + L2) {
                this.f31046x = false;
            }
            f10 = 2.0f;
            this.f31045w.setAlpha(this.f31047y.d(this.f31046x));
            if (this.f31045w.getAlpha() > 0.0f) {
                float alpha = ((this.f31045w.getAlpha() * 0.4f) + 0.6f) * L;
                float f13 = alpha / 2.0f;
                this.f31045w.y0((getWidth() / 2.0f) - f13, ((T1 - L2) - (L / 2.0f)) - f13, alpha, alpha);
                this.f31045w.h(canvas2, null);
            } else {
                this.f31045w.R();
                this.f31045w = null;
            }
        } else {
            f7 = 20.0f;
            f10 = 2.0f;
        }
        float f14 = 1.0f;
        float L3 = org.telegram.messenger.i0.L((1.0f - d) * 14.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getPaddingLeft(), T1, getWidth() - getPaddingRight(), getBottom() + L3);
        path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        if (d > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f31040c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f31040c = Boolean.valueOf(z11);
            cvVar.O0(z11);
        }
        org.telegram.ui.ActionBar.t6.f21217t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, cvVar.I0));
        org.telegram.ui.ActionBar.t6.f21217t0.setAlpha((int) (w7.u.a(T1 / org.telegram.messenger.i0.L(f7), 0.0f, 1.0f) * org.telegram.ui.ActionBar.t6.f21217t0.getAlpha()));
        int L4 = org.telegram.messenger.i0.L(36.0f);
        float L5 = T1 + org.telegram.messenger.i0.L(10.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.i0.L(4.0f) + L5);
        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), org.telegram.ui.ActionBar.t6.f21217t0);
        View view = cvVar.f25167p1;
        if (!g3Var.canScrollVertically(1) && cvVar.f25170s1.getVisibility() != 0) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        view.setVisibility(i10);
        if (g3Var != null) {
            canvas2.save();
            canvas2.translate(g3Var.getLeft(), g3Var.getY() + 0.0f);
            canvas2.clipRect(0, 0, g3Var.getWidth(), g3Var.getHeight());
            float f15 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, g3Var.getWidth(), g3Var.getHeight(), (int) (g3Var.getAlpha() * 255.0f), 31);
            int i11 = 0;
            while (true) {
                sparseArray = this.e;
                int size = sparseArray.size();
                arrayList = this.f31042n;
                if (i11 >= size) {
                    break;
                }
                ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
                arrayList3.clear();
                arrayList.add(arrayList3);
                i11++;
            }
            sparseArray.clear();
            int i12 = 0;
            while (i12 < g3Var.getChildCount()) {
                View childAt = g3Var.getChildAt(i12);
                if (childAt instanceof vu) {
                    vu vuVar = (vu) childAt;
                    if (vuVar.isPressed()) {
                        float f16 = vuVar.e;
                        if (f16 != f14) {
                            vuVar.e = Utilities.i(f16 + 0.16f, f14, 0.0f);
                            vuVar.invalidate();
                        }
                    }
                    if (cvVar.f25161i1 == null || (o5Var = vuVar.f31844c) == null) {
                        f11 = f14;
                    } else {
                        f11 = f14;
                        f5 f5Var = (f5) cvVar.f25161i1.get(o5Var.getDocumentId());
                        if (f5Var != null) {
                            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, cvVar.I0);
                            if (w03 == cvVar.L1 && cvVar.K1 != null) {
                                f12 = f15;
                            } else {
                                cvVar.L1 = w03;
                                f12 = f15;
                                cvVar.K1 = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                            }
                            f5Var.setColorFilter(cvVar.K1);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) i0.a.v(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(vuVar);
                        }
                    }
                    f12 = f15;
                } else {
                    f11 = f14;
                    f12 = f15;
                    canvas2.save();
                    canvas2.translate(childAt.getLeft(), childAt.getTop());
                    childAt.draw(canvas2);
                    canvas2.restore();
                }
                i12++;
                f14 = f11;
                f15 = f12;
            }
            float f17 = f14;
            float f18 = f15;
            ArrayList arrayList5 = this.h;
            arrayList5.clear();
            ArrayList arrayList6 = this.f31041f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i13 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f31043r;
                if (i13 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
                View view2 = (View) arrayList7.get(0);
                g3Var.getClass();
                int R = RecyclerView.R(view2);
                long j10 = currentTimeMillis;
                int i14 = 0;
                while (true) {
                    if (i14 < arrayList5.size()) {
                        if (((tu) arrayList5.get(i14)).M == R) {
                            tuVar = (tu) arrayList5.get(i14);
                            arrayList5.remove(i14);
                            break;
                        }
                        i14++;
                    } else {
                        tuVar = null;
                        break;
                    }
                }
                if (tuVar == null) {
                    if (!arrayList2.isEmpty()) {
                        tuVar = (tu) i0.a.v(1, arrayList2);
                    } else {
                        tuVar = new tu(this);
                        tuVar.l(7);
                    }
                    tuVar.M = R;
                    tuVar.e();
                }
                arrayList6.add(tuVar);
                tuVar.N = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                tu tuVar2 = tuVar;
                currentTimeMillis = j10;
                tuVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i13++;
            }
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((tu) arrayList5.get(i15));
                    ((tu) arrayList5.get(i15)).N = null;
                    ((tu) arrayList5.get(i15)).k();
                } else {
                    ((tu) arrayList5.get(i15)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (g3Var.getAlpha() < f17) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) L5)) / 2;
                int L6 = org.telegram.messenger.i0.L(16.0f);
                kpVar.setAlpha((int) ((f17 - g3Var.getAlpha()) * f18));
                kpVar.setBounds(width - L6, height - L6, width + L6, height + L6);
                kpVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            cv cvVar = this.D;
            if (y3 < cvVar.I0() - org.telegram.messenger.i0.L(6.0f)) {
                cvVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        ImageReceiver imageReceiver = this.f31045w;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        int i10 = 0;
        this.d = false;
        int i11 = 0;
        while (true) {
            arrayList = this.f31041f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((tu) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f31043r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((tu) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        o5.release(this, this.D.f25161i1);
        ImageReceiver imageReceiver = this.f31045w;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }
}
