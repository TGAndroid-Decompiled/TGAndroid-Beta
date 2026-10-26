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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class op0 extends View implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f42260a;
    public final Paint f42261b;
    public final int f42262c;
    public final int d;
    public boolean e;
    public np0[] f42263f;
    public final int[] h;
    public final Paint f42264n;
    public boolean f42265r;
    public int f42266s;
    public Utilities.Callback v;
    public np0 f42267w;

    public op0(int i10, int i11, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f42261b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f42264n = new Paint(1);
        this.f42265r = true;
        this.f42266s = 0;
        this.f42262c = i10;
        this.d = i11;
        this.f42260a = u6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f42266s = i10;
        if (this.f42263f != null) {
            int i11 = 0;
            while (true) {
                np0[] np0VarArr = this.f42263f;
                if (i11 < np0VarArr.length) {
                    np0 np0Var = np0VarArr[i11];
                    if (np0Var.f41982o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    np0Var.f41980m = z11;
                    if (!z10) {
                        np0Var.f41981n.f(z11, true);
                    }
                    np0Var.f41985r.invalidate();
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f42263f != null) {
            int i10 = 0;
            while (true) {
                np0[] np0VarArr = this.f42263f;
                if (i10 >= np0VarArr.length) {
                    break;
                }
                np0 np0Var = np0VarArr[i10];
                op0 op0Var = np0Var.f41985r;
                Path path = np0Var.e;
                canvas.save();
                float a2 = np0Var.f41979l.a(0.05f);
                RectF rectF = np0Var.f41983p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = np0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(np0Var.f41971a);
                if (np0Var.f41974f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, np0Var.f41972b);
                }
                canvas.restore();
                if (np0Var.f41975g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), np0Var.f41973c);
                    canvas.restore();
                }
                float e = np0Var.f41981n.e(np0Var.f41980m);
                if (e > 0.0f) {
                    Paint paint = op0Var.f42261b;
                    Paint paint2 = op0Var.f42261b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, op0Var.f42260a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (np0Var.h) {
                    if (op0Var.e) {
                        if (np0Var.f41978k == null) {
                            Drawable drawable = op0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            np0Var.f41978k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        np0Var.f41978k.setBounds((int) org.telegram.messenger.vh.w(np0Var.f41978k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.vh.w(np0Var.f41978k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.c(np0Var.f41978k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.c(np0Var.f41978k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        np0Var.f41978k.draw(canvas);
                    } else {
                        if (np0Var.f41976i == null) {
                            np0Var.f41976i = new Path();
                        }
                        if (np0Var.f41977j == null) {
                            Paint paint3 = new Paint(1);
                            np0Var.f41977j = paint3;
                            paint3.setColor(-1);
                            np0Var.f41977j.setStyle(Paint.Style.STROKE);
                            np0Var.f41977j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        np0Var.f41977j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        np0Var.f41976i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        np0Var.f41976i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        np0Var.f41976i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        np0Var.f41976i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        np0Var.f41976i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(np0Var.f41976i, np0Var.f41977j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f42265r) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d7, this.f42260a);
            Paint paint4 = this.f42264n;
            paint4.setColor(w02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.op0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f42266s;
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
        int i14 = this.f42262c;
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
        np0[] np0VarArr = this.f42263f;
        if (np0VarArr == null || np0VarArr.length != size) {
            this.f42263f = new np0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f42263f[i17] = new np0(this);
                if (i14 == i16) {
                    np0 np0Var = this.f42263f[i17];
                    int i18 = this.h[i17];
                    np0Var.f41982o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    np0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.y6.f23339c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.y6.f23616r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.y6.w0(i13, this.f42260a);
                    np0Var.f41975g = false;
                    np0Var.f41974f = false;
                    np0Var.f41971a.setColor(w02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f42263f[i17].f41982o = peerColors.colors.get(i17).f19551id;
                    this.f42263f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f42263f != null) {
            int i19 = 0;
            float f13 = f12;
            float f14 = min3;
            while (i19 < this.f42263f.length) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f42263f[i19].f41983p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f42263f[i19].f41984q.set(rectF);
                np0 np0Var2 = this.f42263f[i19];
                if (np0Var2.f41982o == this.f42266s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                np0Var2.f41980m = z11;
                boolean z13 = z12;
                np0Var2.f41981n.f(z11, z13);
                np0Var2.f41985r.invalidate();
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
        this.f42265r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }

    @Override
    public final void updateColors() {
        MessagesController.PeerColors peerColors;
        boolean z10;
        int i10;
        if (this.f42263f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f42262c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            np0[] np0VarArr = this.f42263f;
            if (i12 < np0VarArr.length) {
                org.telegram.ui.ActionBar.u6 u6Var = this.f42260a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    np0 np0Var = np0VarArr[i12];
                    int i13 = iArr[i12];
                    np0Var.f41982o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    np0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.y6.f23339c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.y6.f23616r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
                    np0Var.f41975g = false;
                    np0Var.f41974f = false;
                    np0Var.f41971a.setColor(w02);
                } else if (i12 < 7 && i11 == 1) {
                    np0 np0Var2 = np0VarArr[i12];
                    int i14 = iArr[i12];
                    np0Var2.f41982o = i14;
                    int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23616r8[i14], u6Var);
                    np0Var2.f41975g = false;
                    np0Var2.f41974f = false;
                    np0Var2.f41971a.setColor(w03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f42263f[i12].f41982o = peerColors.colors.get(i12).f19551id;
                    this.f42263f[i12].a(peerColors.colors.get(i12));
                }
                i12++;
            } else {
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
