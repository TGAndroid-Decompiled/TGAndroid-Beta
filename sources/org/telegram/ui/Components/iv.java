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
public final class iv extends FrameLayout {
    public final Paint f25046a;
    public final Path f25047b;
    public Boolean f25048c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f25049f;
    public final ArrayList h;
    public final ArrayList f25050n;
    public final ArrayList f25051r;
    public final e6 f25052s;
    public ImageReceiver v;
    public boolean f25053w;
    public final e6 f25054x;
    public final sv f25055y;

    public iv(sv svVar, Context context) {
        super(context);
        this.f25055y = svVar;
        this.f25046a = new Paint();
        this.f25047b = new Path();
        this.f25048c = null;
        this.e = new SparseArray();
        this.f25049f = new ArrayList();
        this.h = new ArrayList();
        this.f25050n = new ArrayList();
        this.f25051r = new ArrayList();
        qr qrVar = qr.h;
        this.f25052s = new e6(this, 0L, 350L, qrVar);
        this.f25054x = new e6(this, 0L, 320L, qrVar);
    }

    public final void a() {
        z5[] z5VarArr;
        sv svVar = this.f25055y;
        ci.v vVar = svVar.h;
        if (vVar == null) {
            z5VarArr = new z5[0];
        } else {
            z5[] z5VarArr2 = new z5[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof jv) {
                    z5VarArr2[i10] = ((jv) childAt).f25462c;
                }
            }
            z5VarArr = z5VarArr2;
        }
        svVar.f28231b = z5.update(3, this, z5VarArr, svVar.f28231b);
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
        hv hvVar;
        z5 z5Var;
        Canvas canvas2 = canvas;
        sv svVar = this.f25055y;
        tp tpVar = svVar.F;
        ci.v vVar = svVar.h;
        if (!this.d) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.f19133h5;
        int themedColor = svVar.getThemedColor(i11);
        Paint paint = this.f25046a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.j6.m(paint);
        Path path = this.f25047b;
        path.reset();
        float V = svVar.V();
        viewGroup = ((org.telegram.ui.ActionBar.f3) svVar).containerView;
        if (V <= viewGroup.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.f25052s.e(z10);
        float lerp = AndroidUtilities.lerp(V, 0.0f, e);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f7 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f25053w = false;
            }
            this.v.setAlpha(this.f25054x.e(this.f25053w));
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
        Boolean bool = this.f25048c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f25048c = Boolean.valueOf(z11);
            if (AndroidUtilities.computePerceivedBrightness(svVar.getThemedColor(i11)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(svVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19340s8), 855638016)) > 0.721f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(svVar, z12);
        }
        org.telegram.ui.ActionBar.j6.f19351t0.setColor(svVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
        org.telegram.ui.ActionBar.j6.f19351t0.setAlpha((int) (w7.q.a(lerp / AndroidUtilities.dp(f7), 0.0f, 1.0f) * org.telegram.ui.ActionBar.j6.f19351t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f19351t0);
        View view = svVar.f28235r;
        if (!vVar.canScrollVertically(1) && svVar.f28237w.getVisibility() != 0) {
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
                sparseArray = this.e;
                int size = sparseArray.size();
                arrayList = this.f25050n;
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
                if (childAt instanceof jv) {
                    jv jvVar = (jv) childAt;
                    if (jvVar.isPressed()) {
                        float f13 = jvVar.e;
                        if (f13 != f12) {
                            jvVar.e = Utilities.clamp(f13 + 0.16f, f12, 0.0f);
                            jvVar.invalidate();
                        }
                    }
                    if (svVar.f28231b != null && (z5Var = jvVar.f25462c) != null) {
                        q5 q5Var = (q5) svVar.f28231b.get(z5Var.getDocumentId());
                        if (q5Var != null) {
                            int themedColor2 = svVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                            if (themedColor2 != svVar.U || svVar.T == null) {
                                svVar.U = themedColor2;
                                svVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            q5Var.setColorFilter(svVar.T);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) hg.k0.v(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(jvVar);
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
            ArrayList arrayList6 = this.f25049f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i14 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f25051r;
                if (i14 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
                View view2 = (View) arrayList7.get(0);
                vVar.getClass();
                int S = RecyclerView.S(view2);
                long j3 = currentTimeMillis;
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList5.size()) {
                        if (((hv) arrayList5.get(i15)).M == S) {
                            hvVar = (hv) arrayList5.get(i15);
                            arrayList5.remove(i15);
                            break;
                        }
                        i15++;
                    } else {
                        hvVar = null;
                        break;
                    }
                }
                if (hvVar == null) {
                    if (!arrayList2.isEmpty()) {
                        hvVar = (hv) hg.k0.v(1, arrayList2);
                    } else {
                        hvVar = new hv(this);
                        hvVar.l(7);
                    }
                    hvVar.M = S;
                    hvVar.e();
                }
                arrayList6.add(hvVar);
                hvVar.N = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                hv hvVar2 = hvVar;
                currentTimeMillis = j3;
                hvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i14++;
            }
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((hv) arrayList5.get(i16));
                    ((hv) arrayList5.get(i16)).N = null;
                    ((hv) arrayList5.get(i16)).k();
                } else {
                    ((hv) arrayList5.get(i16)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (vVar.getAlpha() < 1.0f) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) dp5)) / 2;
                int dp6 = AndroidUtilities.dp(16.0f);
                tpVar.setAlpha((int) ((1.0f - vVar.getAlpha()) * 255.0f));
                tpVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                tpVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            sv svVar = this.f25055y;
            if (y3 < svVar.V() - AndroidUtilities.dp(6.0f)) {
                svVar.dismiss();
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
            arrayList = this.f25049f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((hv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f25051r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((hv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        z5.release(this, this.f25055y.f28231b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
