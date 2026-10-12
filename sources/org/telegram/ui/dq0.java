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
public final class dq0 extends View {
    public final org.telegram.ui.ActionBar.c6 f35366a;
    public final Paint f35367b;
    public final int f35368c;
    public final int d;
    public boolean e;
    public cq0[] f35369f;
    public final int[] h;
    public final Paint f35370n;
    public boolean f35371r;
    public int f35372s;
    public Utilities.Callback v;
    public cq0 f35373w;

    public dq0(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f35367b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f35370n = new Paint(1);
        this.f35371r = true;
        this.f35372s = 0;
        this.f35368c = i10;
        this.d = i11;
        this.f35366a = c6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f35372s = i10;
        if (this.f35369f != null) {
            int i11 = 0;
            while (true) {
                cq0[] cq0VarArr = this.f35369f;
                if (i11 < cq0VarArr.length) {
                    cq0 cq0Var = cq0VarArr[i11];
                    if (cq0Var.f35049o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cq0Var.f35047m = z11;
                    if (!z10) {
                        cq0Var.f35048n.f(z11, true);
                    }
                    cq0Var.f35052r.invalidate();
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
        if (this.f35369f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f35368c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            cq0[] cq0VarArr = this.f35369f;
            if (i12 < cq0VarArr.length) {
                org.telegram.ui.ActionBar.c6 c6Var = this.f35366a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    cq0 cq0Var = cq0VarArr[i12];
                    int i13 = iArr[i12];
                    cq0Var.f35049o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cq0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.g6.f19884c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.g6.f20160r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
                    cq0Var.f35042g = false;
                    cq0Var.f35041f = false;
                    cq0Var.f35038a.setColor(w02);
                } else if (i12 < 7 && i11 == 1) {
                    cq0 cq0Var2 = cq0VarArr[i12];
                    int i14 = iArr[i12];
                    cq0Var2.f35049o = i14;
                    int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20160r8[i14], c6Var);
                    cq0Var2.f35042g = false;
                    cq0Var2.f35041f = false;
                    cq0Var2.f35038a.setColor(w03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f35369f[i12].f35049o = peerColors.colors.get(i12).f16710id;
                    this.f35369f[i12].a(peerColors.colors.get(i12));
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
        if (this.f35369f != null) {
            int i10 = 0;
            while (true) {
                cq0[] cq0VarArr = this.f35369f;
                if (i10 >= cq0VarArr.length) {
                    break;
                }
                cq0 cq0Var = cq0VarArr[i10];
                dq0 dq0Var = cq0Var.f35052r;
                Path path = cq0Var.e;
                canvas.save();
                float a2 = cq0Var.f35046l.a(0.05f);
                RectF rectF = cq0Var.f35050p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = cq0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(cq0Var.f35038a);
                if (cq0Var.f35041f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, cq0Var.f35039b);
                }
                canvas.restore();
                if (cq0Var.f35042g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), cq0Var.f35040c);
                    canvas.restore();
                }
                float e = cq0Var.f35048n.e(cq0Var.f35047m);
                if (e > 0.0f) {
                    Paint paint = dq0Var.f35367b;
                    Paint paint2 = dq0Var.f35367b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, dq0Var.f35366a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (cq0Var.h) {
                    if (dq0Var.e) {
                        if (cq0Var.f35045k == null) {
                            Drawable drawable = dq0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            cq0Var.f35045k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        cq0Var.f35045k.setBounds((int) org.telegram.messenger.yh.b(cq0Var.f35045k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.yh.b(cq0Var.f35045k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.d(cq0Var.f35045k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.d(cq0Var.f35045k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        cq0Var.f35045k.draw(canvas);
                    } else {
                        if (cq0Var.f35043i == null) {
                            cq0Var.f35043i = new Path();
                        }
                        if (cq0Var.f35044j == null) {
                            Paint paint3 = new Paint(1);
                            cq0Var.f35044j = paint3;
                            paint3.setColor(-1);
                            cq0Var.f35044j.setStyle(Paint.Style.STROKE);
                            cq0Var.f35044j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        cq0Var.f35044j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        cq0Var.f35043i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        cq0Var.f35043i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        cq0Var.f35043i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        cq0Var.f35043i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        cq0Var.f35043i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(cq0Var.f35043i, cq0Var.f35044j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f35371r) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19902d7, this.f35366a);
            Paint paint4 = this.f35370n;
            paint4.setColor(w02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dq0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f35372s;
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
        int i14 = this.f35368c;
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
        cq0[] cq0VarArr = this.f35369f;
        if (cq0VarArr == null || cq0VarArr.length != size) {
            this.f35369f = new cq0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f35369f[i17] = new cq0(this);
                if (i14 == i16) {
                    cq0 cq0Var = this.f35369f[i17];
                    int i18 = this.h[i17];
                    cq0Var.f35049o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cq0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.g6.f19884c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.g6.f20160r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.g6.w0(i13, this.f35366a);
                    cq0Var.f35042g = false;
                    cq0Var.f35041f = false;
                    cq0Var.f35038a.setColor(w02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f35369f[i17].f35049o = peerColors.colors.get(i17).f16710id;
                    this.f35369f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f35369f != null) {
            int i19 = 0;
            float f13 = f12;
            float f14 = min3;
            while (i19 < this.f35369f.length) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f35369f[i19].f35050p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f35369f[i19].f35051q.set(rectF);
                cq0 cq0Var2 = this.f35369f[i19];
                if (cq0Var2.f35049o == this.f35372s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                cq0Var2.f35047m = z11;
                boolean z13 = z12;
                cq0Var2.f35048n.f(z11, z13);
                cq0Var2.f35052r.invalidate();
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
        this.f35371r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
