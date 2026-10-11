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
public final class zv extends FrameLayout {
    public final Paint f33669a;
    public final Path f33670b;
    public Boolean f33671c;
    public boolean d;
    public final SparseArray f33672e;
    public final ArrayList f33673f;
    public final ArrayList h;
    public final ArrayList f33674n;
    public final ArrayList f33675r;
    public final g6 f33676s;
    public ImageReceiver v;
    public boolean f33677w;
    public final g6 f33678x;
    public final jw f33679y;

    public zv(jw jwVar, Context context) {
        super(context);
        this.f33679y = jwVar;
        this.f33669a = new Paint();
        this.f33670b = new Path();
        this.f33671c = null;
        this.f33672e = new SparseArray();
        this.f33673f = new ArrayList();
        this.h = new ArrayList();
        this.f33674n = new ArrayList();
        this.f33675r = new ArrayList();
        is isVar = is.h;
        this.f33676s = new g6(this, 0L, 350L, isVar);
        this.f33678x = new g6(this, 0L, 320L, isVar);
    }

    public final void a() {
        b6[] b6VarArr;
        jw jwVar = this.f33679y;
        ci.v vVar = jwVar.h;
        if (vVar == null) {
            b6VarArr = new b6[0];
        } else {
            b6[] b6VarArr2 = new b6[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof aw) {
                    b6VarArr2[i10] = ((aw) childAt).f24604c;
                }
            }
            b6VarArr = b6VarArr2;
        }
        jwVar.f27758b = b6.update(3, this, b6VarArr, jwVar.f27758b);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        boolean z10;
        float f7;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        yv yvVar;
        float f11;
        b6 b6Var;
        Canvas canvas2 = canvas;
        jw jwVar = this.f33679y;
        jq jqVar = jwVar.F;
        ci.v vVar = jwVar.h;
        if (!this.d) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.h6.f20857h5;
        int themedColor = jwVar.getThemedColor(i11);
        Paint paint = this.f33669a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.h6.m(paint);
        Path path = this.f33670b;
        path.reset();
        float W = jwVar.W();
        viewGroup = ((org.telegram.ui.ActionBar.e3) jwVar).containerView;
        if (W <= viewGroup.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f33676s.e(z10);
        float lerp = AndroidUtilities.lerp(W, 0.0f, e7);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f10 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f33677w = false;
            }
            f7 = 0.0f;
            this.v.setAlpha(this.f33678x.e(this.f33677w));
            if (this.v.getAlpha() > 0.0f) {
                float alpha = ((this.v.getAlpha() * 0.4f) + 0.6f) * dp;
                float f12 = (lerp - dp2) - (dp / 2.0f);
                float f13 = alpha / 2.0f;
                this.v.setImageCoords((getWidth() / 2.0f) - f13, f12 - f13, alpha, alpha);
                this.v.draw(canvas2);
            } else {
                this.v.onDetachedFromWindow();
                this.v = null;
            }
        } else {
            f7 = 0.0f;
            f10 = 20.0f;
        }
        float f14 = 1.0f;
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
        Boolean bool = this.f33671c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f33671c = Boolean.valueOf(z11);
            if (AndroidUtilities.computePerceivedBrightness(jwVar.getThemedColor(i11)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v(jwVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21065s8), 855638016)) > 0.721f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(jwVar, z12);
        }
        org.telegram.ui.ActionBar.h6.f21076t0.setColor(jwVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii));
        org.telegram.ui.ActionBar.h6.f21076t0.setAlpha((int) (w7.o.a(lerp / AndroidUtilities.dp(f10), f7, 1.0f) * org.telegram.ui.ActionBar.h6.f21076t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f21076t0);
        View view = jwVar.f27763r;
        if (!vVar.canScrollVertically(1) && jwVar.f27765w.getVisibility() != 0) {
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
            int i12 = 0;
            while (true) {
                sparseArray = this.f33672e;
                int size = sparseArray.size();
                arrayList = this.f33674n;
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
                if (childAt instanceof aw) {
                    aw awVar = (aw) childAt;
                    if (awVar.isPressed()) {
                        float f16 = awVar.f24605e;
                        if (f16 != f14) {
                            awVar.f24605e = Utilities.clamp(f16 + 0.16f, f14, 0.0f);
                            awVar.invalidate();
                        }
                    }
                    if (jwVar.f27758b != null && (b6Var = awVar.f24604c) != null) {
                        s5 s5Var = (s5) jwVar.f27758b.get(b6Var.getDocumentId());
                        if (s5Var != null) {
                            int themedColor2 = jwVar.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
                            if (themedColor2 == jwVar.U && jwVar.T != null) {
                                f11 = f14;
                            } else {
                                jwVar.U = themedColor2;
                                f11 = f14;
                                jwVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            s5Var.setColorFilter(jwVar.T);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) hg.c.x(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(awVar);
                        }
                    }
                    f11 = f14;
                } else {
                    f11 = f14;
                    canvas2.save();
                    canvas2.translate(childAt.getLeft(), childAt.getTop());
                    childAt.draw(canvas2);
                    canvas2.restore();
                }
                i13++;
                f14 = f11;
            }
            float f17 = f14;
            ArrayList arrayList5 = this.h;
            arrayList5.clear();
            ArrayList arrayList6 = this.f33673f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i14 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f33675r;
                if (i14 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
                View view2 = (View) arrayList7.get(0);
                vVar.getClass();
                int R = RecyclerView.R(view2);
                long j3 = currentTimeMillis;
                float f18 = f15;
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList5.size()) {
                        if (((yv) arrayList5.get(i15)).M == R) {
                            yvVar = (yv) arrayList5.get(i15);
                            arrayList5.remove(i15);
                            break;
                        }
                        i15++;
                    } else {
                        yvVar = null;
                        break;
                    }
                }
                if (yvVar == null) {
                    if (!arrayList2.isEmpty()) {
                        yvVar = (yv) hg.c.x(1, arrayList2);
                    } else {
                        yvVar = new yv(this);
                        yvVar.l(7);
                    }
                    yvVar.M = R;
                    yvVar.e();
                }
                arrayList6.add(yvVar);
                yvVar.N = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                yv yvVar2 = yvVar;
                currentTimeMillis = j3;
                yvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i14++;
                f15 = f18;
            }
            float f19 = f15;
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((yv) arrayList5.get(i16));
                    ((yv) arrayList5.get(i16)).N = null;
                    ((yv) arrayList5.get(i16)).k();
                } else {
                    ((yv) arrayList5.get(i16)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (vVar.getAlpha() < f17) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) dp5)) / 2;
                int dp6 = AndroidUtilities.dp(16.0f);
                jqVar.setAlpha((int) ((f17 - vVar.getAlpha()) * f19));
                jqVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                jqVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            jw jwVar = this.f33679y;
            if (y3 < jwVar.W() - AndroidUtilities.dp(6.0f)) {
                jwVar.dismiss();
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
            arrayList = this.f33673f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((yv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f33675r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((yv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        b6.release(this, this.f33679y.f27758b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
