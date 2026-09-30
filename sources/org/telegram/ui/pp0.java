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
public final class pp0 extends View {
    public final org.telegram.ui.ActionBar.d6 f36698a;
    public final Paint f36699b;
    public final int f36700c;
    public final int d;
    public boolean e;
    public op0[] f36701f;
    public final int[] h;
    public final Paint f36702n;
    public boolean f36703r;
    public int f36704s;
    public Utilities.Callback v;
    public op0 f36705w;

    public pp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f36699b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f36702n = new Paint(1);
        this.f36703r = true;
        this.f36704s = 0;
        this.f36700c = i10;
        this.d = i11;
        this.f36698a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f36704s = i10;
        if (this.f36701f != null) {
            int i11 = 0;
            while (true) {
                op0[] op0VarArr = this.f36701f;
                if (i11 < op0VarArr.length) {
                    op0 op0Var = op0VarArr[i11];
                    if (op0Var.f36427o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    op0Var.f36425m = z11;
                    if (!z10) {
                        op0Var.f36426n.f(z11, true);
                    }
                    op0Var.f36430r.invalidate();
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
        if (this.f36701f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f36700c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            op0[] op0VarArr = this.f36701f;
            if (i12 < op0VarArr.length) {
                org.telegram.ui.ActionBar.d6 d6Var = this.f36698a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    op0 op0Var = op0VarArr[i12];
                    int i13 = iArr[i12];
                    op0Var.f36427o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    op0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.h6.f19060c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.h6.f19335r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                    op0Var.f36420g = false;
                    op0Var.f36419f = false;
                    op0Var.f36416a.setColor(v02);
                } else if (i12 < 7 && i11 == 1) {
                    op0 op0Var2 = op0VarArr[i12];
                    int i14 = iArr[i12];
                    op0Var2.f36427o = i14;
                    int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19335r8[i14], d6Var);
                    op0Var2.f36420g = false;
                    op0Var2.f36419f = false;
                    op0Var2.f36416a.setColor(v03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f36701f[i12].f36427o = peerColors.colors.get(i12).f15851id;
                    this.f36701f[i12].a(peerColors.colors.get(i12));
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
        if (this.f36701f != null) {
            int i10 = 0;
            while (true) {
                op0[] op0VarArr = this.f36701f;
                if (i10 >= op0VarArr.length) {
                    break;
                }
                op0 op0Var = op0VarArr[i10];
                pp0 pp0Var = op0Var.f36430r;
                Path path = op0Var.e;
                canvas.save();
                float a2 = op0Var.f36424l.a(0.05f);
                RectF rectF = op0Var.f36428p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = op0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(op0Var.f36416a);
                if (op0Var.f36419f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, op0Var.f36417b);
                }
                canvas.restore();
                if (op0Var.f36420g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), op0Var.f36418c);
                    canvas.restore();
                }
                float e = op0Var.f36426n.e(op0Var.f36425m);
                if (e > 0.0f) {
                    Paint paint = pp0Var.f36699b;
                    Paint paint2 = pp0Var.f36699b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19076d6, pp0Var.f36698a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (op0Var.h) {
                    if (pp0Var.e) {
                        if (op0Var.f36423k == null) {
                            Drawable drawable = pp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            op0Var.f36423k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        op0Var.f36423k.setBounds((int) org.telegram.messenger.ok.b(op0Var.f36423k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.ok.b(op0Var.f36423k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a4.a.e(op0Var.f36423k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a4.a.e(op0Var.f36423k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        op0Var.f36423k.draw(canvas);
                    } else {
                        if (op0Var.f36421i == null) {
                            op0Var.f36421i = new Path();
                        }
                        if (op0Var.f36422j == null) {
                            Paint paint3 = new Paint(1);
                            op0Var.f36422j = paint3;
                            paint3.setColor(-1);
                            op0Var.f36422j.setStyle(Paint.Style.STROKE);
                            op0Var.f36422j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        op0Var.f36422j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        op0Var.f36421i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        op0Var.f36421i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        op0Var.f36421i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        op0Var.f36421i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        op0Var.f36421i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(op0Var.f36421i, op0Var.f36422j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f36703r) {
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19077d7, this.f36698a);
            Paint paint4 = this.f36702n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f36704s;
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
        int i14 = this.f36700c;
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
        setMeasuredDimension(size2, (int) (((i12 + 1) * min3) + ((size / i15) * min)));
        op0[] op0VarArr = this.f36701f;
        if (op0VarArr == null || op0VarArr.length != size) {
            this.f36701f = new op0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f36701f[i17] = new op0(this);
                if (i14 == i16) {
                    op0 op0Var = this.f36701f[i17];
                    int i18 = this.h[i17];
                    op0Var.f36427o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    op0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.h6.f19060c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.h6.f19335r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i13, this.f36698a);
                    op0Var.f36420g = false;
                    op0Var.f36419f = false;
                    op0Var.f36416a.setColor(v02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f36701f[i17].f36427o = peerColors.colors.get(i17).f15851id;
                    this.f36701f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f36701f != null) {
            float f13 = f12;
            float f14 = min3;
            for (int i19 = 0; i19 < this.f36701f.length; i19++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f36701f[i19].f36428p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f36701f[i19].f36429q.set(rectF);
                op0 op0Var2 = this.f36701f[i19];
                if (op0Var2.f36427o == this.f36704s) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                op0Var2.f36425m = z11;
                op0Var2.f36426n.f(z11, true);
                op0Var2.f36430r.invalidate();
                if (i19 % i15 == i15 - 1) {
                    f14 += min + min3;
                    f13 = f12;
                } else {
                    f13 = min + min2 + f13;
                }
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.e = z10;
    }

    public void setDivider(boolean z10) {
        this.f36703r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
