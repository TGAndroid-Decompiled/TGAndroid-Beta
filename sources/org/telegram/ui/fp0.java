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
public final class fp0 extends View {
    public final org.telegram.ui.ActionBar.d6 f37051a;
    public final Paint f37052b;
    public final int f37053c;
    public final int d;
    public boolean e;
    public ep0[] f37054f;
    public final int[] h;
    public final Paint f37055n;
    public boolean f37056r;
    public int f37057s;
    public Utilities.Callback v;
    public ep0 f37058w;

    public fp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f37052b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f37055n = new Paint(1);
        this.f37056r = true;
        this.f37057s = 0;
        this.f37053c = i10;
        this.d = i11;
        this.f37051a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f37057s = i10;
        if (this.f37054f != null) {
            int i11 = 0;
            while (true) {
                ep0[] ep0VarArr = this.f37054f;
                if (i11 < ep0VarArr.length) {
                    ep0 ep0Var = ep0VarArr[i11];
                    if (ep0Var.f36752o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ep0Var.f36750m = z11;
                    if (!z10) {
                        ep0Var.f36751n.f(z11, true);
                    }
                    ep0Var.f36755r.invalidate();
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
        if (this.f37054f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f37053c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            ep0[] ep0VarArr = this.f37054f;
            if (i12 < ep0VarArr.length) {
                org.telegram.ui.ActionBar.d6 d6Var = this.f37051a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    ep0 ep0Var = ep0VarArr[i12];
                    int i13 = iArr[i12];
                    ep0Var.f36752o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ep0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.h6.f20973c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.h6.f21249r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                    ep0Var.f36745g = false;
                    ep0Var.f36744f = false;
                    ep0Var.f36741a.setColor(w02);
                } else if (i12 < 7 && i11 == 1) {
                    ep0 ep0Var2 = ep0VarArr[i12];
                    int i14 = iArr[i12];
                    ep0Var2.f36752o = i14;
                    int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21249r8[i14], d6Var);
                    ep0Var2.f36745g = false;
                    ep0Var2.f36744f = false;
                    ep0Var2.f36741a.setColor(w03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f37054f[i12].f36752o = peerColors.colors.get(i12).f17801id;
                    this.f37054f[i12].a(peerColors.colors.get(i12));
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
        if (this.f37054f != null) {
            int i10 = 0;
            while (true) {
                ep0[] ep0VarArr = this.f37054f;
                if (i10 >= ep0VarArr.length) {
                    break;
                }
                ep0 ep0Var = ep0VarArr[i10];
                fp0 fp0Var = ep0Var.f36755r;
                Path path = ep0Var.e;
                canvas.save();
                float a2 = ep0Var.f36749l.a(0.05f);
                RectF rectF = ep0Var.f36753p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = ep0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(ep0Var.f36741a);
                if (ep0Var.f36744f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, ep0Var.f36742b);
                }
                canvas.restore();
                if (ep0Var.f36745g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), ep0Var.f36743c);
                    canvas.restore();
                }
                float e = ep0Var.f36751n.e(ep0Var.f36750m);
                if (e > 0.0f) {
                    Paint paint = fp0Var.f37052b;
                    Paint paint2 = fp0Var.f37052b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20990d6, fp0Var.f37051a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (ep0Var.h) {
                    if (fp0Var.e) {
                        if (ep0Var.f36748k == null) {
                            Drawable drawable = fp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            ep0Var.f36748k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        ep0Var.f36748k.setBounds((int) org.telegram.messenger.mk.x(ep0Var.f36748k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.mk.x(ep0Var.f36748k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.d(ep0Var.f36748k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.d(ep0Var.f36748k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        ep0Var.f36748k.draw(canvas);
                    } else {
                        if (ep0Var.f36746i == null) {
                            ep0Var.f36746i = new Path();
                        }
                        if (ep0Var.f36747j == null) {
                            Paint paint3 = new Paint(1);
                            ep0Var.f36747j = paint3;
                            paint3.setColor(-1);
                            ep0Var.f36747j.setStyle(Paint.Style.STROKE);
                            ep0Var.f36747j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        ep0Var.f36747j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        ep0Var.f36746i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        ep0Var.f36746i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        ep0Var.f36746i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        ep0Var.f36746i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        ep0Var.f36746i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(ep0Var.f36746i, ep0Var.f36747j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f37056r) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20991d7, this.f37051a);
            Paint paint4 = this.f37055n;
            paint4.setColor(w02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f37057s;
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
        int i14 = this.f37053c;
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
        ep0[] ep0VarArr = this.f37054f;
        if (ep0VarArr == null || ep0VarArr.length != size) {
            this.f37054f = new ep0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f37054f[i17] = new ep0(this);
                if (i14 == i16) {
                    ep0 ep0Var = this.f37054f[i17];
                    int i18 = this.h[i17];
                    ep0Var.f36752o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ep0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.h6.f20973c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.h6.f21249r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i13, this.f37051a);
                    ep0Var.f36745g = false;
                    ep0Var.f36744f = false;
                    ep0Var.f36741a.setColor(w02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f37054f[i17].f36752o = peerColors.colors.get(i17).f17801id;
                    this.f37054f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f37054f != null) {
            int i19 = 0;
            float f13 = f12;
            float f14 = min3;
            while (i19 < this.f37054f.length) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f37054f[i19].f36753p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f37054f[i19].f36754q.set(rectF);
                ep0 ep0Var2 = this.f37054f[i19];
                if (ep0Var2.f36752o == this.f37057s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                ep0Var2.f36750m = z11;
                boolean z13 = z12;
                ep0Var2.f36751n.f(z11, z13);
                ep0Var2.f36755r.invalidate();
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
        this.f37056r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
