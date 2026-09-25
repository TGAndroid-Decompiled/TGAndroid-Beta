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
    public final Paint f25498a;
    public final Path f25499b;
    public Boolean f25500c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f25501f;
    public final ArrayList h;
    public final ArrayList f25502n;
    public final ArrayList f25503r;
    public final e6 f25504s;
    public ImageReceiver v;
    public boolean f25505w;
    public final e6 f25506x;
    public final tv f25507y;

    public jv(tv tvVar, Context context) {
        super(context);
        this.f25507y = tvVar;
        this.f25498a = new Paint();
        this.f25499b = new Path();
        this.f25500c = null;
        this.e = new SparseArray();
        this.f25501f = new ArrayList();
        this.h = new ArrayList();
        this.f25502n = new ArrayList();
        this.f25503r = new ArrayList();
        rr rrVar = rr.h;
        this.f25504s = new e6(this, 0L, 350L, rrVar);
        this.f25506x = new e6(this, 0L, 320L, rrVar);
    }

    public final void a() {
        z5[] z5VarArr;
        tv tvVar = this.f25507y;
        ci.v vVar = tvVar.h;
        if (vVar == null) {
            z5VarArr = new z5[0];
        } else {
            z5[] z5VarArr2 = new z5[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof kv) {
                    z5VarArr2[i10] = ((kv) childAt).f25893c;
                }
            }
            z5VarArr = z5VarArr2;
        }
        tvVar.f28624b = z5.update(3, this, z5VarArr, tvVar.f28624b);
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
        z5 z5Var;
        Canvas canvas2 = canvas;
        tv tvVar = this.f25507y;
        up upVar = tvVar.F;
        ci.v vVar = tvVar.h;
        if (!this.d) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.h6.f19130h5;
        int themedColor = tvVar.getThemedColor(i11);
        Paint paint = this.f25498a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.h6.m(paint);
        Path path = this.f25499b;
        path.reset();
        float V = tvVar.V();
        viewGroup = ((org.telegram.ui.ActionBar.e3) tvVar).containerView;
        if (V <= viewGroup.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.f25504s.e(z10);
        float lerp = AndroidUtilities.lerp(V, 0.0f, e);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f7 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f25505w = false;
            }
            this.v.setAlpha(this.f25506x.e(this.f25505w));
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
        Boolean bool = this.f25500c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f25500c = Boolean.valueOf(z11);
            if (AndroidUtilities.computePerceivedBrightness(tvVar.getThemedColor(i11)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v(tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19338s8), 855638016)) > 0.721f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(tvVar, z12);
        }
        org.telegram.ui.ActionBar.h6.f19349t0.setColor(tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii));
        org.telegram.ui.ActionBar.h6.f19349t0.setAlpha((int) (w7.q.a(lerp / AndroidUtilities.dp(f7), 0.0f, 1.0f) * org.telegram.ui.ActionBar.h6.f19349t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f19349t0);
        View view = tvVar.f28628r;
        if (!vVar.canScrollVertically(1) && tvVar.f28630w.getVisibility() != 0) {
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
                arrayList = this.f25502n;
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
                    if (tvVar.f28624b != null && (z5Var = kvVar.f25893c) != null) {
                        q5 q5Var = (q5) tvVar.f28624b.get(z5Var.getDocumentId());
                        if (q5Var != null) {
                            int themedColor2 = tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
                            if (themedColor2 != tvVar.U || tvVar.T == null) {
                                tvVar.U = themedColor2;
                                tvVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            q5Var.setColorFilter(tvVar.T);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) hg.c.x(1, arrayList);
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
            ArrayList arrayList6 = this.f25501f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i14 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f25503r;
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
                        if (((iv) arrayList5.get(i15)).M == R) {
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
                        ivVar = (iv) hg.c.x(1, arrayList2);
                    } else {
                        ivVar = new iv(this);
                        ivVar.l(7);
                    }
                    ivVar.M = R;
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
                upVar.setAlpha((int) ((1.0f - vVar.getAlpha()) * 255.0f));
                upVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                upVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            tv tvVar = this.f25507y;
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
            arrayList = this.f25501f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((iv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f25503r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((iv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        z5.release(this, this.f25507y.f28624b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
