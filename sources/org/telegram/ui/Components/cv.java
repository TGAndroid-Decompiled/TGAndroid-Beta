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
public final class cv extends FrameLayout {
    public final Paint f24052a;
    public final Path f24053b;
    public Boolean f24054c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f24055f;
    public final ArrayList h;
    public final ArrayList f24056n;
    public final ArrayList f24057r;
    public final z5 f24058s;
    public ImageReceiver v;
    public boolean f24059w;
    public final z5 f24060x;
    public final mv f24061y;

    public cv(mv mvVar, Context context) {
        super(context);
        this.f24061y = mvVar;
        this.f24052a = new Paint();
        this.f24053b = new Path();
        this.f24054c = null;
        this.e = new SparseArray();
        this.f24055f = new ArrayList();
        this.h = new ArrayList();
        this.f24056n = new ArrayList();
        this.f24057r = new ArrayList();
        nr nrVar = nr.h;
        this.f24058s = new z5(this, 0L, 350L, nrVar);
        this.f24060x = new z5(this, 0L, 320L, nrVar);
    }

    public final void a() {
        u5[] u5VarArr;
        mv mvVar = this.f24061y;
        org.telegram.ui.k3 k3Var = mvVar.h;
        if (k3Var == null) {
            u5VarArr = new u5[0];
        } else {
            u5[] u5VarArr2 = new u5[k3Var.getChildCount()];
            for (int i10 = 0; i10 < k3Var.getChildCount(); i10++) {
                View childAt = k3Var.getChildAt(i10);
                if (childAt instanceof dv) {
                    u5VarArr2[i10] = ((dv) childAt).f24379c;
                }
            }
            u5VarArr = u5VarArr2;
        }
        mvVar.f27123b = u5.update(3, this, u5VarArr, mvVar.f27123b);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        boolean z4;
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        bv bvVar;
        u5 u5Var;
        Canvas canvas2 = canvas;
        mv mvVar = this.f24061y;
        rp rpVar = mvVar.C;
        org.telegram.ui.k3 k3Var = mvVar.h;
        if (!this.d) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.f19977h5;
        int themedColor = mvVar.getThemedColor(i11);
        Paint paint = this.f24052a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.j6.m(paint);
        Path path = this.f24053b;
        path.reset();
        float V = mvVar.V();
        viewGroup = ((org.telegram.ui.ActionBar.g3) mvVar).containerView;
        if (V <= viewGroup.getPaddingTop()) {
            z4 = true;
        } else {
            z4 = false;
        }
        float e = this.f24058s.e(z4);
        float lerp = AndroidUtilities.lerp(V, 0.0f, e);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f10 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f24059w = false;
            }
            this.v.setAlpha(this.f24060x.e(this.f24059w));
            if (this.v.getAlpha() > 0.0f) {
                float alpha = ((this.v.getAlpha() * 0.4f) + 0.6f) * dp;
                float f11 = (lerp - dp2) - (dp / 2.0f);
                float f12 = alpha / 2.0f;
                this.v.setImageCoords((getWidth() / 2.0f) - f12, f11 - f12, alpha, alpha);
                this.v.draw(canvas2);
            } else {
                this.v.onDetachedFromWindow();
                this.v = null;
            }
        } else {
            f10 = 20.0f;
        }
        float f13 = 1.0f;
        float dp3 = AndroidUtilities.dp((1.0f - e) * 14.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), lerp, getWidth() - getPaddingRight(), getBottom() + dp3);
        path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        if (e > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f24054c;
        if (bool == null || z10 != bool.booleanValue()) {
            this.f24054c = Boolean.valueOf(z10);
            if (AndroidUtilities.computePerceivedBrightness(mvVar.getThemedColor(i11)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20176s8), 855638016)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(mvVar, z11);
        }
        org.telegram.ui.ActionBar.j6.f20185t0.setColor(mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
        org.telegram.ui.ActionBar.j6.f20185t0.setAlpha((int) (k7.n.a(lerp / AndroidUtilities.dp(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.j6.f20185t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20185t0);
        View view = mvVar.f27127r;
        if (!k3Var.canScrollVertically(1) && mvVar.f27129w.getVisibility() != 0) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        view.setVisibility(i10);
        if (k3Var != null) {
            canvas2.save();
            canvas2.translate(k3Var.getLeft(), k3Var.getY() + 0.0f);
            canvas2.clipRect(0, 0, k3Var.getWidth(), k3Var.getHeight());
            canvas2.saveLayerAlpha(0.0f, 0.0f, k3Var.getWidth(), k3Var.getHeight(), (int) (k3Var.getAlpha() * 255.0f), 31);
            int i12 = 0;
            while (true) {
                sparseArray = this.e;
                int size = sparseArray.size();
                arrayList = this.f24056n;
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
            while (i13 < k3Var.getChildCount()) {
                View childAt = k3Var.getChildAt(i13);
                if (childAt instanceof dv) {
                    dv dvVar = (dv) childAt;
                    if (dvVar.isPressed()) {
                        float f14 = dvVar.e;
                        if (f14 != f13) {
                            dvVar.e = Utilities.clamp(f14 + 0.16f, f13, 0.0f);
                            dvVar.invalidate();
                        }
                    }
                    if (mvVar.f27123b != null && (u5Var = dvVar.f24379c) != null) {
                        l5 l5Var = (l5) mvVar.f27123b.get(u5Var.getDocumentId());
                        if (l5Var != null) {
                            int themedColor2 = mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                            if (themedColor2 != mvVar.R || mvVar.Q == null) {
                                mvVar.R = themedColor2;
                                mvVar.Q = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            l5Var.setColorFilter(mvVar.Q);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) e2.c.g(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(dvVar);
                        }
                    }
                } else {
                    canvas2.save();
                    canvas2.translate(childAt.getLeft(), childAt.getTop());
                    childAt.draw(canvas2);
                    canvas2.restore();
                }
                i13++;
                f13 = 1.0f;
            }
            ArrayList arrayList5 = this.h;
            arrayList5.clear();
            ArrayList arrayList6 = this.f24055f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i14 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f24057r;
                if (i14 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
                View view2 = (View) arrayList7.get(0);
                k3Var.getClass();
                int R = RecyclerView.R(view2);
                long j10 = currentTimeMillis;
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList5.size()) {
                        if (((bv) arrayList5.get(i15)).J == R) {
                            bvVar = (bv) arrayList5.get(i15);
                            arrayList5.remove(i15);
                            break;
                        }
                        i15++;
                    } else {
                        bvVar = null;
                        break;
                    }
                }
                if (bvVar == null) {
                    if (!arrayList2.isEmpty()) {
                        bvVar = (bv) e2.c.g(1, arrayList2);
                    } else {
                        bvVar = new bv(this);
                        bvVar.l(7);
                    }
                    bvVar.J = R;
                    bvVar.e();
                }
                arrayList6.add(bvVar);
                bvVar.K = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                bv bvVar2 = bvVar;
                currentTimeMillis = j10;
                bvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i14++;
            }
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((bv) arrayList5.get(i16));
                    ((bv) arrayList5.get(i16)).K = null;
                    ((bv) arrayList5.get(i16)).k();
                } else {
                    ((bv) arrayList5.get(i16)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (k3Var.getAlpha() < 1.0f) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) dp5)) / 2;
                int dp6 = AndroidUtilities.dp(16.0f);
                rpVar.setAlpha((int) ((1.0f - k3Var.getAlpha()) * 255.0f));
                rpVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                rpVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            mv mvVar = this.f24061y;
            if (y10 < mvVar.V() - AndroidUtilities.dp(6.0f)) {
                mvVar.dismiss();
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
            arrayList = this.f24055f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((bv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f24057r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((bv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        u5.release(this, this.f24061y.f27123b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
