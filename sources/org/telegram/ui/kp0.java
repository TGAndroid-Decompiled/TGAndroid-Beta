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
public final class kp0 extends View {
    public final org.telegram.ui.ActionBar.f6 f35566a;
    public final Paint f35567b;
    public final int f35568c;
    public final int d;
    public boolean e;
    public jp0[] f35569f;
    public final int[] h;
    public final Paint f35570n;
    public boolean f35571r;
    public int f35572s;
    public Utilities.Callback v;
    public jp0 f35573w;

    public kp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f35567b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f35570n = new Paint(1);
        this.f35571r = true;
        this.f35572s = 0;
        this.f35568c = i10;
        this.d = i11;
        this.f35566a = f6Var;
    }

    public final void a(int i10, boolean z4) {
        boolean z10;
        this.f35572s = i10;
        if (this.f35569f != null) {
            int i11 = 0;
            while (true) {
                jp0[] jp0VarArr = this.f35569f;
                if (i11 < jp0VarArr.length) {
                    jp0 jp0Var = jp0VarArr[i11];
                    if (jp0Var.f35344o == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jp0Var.f35342m = z10;
                    if (!z4) {
                        jp0Var.f35343n.f(z10, true);
                    }
                    jp0Var.f35347r.invalidate();
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
        if (this.f35569f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f35568c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            jp0[] jp0VarArr = this.f35569f;
            if (i12 < jp0VarArr.length) {
                org.telegram.ui.ActionBar.f6 f6Var = this.f35566a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    jp0 jp0Var = jp0VarArr[i12];
                    int i13 = iArr[i12];
                    jp0Var.f35344o = i13;
                    if (i13 < 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    jp0Var.h = z4;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.j6.f19865c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.j6.f20134r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    jp0Var.f35337g = false;
                    jp0Var.f35336f = false;
                    jp0Var.f35333a.setColor(v02);
                } else if (i12 < 7 && i11 == 1) {
                    jp0 jp0Var2 = jp0VarArr[i12];
                    int i14 = iArr[i12];
                    jp0Var2.f35344o = i14;
                    int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20134r8[i14], f6Var);
                    jp0Var2.f35337g = false;
                    jp0Var2.f35336f = false;
                    jp0Var2.f35333a.setColor(v03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f35569f[i12].f35344o = peerColors.colors.get(i12).f16651id;
                    this.f35569f[i12].a(peerColors.colors.get(i12));
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
        if (this.f35569f != null) {
            int i10 = 0;
            while (true) {
                jp0[] jp0VarArr = this.f35569f;
                if (i10 >= jp0VarArr.length) {
                    break;
                }
                jp0 jp0Var = jp0VarArr[i10];
                kp0 kp0Var = jp0Var.f35347r;
                Path path = jp0Var.e;
                canvas.save();
                float a2 = jp0Var.f35341l.a(0.05f);
                RectF rectF = jp0Var.f35345p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = jp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(jp0Var.f35333a);
                if (jp0Var.f35336f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, jp0Var.f35334b);
                }
                canvas.restore();
                if (jp0Var.f35337g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), jp0Var.f35335c);
                    canvas.restore();
                }
                float e = jp0Var.f35343n.e(jp0Var.f35342m);
                if (e > 0.0f) {
                    Paint paint = kp0Var.f35567b;
                    Paint paint2 = kp0Var.f35567b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, kp0Var.f35566a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (jp0Var.h) {
                    if (kp0Var.e) {
                        if (jp0Var.f35340k == null) {
                            Drawable drawable = kp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            jp0Var.f35340k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        jp0Var.f35340k.setBounds((int) org.telegram.messenger.y3.A(jp0Var.f35340k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.y3.A(jp0Var.f35340k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) vh.w2.c(jp0Var.f35340k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) vh.w2.c(jp0Var.f35340k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        jp0Var.f35340k.draw(canvas);
                    } else {
                        if (jp0Var.f35338i == null) {
                            jp0Var.f35338i = new Path();
                        }
                        if (jp0Var.f35339j == null) {
                            Paint paint3 = new Paint(1);
                            jp0Var.f35339j = paint3;
                            paint3.setColor(-1);
                            jp0Var.f35339j.setStyle(Paint.Style.STROKE);
                            jp0Var.f35339j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        jp0Var.f35339j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        jp0Var.f35338i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        jp0Var.f35338i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        jp0Var.f35338i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        jp0Var.f35338i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        jp0Var.f35338i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(jp0Var.f35338i, jp0Var.f35339j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f35571r) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19882d7, this.f35566a);
            Paint paint4 = this.f35570n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f35572s;
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
        int i14 = this.f35568c;
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
        jp0[] jp0VarArr = this.f35569f;
        if (jp0VarArr == null || jp0VarArr.length != size) {
            this.f35569f = new jp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f35569f[i17] = new jp0(this);
                if (i14 == i16) {
                    jp0 jp0Var = this.f35569f[i17];
                    int i18 = this.h[i17];
                    jp0Var.f35344o = i18;
                    if (i18 < 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    jp0Var.h = z4;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.j6.f19865c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.j6.f20134r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i13, this.f35566a);
                    jp0Var.f35337g = false;
                    jp0Var.f35336f = false;
                    jp0Var.f35333a.setColor(v02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f35569f[i17].f35344o = peerColors.colors.get(i17).f16651id;
                    this.f35569f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f35569f != null) {
            float f14 = f13;
            float f15 = min3;
            for (int i19 = 0; i19 < this.f35569f.length; i19++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f35569f[i19].f35345p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f35569f[i19].f35346q.set(rectF);
                jp0 jp0Var2 = this.f35569f[i19];
                if (jp0Var2.f35344o == this.f35572s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jp0Var2.f35342m = z10;
                jp0Var2.f35343n.f(z10, true);
                jp0Var2.f35347r.invalidate();
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
        this.f35571r = z4;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
