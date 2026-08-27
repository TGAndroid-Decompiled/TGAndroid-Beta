package org.telegram.ui.Components;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class tc {

    public static final int[] f32728p = {16842910, 16842919};

    public iq f32729a;

    public final ArrayList f32730b = new ArrayList();

    public int f32731c;
    public boolean d;

    public final org.telegram.ui.Cells.z f32732e;

    public final View f32733f;

    public final Paint f32734g;
    public Runnable h;

    public boolean f32735i;

    public Runnable f32736j;

    public final m.i3 f32737k;

    public boolean f32738l;

    public final CornerPathEffect f32739m;

    public boolean f32740n;

    public final Paint f32741o;

    public tc(View view) {
        Paint paint = new Paint(1);
        this.f32734g = paint;
        this.f32737k = new m.i3(this, 12);
        float fDp = AndroidUtilities.dp(12.0f);
        this.f32733f = view;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(fDp);
        this.f32739m = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint(1);
        this.f32741o = paint2;
        paint2.setFilterBitmap(true);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(12.0f)));
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        paint3.setColor(-1);
        org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false) & 436207615}), null, new af.g(this, paint3));
        this.f32732e = zVar;
        zVar.setCallback(view);
    }

    public final void a(RectF rectF) {
        int i10 = this.f32731c + 1;
        this.f32731c = i10;
        ArrayList arrayList = this.f32730b;
        if (i10 > arrayList.size()) {
            arrayList.add(new RectF());
        }
        ((RectF) arrayList.get(this.f32731c - 1)).set(rectF);
    }

    public final boolean b(MotionEvent motionEvent) {
        Runnable runnable;
        int x8 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        View view = this.f32733f;
        m.i3 i3Var = this.f32737k;
        org.telegram.ui.Cells.z zVar = this.f32732e;
        if (action == 0) {
            for (int i10 = 0; i10 < this.f32731c; i10++) {
                float f10 = x8;
                float f11 = y10;
                if (((RectF) this.f32730b.get(i10)).contains(f10, f11)) {
                    this.d = true;
                    if (zVar != null) {
                        zVar.setHotspot(f10, f11);
                        zVar.setState(f32728p);
                    }
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    if (this.f32738l) {
                        AndroidUtilities.runOnUIThread(i3Var, ViewConfiguration.getLongPressTimeout());
                    }
                    view.invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
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
        } else if (motionEvent.getAction() == 2 && this.d && zVar != null) {
            zVar.setHotspot(x8, y10);
        }
        return this.d;
    }

    public final void c(Canvas canvas, Paint paint) {
        int i10 = this.f32731c;
        CornerPathEffect cornerPathEffect = this.f32739m;
        org.telegram.ui.Cells.z zVar = this.f32732e;
        int i11 = 0;
        ArrayList arrayList = this.f32730b;
        if (i10 <= 1) {
            if (i10 == 1) {
                if (zVar != null) {
                    zVar.setBounds((int) ((RectF) arrayList.get(0)).left, (int) ((RectF) arrayList.get(0)).top, (int) ((RectF) arrayList.get(0)).right, (int) ((RectF) arrayList.get(0)).bottom);
                }
                if (!this.f32740n) {
                    paint.setPathEffect(cornerPathEffect);
                    canvas.drawRoundRect((RectF) arrayList.get(0), 0.0f, 0.0f, paint);
                    return;
                } else {
                    paint.setPathEffect(null);
                    float fMin = Math.min(((RectF) arrayList.get(0)).width(), ((RectF) arrayList.get(0)).height()) / 2.0f;
                    canvas.drawRoundRect((RectF) arrayList.get(0), fMin, fMin, paint);
                    return;
                }
            }
            return;
        }
        if (!this.f32735i) {
            iq iqVar = this.f32729a;
            if (iqVar == null) {
                this.f32729a = new iq(0);
            } else {
                iqVar.rewind();
            }
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = this.f32731c;
                if (i11 >= i16) {
                    break;
                }
                int i17 = i11 + 1;
                if (i17 < i16) {
                    float f10 = ((RectF) arrayList.get(i11)).right;
                    float f11 = ((RectF) arrayList.get(i17)).right;
                    if (Math.abs(f10 - f11) < AndroidUtilities.dp(4.0f)) {
                        RectF rectF = (RectF) arrayList.get(i17);
                        RectF rectF2 = (RectF) arrayList.get(i11);
                        float fMax = Math.max(f10, f11);
                        rectF2.right = fMax;
                        rectF.right = fMax;
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
                this.f32729a.addRect((RectF) arrayList.get(i11), Path.Direction.CCW);
                if (zVar != null) {
                    zVar.setBounds(i14, i15, i13, i12);
                }
                i11 = i17;
            }
            this.f32729a.a();
            this.f32735i = true;
        }
        paint.setPathEffect(cornerPathEffect);
        iq iqVar2 = this.f32729a;
        if (iqVar2 != null) {
            canvas.drawPath(iqVar2, paint);
        }
    }

    public final void d(int i10) {
        this.f32734g.setColor(i10);
        org.telegram.ui.Cells.z zVar = this.f32732e;
        if (zVar != null) {
            org.telegram.ui.ActionBar.g6.B1(zVar, i10, true);
        }
    }

    public final void e(org.telegram.ui.Cells.g2 g2Var) {
        this.h = g2Var;
    }
}
