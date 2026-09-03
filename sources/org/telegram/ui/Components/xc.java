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
public final class xc {
    public static final int[] f33016p = {16842910, 16842919};
    public uq f33017a;
    public final ArrayList f33018b = new ArrayList();
    public int f33019c;
    public boolean d;
    public final org.telegram.ui.Cells.z f33020e;
    public final View f33021f;
    public final Paint f33022g;
    public Runnable h;
    public boolean f33023i;
    public Runnable f33024j;
    public final m2.b f33025k;
    public boolean f33026l;
    public final CornerPathEffect f33027m;
    public boolean f33028n;
    public final Paint f33029o;

    public xc(View view) {
        Paint paint = new Paint(1);
        this.f33022g = paint;
        this.f33025k = new m2.b(this, 14);
        this.f33021f = view;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(AndroidUtilities.dp(12.0f));
        this.f33027m = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint(1);
        this.f33029o = paint2;
        paint2.setFilterBitmap(true);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(12.0f)));
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        paint3.setColor(-1);
        ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false) & 436207615}), null, new ef.f(this, paint3));
        this.f33020e = rippleDrawable;
        rippleDrawable.setCallback(view);
    }

    public final void a(RectF rectF) {
        int i10 = this.f33019c + 1;
        this.f33019c = i10;
        ArrayList arrayList = this.f33018b;
        if (i10 > arrayList.size()) {
            arrayList.add(new RectF());
        }
        ((RectF) arrayList.get(this.f33019c - 1)).set(rectF);
    }

    public final boolean b(MotionEvent motionEvent) {
        Runnable runnable;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        View view = this.f33021f;
        m2.b bVar = this.f33025k;
        org.telegram.ui.Cells.z zVar = this.f33020e;
        if (action == 0) {
            for (int i10 = 0; i10 < this.f33019c; i10++) {
                float f10 = x10;
                float f11 = y10;
                if (((RectF) this.f33018b.get(i10)).contains(f10, f11)) {
                    this.d = true;
                    if (zVar != null) {
                        zVar.setHotspot(f10, f11);
                        zVar.setState(f33016p);
                    }
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    if (this.f33026l) {
                        AndroidUtilities.runOnUIThread(bVar, ViewConfiguration.getLongPressTimeout());
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
            AndroidUtilities.cancelRunOnUIThread(bVar);
        }
        return this.d;
    }

    public final void c(Canvas canvas, Paint paint) {
        int i10 = this.f33019c;
        CornerPathEffect cornerPathEffect = this.f33027m;
        org.telegram.ui.Cells.z zVar = this.f33020e;
        int i11 = 0;
        ArrayList arrayList = this.f33018b;
        if (i10 > 1) {
            if (!this.f33023i) {
                uq uqVar = this.f33017a;
                if (uqVar == null) {
                    this.f33017a = new uq(0);
                } else {
                    uqVar.rewind();
                }
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    int i16 = this.f33019c;
                    if (i11 >= i16) {
                        break;
                    }
                    int i17 = i11 + 1;
                    if (i17 < i16) {
                        float f10 = ((RectF) arrayList.get(i11)).right;
                        float f11 = ((RectF) arrayList.get(i17)).right;
                        if (Math.abs(f10 - f11) < AndroidUtilities.dp(4.0f)) {
                            float max = Math.max(f10, f11);
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
                    this.f33017a.addRect((RectF) arrayList.get(i11), Path.Direction.CCW);
                    if (zVar != null) {
                        zVar.setBounds(i14, i15, i13, i12);
                    }
                    i11 = i17;
                }
                this.f33017a.a();
                this.f33023i = true;
            }
            paint.setPathEffect(cornerPathEffect);
            uq uqVar2 = this.f33017a;
            if (uqVar2 != null) {
                canvas.drawPath(uqVar2, paint);
            }
        } else if (i10 == 1) {
            if (zVar != null) {
                zVar.setBounds((int) ((RectF) arrayList.get(0)).left, (int) ((RectF) arrayList.get(0)).top, (int) ((RectF) arrayList.get(0)).right, (int) ((RectF) arrayList.get(0)).bottom);
            }
            if (this.f33028n) {
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
        this.f33022g.setColor(i10);
        org.telegram.ui.Cells.z zVar = this.f33020e;
        if (zVar != null) {
            org.telegram.ui.ActionBar.k6.B1(zVar, i10, true);
        }
    }

    public final void e(org.telegram.ui.Cells.h2 h2Var) {
        this.h = h2Var;
    }
}
