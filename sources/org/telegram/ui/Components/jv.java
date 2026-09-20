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
public final class jv extends FrameLayout {
    public final Paint f25466a;
    public final Path f25467b;
    public Boolean f25468c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f25469f;
    public final ArrayList h;
    public final ArrayList f25470n;
    public final ArrayList f25471r;
    public final d6 f25472s;
    public ImageReceiver v;
    public boolean f25473w;
    public final d6 f25474x;
    public final tv f25475y;

    public jv(tv tvVar, Context context) {
        super(context);
        this.f25475y = tvVar;
        this.f25466a = new Paint();
        this.f25467b = new Path();
        this.f25468c = null;
        this.e = new SparseArray();
        this.f25469f = new ArrayList();
        this.h = new ArrayList();
        this.f25470n = new ArrayList();
        this.f25471r = new ArrayList();
        qr qrVar = qr.h;
        this.f25472s = new d6(this, 0L, 350L, qrVar);
        this.f25474x = new d6(this, 0L, 320L, qrVar);
    }

    public final void a() {
        y5[] y5VarArr;
        tv tvVar = this.f25475y;
        ci.v vVar = tvVar.h;
        if (vVar == null) {
            y5VarArr = new y5[0];
        } else {
            y5[] y5VarArr2 = new y5[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof kv) {
                    y5VarArr2[i10] = ((kv) childAt).f25870c;
                }
            }
            y5VarArr = y5VarArr2;
        }
        tvVar.f28450b = y5.update(3, this, y5VarArr, tvVar.f28450b);
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
        iv ivVar;
        y5 y5Var;
        Canvas canvas2 = canvas;
        tv tvVar = this.f25475y;
        tp tpVar = tvVar.F;
        ci.v vVar = tvVar.h;
        if (!this.d) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.f19165h5;
        int themedColor = tvVar.getThemedColor(i11);
        Paint paint = this.f25466a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.j6.m(paint);
        Path path = this.f25467b;
        path.reset();
        float V = tvVar.V();
        viewGroup = ((org.telegram.ui.ActionBar.f3) tvVar).containerView;
        if (V <= viewGroup.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.f25472s.e(z10);
        float lerp = AndroidUtilities.lerp(V, 0.0f, e);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f7 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f25473w = false;
            }
            this.v.setAlpha(this.f25474x.e(this.f25473w));
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
        Boolean bool = this.f25468c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f25468c = Boolean.valueOf(z11);
            if (AndroidUtilities.computePerceivedBrightness(tvVar.getThemedColor(i11)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(tvVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19372s8), 855638016)) > 0.721f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(tvVar, z12);
        }
        org.telegram.ui.ActionBar.j6.f19383t0.setColor(tvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
        org.telegram.ui.ActionBar.j6.f19383t0.setAlpha((int) (w7.q.a(lerp / AndroidUtilities.dp(f7), 0.0f, 1.0f) * org.telegram.ui.ActionBar.j6.f19383t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f19383t0);
        View view = tvVar.f28454r;
        if (!vVar.canScrollVertically(1) && tvVar.f28456w.getVisibility() != 0) {
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
                arrayList = this.f25470n;
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
                if (childAt instanceof kv) {
                    kv kvVar = (kv) childAt;
                    if (kvVar.isPressed()) {
                        float f13 = kvVar.e;
                        if (f13 != f12) {
                            kvVar.e = Utilities.clamp(f13 + 0.16f, f12, 0.0f);
                            kvVar.invalidate();
                        }
                    }
                    if (tvVar.f28450b != null && (y5Var = kvVar.f25870c) != null) {
                        p5 p5Var = (p5) tvVar.f28450b.get(y5Var.getDocumentId());
                        if (p5Var != null) {
                            int themedColor2 = tvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                            if (themedColor2 != tvVar.U || tvVar.T == null) {
                                tvVar.U = themedColor2;
                                tvVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            p5Var.setColorFilter(tvVar.T);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) hg.k0.x(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(kvVar);
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
            ArrayList arrayList6 = this.f25469f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i14 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f25471r;
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
                        if (((iv) arrayList5.get(i15)).M == S) {
                            ivVar = (iv) arrayList5.get(i15);
                            arrayList5.remove(i15);
                            break;
                        }
                        i15++;
                    } else {
                        ivVar = null;
                        break;
                    }
                }
                if (ivVar == null) {
                    if (!arrayList2.isEmpty()) {
                        ivVar = (iv) hg.k0.x(1, arrayList2);
                    } else {
                        ivVar = new iv(this);
                        ivVar.l(7);
                    }
                    ivVar.M = S;
                    ivVar.e();
                }
                arrayList6.add(ivVar);
                ivVar.N = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                iv ivVar2 = ivVar;
                currentTimeMillis = j3;
                ivVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i14++;
            }
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((iv) arrayList5.get(i16));
                    ((iv) arrayList5.get(i16)).N = null;
                    ((iv) arrayList5.get(i16)).k();
                } else {
                    ((iv) arrayList5.get(i16)).f();
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
            tv tvVar = this.f25475y;
            if (y3 < tvVar.V() - AndroidUtilities.dp(6.0f)) {
                tvVar.dismiss();
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
            arrayList = this.f25469f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((iv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f25471r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((iv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        y5.release(this, this.f25475y.f28450b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
