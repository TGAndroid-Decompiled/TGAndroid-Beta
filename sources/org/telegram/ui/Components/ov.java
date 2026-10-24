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
public final class ov extends FrameLayout {
    public final Paint f29393a;
    public final Path f29394b;
    public Boolean f29395c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f29396f;
    public final ArrayList h;
    public final ArrayList f29397n;
    public final ArrayList f29398r;
    public final d6 f29399s;
    public ImageReceiver v;
    public boolean f29400w;
    public final d6 f29401x;
    public final yv f29402y;

    public ov(yv yvVar, Context context) {
        super(context);
        this.f29402y = yvVar;
        this.f29393a = new Paint();
        this.f29394b = new Path();
        this.f29395c = null;
        this.e = new SparseArray();
        this.f29396f = new ArrayList();
        this.h = new ArrayList();
        this.f29397n = new ArrayList();
        this.f29398r = new ArrayList();
        zr zrVar = zr.h;
        this.f29399s = new d6(this, 0L, 350L, zrVar);
        this.f29401x = new d6(this, 0L, 320L, zrVar);
    }

    public final void a() {
        y5[] y5VarArr;
        yv yvVar = this.f29402y;
        ei.v vVar = yvVar.h;
        if (vVar == null) {
            y5VarArr = new y5[0];
        } else {
            y5[] y5VarArr2 = new y5[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof pv) {
                    y5VarArr2[i10] = ((pv) childAt).f29684c;
                }
            }
            y5VarArr = y5VarArr2;
        }
        yvVar.f33048b = y5.update(3, this, y5VarArr, yvVar.f33048b);
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
        nv nvVar;
        float f11;
        float f12;
        y5 y5Var;
        Canvas canvas2 = canvas;
        yv yvVar = this.f29402y;
        cq cqVar = yvVar.F;
        ei.v vVar = yvVar.h;
        if (!this.d) {
            return;
        }
        int themedColor = yvVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5);
        Paint paint = this.f29393a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.k6.m(paint);
        Path path = this.f29394b;
        path.reset();
        float f02 = yvVar.f0();
        viewGroup = ((org.telegram.ui.ActionBar.h3) yvVar).containerView;
        if (f02 <= viewGroup.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.f29399s.e(z10);
        float lerp = AndroidUtilities.lerp(f02, 0.0f, e);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f7 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f29400w = false;
            }
            f10 = 2.0f;
            this.v.setAlpha(this.f29401x.e(this.f29400w));
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
        Boolean bool = this.f29395c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f29395c = Boolean.valueOf(z11);
            yvVar.l0(z11);
        }
        org.telegram.ui.ActionBar.k6.f21474t0.setColor(yvVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ii));
        org.telegram.ui.ActionBar.k6.f21474t0.setAlpha((int) (w7.r.a(lerp / AndroidUtilities.dp(f7), 0.0f, 1.0f) * org.telegram.ui.ActionBar.k6.f21474t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.k6.f21474t0);
        View view = yvVar.f33052r;
        if (!vVar.canScrollVertically(1) && yvVar.f33054w.getVisibility() != 0) {
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
                arrayList = this.f29397n;
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
                if (childAt instanceof pv) {
                    pv pvVar = (pv) childAt;
                    if (pvVar.isPressed()) {
                        float f16 = pvVar.e;
                        if (f16 != f14) {
                            pvVar.e = Utilities.clamp(f16 + 0.16f, f14, 0.0f);
                            pvVar.invalidate();
                        }
                    }
                    if (yvVar.f33048b == null || (y5Var = pvVar.f29684c) == null) {
                        f11 = f14;
                    } else {
                        f11 = f14;
                        p5 p5Var = (p5) yvVar.f33048b.get(y5Var.getDocumentId());
                        if (p5Var != null) {
                            int themedColor2 = yvVar.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
                            if (themedColor2 == yvVar.U && yvVar.T != null) {
                                f12 = f15;
                            } else {
                                yvVar.U = themedColor2;
                                f12 = f15;
                                yvVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            p5Var.setColorFilter(yvVar.T);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) i2.o1.A(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(pvVar);
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
            ArrayList arrayList6 = this.f29396f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i13 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f29398r;
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
                        if (((nv) arrayList5.get(i14)).M == R) {
                            nvVar = (nv) arrayList5.get(i14);
                            arrayList5.remove(i14);
                            break;
                        }
                        i14++;
                    } else {
                        nvVar = null;
                        break;
                    }
                }
                if (nvVar == null) {
                    if (!arrayList2.isEmpty()) {
                        nvVar = (nv) i2.o1.A(1, arrayList2);
                    } else {
                        nvVar = new nv(this);
                        nvVar.l(7);
                    }
                    nvVar.M = R;
                    nvVar.e();
                }
                arrayList6.add(nvVar);
                nvVar.N = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                nv nvVar2 = nvVar;
                currentTimeMillis = j10;
                nvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i13++;
            }
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((nv) arrayList5.get(i15));
                    ((nv) arrayList5.get(i15)).N = null;
                    ((nv) arrayList5.get(i15)).k();
                } else {
                    ((nv) arrayList5.get(i15)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (vVar.getAlpha() < f17) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) dp5)) / 2;
                int dp6 = AndroidUtilities.dp(16.0f);
                cqVar.setAlpha((int) ((f17 - vVar.getAlpha()) * f18));
                cqVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                cqVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            yv yvVar = this.f29402y;
            if (y3 < yvVar.f0() - AndroidUtilities.dp(6.0f)) {
                yvVar.dismiss();
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
            arrayList = this.f29396f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((nv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f29398r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((nv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        y5.release(this, this.f29402y.f33048b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
