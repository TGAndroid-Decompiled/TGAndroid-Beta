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
public final class wc {
    public static final int[] f34186p = {16842910, 16842919};
    public kq f34187a;
    public final ArrayList f34188b = new ArrayList();
    public int f34189c;
    public boolean d;
    public final org.telegram.ui.Cells.z f34190e;
    public final View f34191f;
    public final Paint f34192g;
    public Runnable h;
    public boolean f34193i;
    public Runnable f34194j;
    public final m.i3 f34195k;
    public boolean f34196l;
    public final CornerPathEffect f34197m;
    public boolean f34198n;
    public final Paint f34199o;

    public wc(View view) {
        Paint paint = new Paint(1);
        this.f34192g = paint;
        this.f34195k = new m.i3(this, 12);
        this.f34191f = view;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(AndroidUtilities.dp(12.0f));
        this.f34197m = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint(1);
        this.f34199o = paint2;
        paint2.setFilterBitmap(true);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(12.0f)));
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        paint3.setColor(-1);
        ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false) & 436207615}), null, new vc(this, paint3));
        this.f34190e = rippleDrawable;
        rippleDrawable.setCallback(view);
    }

    public final void a(RectF rectF) {
        int i9 = this.f34189c + 1;
        this.f34189c = i9;
        ArrayList arrayList = this.f34188b;
        if (i9 > arrayList.size()) {
            arrayList.add(new RectF());
        }
        ((RectF) arrayList.get(this.f34189c - 1)).set(rectF);
    }

    public final boolean b(MotionEvent motionEvent) {
        Runnable runnable;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        View view = this.f34191f;
        m.i3 i3Var = this.f34195k;
        org.telegram.ui.Cells.z zVar = this.f34190e;
        if (action == 0) {
            for (int i9 = 0; i9 < this.f34189c; i9++) {
                float f10 = x10;
                float f11 = y10;
                if (((RectF) this.f34188b.get(i9)).contains(f10, f11)) {
                    this.d = true;
                    if (zVar != null) {
                        zVar.setHotspot(f10, f11);
                        zVar.setState(f34186p);
                    }
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    if (this.f34196l) {
                        AndroidUtilities.runOnUIThread(i3Var, ViewConfiguration.getLongPressTimeout());
                    }
                    view.invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.d && zVar != null) {
                zVar.setHotspot(x10, y10);
            }
        } else {
            if (this.d) {
                if (motionEvent.getAction() == 1 && (runnable = this.h) != null) {
                    runnable.run();
                }
                view.playSoundEffect(0);
                if (zVar != null) {
                    zVar.setState(StateSet.NOTHING);
                }
                this.d = false;
                view.invalidate();
            }
            AndroidUtilities.cancelRunOnUIThread(i3Var);
        }
        return this.d;
    }

    public final void c(Canvas canvas, Paint paint) {
        int i9 = this.f34189c;
        CornerPathEffect cornerPathEffect = this.f34197m;
        org.telegram.ui.Cells.z zVar = this.f34190e;
        int i10 = 0;
        ArrayList arrayList = this.f34188b;
        if (i9 > 1) {
            if (!this.f34193i) {
                kq kqVar = this.f34187a;
                if (kqVar == null) {
                    this.f34187a = new kq(0);
                } else {
                    kqVar.rewind();
                }
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int i15 = this.f34189c;
                    if (i10 >= i15) {
                        break;
                    }
                    int i16 = i10 + 1;
                    if (i16 < i15) {
                        float f10 = ((RectF) arrayList.get(i10)).right;
                        float f11 = ((RectF) arrayList.get(i16)).right;
                        if (Math.abs(f10 - f11) < AndroidUtilities.dp(4.0f)) {
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
                    this.f34187a.addRect((RectF) arrayList.get(i10), Path.Direction.CCW);
                    if (zVar != null) {
                        zVar.setBounds(i13, i14, i12, i11);
                    }
                    i10 = i16;
                }
                this.f34187a.a();
                this.f34193i = true;
            }
            paint.setPathEffect(cornerPathEffect);
            kq kqVar2 = this.f34187a;
            if (kqVar2 != null) {
                canvas.drawPath(kqVar2, paint);
            }
        } else if (i9 == 1) {
            if (zVar != null) {
                zVar.setBounds((int) ((RectF) arrayList.get(0)).left, (int) ((RectF) arrayList.get(0)).top, (int) ((RectF) arrayList.get(0)).right, (int) ((RectF) arrayList.get(0)).bottom);
            }
            if (this.f34198n) {
                paint.setPathEffect(null);
                float min = Math.min(((RectF) arrayList.get(0)).width(), ((RectF) arrayList.get(0)).height()) / 2.0f;
                canvas.drawRoundRect((RectF) arrayList.get(0), min, min, paint);
                return;
            }
            paint.setPathEffect(cornerPathEffect);
            canvas.drawRoundRect((RectF) arrayList.get(0), 0.0f, 0.0f, paint);
        }
    }

    public final void d(int i9) {
        this.f34192g.setColor(i9);
        org.telegram.ui.Cells.z zVar = this.f34190e;
        if (zVar != null) {
            org.telegram.ui.ActionBar.f6.B1(zVar, i9, true);
        }
    }

    public final void e(org.telegram.ui.Cells.h2 h2Var) {
        this.h = h2Var;
    }
}
