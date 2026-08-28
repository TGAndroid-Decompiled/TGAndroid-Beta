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
public final class tu extends FrameLayout {
    public final Paint f32809a;
    public final Path f32810b;
    public Boolean f32811c;
    public boolean d;
    public final SparseArray f32812e;
    public final ArrayList f32813f;
    public final ArrayList h;
    public final ArrayList f32814n;
    public final ArrayList f32815r;
    public final y5 f32816s;
    public ImageReceiver v;
    public boolean f32817w;
    public final y5 f32818x;
    public final dv f32819y;

    public tu(dv dvVar, Context context) {
        super(context);
        this.f32819y = dvVar;
        this.f32809a = new Paint();
        this.f32810b = new Path();
        this.f32811c = null;
        this.f32812e = new SparseArray();
        this.f32813f = new ArrayList();
        this.h = new ArrayList();
        this.f32814n = new ArrayList();
        this.f32815r = new ArrayList();
        gr grVar = gr.h;
        this.f32816s = new y5(this, 0L, 350L, grVar);
        this.f32818x = new y5(this, 0L, 320L, grVar);
    }

    public final void a() {
        t5[] t5VarArr;
        dv dvVar = this.f32819y;
        kh.w wVar = dvVar.h;
        if (wVar == null) {
            t5VarArr = new t5[0];
        } else {
            t5[] t5VarArr2 = new t5[wVar.getChildCount()];
            for (int i9 = 0; i9 < wVar.getChildCount(); i9++) {
                View childAt = wVar.getChildAt(i9);
                if (childAt instanceof uu) {
                    t5VarArr2[i9] = ((uu) childAt).f33145c;
                }
            }
            t5VarArr = t5VarArr2;
        }
        dvVar.f27814b = t5.update(3, this, t5VarArr, dvVar.f27814b);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i9;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        su suVar;
        t5 t5Var;
        Canvas canvas2 = canvas;
        dv dvVar = this.f32819y;
        jp jpVar = dvVar.B;
        kh.w wVar = dvVar.h;
        if (!this.d) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.f6.f23072h5;
        int themedColor = dvVar.getThemedColor(i10);
        Paint paint = this.f32809a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.f6.m(paint);
        Path path = this.f32810b;
        path.reset();
        float U = dvVar.U();
        viewGroup = ((org.telegram.ui.ActionBar.f3) dvVar).containerView;
        if (U <= viewGroup.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e10 = this.f32816s.e(z10);
        float lerp = AndroidUtilities.lerp(U, 0.0f, e10);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f10 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f32817w = false;
            }
            this.v.setAlpha(this.f32818x.e(this.f32817w));
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
        float dp3 = AndroidUtilities.dp((1.0f - e10) * 14.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), lerp, getWidth() - getPaddingRight(), getBottom() + dp3);
        path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        if (e10 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f32811c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f32811c = Boolean.valueOf(z11);
            if (AndroidUtilities.computePerceivedBrightness(dvVar.getThemedColor(i10)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23269s8), 855638016)) > 0.721f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(dvVar, z12);
        }
        org.telegram.ui.ActionBar.f6.f23279t0.setColor(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.Ii));
        org.telegram.ui.ActionBar.f6.f23279t0.setAlpha((int) (g7.n.a(lerp / AndroidUtilities.dp(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.f6.f23279t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.f23279t0);
        View view = dvVar.f27819r;
        if (!wVar.canScrollVertically(1) && dvVar.f27821w.getVisibility() != 0) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        view.setVisibility(i9);
        if (wVar != null) {
            canvas2.save();
            canvas2.translate(wVar.getLeft(), wVar.getY() + 0.0f);
            canvas2.clipRect(0, 0, wVar.getWidth(), wVar.getHeight());
            canvas2.saveLayerAlpha(0.0f, 0.0f, wVar.getWidth(), wVar.getHeight(), (int) (wVar.getAlpha() * 255.0f), 31);
            int i11 = 0;
            while (true) {
                sparseArray = this.f32812e;
                int size = sparseArray.size();
                arrayList = this.f32814n;
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
            while (i12 < wVar.getChildCount()) {
                View childAt = wVar.getChildAt(i12);
                if (childAt instanceof uu) {
                    uu uuVar = (uu) childAt;
                    if (uuVar.isPressed()) {
                        float f14 = uuVar.f33146e;
                        if (f14 != f13) {
                            uuVar.f33146e = Utilities.clamp(f14 + 0.16f, f13, 0.0f);
                            uuVar.invalidate();
                        }
                    }
                    if (dvVar.f27814b != null && (t5Var = uuVar.f33145c) != null) {
                        k5 k5Var = (k5) dvVar.f27814b.get(t5Var.getDocumentId());
                        if (k5Var != null) {
                            int themedColor2 = dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.G6);
                            if (themedColor2 != dvVar.Q || dvVar.P == null) {
                                dvVar.Q = themedColor2;
                                dvVar.P = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            k5Var.setColorFilter(dvVar.P);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) e2.c.k(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(uuVar);
                        }
                    }
                } else {
                    canvas2.save();
                    canvas2.translate(childAt.getLeft(), childAt.getTop());
                    childAt.draw(canvas2);
                    canvas2.restore();
                }
                i12++;
                f13 = 1.0f;
            }
            ArrayList arrayList5 = this.h;
            arrayList5.clear();
            ArrayList arrayList6 = this.f32813f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i13 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f32815r;
                if (i13 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
                View view2 = (View) arrayList7.get(0);
                wVar.getClass();
                int R = RecyclerView.R(view2);
                long j10 = currentTimeMillis;
                int i14 = 0;
                while (true) {
                    if (i14 < arrayList5.size()) {
                        if (((su) arrayList5.get(i14)).I == R) {
                            suVar = (su) arrayList5.get(i14);
                            arrayList5.remove(i14);
                            break;
                        }
                        i14++;
                    } else {
                        suVar = null;
                        break;
                    }
                }
                if (suVar == null) {
                    if (!arrayList2.isEmpty()) {
                        suVar = (su) e2.c.k(1, arrayList2);
                    } else {
                        suVar = new su(this);
                        suVar.l(7);
                    }
                    suVar.I = R;
                    suVar.e();
                }
                arrayList6.add(suVar);
                suVar.J = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                su suVar2 = suVar;
                currentTimeMillis = j10;
                suVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i13++;
            }
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((su) arrayList5.get(i15));
                    ((su) arrayList5.get(i15)).J = null;
                    ((su) arrayList5.get(i15)).k();
                } else {
                    ((su) arrayList5.get(i15)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (wVar.getAlpha() < 1.0f) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) dp5)) / 2;
                int dp6 = AndroidUtilities.dp(16.0f);
                jpVar.setAlpha((int) ((1.0f - wVar.getAlpha()) * 255.0f));
                jpVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                jpVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            dv dvVar = this.f32819y;
            if (y10 < dvVar.U() - AndroidUtilities.dp(6.0f)) {
                dvVar.dismiss();
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
        int i9 = 0;
        this.d = false;
        int i10 = 0;
        while (true) {
            arrayList = this.f32813f;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((su) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.f32815r;
            if (i9 >= arrayList2.size()) {
                break;
            }
            ((su) arrayList2.get(i9)).f();
            i9++;
        }
        arrayList.clear();
        t5.release(this, this.f32819y.f27814b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
