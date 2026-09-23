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
public final class fd {
    public static final int[] f23939p = {16842910, 16842919};
    public vq f23940a;
    public final ArrayList f23941b = new ArrayList();
    public int f23942c;
    public boolean d;
    public final org.telegram.ui.Cells.z e;
    public final View f23943f;
    public final Paint f23944g;
    public Runnable h;
    public boolean f23945i;
    public Runnable f23946j;
    public final org.telegram.ui.Cells.l7 f23947k;
    public boolean f23948l;
    public final CornerPathEffect f23949m;
    public boolean f23950n;
    public final Paint f23951o;

    public fd(View view) {
        Paint paint = new Paint(1);
        this.f23944g = paint;
        this.f23947k = new org.telegram.ui.Cells.l7(this, 5);
        this.f23943f = view;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(AndroidUtilities.dp(12.0f));
        this.f23949m = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint(1);
        this.f23951o = paint2;
        paint2.setFilterBitmap(true);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(12.0f)));
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        paint3.setColor(-1);
        ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false) & 436207615}), null, new ed(this, paint3));
        this.e = rippleDrawable;
        rippleDrawable.setCallback(view);
    }

    public final void a(RectF rectF) {
        int i10 = this.f23942c + 1;
        this.f23942c = i10;
        ArrayList arrayList = this.f23941b;
        if (i10 > arrayList.size()) {
            arrayList.add(new RectF());
        }
        ((RectF) arrayList.get(this.f23942c - 1)).set(rectF);
    }

    public final boolean b(MotionEvent motionEvent) {
        Runnable runnable;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        View view = this.f23943f;
        org.telegram.ui.Cells.l7 l7Var = this.f23947k;
        org.telegram.ui.Cells.z zVar = this.e;
        if (action == 0) {
            for (int i10 = 0; i10 < this.f23942c; i10++) {
                float f7 = x10;
                float f10 = y3;
                if (((RectF) this.f23941b.get(i10)).contains(f7, f10)) {
                    this.d = true;
                    if (zVar != null) {
                        zVar.setHotspot(f7, f10);
                        zVar.setState(f23939p);
                    }
                    AndroidUtilities.cancelRunOnUIThread(l7Var);
                    if (this.f23948l) {
                        AndroidUtilities.runOnUIThread(l7Var, ViewConfiguration.getLongPressTimeout());
                    }
                    view.invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.d && zVar != null) {
                zVar.setHotspot(x10, y3);
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
            AndroidUtilities.cancelRunOnUIThread(l7Var);
        }
        return this.d;
    }

    public final void c(Canvas canvas, Paint paint) {
        int i10 = this.f23942c;
        CornerPathEffect cornerPathEffect = this.f23949m;
        org.telegram.ui.Cells.z zVar = this.e;
        int i11 = 0;
        ArrayList arrayList = this.f23941b;
        if (i10 > 1) {
            if (!this.f23945i) {
                vq vqVar = this.f23940a;
                if (vqVar == null) {
                    this.f23940a = new vq(0);
                } else {
                    vqVar.rewind();
                }
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    int i16 = this.f23942c;
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
                    this.f23940a.addRect((RectF) arrayList.get(i11), Path.Direction.CCW);
                    if (zVar != null) {
                        zVar.setBounds(i14, i15, i13, i12);
                    }
                    i11 = i17;
                }
                this.f23940a.a();
                this.f23945i = true;
            }
            paint.setPathEffect(cornerPathEffect);
            vq vqVar2 = this.f23940a;
            if (vqVar2 != null) {
                canvas.drawPath(vqVar2, paint);
            }
        } else if (i10 == 1) {
            if (zVar != null) {
                zVar.setBounds((int) ((RectF) arrayList.get(0)).left, (int) ((RectF) arrayList.get(0)).top, (int) ((RectF) arrayList.get(0)).right, (int) ((RectF) arrayList.get(0)).bottom);
            }
            if (this.f23950n) {
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
        this.f23944g.setColor(i10);
        org.telegram.ui.Cells.z zVar = this.e;
        if (zVar != null) {
            org.telegram.ui.ActionBar.h6.B1(zVar, i10, true);
        }
    }

    public final void e(org.telegram.ui.Cells.h2 h2Var) {
        this.h = h2Var;
    }
}
