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
    public static final int[] f22671p = {16842910, 16842919};
    public ar f22672a;
    public final ArrayList f22673b = new ArrayList();
    public int f22674c;
    public boolean d;
    public final org.telegram.ui.Cells.z e;
    public final View f22675f;
    public final Paint f22676g;
    public Runnable h;
    public boolean f22677i;
    public Runnable f22678j;
    public final org.telegram.ui.Cells.l9 f22679k;
    public boolean f22680l;
    public final CornerPathEffect f22681m;
    public boolean f22682n;
    public final Paint f22683o;

    public ed(View view) {
        Paint paint = new Paint(1);
        this.f22676g = paint;
        this.f22679k = new org.telegram.ui.Cells.l9(this, 3);
        this.f22675f = view;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(AndroidUtilities.dp(12.0f));
        this.f22681m = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint(1);
        this.f22683o = paint2;
        paint2.setFilterBitmap(true);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(12.0f)));
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        paint3.setColor(-1);
        ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false) & 436207615}), null, new dd(this, paint3));
        this.e = rippleDrawable;
        rippleDrawable.setCallback(view);
    }

    public final void a(RectF rectF) {
        int i10 = this.f22674c + 1;
        this.f22674c = i10;
        ArrayList arrayList = this.f22673b;
        if (i10 > arrayList.size()) {
            arrayList.add(new RectF());
        }
        ((RectF) arrayList.get(this.f22674c - 1)).set(rectF);
    }

    public final boolean b(MotionEvent motionEvent) {
        Runnable runnable;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        View view = this.f22675f;
        org.telegram.ui.Cells.l9 l9Var = this.f22679k;
        org.telegram.ui.Cells.z zVar = this.e;
        if (action == 0) {
            for (int i10 = 0; i10 < this.f22674c; i10++) {
                float f7 = x10;
                float f10 = y3;
                if (((RectF) this.f22673b.get(i10)).contains(f7, f10)) {
                    this.d = true;
                    if (zVar != null) {
                        zVar.setHotspot(f7, f10);
                        zVar.setState(f22671p);
                    }
                    AndroidUtilities.cancelRunOnUIThread(l9Var);
                    if (this.f22680l) {
                        AndroidUtilities.runOnUIThread(l9Var, ViewConfiguration.getLongPressTimeout());
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
            AndroidUtilities.cancelRunOnUIThread(l9Var);
        }
        return this.d;
    }

    public final void c(Canvas canvas, Paint paint) {
        int i10 = this.f22674c;
        CornerPathEffect cornerPathEffect = this.f22681m;
        org.telegram.ui.Cells.z zVar = this.e;
        int i11 = 0;
        ArrayList arrayList = this.f22673b;
        if (i10 > 1) {
            if (!this.f22677i) {
                ar arVar = this.f22672a;
                if (arVar == null) {
                    this.f22672a = new ar(0);
                } else {
                    arVar.rewind();
                }
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    int i16 = this.f22674c;
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
                    this.f22672a.addRect((RectF) arrayList.get(i11), Path.Direction.CCW);
                    if (zVar != null) {
                        zVar.setBounds(i14, i15, i13, i12);
                    }
                    i11 = i17;
                }
                this.f22672a.a();
                this.f22677i = true;
            }
            paint.setPathEffect(cornerPathEffect);
            ar arVar2 = this.f22672a;
            if (arVar2 != null) {
                canvas.drawPath(arVar2, paint);
            }
        } else if (i10 == 1) {
            if (zVar != null) {
                zVar.setBounds((int) ((RectF) arrayList.get(0)).left, (int) ((RectF) arrayList.get(0)).top, (int) ((RectF) arrayList.get(0)).right, (int) ((RectF) arrayList.get(0)).bottom);
            }
            if (this.f22682n) {
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
        this.f22676g.setColor(i10);
        org.telegram.ui.Cells.z zVar = this.e;
        if (zVar != null) {
            org.telegram.ui.ActionBar.j6.B1(zVar, i10, true);
        }
    }

    public final void e(org.telegram.ui.Cells.h2 h2Var) {
        this.h = h2Var;
    }
}
