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
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class hv extends FrameLayout {
    public final Paint f26893a;
    public final Path f26894b;
    public Boolean f26895c;
    public boolean d;
    public final SparseArray f26896e;
    public final ArrayList f26897f;
    public final ArrayList h;
    public final ArrayList f26898n;
    public final ArrayList f26899r;
    public final e6 f26900s;
    public ImageReceiver v;
    public boolean f26901w;
    public final e6 f26902x;
    public final rv f26903y;

    public hv(rv rvVar, Context context) {
        super(context);
        this.f26903y = rvVar;
        this.f26893a = new Paint();
        this.f26894b = new Path();
        this.f26895c = null;
        this.f26896e = new SparseArray();
        this.f26897f = new ArrayList();
        this.h = new ArrayList();
        this.f26898n = new ArrayList();
        this.f26899r = new ArrayList();
        pr prVar = pr.h;
        this.f26900s = new e6(this, 0L, 350L, prVar);
        this.f26902x = new e6(this, 0L, 320L, prVar);
    }

    public final void a() {
        z5[] z5VarArr;
        rv rvVar = this.f26903y;
        di.v vVar = rvVar.h;
        if (vVar == null) {
            z5VarArr = new z5[0];
        } else {
            z5[] z5VarArr2 = new z5[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof iv) {
                    z5VarArr2[i10] = ((iv) childAt).f27296c;
                }
            }
            z5VarArr = z5VarArr2;
        }
        rvVar.f30120b = z5.update(3, this, z5VarArr, rvVar.f30120b);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        boolean z10;
        float f7;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        gv gvVar;
        z5 z5Var;
        Canvas canvas2 = canvas;
        rv rvVar = this.f26903y;
        sp spVar = rvVar.F;
        di.v vVar = rvVar.h;
        if (!this.d) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.f20761h5;
        int themedColor = rvVar.getThemedColor(i11);
        Paint paint = this.f26893a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.j6.m(paint);
        Path path = this.f26894b;
        path.reset();
        float V = rvVar.V();
        viewGroup = ((org.telegram.ui.ActionBar.f3) rvVar).containerView;
        if (V <= viewGroup.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f26900s.e(z10);
        float lerp = AndroidUtilities.lerp(V, 0.0f, e7);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f7 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f26901w = false;
            }
            this.v.setAlpha(this.f26902x.e(this.f26901w));
            if (this.v.getAlpha() > 0.0f) {
                float alpha = ((this.v.getAlpha() * 0.4f) + 0.6f) * dp;
                float f10 = (lerp - dp2) - (dp / 2.0f);
                float f11 = alpha / 2.0f;
                this.v.setImageCoords((getWidth() / 2.0f) - f11, f10 - f11, alpha, alpha);
                this.v.draw(canvas2);
            } else {
                this.v.onDetachedFromWindow();
                this.v = null;
            }
        } else {
            f7 = 20.0f;
        }
        float f12 = 1.0f;
        float dp3 = AndroidUtilities.dp((1.0f - e7) * 14.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), lerp, getWidth() - getPaddingRight(), getBottom() + dp3);
        path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        if (e7 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f26895c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f26895c = Boolean.valueOf(z11);
            if (AndroidUtilities.computePerceivedBrightness(rvVar.getThemedColor(i11)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20964s8), 855638016)) > 0.721f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(rvVar, z12);
        }
        org.telegram.ui.ActionBar.j6.f20975t0.setColor(rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
        org.telegram.ui.ActionBar.j6.f20975t0.setAlpha((int) (w7.p.a(lerp / AndroidUtilities.dp(f7), 0.0f, 1.0f) * org.telegram.ui.ActionBar.j6.f20975t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20975t0);
        View view = rvVar.f30125r;
        if (!vVar.canScrollVertically(1) && rvVar.f30127w.getVisibility() != 0) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        view.setVisibility(i10);
        if (vVar != null) {
            canvas2.save();
            canvas2.translate(vVar.getLeft(), vVar.getY() + 0.0f);
            canvas2.clipRect(0, 0, vVar.getWidth(), vVar.getHeight());
            canvas2.saveLayerAlpha(0.0f, 0.0f, vVar.getWidth(), vVar.getHeight(), (int) (vVar.getAlpha() * 255.0f), 31);
            int i12 = 0;
            while (true) {
                sparseArray = this.f26896e;
                int size = sparseArray.size();
                arrayList = this.f26898n;
                if (i12 >= size) {
                    break;
                }
                ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i12);
                arrayList3.clear();
                arrayList.add(arrayList3);
                i12++;
            }
            sparseArray.clear();
            int i13 = 0;
            while (i13 < vVar.getChildCount()) {
                View childAt = vVar.getChildAt(i13);
                if (childAt instanceof iv) {
                    iv ivVar = (iv) childAt;
                    if (ivVar.isPressed()) {
                        float f13 = ivVar.f27297e;
                        if (f13 != f12) {
                            ivVar.f27297e = Utilities.clamp(f13 + 0.16f, f12, 0.0f);
                            ivVar.invalidate();
                        }
                    }
                    if (rvVar.f30120b != null && (z5Var = ivVar.f27296c) != null) {
                        q5 q5Var = (q5) rvVar.f30120b.get(z5Var.getDocumentId());
                        if (q5Var != null) {
                            int themedColor2 = rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                            if (themedColor2 != rvVar.U || rvVar.T == null) {
                                rvVar.U = themedColor2;
                                rvVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            q5Var.setColorFilter(rvVar.T);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) i2.g.z(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(ivVar);
                        }
                    }
                } else {
                    canvas2.save();
                    canvas2.translate(childAt.getLeft(), childAt.getTop());
                    childAt.draw(canvas2);
                    canvas2.restore();
                }
                i13++;
                f12 = 1.0f;
            }
            ArrayList arrayList5 = this.h;
            arrayList5.clear();
            ArrayList arrayList6 = this.f26897f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i14 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f26899r;
                if (i14 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
                View view2 = (View) arrayList7.get(0);
                vVar.getClass();
                int R = RecyclerView.R(view2);
                long j3 = currentTimeMillis;
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList5.size()) {
                        if (((gv) arrayList5.get(i15)).M == R) {
                            gvVar = (gv) arrayList5.get(i15);
                            arrayList5.remove(i15);
                            break;
                        }
                        i15++;
                    } else {
                        gvVar = null;
                        break;
                    }
                }
                if (gvVar == null) {
                    if (!arrayList2.isEmpty()) {
                        gvVar = (gv) i2.g.z(1, arrayList2);
                    } else {
                        gvVar = new gv(this);
                        gvVar.l(7);
                    }
                    gvVar.M = R;
                    gvVar.e();
                }
                arrayList6.add(gvVar);
                gvVar.N = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                gv gvVar2 = gvVar;
                currentTimeMillis = j3;
                gvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i14++;
            }
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((gv) arrayList5.get(i16));
                    ((gv) arrayList5.get(i16)).N = null;
                    ((gv) arrayList5.get(i16)).k();
                } else {
                    ((gv) arrayList5.get(i16)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (vVar.getAlpha() < 1.0f) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) dp5)) / 2;
                int dp6 = AndroidUtilities.dp(16.0f);
                spVar.setAlpha((int) ((1.0f - vVar.getAlpha()) * 255.0f));
                spVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                spVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            rv rvVar = this.f26903y;
            if (y3 < rvVar.V() - AndroidUtilities.dp(6.0f)) {
                rvVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
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
            arrayList = this.f26897f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((gv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f26899r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((gv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        z5.release(this, this.f26903y.f30120b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
