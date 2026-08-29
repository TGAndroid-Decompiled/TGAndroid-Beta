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
public final class ad {
    public static final int[] f26738p = {16842910, 16842919};
    public oq f26739a;
    public final ArrayList f26740b = new ArrayList();
    public int f26741c;
    public boolean d;
    public final org.telegram.ui.Cells.z f26742e;
    public final View f26743f;
    public final Paint f26744g;
    public Runnable h;
    public boolean f26745i;
    public Runnable f26746j;
    public final lh.m7 f26747k;
    public boolean f26748l;
    public final CornerPathEffect f26749m;
    public boolean f26750n;
    public final Paint f26751o;

    public ad(View view) {
        Paint paint = new Paint(1);
        this.f26744g = paint;
        this.f26747k = new lh.m7(this, 15);
        this.f26743f = view;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(AndroidUtilities.dp(12.0f));
        this.f26749m = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint(1);
        this.f26751o = paint2;
        paint2.setFilterBitmap(true);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(12.0f)));
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        paint3.setColor(-1);
        ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false) & 436207615}), null, new cf.f(this, paint3));
        this.f26742e = rippleDrawable;
        rippleDrawable.setCallback(view);
    }

    public final void a(RectF rectF) {
        int i10 = this.f26741c + 1;
        this.f26741c = i10;
        ArrayList arrayList = this.f26740b;
        if (i10 > arrayList.size()) {
            arrayList.add(new RectF());
        }
        ((RectF) arrayList.get(this.f26741c - 1)).set(rectF);
    }

    public final boolean b(MotionEvent motionEvent) {
        Runnable runnable;
        int x4 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        View view = this.f26743f;
        lh.m7 m7Var = this.f26747k;
        org.telegram.ui.Cells.z zVar = this.f26742e;
        if (action == 0) {
            for (int i10 = 0; i10 < this.f26741c; i10++) {
                float f9 = x4;
                float f10 = y8;
                if (((RectF) this.f26740b.get(i10)).contains(f9, f10)) {
                    this.d = true;
                    if (zVar != null) {
                        zVar.setHotspot(f9, f10);
                        zVar.setState(f26738p);
                    }
                    AndroidUtilities.cancelRunOnUIThread(m7Var);
                    if (this.f26748l) {
                        AndroidUtilities.runOnUIThread(m7Var, ViewConfiguration.getLongPressTimeout());
                    }
                    view.invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.d && zVar != null) {
                zVar.setHotspot(x4, y8);
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
            AndroidUtilities.cancelRunOnUIThread(m7Var);
        }
        return this.d;
    }

    public final void c(Canvas canvas, Paint paint) {
        int i10 = this.f26741c;
        CornerPathEffect cornerPathEffect = this.f26749m;
        org.telegram.ui.Cells.z zVar = this.f26742e;
        int i11 = 0;
        ArrayList arrayList = this.f26740b;
        if (i10 > 1) {
            if (!this.f26745i) {
                oq oqVar = this.f26739a;
                if (oqVar == null) {
                    this.f26739a = new oq(0);
                } else {
                    oqVar.rewind();
                }
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    int i16 = this.f26741c;
                    if (i11 >= i16) {
                        break;
                    }
                    int i17 = i11 + 1;
                    if (i17 < i16) {
                        float f9 = ((RectF) arrayList.get(i11)).right;
                        float f10 = ((RectF) arrayList.get(i17)).right;
                        if (Math.abs(f9 - f10) < AndroidUtilities.dp(4.0f)) {
                            float max = Math.max(f9, f10);
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
                    this.f26739a.addRect((RectF) arrayList.get(i11), Path.Direction.CCW);
                    if (zVar != null) {
                        zVar.setBounds(i14, i15, i13, i12);
                    }
                    i11 = i17;
                }
                this.f26739a.a();
                this.f26745i = true;
            }
            paint.setPathEffect(cornerPathEffect);
            oq oqVar2 = this.f26739a;
            if (oqVar2 != null) {
                canvas.drawPath(oqVar2, paint);
            }
        } else if (i10 == 1) {
            if (zVar != null) {
                zVar.setBounds((int) ((RectF) arrayList.get(0)).left, (int) ((RectF) arrayList.get(0)).top, (int) ((RectF) arrayList.get(0)).right, (int) ((RectF) arrayList.get(0)).bottom);
            }
            if (this.f26750n) {
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
        this.f26744g.setColor(i10);
        org.telegram.ui.Cells.z zVar = this.f26742e;
        if (zVar != null) {
            org.telegram.ui.ActionBar.g6.B1(zVar, i10, true);
        }
    }

    public final void e(org.telegram.ui.Cells.g2 g2Var) {
        this.h = g2Var;
    }
}
