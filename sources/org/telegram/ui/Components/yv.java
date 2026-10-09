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
public final class yv extends FrameLayout {
    public final Paint f33356a;
    public final Path f33357b;
    public Boolean f33358c;
    public boolean d;
    public final SparseArray f33359e;
    public final ArrayList f33360f;
    public final ArrayList h;
    public final ArrayList f33361n;
    public final ArrayList f33362r;
    public final g6 f33363s;
    public ImageReceiver v;
    public boolean f33364w;
    public final g6 f33365x;
    public final iw f33366y;

    public yv(iw iwVar, Context context) {
        super(context);
        this.f33366y = iwVar;
        this.f33356a = new Paint();
        this.f33357b = new Path();
        this.f33358c = null;
        this.f33359e = new SparseArray();
        this.f33360f = new ArrayList();
        this.h = new ArrayList();
        this.f33361n = new ArrayList();
        this.f33362r = new ArrayList();
        hs hsVar = hs.h;
        this.f33363s = new g6(this, 0L, 350L, hsVar);
        this.f33365x = new g6(this, 0L, 320L, hsVar);
    }

    public final void a() {
        b6[] b6VarArr;
        iw iwVar = this.f33366y;
        ci.v vVar = iwVar.h;
        if (vVar == null) {
            b6VarArr = new b6[0];
        } else {
            b6[] b6VarArr2 = new b6[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof zv) {
                    b6VarArr2[i10] = ((zv) childAt).f33665c;
                }
            }
            b6VarArr = b6VarArr2;
        }
        iwVar.f27495b = b6.update(3, this, b6VarArr, iwVar.f27495b);
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
        xv xvVar;
        float f11;
        b6 b6Var;
        Canvas canvas2 = canvas;
        iw iwVar = this.f33366y;
        jq jqVar = iwVar.F;
        ci.v vVar = iwVar.h;
        if (!this.d) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.i6.f20868h5;
        int themedColor = iwVar.getThemedColor(i11);
        Paint paint = this.f33356a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.i6.m(paint);
        Path path = this.f33357b;
        path.reset();
        float W = iwVar.W();
        viewGroup = ((org.telegram.ui.ActionBar.f3) iwVar).containerView;
        if (W <= viewGroup.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f33363s.e(z10);
        float lerp = AndroidUtilities.lerp(W, 0.0f, e7);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f10 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f33364w = false;
            }
            f7 = 0.0f;
            this.v.setAlpha(this.f33365x.e(this.f33364w));
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
        Boolean bool = this.f33358c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f33358c = Boolean.valueOf(z11);
            if (AndroidUtilities.computePerceivedBrightness(iwVar.getThemedColor(i11)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v(iwVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21075s8), 855638016)) > 0.721f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(iwVar, z12);
        }
        org.telegram.ui.ActionBar.i6.f21086t0.setColor(iwVar.getThemedColor(org.telegram.ui.ActionBar.i6.Ii));
        org.telegram.ui.ActionBar.i6.f21086t0.setAlpha((int) (w7.o.a(lerp / AndroidUtilities.dp(f10), f7, 1.0f) * org.telegram.ui.ActionBar.i6.f21086t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f21086t0);
        View view = iwVar.f27500r;
        if (!vVar.canScrollVertically(1) && iwVar.f27502w.getVisibility() != 0) {
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
                sparseArray = this.f33359e;
                int size = sparseArray.size();
                arrayList = this.f33361n;
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
                if (childAt instanceof zv) {
                    zv zvVar = (zv) childAt;
                    if (zvVar.isPressed()) {
                        float f16 = zvVar.f33666e;
                        if (f16 != f14) {
                            zvVar.f33666e = Utilities.clamp(f16 + 0.16f, f14, 0.0f);
                            zvVar.invalidate();
                        }
                    }
                    if (iwVar.f27495b != null && (b6Var = zvVar.f33665c) != null) {
                        s5 s5Var = (s5) iwVar.f27495b.get(b6Var.getDocumentId());
                        if (s5Var != null) {
                            int themedColor2 = iwVar.getThemedColor(org.telegram.ui.ActionBar.i6.G6);
                            if (themedColor2 == iwVar.U && iwVar.T != null) {
                                f11 = f14;
                            } else {
                                iwVar.U = themedColor2;
                                f11 = f14;
                                iwVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            s5Var.setColorFilter(iwVar.T);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) hg.c.x(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(zvVar);
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
            ArrayList arrayList6 = this.f33360f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i14 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f33362r;
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
                        if (((xv) arrayList5.get(i15)).M == R) {
                            xvVar = (xv) arrayList5.get(i15);
                            arrayList5.remove(i15);
                            break;
                        }
                        i15++;
                    } else {
                        xvVar = null;
                        break;
                    }
                }
                if (xvVar == null) {
                    if (!arrayList2.isEmpty()) {
                        xvVar = (xv) hg.c.x(1, arrayList2);
                    } else {
                        xvVar = new xv(this);
                        xvVar.l(7);
                    }
                    xvVar.M = R;
                    xvVar.e();
                }
                arrayList6.add(xvVar);
                xvVar.N = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                xv xvVar2 = xvVar;
                currentTimeMillis = j3;
                xvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i14++;
                f15 = f18;
            }
            float f19 = f15;
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((xv) arrayList5.get(i16));
                    ((xv) arrayList5.get(i16)).N = null;
                    ((xv) arrayList5.get(i16)).k();
                } else {
                    ((xv) arrayList5.get(i16)).f();
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
            iw iwVar = this.f33366y;
            if (y3 < iwVar.W() - AndroidUtilities.dp(6.0f)) {
                iwVar.dismiss();
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
            arrayList = this.f33360f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((xv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f33362r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((xv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        b6.release(this, this.f33366y.f27495b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
