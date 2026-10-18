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
public final class hp0 extends View {
    public final org.telegram.ui.ActionBar.d6 f37578a;
    public final Paint f37579b;
    public final int f37580c;
    public final int d;
    public boolean e;
    public gp0[] f37581f;
    public final int[] h;
    public final Paint f37582n;
    public boolean f37583r;
    public int f37584s;
    public Utilities.Callback v;
    public gp0 f37585w;

    public hp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f37579b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f37582n = new Paint(1);
        this.f37583r = true;
        this.f37584s = 0;
        this.f37580c = i10;
        this.d = i11;
        this.f37578a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f37584s = i10;
        if (this.f37581f != null) {
            int i11 = 0;
            while (true) {
                gp0[] gp0VarArr = this.f37581f;
                if (i11 < gp0VarArr.length) {
                    gp0 gp0Var = gp0VarArr[i11];
                    if (gp0Var.f37269o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    gp0Var.f37267m = z11;
                    if (!z10) {
                        gp0Var.f37268n.f(z11, true);
                    }
                    gp0Var.f37272r.invalidate();
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
        if (this.f37581f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f37580c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            gp0[] gp0VarArr = this.f37581f;
            if (i12 < gp0VarArr.length) {
                org.telegram.ui.ActionBar.d6 d6Var = this.f37578a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    gp0 gp0Var = gp0VarArr[i12];
                    int i13 = iArr[i12];
                    gp0Var.f37269o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gp0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.h6.f20969c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.h6.f21245r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                    gp0Var.f37262g = false;
                    gp0Var.f37261f = false;
                    gp0Var.f37258a.setColor(w02);
                } else if (i12 < 7 && i11 == 1) {
                    gp0 gp0Var2 = gp0VarArr[i12];
                    int i14 = iArr[i12];
                    gp0Var2.f37269o = i14;
                    int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21245r8[i14], d6Var);
                    gp0Var2.f37262g = false;
                    gp0Var2.f37261f = false;
                    gp0Var2.f37258a.setColor(w03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f37581f[i12].f37269o = peerColors.colors.get(i12).f17800id;
                    this.f37581f[i12].a(peerColors.colors.get(i12));
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
        if (this.f37581f != null) {
            int i10 = 0;
            while (true) {
                gp0[] gp0VarArr = this.f37581f;
                if (i10 >= gp0VarArr.length) {
                    break;
                }
                gp0 gp0Var = gp0VarArr[i10];
                hp0 hp0Var = gp0Var.f37272r;
                Path path = gp0Var.e;
                canvas.save();
                float a2 = gp0Var.f37266l.a(0.05f);
                RectF rectF = gp0Var.f37270p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = gp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(gp0Var.f37258a);
                if (gp0Var.f37261f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, gp0Var.f37259b);
                }
                canvas.restore();
                if (gp0Var.f37262g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), gp0Var.f37260c);
                    canvas.restore();
                }
                float e = gp0Var.f37268n.e(gp0Var.f37267m);
                if (e > 0.0f) {
                    Paint paint = hp0Var.f37579b;
                    Paint paint2 = hp0Var.f37579b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, hp0Var.f37578a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (gp0Var.h) {
                    if (hp0Var.e) {
                        if (gp0Var.f37265k == null) {
                            Drawable drawable = hp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            gp0Var.f37265k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        gp0Var.f37265k.setBounds((int) org.telegram.messenger.lk.x(gp0Var.f37265k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.lk.x(gp0Var.f37265k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.d(gp0Var.f37265k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.d(gp0Var.f37265k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        gp0Var.f37265k.draw(canvas);
                    } else {
                        if (gp0Var.f37263i == null) {
                            gp0Var.f37263i = new Path();
                        }
                        if (gp0Var.f37264j == null) {
                            Paint paint3 = new Paint(1);
                            gp0Var.f37264j = paint3;
                            paint3.setColor(-1);
                            gp0Var.f37264j.setStyle(Paint.Style.STROKE);
                            gp0Var.f37264j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        gp0Var.f37264j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        gp0Var.f37263i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        gp0Var.f37263i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        gp0Var.f37263i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        gp0Var.f37263i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        gp0Var.f37263i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(gp0Var.f37263i, gp0Var.f37264j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f37583r) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987d7, this.f37578a);
            Paint paint4 = this.f37582n;
            paint4.setColor(w02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f37584s;
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
        int i14 = this.f37580c;
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
        gp0[] gp0VarArr = this.f37581f;
        if (gp0VarArr == null || gp0VarArr.length != size) {
            this.f37581f = new gp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f37581f[i17] = new gp0(this);
                if (i14 == i16) {
                    gp0 gp0Var = this.f37581f[i17];
                    int i18 = this.h[i17];
                    gp0Var.f37269o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gp0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.h6.f20969c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.h6.f21245r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i13, this.f37578a);
                    gp0Var.f37262g = false;
                    gp0Var.f37261f = false;
                    gp0Var.f37258a.setColor(w02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f37581f[i17].f37269o = peerColors.colors.get(i17).f17800id;
                    this.f37581f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f37581f != null) {
            int i19 = 0;
            float f13 = f12;
            float f14 = min3;
            while (i19 < this.f37581f.length) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f37581f[i19].f37270p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f37581f[i19].f37271q.set(rectF);
                gp0 gp0Var2 = this.f37581f[i19];
                if (gp0Var2.f37269o == this.f37584s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                gp0Var2.f37267m = z11;
                boolean z13 = z12;
                gp0Var2.f37268n.f(z11, z13);
                gp0Var2.f37272r.invalidate();
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
        this.f37583r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
