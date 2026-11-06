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
public final class pc {
    public static final int[] f36959p = {16842910, 16842919};
    public aq f36960a;
    public final ArrayList f36961b = new ArrayList();
    public int f36962c;
    public boolean d;
    public final org.telegram.ui.Cells.y f36963e;
    public final View f36964f;
    public final Paint f36965g;
    public Runnable h;
    public boolean f36966i;
    public Runnable f36967j;
    public final m.f3 f36968k;
    public boolean f36969l;
    public final CornerPathEffect f36970m;
    public boolean f36971n;
    public final Paint f36972o;

    public pc(View view) {
        Paint paint = new Paint(1);
        this.f36965g = paint;
        this.f36968k = new m.f3(this, 26);
        this.f36964f = view;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(org.telegram.messenger.g0.L(12.0f));
        this.f36970m = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint(1);
        this.f36972o = paint2;
        paint2.setFilterBitmap(true);
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(12.0f)));
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        paint3.setColor(-1);
        ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27940i6, false) & 436207615}), null, new oc(this, paint3));
        this.f36963e = rippleDrawable;
        rippleDrawable.setCallback(view);
    }

    public final void a(RectF rectF) {
        int i7 = this.f36962c + 1;
        this.f36962c = i7;
        ArrayList arrayList = this.f36961b;
        if (i7 > arrayList.size()) {
            arrayList.add(new RectF());
        }
        ((RectF) arrayList.get(this.f36962c - 1)).set(rectF);
    }

    public final boolean b(MotionEvent motionEvent) {
        Runnable runnable;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        View view = this.f36964f;
        m.f3 f3Var = this.f36968k;
        org.telegram.ui.Cells.y yVar = this.f36963e;
        if (action == 0) {
            for (int i7 = 0; i7 < this.f36962c; i7++) {
                float f10 = x10;
                float f11 = y10;
                if (((RectF) this.f36961b.get(i7)).contains(f10, f11)) {
                    this.d = true;
                    if (yVar != null) {
                        yVar.setHotspot(f10, f11);
                        yVar.setState(f36959p);
                    }
                    org.telegram.messenger.g0.r(f3Var);
                    if (this.f36969l) {
                        org.telegram.messenger.g0.i3(f3Var, ViewConfiguration.getLongPressTimeout());
                    }
                    view.invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.d && yVar != null) {
                yVar.setHotspot(x10, y10);
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
            org.telegram.messenger.g0.r(f3Var);
        }
        return this.d;
    }

    public final void c(Canvas canvas, Paint paint) {
        int i7 = this.f36962c;
        CornerPathEffect cornerPathEffect = this.f36970m;
        org.telegram.ui.Cells.y yVar = this.f36963e;
        int i10 = 0;
        ArrayList arrayList = this.f36961b;
        if (i7 > 1) {
            if (!this.f36966i) {
                aq aqVar = this.f36960a;
                if (aqVar == null) {
                    this.f36960a = new aq(0);
                } else {
                    aqVar.rewind();
                }
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int i15 = this.f36962c;
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
                    this.f36960a.addRect((RectF) arrayList.get(i10), Path.Direction.CCW);
                    if (yVar != null) {
                        yVar.setBounds(i13, i14, i12, i11);
                    }
                    i10 = i16;
                }
                this.f36960a.a();
                this.f36966i = true;
            }
            paint.setPathEffect(cornerPathEffect);
            aq aqVar2 = this.f36960a;
            if (aqVar2 != null) {
                canvas.drawPath(aqVar2, paint);
            }
        } else if (i7 == 1) {
            if (yVar != null) {
                yVar.setBounds((int) ((RectF) arrayList.get(0)).left, (int) ((RectF) arrayList.get(0)).top, (int) ((RectF) arrayList.get(0)).right, (int) ((RectF) arrayList.get(0)).bottom);
            }
            if (this.f36971n) {
                paint.setPathEffect(null);
                float min = Math.min(((RectF) arrayList.get(0)).width(), ((RectF) arrayList.get(0)).height()) / 2.0f;
                canvas.drawRoundRect((RectF) arrayList.get(0), min, min, paint);
                return;
            }
            paint.setPathEffect(cornerPathEffect);
            canvas.drawRoundRect((RectF) arrayList.get(0), 0.0f, 0.0f, paint);
        }
    }

    public final void d(int i7) {
        this.f36965g.setColor(i7);
        org.telegram.ui.Cells.y yVar = this.f36963e;
        if (yVar != null) {
            org.telegram.ui.ActionBar.k6.H1(yVar, i7, true);
        }
    }

    public final void e(org.telegram.ui.Cells.k2 k2Var) {
        this.h = k2Var;
    }
}
