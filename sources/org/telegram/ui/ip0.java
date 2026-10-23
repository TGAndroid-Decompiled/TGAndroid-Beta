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
public final class ip0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f38331a;
    public final Paint f38332b;
    public final int f38333c;
    public final int d;
    public boolean e;
    public hp0[] f38334f;
    public final int[] h;
    public final Paint f38335n;
    public boolean f38336r;
    public int f38337s;
    public Utilities.Callback v;
    public hp0 f38338w;

    public ip0(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f38332b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f38335n = new Paint(1);
        this.f38336r = true;
        this.f38337s = 0;
        this.f38333c = i10;
        this.d = i11;
        this.f38331a = g6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f38337s = i10;
        if (this.f38334f != null) {
            int i11 = 0;
            while (true) {
                hp0[] hp0VarArr = this.f38334f;
                if (i11 < hp0VarArr.length) {
                    hp0 hp0Var = hp0VarArr[i11];
                    if (hp0Var.f37902o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    hp0Var.f37900m = z11;
                    if (!z10) {
                        hp0Var.f37901n.f(z11, true);
                    }
                    hp0Var.f37905r.invalidate();
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f38334f != null) {
            int i10 = 0;
            while (true) {
                hp0[] hp0VarArr = this.f38334f;
                if (i10 >= hp0VarArr.length) {
                    break;
                }
                hp0 hp0Var = hp0VarArr[i10];
                ip0 ip0Var = hp0Var.f37905r;
                Path path = hp0Var.e;
                canvas.save();
                float a2 = hp0Var.f37899l.a(0.05f);
                RectF rectF = hp0Var.f37903p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = hp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(hp0Var.f37891a);
                if (hp0Var.f37894f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, hp0Var.f37892b);
                }
                canvas.restore();
                if (hp0Var.f37895g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), hp0Var.f37893c);
                    canvas.restore();
                }
                float e = hp0Var.f37901n.e(hp0Var.f37900m);
                if (e > 0.0f) {
                    Paint paint = ip0Var.f38332b;
                    Paint paint2 = ip0Var.f38332b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, ip0Var.f38331a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (hp0Var.h) {
                    if (ip0Var.e) {
                        if (hp0Var.f37898k == null) {
                            Drawable drawable = ip0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            hp0Var.f37898k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        hp0Var.f37898k.setBounds((int) org.telegram.messenger.sl.x(hp0Var.f37898k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.sl.x(hp0Var.f37898k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.d(hp0Var.f37898k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.d(hp0Var.f37898k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        hp0Var.f37898k.draw(canvas);
                    } else {
                        if (hp0Var.f37896i == null) {
                            hp0Var.f37896i = new Path();
                        }
                        if (hp0Var.f37897j == null) {
                            Paint paint3 = new Paint(1);
                            hp0Var.f37897j = paint3;
                            paint3.setColor(-1);
                            hp0Var.f37897j.setStyle(Paint.Style.STROKE);
                            hp0Var.f37897j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        hp0Var.f37897j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        hp0Var.f37896i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        hp0Var.f37896i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        hp0Var.f37896i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        hp0Var.f37896i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        hp0Var.f37896i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(hp0Var.f37896i, hp0Var.f37897j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f38336r) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d7, this.f38331a);
            Paint paint4 = this.f38335n;
            paint4.setColor(w02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ip0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f38337s;
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
        int i14 = this.f38333c;
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
        hp0[] hp0VarArr = this.f38334f;
        if (hp0VarArr == null || hp0VarArr.length != size) {
            this.f38334f = new hp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f38334f[i17] = new hp0(this);
                if (i14 == i16) {
                    hp0 hp0Var = this.f38334f[i17];
                    int i18 = this.h[i17];
                    hp0Var.f37902o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hp0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.k6.f21166c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.k6.f21442r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i13, this.f38331a);
                    hp0Var.f37895g = false;
                    hp0Var.f37894f = false;
                    hp0Var.f37891a.setColor(w02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f38334f[i17].f37902o = peerColors.colors.get(i17).f17864id;
                    this.f38334f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f38334f != null) {
            int i19 = 0;
            float f13 = f12;
            float f14 = min3;
            while (i19 < this.f38334f.length) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f38334f[i19].f37903p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f38334f[i19].f37904q.set(rectF);
                hp0 hp0Var2 = this.f38334f[i19];
                if (hp0Var2.f37902o == this.f38337s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                hp0Var2.f37900m = z11;
                boolean z13 = z12;
                hp0Var2.f37901n.f(z11, z13);
                hp0Var2.f37905r.invalidate();
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
        this.f38336r = z10;
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
        if (this.f38334f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f38333c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            hp0[] hp0VarArr = this.f38334f;
            if (i12 < hp0VarArr.length) {
                org.telegram.ui.ActionBar.g6 g6Var = this.f38331a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    hp0 hp0Var = hp0VarArr[i12];
                    int i13 = iArr[i12];
                    hp0Var.f37902o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hp0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.k6.f21166c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.k6.f21442r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                    hp0Var.f37895g = false;
                    hp0Var.f37894f = false;
                    hp0Var.f37891a.setColor(w02);
                } else if (i12 < 7 && i11 == 1) {
                    hp0 hp0Var2 = hp0VarArr[i12];
                    int i14 = iArr[i12];
                    hp0Var2.f37902o = i14;
                    int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21442r8[i14], g6Var);
                    hp0Var2.f37895g = false;
                    hp0Var2.f37894f = false;
                    hp0Var2.f37891a.setColor(w03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f38334f[i12].f37902o = peerColors.colors.get(i12).f17864id;
                    this.f38334f[i12].a(peerColors.colors.get(i12));
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
