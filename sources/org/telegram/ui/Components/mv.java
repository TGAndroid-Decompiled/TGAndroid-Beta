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
public final class mv extends FrameLayout {
    public final Paint f28716a;
    public final Path f28717b;
    public Boolean f28718c;
    public boolean d;
    public final SparseArray f28719e;
    public final ArrayList f28720f;
    public final ArrayList h;
    public final ArrayList f28721n;
    public final ArrayList f28722r;
    public final e6 f28723s;
    public ImageReceiver v;
    public boolean f28724w;
    public final e6 f28725x;
    public final wv f28726y;

    public mv(wv wvVar, Context context) {
        super(context);
        this.f28726y = wvVar;
        this.f28716a = new Paint();
        this.f28717b = new Path();
        this.f28718c = null;
        this.f28719e = new SparseArray();
        this.f28720f = new ArrayList();
        this.h = new ArrayList();
        this.f28721n = new ArrayList();
        this.f28722r = new ArrayList();
        tr trVar = tr.h;
        this.f28723s = new e6(this, 0L, 350L, trVar);
        this.f28725x = new e6(this, 0L, 320L, trVar);
    }

    public final void a() {
        z5[] z5VarArr;
        wv wvVar = this.f28726y;
        ci.v vVar = wvVar.h;
        if (vVar == null) {
            z5VarArr = new z5[0];
        } else {
            z5[] z5VarArr2 = new z5[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof nv) {
                    z5VarArr2[i10] = ((nv) childAt).f29068c;
                }
            }
            z5VarArr = z5VarArr2;
        }
        wvVar.f32628b = z5.update(3, this, z5VarArr, wvVar.f32628b);
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
        lv lvVar;
        z5 z5Var;
        Canvas canvas2 = canvas;
        wv wvVar = this.f28726y;
        wp wpVar = wvVar.F;
        ci.v vVar = wvVar.h;
        if (!this.d) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.i6.f20889h5;
        int themedColor = wvVar.getThemedColor(i11);
        Paint paint = this.f28716a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.i6.m(paint);
        Path path = this.f28717b;
        path.reset();
        float T = wvVar.T();
        viewGroup = ((org.telegram.ui.ActionBar.f3) wvVar).containerView;
        if (T <= viewGroup.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f28723s.e(z10);
        float lerp = AndroidUtilities.lerp(T, 0.0f, e7);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f7 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f28724w = false;
            }
            this.v.setAlpha(this.f28725x.e(this.f28724w));
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
        Boolean bool = this.f28718c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f28718c = Boolean.valueOf(z11);
            if (AndroidUtilities.computePerceivedBrightness(wvVar.getThemedColor(i11)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v(wvVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21099s8), 855638016)) > 0.721f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(wvVar, z12);
        }
        org.telegram.ui.ActionBar.i6.f21110t0.setColor(wvVar.getThemedColor(org.telegram.ui.ActionBar.i6.Ii));
        org.telegram.ui.ActionBar.i6.f21110t0.setAlpha((int) (w7.q.a(lerp / AndroidUtilities.dp(f7), 0.0f, 1.0f) * org.telegram.ui.ActionBar.i6.f21110t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f21110t0);
        View view = wvVar.f32633r;
        if (!vVar.canScrollVertically(1) && wvVar.f32635w.getVisibility() != 0) {
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
                sparseArray = this.f28719e;
                int size = sparseArray.size();
                arrayList = this.f28721n;
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
                if (childAt instanceof nv) {
                    nv nvVar = (nv) childAt;
                    if (nvVar.isPressed()) {
                        float f13 = nvVar.f29069e;
                        if (f13 != f12) {
                            nvVar.f29069e = Utilities.clamp(f13 + 0.16f, f12, 0.0f);
                            nvVar.invalidate();
                        }
                    }
                    if (wvVar.f32628b != null && (z5Var = nvVar.f29068c) != null) {
                        q5 q5Var = (q5) wvVar.f32628b.get(z5Var.getDocumentId());
                        if (q5Var != null) {
                            int themedColor2 = wvVar.getThemedColor(org.telegram.ui.ActionBar.i6.G6);
                            if (themedColor2 != wvVar.U || wvVar.T == null) {
                                wvVar.U = themedColor2;
                                wvVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            q5Var.setColorFilter(wvVar.T);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) hg.k0.w(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(nvVar);
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
            ArrayList arrayList6 = this.f28720f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i14 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f28722r;
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
                        if (((lv) arrayList5.get(i15)).M == R) {
                            lvVar = (lv) arrayList5.get(i15);
                            arrayList5.remove(i15);
                            break;
                        }
                        i15++;
                    } else {
                        lvVar = null;
                        break;
                    }
                }
                if (lvVar == null) {
                    if (!arrayList2.isEmpty()) {
                        lvVar = (lv) hg.k0.w(1, arrayList2);
                    } else {
                        lvVar = new lv(this);
                        lvVar.l(7);
                    }
                    lvVar.M = R;
                    lvVar.e();
                }
                arrayList6.add(lvVar);
                lvVar.N = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                lv lvVar2 = lvVar;
                currentTimeMillis = j3;
                lvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i14++;
            }
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((lv) arrayList5.get(i16));
                    ((lv) arrayList5.get(i16)).N = null;
                    ((lv) arrayList5.get(i16)).k();
                } else {
                    ((lv) arrayList5.get(i16)).f();
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
            wv wvVar = this.f28726y;
            if (y3 < wvVar.T() - AndroidUtilities.dp(6.0f)) {
                wvVar.dismiss();
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
            arrayList = this.f28720f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((lv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f28722r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((lv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        z5.release(this, this.f28726y.f32628b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
