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
public final class lv extends FrameLayout {
    public final Paint f26116a;
    public final Path f26117b;
    public Boolean f26118c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f26119f;
    public final ArrayList h;
    public final ArrayList f26120n;
    public final ArrayList f26121r;
    public final e6 f26122s;
    public ImageReceiver v;
    public boolean f26123w;
    public final e6 f26124x;
    public final vv f26125y;

    public lv(vv vvVar, Context context) {
        super(context);
        this.f26125y = vvVar;
        this.f26116a = new Paint();
        this.f26117b = new Path();
        this.f26118c = null;
        this.e = new SparseArray();
        this.f26119f = new ArrayList();
        this.h = new ArrayList();
        this.f26120n = new ArrayList();
        this.f26121r = new ArrayList();
        tr trVar = tr.h;
        this.f26122s = new e6(this, 0L, 350L, trVar);
        this.f26124x = new e6(this, 0L, 320L, trVar);
    }

    public final void a() {
        z5[] z5VarArr;
        vv vvVar = this.f26125y;
        ci.v vVar = vvVar.h;
        if (vVar == null) {
            z5VarArr = new z5[0];
        } else {
            z5[] z5VarArr2 = new z5[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof mv) {
                    z5VarArr2[i10] = ((mv) childAt).f26396c;
                }
            }
            z5VarArr = z5VarArr2;
        }
        vvVar.f29725b = z5.update(3, this, z5VarArr, vvVar.f29725b);
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
        kv kvVar;
        z5 z5Var;
        Canvas canvas2 = canvas;
        vv vvVar = this.f26125y;
        wp wpVar = vvVar.F;
        ci.v vVar = vvVar.h;
        if (!this.d) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.h6.f19146h5;
        int themedColor = vvVar.getThemedColor(i11);
        Paint paint = this.f26116a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.h6.m(paint);
        Path path = this.f26117b;
        path.reset();
        float V = vvVar.V();
        viewGroup = ((org.telegram.ui.ActionBar.e3) vvVar).containerView;
        if (V <= viewGroup.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.f26122s.e(z10);
        float lerp = AndroidUtilities.lerp(V, 0.0f, e);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f7 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f26123w = false;
            }
            this.v.setAlpha(this.f26124x.e(this.f26123w));
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
        Boolean bool = this.f26118c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f26118c = Boolean.valueOf(z11);
            if (AndroidUtilities.computePerceivedBrightness(vvVar.getThemedColor(i11)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v(vvVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19354s8), 855638016)) > 0.721f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(vvVar, z12);
        }
        org.telegram.ui.ActionBar.h6.f19365t0.setColor(vvVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii));
        org.telegram.ui.ActionBar.h6.f19365t0.setAlpha((int) (w7.q.a(lerp / AndroidUtilities.dp(f7), 0.0f, 1.0f) * org.telegram.ui.ActionBar.h6.f19365t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f19365t0);
        View view = vvVar.f29729r;
        if (!vVar.canScrollVertically(1) && vvVar.f29731w.getVisibility() != 0) {
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
                arrayList = this.f26120n;
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
                if (childAt instanceof mv) {
                    mv mvVar = (mv) childAt;
                    if (mvVar.isPressed()) {
                        float f13 = mvVar.e;
                        if (f13 != f12) {
                            mvVar.e = Utilities.clamp(f13 + 0.16f, f12, 0.0f);
                            mvVar.invalidate();
                        }
                    }
                    if (vvVar.f29725b != null && (z5Var = mvVar.f26396c) != null) {
                        q5 q5Var = (q5) vvVar.f29725b.get(z5Var.getDocumentId());
                        if (q5Var != null) {
                            int themedColor2 = vvVar.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
                            if (themedColor2 != vvVar.U || vvVar.T == null) {
                                vvVar.U = themedColor2;
                                vvVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            q5Var.setColorFilter(vvVar.T);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) hg.c.x(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(mvVar);
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
            ArrayList arrayList6 = this.f26119f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i14 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f26121r;
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
                        if (((kv) arrayList5.get(i15)).M == R) {
                            kvVar = (kv) arrayList5.get(i15);
                            arrayList5.remove(i15);
                            break;
                        }
                        i15++;
                    } else {
                        kvVar = null;
                        break;
                    }
                }
                if (kvVar == null) {
                    if (!arrayList2.isEmpty()) {
                        kvVar = (kv) hg.c.x(1, arrayList2);
                    } else {
                        kvVar = new kv(this);
                        kvVar.l(7);
                    }
                    kvVar.M = R;
                    kvVar.e();
                }
                arrayList6.add(kvVar);
                kvVar.N = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                kv kvVar2 = kvVar;
                currentTimeMillis = j3;
                kvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i14++;
            }
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((kv) arrayList5.get(i16));
                    ((kv) arrayList5.get(i16)).N = null;
                    ((kv) arrayList5.get(i16)).k();
                } else {
                    ((kv) arrayList5.get(i16)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (vVar.getAlpha() < 1.0f) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) dp5)) / 2;
                int dp6 = AndroidUtilities.dp(16.0f);
                wpVar.setAlpha((int) ((1.0f - vVar.getAlpha()) * 255.0f));
                wpVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                wpVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            vv vvVar = this.f26125y;
            if (y3 < vvVar.V() - AndroidUtilities.dp(6.0f)) {
                vvVar.dismiss();
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
            arrayList = this.f26119f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((kv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f26121r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((kv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        z5.release(this, this.f26125y.f29725b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
