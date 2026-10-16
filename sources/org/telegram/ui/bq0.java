package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class bq0 extends View {
    public final org.telegram.ui.ActionBar.c6 f34367a;
    public final Paint f34368b;
    public final int f34369c;
    public final int d;
    public boolean e;
    public aq0[] f34370f;
    public final int[] h;
    public final Paint f34371n;
    public boolean f34372r;
    public int f34373s;
    public Utilities.Callback v;
    public aq0 f34374w;

    public bq0(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f34368b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f34371n = new Paint(1);
        this.f34372r = true;
        this.f34373s = 0;
        this.f34369c = i10;
        this.d = i11;
        this.f34367a = c6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f34373s = i10;
        if (this.f34370f != null) {
            int i11 = 0;
            while (true) {
                aq0[] aq0VarArr = this.f34370f;
                if (i11 < aq0VarArr.length) {
                    aq0 aq0Var = aq0VarArr[i11];
                    if (aq0Var.f34069o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    aq0Var.f34067m = z11;
                    if (!z10) {
                        aq0Var.f34068n.f(z11, true);
                    }
                    aq0Var.f34072r.invalidate();
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b() {
        MessagesController.PeerColors peerColors;
        boolean z10;
        int i10;
        if (this.f34370f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f34369c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            aq0[] aq0VarArr = this.f34370f;
            if (i12 < aq0VarArr.length) {
                org.telegram.ui.ActionBar.c6 c6Var = this.f34367a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    aq0 aq0Var = aq0VarArr[i12];
                    int i13 = iArr[i12];
                    aq0Var.f34069o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    aq0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.g6.f19584c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.g6.f19860r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
                    aq0Var.f34062g = false;
                    aq0Var.f34061f = false;
                    aq0Var.f34058a.setColor(w02);
                } else if (i12 < 7 && i11 == 1) {
                    aq0 aq0Var2 = aq0VarArr[i12];
                    int i14 = iArr[i12];
                    aq0Var2.f34069o = i14;
                    int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19860r8[i14], c6Var);
                    aq0Var2.f34062g = false;
                    aq0Var2.f34061f = false;
                    aq0Var2.f34058a.setColor(w03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f34370f[i12].f34069o = peerColors.colors.get(i12).f16402id;
                    this.f34370f[i12].a(peerColors.colors.get(i12));
                }
                i12++;
            } else {
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f34370f != null) {
            int i10 = 0;
            while (true) {
                aq0[] aq0VarArr = this.f34370f;
                if (i10 >= aq0VarArr.length) {
                    break;
                }
                aq0 aq0Var = aq0VarArr[i10];
                bq0 bq0Var = aq0Var.f34072r;
                Path path = aq0Var.e;
                canvas.save();
                float a2 = aq0Var.f34066l.a(0.05f);
                RectF rectF = aq0Var.f34070p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = aq0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(aq0Var.f34058a);
                if (aq0Var.f34061f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, aq0Var.f34059b);
                }
                canvas.restore();
                if (aq0Var.f34062g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), aq0Var.f34060c);
                    canvas.restore();
                }
                float e = aq0Var.f34068n.e(aq0Var.f34067m);
                if (e > 0.0f) {
                    Paint paint = bq0Var.f34368b;
                    Paint paint2 = bq0Var.f34368b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, bq0Var.f34367a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (aq0Var.h) {
                    if (bq0Var.e) {
                        if (aq0Var.f34065k == null) {
                            Drawable drawable = bq0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            aq0Var.f34065k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        aq0Var.f34065k.setBounds((int) org.telegram.messenger.sk.b(aq0Var.f34065k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.sk.b(aq0Var.f34065k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.d(aq0Var.f34065k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.d(aq0Var.f34065k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        aq0Var.f34065k.draw(canvas);
                    } else {
                        if (aq0Var.f34063i == null) {
                            aq0Var.f34063i = new Path();
                        }
                        if (aq0Var.f34064j == null) {
                            Paint paint3 = new Paint(1);
                            aq0Var.f34064j = paint3;
                            paint3.setColor(-1);
                            aq0Var.f34064j.setStyle(Paint.Style.STROKE);
                            aq0Var.f34064j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        aq0Var.f34064j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        aq0Var.f34063i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        aq0Var.f34063i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        aq0Var.f34063i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        aq0Var.f34063i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        aq0Var.f34063i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(aq0Var.f34063i, aq0Var.f34064j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f34372r) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19602d7, this.f34367a);
            Paint paint4 = this.f34371n;
            paint4.setColor(w02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f34373s;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        MessagesController.PeerColors peerColors;
        int size;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        int size2 = View.MeasureSpec.getSize(i10);
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i14 = this.f34369c;
        if (i14 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        if (peerColors == null) {
            size = 0;
        } else {
            size = peerColors.colors.size();
        }
        int i15 = 8;
        int i16 = 2;
        if (i14 == 2) {
            size = 8;
        }
        if (i14 != 2 && i14 == 1) {
            i15 = 7;
        }
        float f7 = size2;
        float f10 = i15;
        float f11 = i15 + 1;
        float min = Math.min(AndroidUtilities.dp(54.0f), f7 / ((f11 * 0.28947f) + f10));
        float min2 = Math.min(0.28947f * min, AndroidUtilities.dp(8.0f));
        float min3 = Math.min(0.31578946f * min, AndroidUtilities.dp(11.33f));
        boolean z12 = true;
        setMeasuredDimension(size2, (int) (((i12 + 1) * min3) + ((size / i15) * min)));
        aq0[] aq0VarArr = this.f34370f;
        if (aq0VarArr == null || aq0VarArr.length != size) {
            this.f34370f = new aq0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f34370f[i17] = new aq0(this);
                if (i14 == i16) {
                    aq0 aq0Var = this.f34370f[i17];
                    int i18 = this.h[i17];
                    aq0Var.f34069o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    aq0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.g6.f19584c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.g6.f19860r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.g6.w0(i13, this.f34367a);
                    aq0Var.f34062g = false;
                    aq0Var.f34061f = false;
                    aq0Var.f34058a.setColor(w02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f34370f[i17].f34069o = peerColors.colors.get(i17).f16402id;
                    this.f34370f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f34370f != null) {
            int i19 = 0;
            float f13 = f12;
            float f14 = min3;
            while (i19 < this.f34370f.length) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f34370f[i19].f34070p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f34370f[i19].f34071q.set(rectF);
                aq0 aq0Var2 = this.f34370f[i19];
                if (aq0Var2.f34069o == this.f34373s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                aq0Var2.f34067m = z11;
                boolean z13 = z12;
                aq0Var2.f34068n.f(z11, z13);
                aq0Var2.f34072r.invalidate();
                if (i19 % i15 == i15 - 1) {
                    f14 += min + min3;
                    f13 = f12;
                } else {
                    f13 = min + min2 + f13;
                }
                i19++;
                z12 = z13;
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.e = z10;
    }

    public void setDivider(boolean z10) {
        this.f34372r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
