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
public final class ep0 extends View {
    public final org.telegram.ui.ActionBar.f6 f34061a;
    public final Paint f34062b;
    public final int f34063c;
    public final int d;
    public boolean e;
    public dp0[] f34064f;
    public final int[] h;
    public final Paint f34065n;
    public boolean f34066r;
    public int f34067s;
    public Utilities.Callback v;
    public dp0 f34068w;

    public ep0(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f34062b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f34065n = new Paint(1);
        this.f34066r = true;
        this.f34067s = 0;
        this.f34063c = i10;
        this.d = i11;
        this.f34061a = f6Var;
    }

    public final void a(int i10, boolean z4) {
        boolean z10;
        this.f34067s = i10;
        if (this.f34064f != null) {
            int i11 = 0;
            while (true) {
                dp0[] dp0VarArr = this.f34064f;
                if (i11 < dp0VarArr.length) {
                    dp0 dp0Var = dp0VarArr[i11];
                    if (dp0Var.f33783o == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dp0Var.f33781m = z10;
                    if (!z4) {
                        dp0Var.f33782n.f(z10, true);
                    }
                    dp0Var.f33786r.invalidate();
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
        if (this.f34064f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f34063c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            dp0[] dp0VarArr = this.f34064f;
            if (i12 < dp0VarArr.length) {
                org.telegram.ui.ActionBar.f6 f6Var = this.f34061a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    dp0 dp0Var = dp0VarArr[i12];
                    int i13 = iArr[i12];
                    dp0Var.f33783o = i13;
                    if (i13 < 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    dp0Var.h = z4;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.j6.f19890c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.j6.f20160r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    dp0Var.f33776g = false;
                    dp0Var.f33775f = false;
                    dp0Var.f33772a.setColor(v02);
                } else if (i12 < 7 && i11 == 1) {
                    dp0 dp0Var2 = dp0VarArr[i12];
                    int i14 = iArr[i12];
                    dp0Var2.f33783o = i14;
                    int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20160r8[i14], f6Var);
                    dp0Var2.f33776g = false;
                    dp0Var2.f33775f = false;
                    dp0Var2.f33772a.setColor(v03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f34064f[i12].f33783o = peerColors.colors.get(i12).f16671id;
                    this.f34064f[i12].a(peerColors.colors.get(i12));
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
        if (this.f34064f != null) {
            int i10 = 0;
            while (true) {
                dp0[] dp0VarArr = this.f34064f;
                if (i10 >= dp0VarArr.length) {
                    break;
                }
                dp0 dp0Var = dp0VarArr[i10];
                ep0 ep0Var = dp0Var.f33786r;
                Path path = dp0Var.e;
                canvas.save();
                float a2 = dp0Var.f33780l.a(0.05f);
                RectF rectF = dp0Var.f33784p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = dp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(dp0Var.f33772a);
                if (dp0Var.f33775f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, dp0Var.f33773b);
                }
                canvas.restore();
                if (dp0Var.f33776g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), dp0Var.f33774c);
                    canvas.restore();
                }
                float e = dp0Var.f33782n.e(dp0Var.f33781m);
                if (e > 0.0f) {
                    Paint paint = ep0Var.f34062b;
                    Paint paint2 = ep0Var.f34062b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, ep0Var.f34061a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (dp0Var.h) {
                    if (ep0Var.e) {
                        if (dp0Var.f33779k == null) {
                            Drawable drawable = ep0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            dp0Var.f33779k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        dp0Var.f33779k.setBounds((int) org.telegram.messenger.y3.A(dp0Var.f33779k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.y3.A(dp0Var.f33779k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) vh.v2.c(dp0Var.f33779k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) vh.v2.c(dp0Var.f33779k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        dp0Var.f33779k.draw(canvas);
                    } else {
                        if (dp0Var.f33777i == null) {
                            dp0Var.f33777i = new Path();
                        }
                        if (dp0Var.f33778j == null) {
                            Paint paint3 = new Paint(1);
                            dp0Var.f33778j = paint3;
                            paint3.setColor(-1);
                            dp0Var.f33778j.setStyle(Paint.Style.STROKE);
                            dp0Var.f33778j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        dp0Var.f33778j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        dp0Var.f33777i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        dp0Var.f33777i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        dp0Var.f33777i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        dp0Var.f33777i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        dp0Var.f33777i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(dp0Var.f33777i, dp0Var.f33778j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f34066r) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19907d7, this.f34061a);
            Paint paint4 = this.f34065n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ep0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f34067s;
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
        int i14 = this.f34063c;
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
        dp0[] dp0VarArr = this.f34064f;
        if (dp0VarArr == null || dp0VarArr.length != size) {
            this.f34064f = new dp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f34064f[i17] = new dp0(this);
                if (i14 == i16) {
                    dp0 dp0Var = this.f34064f[i17];
                    int i18 = this.h[i17];
                    dp0Var.f33783o = i18;
                    if (i18 < 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    dp0Var.h = z4;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.j6.f19890c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.j6.f20160r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i13, this.f34061a);
                    dp0Var.f33776g = false;
                    dp0Var.f33775f = false;
                    dp0Var.f33772a.setColor(v02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f34064f[i17].f33783o = peerColors.colors.get(i17).f16671id;
                    this.f34064f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f34064f != null) {
            float f14 = f13;
            float f15 = min3;
            for (int i19 = 0; i19 < this.f34064f.length; i19++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f34064f[i19].f33784p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f34064f[i19].f33785q.set(rectF);
                dp0 dp0Var2 = this.f34064f[i19];
                if (dp0Var2.f33783o == this.f34067s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dp0Var2.f33781m = z10;
                dp0Var2.f33782n.f(z10, true);
                dp0Var2.f33786r.invalidate();
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
        this.e = z4;
    }

    public void setDivider(boolean z4) {
        this.f34066r = z4;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
