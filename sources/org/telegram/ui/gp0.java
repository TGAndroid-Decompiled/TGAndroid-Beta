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
public final class gp0 extends View {
    public final org.telegram.ui.ActionBar.g6 f37241a;
    public final Paint f37242b;
    public final int f37243c;
    public final int d;
    public boolean f37244e;
    public fp0[] f37245f;
    public final int[] h;
    public final Paint f37246n;
    public boolean f37247r;
    public int f37248s;
    public Utilities.Callback v;
    public fp0 f37249w;

    public gp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f37242b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f37246n = new Paint(1);
        this.f37247r = true;
        this.f37248s = 0;
        this.f37243c = i10;
        this.d = i11;
        this.f37241a = g6Var;
    }

    public final void a(int i10, boolean z4) {
        boolean z10;
        this.f37248s = i10;
        if (this.f37245f != null) {
            int i11 = 0;
            while (true) {
                fp0[] fp0VarArr = this.f37245f;
                if (i11 < fp0VarArr.length) {
                    fp0 fp0Var = fp0VarArr[i11];
                    if (fp0Var.f37000o == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fp0Var.f36998m = z10;
                    if (!z4) {
                        fp0Var.f36999n.f(z10, true);
                    }
                    fp0Var.f37003r.invalidate();
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b() {
        MessagesController.PeerColors peerColors;
        boolean z4;
        int i10;
        if (this.f37245f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f37243c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            fp0[] fp0VarArr = this.f37245f;
            if (i12 < fp0VarArr.length) {
                org.telegram.ui.ActionBar.g6 g6Var = this.f37241a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    fp0 fp0Var = fp0VarArr[i12];
                    int i13 = iArr[i12];
                    fp0Var.f37000o = i13;
                    if (i13 < 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    fp0Var.h = z4;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.k6.f21643c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.k6.f21914r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
                    fp0Var.f36993g = false;
                    fp0Var.f36992f = false;
                    fp0Var.f36988a.setColor(v02);
                } else if (i12 < 7 && i11 == 1) {
                    fp0 fp0Var2 = fp0VarArr[i12];
                    int i14 = iArr[i12];
                    fp0Var2.f37000o = i14;
                    int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21914r8[i14], g6Var);
                    fp0Var2.f36993g = false;
                    fp0Var2.f36992f = false;
                    fp0Var2.f36988a.setColor(v03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f37245f[i12].f37000o = peerColors.colors.get(i12).f18057id;
                    this.f37245f[i12].a(peerColors.colors.get(i12));
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
        if (this.f37245f != null) {
            int i10 = 0;
            while (true) {
                fp0[] fp0VarArr = this.f37245f;
                if (i10 >= fp0VarArr.length) {
                    break;
                }
                fp0 fp0Var = fp0VarArr[i10];
                gp0 gp0Var = fp0Var.f37003r;
                Path path = fp0Var.f36991e;
                canvas.save();
                float a2 = fp0Var.f36997l.a(0.05f);
                RectF rectF = fp0Var.f37001p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = fp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(fp0Var.f36988a);
                if (fp0Var.f36992f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, fp0Var.f36989b);
                }
                canvas.restore();
                if (fp0Var.f36993g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), fp0Var.f36990c);
                    canvas.restore();
                }
                float e6 = fp0Var.f36999n.e(fp0Var.f36998m);
                if (e6 > 0.0f) {
                    Paint paint = gp0Var.f37242b;
                    Paint paint2 = gp0Var.f37242b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, gp0Var.f37241a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e6) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (fp0Var.h) {
                    if (gp0Var.f37244e) {
                        if (fp0Var.f36996k == null) {
                            Drawable drawable = gp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            fp0Var.f36996k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        fp0Var.f36996k.setBounds((int) org.telegram.messenger.y3.A(fp0Var.f36996k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.y3.A(fp0Var.f36996k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) w.c.c(fp0Var.f36996k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) w.c.c(fp0Var.f36996k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        fp0Var.f36996k.draw(canvas);
                    } else {
                        if (fp0Var.f36994i == null) {
                            fp0Var.f36994i = new Path();
                        }
                        if (fp0Var.f36995j == null) {
                            Paint paint3 = new Paint(1);
                            fp0Var.f36995j = paint3;
                            paint3.setColor(-1);
                            fp0Var.f36995j.setStyle(Paint.Style.STROKE);
                            fp0Var.f36995j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        fp0Var.f36995j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        fp0Var.f36994i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e6);
                        fp0Var.f36994i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        fp0Var.f36994i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        fp0Var.f36994i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        fp0Var.f36994i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(fp0Var.f36994i, fp0Var.f36995j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f37247r) {
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21660d7, this.f37241a);
            Paint paint4 = this.f37246n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f37248s;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        MessagesController.PeerColors peerColors;
        int size;
        int i12;
        boolean z4;
        int i13;
        boolean z10;
        int size2 = View.MeasureSpec.getSize(i10);
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i14 = this.f37243c;
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
        float f10 = size2;
        float f11 = i15;
        float f12 = i15 + 1;
        float min = Math.min(AndroidUtilities.dp(54.0f), f10 / ((f12 * 0.28947f) + f11));
        float min2 = Math.min(0.28947f * min, AndroidUtilities.dp(8.0f));
        float min3 = Math.min(0.31578946f * min, AndroidUtilities.dp(11.33f));
        setMeasuredDimension(size2, (int) (((i12 + 1) * min3) + ((size / i15) * min)));
        fp0[] fp0VarArr = this.f37245f;
        if (fp0VarArr == null || fp0VarArr.length != size) {
            this.f37245f = new fp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f37245f[i17] = new fp0(this);
                if (i14 == i16) {
                    fp0 fp0Var = this.f37245f[i17];
                    int i18 = this.h[i17];
                    fp0Var.f37000o = i18;
                    if (i18 < 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    fp0Var.h = z4;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.k6.f21643c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.k6.f21914r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.k6.v0(i13, this.f37241a);
                    fp0Var.f36993g = false;
                    fp0Var.f36992f = false;
                    fp0Var.f36988a.setColor(v02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f37245f[i17].f37000o = peerColors.colors.get(i17).f18057id;
                    this.f37245f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f37245f != null) {
            float f14 = f13;
            float f15 = min3;
            for (int i19 = 0; i19 < this.f37245f.length; i19++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f37245f[i19].f37001p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f37245f[i19].f37002q.set(rectF);
                fp0 fp0Var2 = this.f37245f[i19];
                if (fp0Var2.f37000o == this.f37248s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fp0Var2.f36998m = z10;
                fp0Var2.f36999n.f(z10, true);
                fp0Var2.f37003r.invalidate();
                if (i19 % i15 == i15 - 1) {
                    f15 += min + min3;
                    f14 = f13;
                } else {
                    f14 = min + min2 + f14;
                }
            }
        }
    }

    public void setCloseAsLock(boolean z4) {
        this.f37244e = z4;
    }

    public void setDivider(boolean z4) {
        this.f37247r = z4;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
