package org.telegram.ui.Components;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
public final class nc {
    public static final int[] f36432p = {16842910, 16842919};
    public bq f36433a;
    public final ArrayList f36434b = new ArrayList();
    public int f36435c;
    public boolean d;
    public final org.telegram.ui.Cells.y f36436e;
    public final View f36437f;
    public final Paint f36438g;
    public Runnable h;
    public boolean f36439i;
    public Runnable f36440j;
    public final mi.b0 f36441k;
    public boolean f36442l;
    public final CornerPathEffect f36443m;
    public boolean f36444n;
    public final Paint f36445o;

    public nc(View view) {
        Paint paint = new Paint(1);
        this.f36438g = paint;
        this.f36441k = new mi.b0(this, 25);
        this.f36437f = view;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(org.telegram.messenger.g0.L(12.0f));
        this.f36443m = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint(1);
        this.f36445o = paint2;
        paint2.setFilterBitmap(true);
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(12.0f)));
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        paint3.setColor(-1);
        ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27972i6, false) & 436207615}), null, new mc(this, paint3));
        this.f36436e = rippleDrawable;
        rippleDrawable.setCallback(view);
    }

    public final void a(RectF rectF) {
        int i3 = this.f36435c + 1;
        this.f36435c = i3;
        ArrayList arrayList = this.f36434b;
        if (i3 > arrayList.size()) {
            arrayList.add(new RectF());
        }
        ((RectF) arrayList.get(this.f36435c - 1)).set(rectF);
    }

    public final boolean b(MotionEvent motionEvent) {
        Runnable runnable;
        int x10 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        View view = this.f36437f;
        mi.b0 b0Var = this.f36441k;
        org.telegram.ui.Cells.y yVar = this.f36436e;
        if (action == 0) {
            for (int i3 = 0; i3 < this.f36435c; i3++) {
                float f10 = x10;
                float f11 = y9;
                if (((RectF) this.f36434b.get(i3)).contains(f10, f11)) {
                    this.d = true;
                    if (yVar != null) {
                        yVar.setHotspot(f10, f11);
                        yVar.setState(f36432p);
                    }
                    org.telegram.messenger.g0.r(b0Var);
                    if (this.f36442l) {
                        org.telegram.messenger.g0.i3(b0Var, ViewConfiguration.getLongPressTimeout());
                    }
                    view.invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.d && yVar != null) {
                yVar.setHotspot(x10, y9);
            }
        } else {
            if (this.d) {
                if (motionEvent.getAction() == 1 && (runnable = this.h) != null) {
                    runnable.run();
                }
                view.playSoundEffect(0);
                if (yVar != null) {
                    yVar.setState(StateSet.NOTHING);
                }
                this.d = false;
                view.invalidate();
            }
            org.telegram.messenger.g0.r(b0Var);
        }
        return this.d;
    }

    public final void c(Canvas canvas, Paint paint) {
        int i3 = this.f36435c;
        CornerPathEffect cornerPathEffect = this.f36443m;
        org.telegram.ui.Cells.y yVar = this.f36436e;
        int i10 = 0;
        ArrayList arrayList = this.f36434b;
        if (i3 > 1) {
            if (!this.f36439i) {
                bq bqVar = this.f36433a;
                if (bqVar == null) {
                    this.f36433a = new bq(0);
                } else {
                    bqVar.rewind();
                }
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int i15 = this.f36435c;
                    if (i10 >= i15) {
                        break;
                    }
                    int i16 = i10 + 1;
                    if (i16 < i15) {
                        float f10 = ((RectF) arrayList.get(i10)).right;
                        float f11 = ((RectF) arrayList.get(i16)).right;
                        if (Math.abs(f10 - f11) < org.telegram.messenger.g0.L(4.0f)) {
                            float max = Math.max(f10, f11);
                            ((RectF) arrayList.get(i10)).right = max;
                            ((RectF) arrayList.get(i16)).right = max;
                        }
                    }
                    if (i10 == 0 || ((RectF) arrayList.get(i10)).bottom > i11) {
                        i11 = (int) ((RectF) arrayList.get(i10)).bottom;
                    }
                    if (i10 == 0 || ((RectF) arrayList.get(i10)).right > i12) {
                        i12 = (int) ((RectF) arrayList.get(i10)).right;
                    }
                    if (i10 == 0 || ((RectF) arrayList.get(i10)).left < i13) {
                        i13 = (int) ((RectF) arrayList.get(i10)).left;
                    }
                    if (i10 == 0 || ((RectF) arrayList.get(i10)).top < i14) {
                        i14 = (int) ((RectF) arrayList.get(i10)).top;
                    }
                    this.f36433a.addRect((RectF) arrayList.get(i10), Path.Direction.CCW);
                    if (yVar != null) {
                        yVar.setBounds(i13, i14, i12, i11);
                    }
                    i10 = i16;
                }
                this.f36433a.a();
                this.f36439i = true;
            }
            paint.setPathEffect(cornerPathEffect);
            bq bqVar2 = this.f36433a;
            if (bqVar2 != null) {
                canvas.drawPath(bqVar2, paint);
            }
        } else if (i3 == 1) {
            if (yVar != null) {
                yVar.setBounds((int) ((RectF) arrayList.get(0)).left, (int) ((RectF) arrayList.get(0)).top, (int) ((RectF) arrayList.get(0)).right, (int) ((RectF) arrayList.get(0)).bottom);
            }
            if (this.f36444n) {
                paint.setPathEffect(null);
                float min = Math.min(((RectF) arrayList.get(0)).width(), ((RectF) arrayList.get(0)).height()) / 2.0f;
                canvas.drawRoundRect((RectF) arrayList.get(0), min, min, paint);
                return;
            }
            paint.setPathEffect(cornerPathEffect);
            canvas.drawRoundRect((RectF) arrayList.get(0), 0.0f, 0.0f, paint);
        }
    }

    public final void d(int i3) {
        this.f36438g.setColor(i3);
        org.telegram.ui.Cells.y yVar = this.f36436e;
        if (yVar != null) {
            org.telegram.ui.ActionBar.k6.H1(yVar, i3, true);
        }
    }

    public final void e(org.telegram.ui.Cells.k2 k2Var) {
        this.h = k2Var;
    }
}
