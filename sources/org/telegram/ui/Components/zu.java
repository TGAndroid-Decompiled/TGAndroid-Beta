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
public final class zu extends FrameLayout {
    public final Paint f35422a;
    public final Path f35423b;
    public Boolean f35424c;
    public boolean d;
    public final SparseArray f35425e;
    public final ArrayList f35426f;
    public final ArrayList h;
    public final ArrayList f35427n;
    public final ArrayList f35428r;
    public final d6 f35429s;
    public ImageReceiver v;
    public boolean f35430w;
    public final d6 f35431x;
    public final jv f35432y;

    public zu(jv jvVar, Context context) {
        super(context);
        this.f35432y = jvVar;
        this.f35422a = new Paint();
        this.f35423b = new Path();
        this.f35424c = null;
        this.f35425e = new SparseArray();
        this.f35426f = new ArrayList();
        this.h = new ArrayList();
        this.f35427n = new ArrayList();
        this.f35428r = new ArrayList();
        jr jrVar = jr.h;
        this.f35429s = new d6(this, 0L, 350L, jrVar);
        this.f35431x = new d6(this, 0L, 320L, jrVar);
    }

    public final void a() {
        y5[] y5VarArr;
        jv jvVar = this.f35432y;
        nh.v vVar = jvVar.h;
        if (vVar == null) {
            y5VarArr = new y5[0];
        } else {
            y5[] y5VarArr2 = new y5[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof av) {
                    y5VarArr2[i10] = ((av) childAt).f26895c;
                }
            }
            y5VarArr = y5VarArr2;
        }
        jvVar.f29823b = y5.update(3, this, y5VarArr, jvVar.f29823b);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        boolean z10;
        float f9;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        yu yuVar;
        y5 y5Var;
        Canvas canvas2 = canvas;
        jv jvVar = this.f35432y;
        np npVar = jvVar.B;
        nh.v vVar = jvVar.h;
        if (!this.d) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.f23133h5;
        int themedColor = jvVar.getThemedColor(i11);
        Paint paint = this.f35422a;
        paint.setColor(themedColor);
        org.telegram.ui.ActionBar.g6.m(paint);
        Path path = this.f35423b;
        path.reset();
        float V = jvVar.V();
        viewGroup = ((org.telegram.ui.ActionBar.f3) jvVar).containerView;
        if (V <= viewGroup.getPaddingTop()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e10 = this.f35429s.e(z10);
        float lerp = AndroidUtilities.lerp(V, 0.0f, e10);
        if (this.v != null) {
            float dp = AndroidUtilities.dp(140.0f);
            f9 = 20.0f;
            float dp2 = AndroidUtilities.dp(20.0f);
            if (lerp < dp + dp2) {
                this.f35430w = false;
            }
            this.v.setAlpha(this.f35431x.e(this.f35430w));
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
            f9 = 20.0f;
        }
        float f12 = 1.0f;
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
        Boolean bool = this.f35424c;
        if (bool == null || z11 != bool.booleanValue()) {
            this.f35424c = Boolean.valueOf(z11);
            if (AndroidUtilities.computePerceivedBrightness(jvVar.getThemedColor(i11)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23329s8), 855638016)) > 0.721f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(jvVar, z12);
        }
        org.telegram.ui.ActionBar.g6.f23340t0.setColor(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
        org.telegram.ui.ActionBar.g6.f23340t0.setAlpha((int) (i7.w.a(lerp / AndroidUtilities.dp(f9), 0.0f, 1.0f) * org.telegram.ui.ActionBar.g6.f23340t0.getAlpha()));
        int dp4 = AndroidUtilities.dp(36.0f);
        float dp5 = lerp + AndroidUtilities.dp(10.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23340t0);
        View view = jvVar.f29828r;
        if (!vVar.canScrollVertically(1) && jvVar.f29830w.getVisibility() != 0) {
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
                sparseArray = this.f35425e;
                int size = sparseArray.size();
                arrayList = this.f35427n;
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
                if (childAt instanceof av) {
                    av avVar = (av) childAt;
                    if (avVar.isPressed()) {
                        float f13 = avVar.f26896e;
                        if (f13 != f12) {
                            avVar.f26896e = Utilities.clamp(f13 + 0.16f, f12, 0.0f);
                            avVar.invalidate();
                        }
                    }
                    if (jvVar.f29823b != null && (y5Var = avVar.f26895c) != null) {
                        p5 p5Var = (p5) jvVar.f29823b.get(y5Var.getDocumentId());
                        if (p5Var != null) {
                            int themedColor2 = jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
                            if (themedColor2 != jvVar.Q || jvVar.P == null) {
                                jvVar.Q = themedColor2;
                                jvVar.P = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                            }
                            p5Var.setColorFilter(jvVar.P);
                            ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                            if (arrayList4 == null) {
                                if (!arrayList.isEmpty()) {
                                    arrayList4 = (ArrayList) com.google.android.recaptcha.internal.a.j(1, arrayList);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                sparseArray.put(childAt.getTop(), arrayList4);
                            }
                            arrayList4.add(avVar);
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
            ArrayList arrayList6 = this.f35426f;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i14 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f35428r;
                if (i14 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
                View view2 = (View) arrayList7.get(0);
                vVar.getClass();
                int R = RecyclerView.R(view2);
                long j10 = currentTimeMillis;
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList5.size()) {
                        if (((yu) arrayList5.get(i15)).I == R) {
                            yuVar = (yu) arrayList5.get(i15);
                            arrayList5.remove(i15);
                            break;
                        }
                        i15++;
                    } else {
                        yuVar = null;
                        break;
                    }
                }
                if (yuVar == null) {
                    if (!arrayList2.isEmpty()) {
                        yuVar = (yu) com.google.android.recaptcha.internal.a.j(1, arrayList2);
                    } else {
                        yuVar = new yu(this);
                        yuVar.l(7);
                    }
                    yuVar.I = R;
                    yuVar.e();
                }
                arrayList6.add(yuVar);
                yuVar.J = arrayList7;
                canvas2.save();
                canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                Canvas canvas3 = canvas2;
                yu yuVar2 = yuVar;
                currentTimeMillis = j10;
                yuVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view2.getMeasuredHeight() - view2.getPaddingBottom(), 1.0f);
                canvas2 = canvas3;
                canvas2.restore();
                i14++;
            }
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((yu) arrayList5.get(i16));
                    ((yu) arrayList5.get(i16)).J = null;
                    ((yu) arrayList5.get(i16)).k();
                } else {
                    ((yu) arrayList5.get(i16)).f();
                }
            }
            arrayList5.clear();
            canvas2.restore();
            canvas2.restore();
            if (vVar.getAlpha() < 1.0f) {
                int width = getWidth() / 2;
                int height = (getHeight() + ((int) dp5)) / 2;
                int dp6 = AndroidUtilities.dp(16.0f);
                npVar.setAlpha((int) ((1.0f - vVar.getAlpha()) * 255.0f));
                npVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                npVar.draw(canvas2);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y8 = motionEvent.getY();
            jv jvVar = this.f35432y;
            if (y8 < jvVar.V() - AndroidUtilities.dp(6.0f)) {
                jvVar.dismiss();
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
            arrayList = this.f35426f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((yu) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f35428r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((yu) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        y5.release(this, this.f35432y.f29823b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
