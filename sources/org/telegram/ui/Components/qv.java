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
public final class qv extends FrameLayout {
    public final Paint f30009a;
    public final Path f30010b;
    public Boolean f30011c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f30012f;
    public final ArrayList h;
    public final ArrayList f30013n;
    public final ArrayList f30014r;
    public final f6 f30015s;
    public ImageReceiver v;
    public boolean f30016w;
    public final f6 f30017x;
    public final aw f30018y;

    public qv(aw awVar, Context context) {
        super(context);
        this.f30018y = awVar;
        this.f30009a = new Paint();
        this.f30010b = new Path();
        this.f30011c = null;
        this.e = new SparseArray();
        this.f30012f = new ArrayList();
        this.h = new ArrayList();
        this.f30013n = new ArrayList();
        this.f30014r = new ArrayList();
        bs bsVar = bs.h;
        this.f30015s = new f6(this, 0L, 350L, bsVar);
        this.f30017x = new f6(this, 0L, 320L, bsVar);
    }

    public final void a() {
        a6[] a6VarArr;
        aw awVar = this.f30018y;
        ei.v vVar = awVar.h;
        if (vVar == null) {
            a6VarArr = new a6[0];
        } else {
            a6[] a6VarArr2 = new a6[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof rv) {
                    a6VarArr2[i10] = ((rv) childAt).f30281c;
                }
            }
            a6VarArr = a6VarArr2;
        }
        awVar.f24854b = a6.update(3, this, a6VarArr, awVar.f24854b);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        boolean z10;
        float f7;
        float f10;
        boolean z11;
        int i10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        pv pvVar;
        float f11;
        float f12;
        a6 a6Var;
        Canvas canvas2 = canvas;
        aw awVar = this.f30018y;
        eq eqVar = awVar.F;
        ei.v vVar = awVar.h;
        if (!this.d) {
            return;
        }
        int themedColor = awVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5);
        Paint paint = this.f30009a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.k6.m(paint);
        Path path = this.f30010b;
        path.reset();
        float f02 = awVar.f0();
        viewGroup = ((org.telegram.ui.ActionBar.h3) awVar).containerView;
        if (f02 <= viewGroup.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.f30015s.e(z10);
        float lerp = AndroidUtilities.lerp(f02, 0.0f, e);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f7 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f30016w = false;
            }
            f10 = 2.0f;
            this.v.setAlpha(this.f30017x.e(this.f30016w));
            if (this.v.getAlpha() > 0.0f) {
                float alpha = ((this.v.getAlpha() * 0.4f) + 0.6f) * dp;
                float f13 = alpha / 2.0f;
                this.v.setImageCoords((getWidth() / 2.0f) - f13, ((lerp - dp2) - (dp / 2.0f)) - f13, alpha, alpha);
                this.v.draw(canvas2);
            } else {
                this.v.onDetachedFromWindow();
                this.v = null;
            }
        } else {
            f7 = 20.0f;
            f10 = 2.0f;
        }
        float f14 = 1.0f;
        float dp3 = AndroidUtilities.dp((1.0f - e) * 14.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), lerp, getWidth() - getPaddingRight(), getBottom() + dp3);
        path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        if (e > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f30011c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f30011c = Boolean.valueOf(z11);
            awVar.l0(z11);
        }
        org.telegram.ui.ActionBar.k6.f21473t0.setColor(awVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ii));
        org.telegram.ui.ActionBar.k6.f21473t0.setAlpha((int) (w7.r.a(lerp / AndroidUtilities.dp(f7), 0.0f, 1.0f) * org.telegram.ui.ActionBar.k6.f21473t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.k6.f21473t0);
        View view = awVar.f24858r;
        if (!vVar.canScrollVertically(1) && awVar.f24860w.getVisibility() != 0) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        view.setVisibility(i10);
        if (vVar != null) {
            canvas2.save();
            canvas2.translate(vVar.getLeft(), vVar.getY() + 0.0f);
            canvas2.clipRect(0, 0, vVar.getWidth(), vVar.getHeight());
            float f15 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, vVar.getWidth(), vVar.getHeight(), (int) (vVar.getAlpha() * 255.0f), 31);
            int i11 = 0;
            while (true) {
                sparseArray = this.e;
                int size = sparseArray.size();
                arrayList = this.f30013n;
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
            while (i12 < vVar.getChildCount()) {
                View childAt = vVar.getChildAt(i12);
                if (childAt instanceof rv) {
                    rv rvVar = (rv) childAt;
                    if (rvVar.isPressed()) {
                        float f16 = rvVar.e;
                        if (f16 != f14) {
                            rvVar.e = Utilities.clamp(f16 + 0.16f, f14, 0.0f);
                            rvVar.invalidate();
                        }
                    }
                    if (awVar.f24854b == null || (a6Var = rvVar.f30281c) == null) {
                        f11 = f14;
                    } else {
                        f11 = f14;
                        r5 r5Var = (r5) awVar.f24854b.get(a6Var.getDocumentId());
                        if (r5Var != null) {
                            int themedColor2 = awVar.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
                            if (themedColor2 == awVar.U && awVar.T != null) {
                                f12 = f15;
                            } else {
                                awVar.U = themedColor2;
                                f12 = f15;
                                awVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            r5Var.setColorFilter(awVar.T);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) i2.o1.A(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(rvVar);
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
            ArrayList arrayList6 = this.f30012f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i13 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f30014r;
                if (i13 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
                View view2 = (View) arrayList7.get(0);
                vVar.getClass();
                int R = RecyclerView.R(view2);
                long j10 = currentTimeMillis;
                int i14 = 0;
                while (true) {
                    if (i14 < arrayList5.size()) {
                        if (((pv) arrayList5.get(i14)).M == R) {
                            pvVar = (pv) arrayList5.get(i14);
                            arrayList5.remove(i14);
                            break;
                        }
                        i14++;
                    } else {
                        pvVar = null;
                        break;
                    }
                }
                if (pvVar == null) {
                    if (!arrayList2.isEmpty()) {
                        pvVar = (pv) i2.o1.A(1, arrayList2);
                    } else {
                        pvVar = new pv(this);
                        pvVar.l(7);
                    }
                    pvVar.M = R;
                    pvVar.e();
                }
                arrayList6.add(pvVar);
                pvVar.N = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                pv pvVar2 = pvVar;
                currentTimeMillis = j10;
                pvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i13++;
            }
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((pv) arrayList5.get(i15));
                    ((pv) arrayList5.get(i15)).N = null;
                    ((pv) arrayList5.get(i15)).k();
                } else {
                    ((pv) arrayList5.get(i15)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (vVar.getAlpha() < f17) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) dp5)) / 2;
                int dp6 = AndroidUtilities.dp(16.0f);
                eqVar.setAlpha((int) ((f17 - vVar.getAlpha()) * f18));
                eqVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                eqVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            aw awVar = this.f30018y;
            if (y3 < awVar.f0() - AndroidUtilities.dp(6.0f)) {
                awVar.dismiss();
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
            arrayList = this.f30012f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((pv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f30014r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((pv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        a6.release(this, this.f30018y.f24854b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
