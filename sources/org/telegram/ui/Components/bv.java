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
public final class bv extends FrameLayout {
    public final Paint f23748a;
    public final Path f23749b;
    public Boolean f23750c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f23751f;
    public final ArrayList h;
    public final ArrayList f23752n;
    public final ArrayList f23753r;
    public final z5 f23754s;
    public ImageReceiver v;
    public boolean f23755w;
    public final z5 f23756x;
    public final lv f23757y;

    public bv(lv lvVar, Context context) {
        super(context);
        this.f23757y = lvVar;
        this.f23748a = new Paint();
        this.f23749b = new Path();
        this.f23750c = null;
        this.e = new SparseArray();
        this.f23751f = new ArrayList();
        this.h = new ArrayList();
        this.f23752n = new ArrayList();
        this.f23753r = new ArrayList();
        mr mrVar = mr.h;
        this.f23754s = new z5(this, 0L, 350L, mrVar);
        this.f23756x = new z5(this, 0L, 320L, mrVar);
    }

    public final void a() {
        u5[] u5VarArr;
        lv lvVar = this.f23757y;
        org.telegram.ui.m3 m3Var = lvVar.h;
        if (m3Var == null) {
            u5VarArr = new u5[0];
        } else {
            u5[] u5VarArr2 = new u5[m3Var.getChildCount()];
            for (int i10 = 0; i10 < m3Var.getChildCount(); i10++) {
                View childAt = m3Var.getChildAt(i10);
                if (childAt instanceof cv) {
                    u5VarArr2[i10] = ((cv) childAt).f24045c;
                }
            }
            u5VarArr = u5VarArr2;
        }
        lvVar.f26878b = u5.update(3, this, u5VarArr, lvVar.f26878b);
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
        av avVar;
        u5 u5Var;
        Canvas canvas2 = canvas;
        lv lvVar = this.f23757y;
        qp qpVar = lvVar.C;
        org.telegram.ui.m3 m3Var = lvVar.h;
        if (!this.d) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.f19952h5;
        int themedColor = lvVar.getThemedColor(i11);
        Paint paint = this.f23748a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.j6.m(paint);
        Path path = this.f23749b;
        path.reset();
        float V = lvVar.V();
        viewGroup = ((org.telegram.ui.ActionBar.g3) lvVar).containerView;
        if (V <= viewGroup.getPaddingTop()) {
            z4 = true;
        } else {
            z4 = false;
        }
        float e = this.f23754s.e(z4);
        float lerp = AndroidUtilities.lerp(V, 0.0f, e);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f10 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f23755w = false;
            }
            this.v.setAlpha(this.f23756x.e(this.f23755w));
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
        Boolean bool = this.f23750c;
        if (bool == null || z10 != bool.booleanValue()) {
            this.f23750c = Boolean.valueOf(z10);
            if (AndroidUtilities.computePerceivedBrightness(lvVar.getThemedColor(i11)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(lvVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20151s8), 855638016)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(lvVar, z11);
        }
        org.telegram.ui.ActionBar.j6.f20160t0.setColor(lvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
        org.telegram.ui.ActionBar.j6.f20160t0.setAlpha((int) (k7.n.a(lerp / AndroidUtilities.dp(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.j6.f20160t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20160t0);
        View view = lvVar.f26882r;
        if (!m3Var.canScrollVertically(1) && lvVar.f26884w.getVisibility() != 0) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        view.setVisibility(i10);
        if (m3Var != null) {
            canvas2.save();
            canvas2.translate(m3Var.getLeft(), m3Var.getY() + 0.0f);
            canvas2.clipRect(0, 0, m3Var.getWidth(), m3Var.getHeight());
            canvas2.saveLayerAlpha(0.0f, 0.0f, m3Var.getWidth(), m3Var.getHeight(), (int) (m3Var.getAlpha() * 255.0f), 31);
            int i12 = 0;
            while (true) {
                sparseArray = this.e;
                int size = sparseArray.size();
                arrayList = this.f23752n;
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
            while (i13 < m3Var.getChildCount()) {
                View childAt = m3Var.getChildAt(i13);
                if (childAt instanceof cv) {
                    cv cvVar = (cv) childAt;
                    if (cvVar.isPressed()) {
                        float f14 = cvVar.e;
                        if (f14 != f13) {
                            cvVar.e = Utilities.clamp(f14 + 0.16f, f13, 0.0f);
                            cvVar.invalidate();
                        }
                    }
                    if (lvVar.f26878b != null && (u5Var = cvVar.f24045c) != null) {
                        l5 l5Var = (l5) lvVar.f26878b.get(u5Var.getDocumentId());
                        if (l5Var != null) {
                            int themedColor2 = lvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                            if (themedColor2 != lvVar.R || lvVar.Q == null) {
                                lvVar.R = themedColor2;
                                lvVar.Q = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            l5Var.setColorFilter(lvVar.Q);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) e2.c.g(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(cvVar);
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
            ArrayList arrayList6 = this.f23751f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i14 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f23753r;
                if (i14 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
                View view2 = (View) arrayList7.get(0);
                m3Var.getClass();
                int R = RecyclerView.R(view2);
                long j10 = currentTimeMillis;
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList5.size()) {
                        if (((av) arrayList5.get(i15)).J == R) {
                            avVar = (av) arrayList5.get(i15);
                            arrayList5.remove(i15);
                            break;
                        }
                        i15++;
                    } else {
                        avVar = null;
                        break;
                    }
                }
                if (avVar == null) {
                    if (!arrayList2.isEmpty()) {
                        avVar = (av) e2.c.g(1, arrayList2);
                    } else {
                        avVar = new av(this);
                        avVar.l(7);
                    }
                    avVar.J = R;
                    avVar.e();
                }
                arrayList6.add(avVar);
                avVar.K = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                av avVar2 = avVar;
                currentTimeMillis = j10;
                avVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i14++;
            }
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((av) arrayList5.get(i16));
                    ((av) arrayList5.get(i16)).K = null;
                    ((av) arrayList5.get(i16)).k();
                } else {
                    ((av) arrayList5.get(i16)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (m3Var.getAlpha() < 1.0f) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) dp5)) / 2;
                int dp6 = AndroidUtilities.dp(16.0f);
                qpVar.setAlpha((int) ((1.0f - m3Var.getAlpha()) * 255.0f));
                qpVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                qpVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            lv lvVar = this.f23757y;
            if (y10 < lvVar.V() - AndroidUtilities.dp(6.0f)) {
                lvVar.dismiss();
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
            arrayList = this.f23751f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((av) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f23753r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((av) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        u5.release(this, this.f23757y.f26878b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
