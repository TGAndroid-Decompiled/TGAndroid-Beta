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
import org.telegram.messenger.AndroidUtilities;
public final class ed {
    public static final int[] f27801p = {16842910, 16842919};
    public fr f27802a;
    public final ArrayList f27803b = new ArrayList();
    public int f27804c;
    public boolean d;
    public final org.telegram.ui.Cells.y e;
    public final View f27805f;
    public final Paint f27806g;
    public Runnable h;
    public boolean f27807i;
    public Runnable f27808j;
    public final m.g3 f27809k;
    public boolean f27810l;
    public final CornerPathEffect f27811m;
    public boolean f27812n;
    public final Paint f27813o;

    public ed(View view) {
        Paint paint = new Paint(1);
        this.f27806g = paint;
        this.f27809k = new m.g3(this, 10);
        this.f27805f = view;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(AndroidUtilities.dp(12.0f));
        this.f27811m = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint(1);
        this.f27813o = paint2;
        paint2.setFilterBitmap(true);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(12.0f)));
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        paint3.setColor(-1);
        ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23448i6, false) & 436207615}), null, new dd(this, paint3));
        this.e = rippleDrawable;
        rippleDrawable.setCallback(view);
    }

    public final void a(RectF rectF) {
        int i10 = this.f27804c + 1;
        this.f27804c = i10;
        ArrayList arrayList = this.f27803b;
        if (i10 > arrayList.size()) {
            arrayList.add(new RectF());
        }
        ((RectF) arrayList.get(this.f27804c - 1)).set(rectF);
    }

    public final boolean b(MotionEvent motionEvent) {
        Runnable runnable;
        int x9 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        View view = this.f27805f;
        m.g3 g3Var = this.f27809k;
        org.telegram.ui.Cells.y yVar = this.e;
        if (action == 0) {
            for (int i10 = 0; i10 < this.f27804c; i10++) {
                float f7 = x9;
                float f10 = y3;
                if (((RectF) this.f27803b.get(i10)).contains(f7, f10)) {
                    this.d = true;
                    if (yVar != null) {
                        yVar.setHotspot(f7, f10);
                        yVar.setState(f27801p);
                    }
                    AndroidUtilities.cancelRunOnUIThread(g3Var);
                    if (this.f27810l) {
                        AndroidUtilities.runOnUIThread(g3Var, ViewConfiguration.getLongPressTimeout());
                    }
                    view.invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.d && yVar != null) {
                yVar.setHotspot(x9, y3);
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
            AndroidUtilities.cancelRunOnUIThread(g3Var);
        }
        return this.d;
    }

    public final void c(Canvas canvas, Paint paint) {
        int i10 = this.f27804c;
        CornerPathEffect cornerPathEffect = this.f27811m;
        org.telegram.ui.Cells.y yVar = this.e;
        int i11 = 0;
        ArrayList arrayList = this.f27803b;
        if (i10 > 1) {
            if (!this.f27807i) {
                fr frVar = this.f27802a;
                if (frVar == null) {
                    this.f27802a = new fr(0);
                } else {
                    frVar.rewind();
                }
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    int i16 = this.f27804c;
                    if (i11 >= i16) {
                        break;
                    }
                    int i17 = i11 + 1;
                    if (i17 < i16) {
                        float f7 = ((RectF) arrayList.get(i11)).right;
                        float f10 = ((RectF) arrayList.get(i17)).right;
                        if (Math.abs(f7 - f10) < AndroidUtilities.dp(4.0f)) {
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
                    this.f27802a.addRect((RectF) arrayList.get(i11), Path.Direction.CCW);
                    if (yVar != null) {
                        yVar.setBounds(i14, i15, i13, i12);
                    }
                    i11 = i17;
                }
                this.f27802a.a();
                this.f27807i = true;
            }
            paint.setPathEffect(cornerPathEffect);
            fr frVar2 = this.f27802a;
            if (frVar2 != null) {
                canvas.drawPath(frVar2, paint);
            }
        } else if (i10 == 1) {
            if (yVar != null) {
                yVar.setBounds((int) ((RectF) arrayList.get(0)).left, (int) ((RectF) arrayList.get(0)).top, (int) ((RectF) arrayList.get(0)).right, (int) ((RectF) arrayList.get(0)).bottom);
            }
            if (this.f27812n) {
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
        this.f27806g.setColor(i10);
        org.telegram.ui.Cells.y yVar = this.e;
        if (yVar != null) {
            org.telegram.ui.ActionBar.y6.E1(yVar, i10, true);
        }
    }

    public final void e(org.telegram.ui.Cells.g2 g2Var) {
        this.h = g2Var;
    }
}
