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
public final class jc {
    public static final int[] f27302p = {16842910, 16842919};
    public jq f27303a;
    public final ArrayList f27304b = new ArrayList();
    public int f27305c;
    public boolean d;
    public final org.telegram.ui.Cells.y e;
    public final View f27306f;
    public final Paint f27307g;
    public Runnable h;
    public boolean f27308i;
    public Runnable f27309j;
    public final mg.c2 f27310k;
    public boolean f27311l;
    public final CornerPathEffect f27312m;
    public boolean f27313n;
    public final Paint f27314o;

    public jc(View view) {
        Paint paint = new Paint(1);
        this.f27307g = paint;
        this.f27310k = new mg.c2(this, 24);
        this.f27306f = view;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(org.telegram.messenger.i0.L(12.0f));
        this.f27312m = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint(1);
        this.f27314o = paint2;
        paint2.setFilterBitmap(true);
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(12.0f)));
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        paint3.setColor(-1);
        ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21020i6, false) & 436207615}), null, new jh.g(this, paint3));
        this.e = rippleDrawable;
        rippleDrawable.setCallback(view);
    }

    public final void a(RectF rectF) {
        int i10 = this.f27305c + 1;
        this.f27305c = i10;
        ArrayList arrayList = this.f27304b;
        if (i10 > arrayList.size()) {
            arrayList.add(new RectF());
        }
        ((RectF) arrayList.get(this.f27305c - 1)).set(rectF);
    }

    public final boolean b(MotionEvent motionEvent) {
        Runnable runnable;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        View view = this.f27306f;
        mg.c2 c2Var = this.f27310k;
        org.telegram.ui.Cells.y yVar = this.e;
        if (action == 0) {
            for (int i10 = 0; i10 < this.f27305c; i10++) {
                float f7 = x10;
                float f10 = y3;
                if (((RectF) this.f27304b.get(i10)).contains(f7, f10)) {
                    this.d = true;
                    if (yVar != null) {
                        yVar.setHotspot(f7, f10);
                        yVar.setState(f27302p);
                    }
                    org.telegram.messenger.i0.r(c2Var);
                    if (this.f27311l) {
                        org.telegram.messenger.i0.h3(c2Var, ViewConfiguration.getLongPressTimeout());
                    }
                    view.invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.d && yVar != null) {
                yVar.setHotspot(x10, y3);
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
            org.telegram.messenger.i0.r(c2Var);
        }
        return this.d;
    }

    public final void c(Canvas canvas, Paint paint) {
        int i10 = this.f27305c;
        CornerPathEffect cornerPathEffect = this.f27312m;
        org.telegram.ui.Cells.y yVar = this.e;
        int i11 = 0;
        ArrayList arrayList = this.f27304b;
        if (i10 > 1) {
            if (!this.f27308i) {
                jq jqVar = this.f27303a;
                if (jqVar == null) {
                    this.f27303a = new jq(0);
                } else {
                    jqVar.rewind();
                }
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    int i16 = this.f27305c;
                    if (i11 >= i16) {
                        break;
                    }
                    int i17 = i11 + 1;
                    if (i17 < i16) {
                        float f7 = ((RectF) arrayList.get(i11)).right;
                        float f10 = ((RectF) arrayList.get(i17)).right;
                        if (Math.abs(f7 - f10) < org.telegram.messenger.i0.L(4.0f)) {
                            float max = Math.max(f7, f10);
                            ((RectF) arrayList.get(i11)).right = max;
                            ((RectF) arrayList.get(i17)).right = max;
                        }
                    }
                    if (i11 == 0 || ((RectF) arrayList.get(i11)).bottom > i12) {
                        i12 = (int) ((RectF) arrayList.get(i11)).bottom;
                    }
                    if (i11 == 0 || ((RectF) arrayList.get(i11)).right > i13) {
                        i13 = (int) ((RectF) arrayList.get(i11)).right;
                    }
                    if (i11 == 0 || ((RectF) arrayList.get(i11)).left < i14) {
                        i14 = (int) ((RectF) arrayList.get(i11)).left;
                    }
                    if (i11 == 0 || ((RectF) arrayList.get(i11)).top < i15) {
                        i15 = (int) ((RectF) arrayList.get(i11)).top;
                    }
                    this.f27303a.addRect((RectF) arrayList.get(i11), Path.Direction.CCW);
                    if (yVar != null) {
                        yVar.setBounds(i14, i15, i13, i12);
                    }
                    i11 = i17;
                }
                this.f27303a.a();
                this.f27308i = true;
            }
            paint.setPathEffect(cornerPathEffect);
            jq jqVar2 = this.f27303a;
            if (jqVar2 != null) {
                canvas.drawPath(jqVar2, paint);
            }
        } else if (i10 == 1) {
            if (yVar != null) {
                yVar.setBounds((int) ((RectF) arrayList.get(0)).left, (int) ((RectF) arrayList.get(0)).top, (int) ((RectF) arrayList.get(0)).right, (int) ((RectF) arrayList.get(0)).bottom);
            }
            if (this.f27313n) {
                paint.setPathEffect(null);
                float min = Math.min(((RectF) arrayList.get(0)).width(), ((RectF) arrayList.get(0)).height()) / 2.0f;
                canvas.drawRoundRect((RectF) arrayList.get(0), min, min, paint);
                return;
            }
            paint.setPathEffect(cornerPathEffect);
            canvas.drawRoundRect((RectF) arrayList.get(0), 0.0f, 0.0f, paint);
        }
    }

    public final void d(int i10) {
        this.f27307g.setColor(i10);
        org.telegram.ui.Cells.y yVar = this.e;
        if (yVar != null) {
            org.telegram.ui.ActionBar.t6.H1(yVar, i10, true);
        }
    }

    public final void e(org.telegram.ui.Cells.k2 k2Var) {
        this.h = k2Var;
    }
}
