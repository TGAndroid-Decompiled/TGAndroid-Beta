package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.yc;
public final class l4 {
    public int A;
    public int B;
    public boolean C;
    public final u1 f20593a;
    public j4 f20594b;
    public int d;
    public int e;
    public int f20596f;
    public int f20597g;
    public int h;
    public boolean f20598i;
    public final org.telegram.ui.Components.d6 f20599j;
    public o90 f20600k;
    public final vh.g f20601l;
    public int f20602m;
    public final yc f20603n;
    public k4 f20604o;
    public boolean f20605p;
    public u01 f20606q;
    public u01 f20607r;
    public long f20608s;
    public Bitmap f20611w;
    public Paint f20612x;
    public int f20613y;
    public int f20614z;
    public final ArrayList f20595c = new ArrayList();
    public final Path f20609t = new Path();
    public final Path f20610u = new Path();
    public final RectF v = new RectF();

    public l4(u1 u1Var) {
        this.f20593a = u1Var;
        this.f20601l = vh.g.e(u1Var);
        this.f20599j = new org.telegram.ui.Components.d6(u1Var, 0L, 350L, qr.h);
        this.f20603n = new yc(u1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f20595c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((k4) obj).f20537f.getVisible()) {
                return false;
            }
        }
        return true;
    }

    public final void b(Canvas canvas) {
        ArrayList arrayList;
        u1 u1Var;
        RectF rectF;
        Path path;
        Path path2;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int a2;
        int max;
        Canvas canvas2 = canvas;
        if (this.f20594b != null) {
            boolean z10 = this.f20598i;
            org.telegram.ui.Components.d6 d6Var = this.f20599j;
            float e = d6Var.e(z10);
            float e7 = d6Var.e(this.f20598i);
            u1 u1Var2 = this.f20593a;
            MessageObject messageObject = u1Var2.getMessageObject();
            Path path3 = this.f20610u;
            path3.rewind();
            float f14 = Float.MAX_VALUE;
            float f15 = Float.MAX_VALUE;
            float f16 = Float.MIN_VALUE;
            float f17 = Float.MIN_VALUE;
            int i10 = 0;
            while (true) {
                arrayList = this.f20595c;
                if (i10 >= arrayList.size()) {
                    break;
                }
                k4 k4Var = (k4) arrayList.get(i10);
                ImageReceiver imageReceiver = k4Var.f20537f;
                RadialProgress2 radialProgress2 = k4Var.G;
                int i11 = this.d;
                int i12 = k4Var.f20534a;
                float f18 = e;
                int i13 = this.e;
                int i14 = k4Var.f20535b;
                float f19 = e7;
                u1 u1Var3 = u1Var2;
                imageReceiver.setImageCoords(i11 + i12, i13 + i14, k4Var.f20536c - i12, k4Var.d - i14);
                imageReceiver.draw(canvas2);
                if (imageReceiver.getAnimation() != null) {
                    imageReceiver.getAnimation().getClass();
                    int round = Math.round(((float) 0) / 1000.0f);
                    if (!k4Var.f20542x && k4Var.K != (max = Math.max(0, k4Var.J - round))) {
                        k4Var.K = max;
                        k4Var.L = new u01(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                    }
                }
                if (f19 > 0.0f) {
                    float min = Math.min(this.d + k4Var.f20534a, f15);
                    float min2 = Math.min(this.e + k4Var.f20535b, f14);
                    f17 = Math.max(this.d + k4Var.f20536c, f17);
                    f16 = Math.max(this.e + k4Var.d, f16);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i15 = this.d;
                    int i16 = this.e;
                    rectF2.set(k4Var.f20534a + i15, k4Var.f20535b + i16, i15 + k4Var.f20536c, i16 + k4Var.d);
                    path3.addRoundRect(rectF2, k4Var.f20540s, Path.Direction.CW);
                    f14 = min2;
                    f15 = min;
                }
                radialProgress2.g(org.telegram.ui.ActionBar.j6.f19248le, org.telegram.ui.ActionBar.j6.f19267me, org.telegram.ui.ActionBar.j6.ne, org.telegram.ui.ActionBar.j6.f19303oe);
                RectF rectF3 = radialProgress2.f22346a;
                float f20 = f14;
                rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.f22365x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.f22365x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.f22365x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.f22365x + imageReceiver.getImageY());
                if (messageObject.isSending()) {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                    long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(k4Var.F);
                    boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                    if (fileProgressSizes == null && isSendingPaidMessage) {
                        radialProgress2.o(1.0f, true);
                        if (k4Var.f20541w) {
                            a2 = 6;
                        } else {
                            a2 = k4Var.a();
                        }
                        k4Var.b(a2);
                    }
                } else if (FileLoader.getInstance(messageObject.currentAccount).isLoadingFile(k4Var.v)) {
                    k4Var.b(3);
                } else {
                    k4Var.b(k4Var.a());
                }
                canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f19) * 255.0f), 31);
                radialProgress2.draw(canvas2);
                canvas2.restore();
                i10++;
                f14 = f20;
                e = f18;
                u1Var2 = u1Var3;
                e7 = f19;
            }
            float f21 = e;
            float f22 = e7;
            u1 u1Var4 = u1Var2;
            if (f22 > 0.0f) {
                canvas2.save();
                canvas2.clipPath(path3);
                canvas2.translate(f15, f14);
                int i17 = (int) (f17 - f15);
                int i18 = (int) (f16 - f14);
                canvas2.saveLayerAlpha(0.0f, 0.0f, i17, i18, (int) (f22 * 255.0f), 31);
                this.f20601l.c(canvas, u1Var4, i17, i18, 1.0f, u1Var4.f21448pe);
                canvas2 = canvas;
                u1Var = u1Var4;
                canvas2.restore();
                canvas2.restore();
                u1Var.invalidate();
            } else {
                u1Var = u1Var4;
            }
            int i19 = 0;
            while (true) {
                int size = arrayList.size();
                rectF = this.v;
                path = this.f20609t;
                if (i19 >= size) {
                    break;
                }
                k4 k4Var2 = (k4) arrayList.get(i19);
                if (k4Var2.L != null) {
                    float dp = AndroidUtilities.dp(11.4f) + k4Var2.L.f28493c;
                    float dp2 = AndroidUtilities.dp(17.0f);
                    float dp3 = AndroidUtilities.dp(5.0f);
                    float f23 = this.d + k4Var2.f20534a + dp3;
                    float f24 = this.e + k4Var2.f20535b + dp3;
                    rectF.set(f23, f24, dp + f23, f24 + dp2);
                    if (this.f20607r == null || rectF.right <= ((this.d + this.f20597g) - (AndroidUtilities.dp(11.32f) + this.f20607r.f28493c)) - dp3 || rectF.top > this.e + dp3) {
                        path.rewind();
                        float f25 = dp2 / 2.0f;
                        path.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        f13 = f22;
                        c(canvas2, f13);
                        canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(1.0f, 1073741824));
                        k4Var2.L.c(this.d + k4Var2.f20534a + dp3 + AndroidUtilities.dp(5.66f), this.e + k4Var2.f20535b + dp3 + f25, 1.0f, -1, canvas2);
                        canvas2.restore();
                        i19++;
                        f22 = f13;
                    }
                }
                f13 = f22;
                i19++;
                f22 = f13;
            }
            if (this.f20606q != null && f21 > 0.0f) {
                float a10 = this.f20603n.a(0.05f);
                float dp4 = AndroidUtilities.dp(28.0f) + this.f20606q.f28493c;
                float dp5 = AndroidUtilities.dp(32.0f);
                float f26 = this.d;
                float f27 = this.f20597g;
                float A = com.google.android.gms.internal.vision.e2.A(f27, dp4, 2.0f, f26);
                f10 = 11.32f;
                float f28 = this.e;
                f11 = 5.0f;
                float f29 = this.h;
                f12 = 17.0f;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f29, dp5, 2.0f, f28), org.telegram.messenger.l0.a(f27, dp4, 2.0f, f26), org.telegram.messenger.l0.a(f29, dp5, 2.0f, f28));
                path.rewind();
                float f30 = dp5 / 2.0f;
                path.addRoundRect(rectF, f30, f30, Path.Direction.CW);
                canvas2.save();
                canvas2.scale(a10, a10, (this.f20597g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
                canvas2.save();
                canvas2.clipPath(path);
                f7 = f21;
                c(canvas2, f7);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(f7, 1342177280));
                path2 = path;
                this.f20606q.c((((this.f20597g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.e + (this.h / 2.0f), f7, -1, canvas2);
                canvas2.restore();
                if (u1Var.getDelegate() != null && u1Var.getDelegate().d1(5, u1Var)) {
                    o90 o90Var = this.f20600k;
                    if (o90Var == null) {
                        o90 o90Var2 = new o90();
                        this.f20600k = o90Var2;
                        o90Var2.setCallback(u1Var);
                        this.f20600k.f(org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.35f, -1), org.telegram.ui.ActionBar.j6.l1(0.8f, -1));
                        o90 o90Var3 = this.f20600k;
                        o90Var3.C = true;
                        o90Var3.f26860w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    } else if (o90Var.b() || this.f20600k.c()) {
                        o90 o90Var4 = this.f20600k;
                        o90Var4.f26843b = -1L;
                        o90Var4.f26844c = -1L;
                    }
                } else {
                    o90 o90Var5 = this.f20600k;
                    if (o90Var5 != null && !o90Var5.c() && !this.f20600k.b()) {
                        this.f20600k.a();
                    }
                }
                o90 o90Var6 = this.f20600k;
                if (o90Var6 != null) {
                    o90Var6.d(rectF);
                    this.f20600k.j(f30);
                    this.f20600k.setAlpha((int) (f7 * 255.0f));
                    this.f20600k.draw(canvas2);
                }
                canvas2.restore();
            } else {
                path2 = path;
                f7 = f21;
                f10 = 11.32f;
                f11 = 5.0f;
                f12 = 17.0f;
            }
            if (this.f20607r != null && f7 < 1.0f && a()) {
                float timeAlpha = u1Var.getTimeAlpha() * (1.0f - f7);
                float dp6 = AndroidUtilities.dp(f10) + this.f20607r.f28493c;
                float dp7 = AndroidUtilities.dp(f12);
                float dp8 = AndroidUtilities.dp(f11);
                float f31 = this.d + this.f20597g;
                float f32 = this.e + dp8;
                rectF.set((f31 - dp6) - dp8, f32, f31 - dp8, f32 + dp7);
                path2.rewind();
                float f33 = dp7 / 2.0f;
                path2.addRoundRect(rectF, f33, f33, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path2);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(timeAlpha, 1073741824));
                this.f20607r.c((((this.d + this.f20597g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.e + dp8 + f33, timeAlpha, -1, canvas2);
                canvas.restore();
            }
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        float f10;
        ArrayList arrayList;
        if (this.f20594b != null) {
            u1 u1Var = this.f20593a;
            if (u1Var.getMessageObject() != null) {
                i10 = u1Var.getMessageObject().getId();
            } else {
                i10 = 0;
            }
            int i11 = this.f20597g;
            int i12 = this.h;
            float f11 = 100.0f;
            if (i11 > i12) {
                f10 = 100.0f;
            } else {
                f10 = (i11 / i12) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f10);
            int i13 = this.h;
            int i14 = this.f20597g;
            if (i13 <= i14) {
                f11 = 100.0f * (i13 / i14);
            }
            int max2 = (int) Math.max(1.0f, f11);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                arrayList = this.f20595c;
                if (i15 >= arrayList.size()) {
                    break;
                }
                k4 k4Var = (k4) arrayList.get(i15);
                if (k4Var.f20537f.hasImageSet() && k4Var.f20537f.getBitmap() != null) {
                    i16 |= 1 << i15;
                }
                i15++;
            }
            Bitmap bitmap = this.f20611w;
            if (bitmap == null || this.f20614z != i10 || this.f20613y != i16 || this.A != max || this.B != max2) {
                this.f20613y = i16;
                this.f20614z = i10;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f20611w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f20611w);
                float f12 = max / this.f20597g;
                canvas2.scale(f12, f12);
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    k4 k4Var2 = (k4) arrayList.get(i17);
                    ImageReceiver imageReceiver = k4Var2.f20537f;
                    int i18 = k4Var2.f20534a;
                    int i19 = k4Var2.f20535b;
                    imageReceiver.setImageCoords(i18, i19, k4Var2.f20536c - i18, k4Var2.d - i19);
                    k4Var2.f20537f.draw(canvas2);
                }
                Utilities.stackBlurBitmap(this.f20611w, 12);
                if (this.f20612x == null) {
                    this.f20612x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f20612x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f20611w != null) {
                canvas.save();
                canvas.translate(this.d, this.e);
                canvas.scale(this.f20597g / this.f20611w.getWidth(), this.f20597g / this.f20611w.getWidth());
                this.f20612x.setAlpha((int) (f7 * 255.0f));
                canvas.drawBitmap(this.f20611w, 0.0f, 0.0f, this.f20612x);
                canvas.restore();
            }
        }
    }

    public final k4 d(float f7, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f20595c;
            if (i10 < arrayList.size()) {
                if (((k4) arrayList.get(i10)).f20537f.isInsideImage(f7, f10)) {
                    return (k4) arrayList.get(i10);
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final void e() {
        if (this.C) {
            this.C = false;
            vh.g gVar = this.f20601l;
            if (gVar != null) {
                gVar.a(this.f20593a);
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f20595c;
                if (i10 < arrayList.size()) {
                    k4 k4Var = (k4) arrayList.get(i10);
                    if (k4Var.M) {
                        k4Var.M = false;
                        k4Var.f20537f.onDetachedFromWindow();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z10;
        k4 k4Var;
        u1 u1Var;
        boolean z11;
        boolean z12;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            k4 d = d(x10, y3);
            this.f20604o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.G;
                if (radialProgress2.f22351i.f22626q != 4 && radialProgress2.f22346a.contains(x10, y3)) {
                    z12 = true;
                    this.f20605p = z12;
                }
            }
            z12 = false;
            this.f20605p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            k4 d10 = d(x10, y3);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.G;
                if (radialProgress22.f22351i.f22626q != 4 && radialProgress22.f22346a.contains(x10, y3)) {
                    z10 = true;
                    k4Var = this.f20604o;
                    if (k4Var != null && k4Var == d10) {
                        u1Var = this.f20593a;
                        if (u1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = u1Var.getMessageObject();
                            if (!this.f20605p && z10 && d10.G.f22351i.f22626q == 3 && messageObject != null) {
                                if (messageObject.isSending()) {
                                    SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                                }
                            } else {
                                l1 delegate = u1Var.getDelegate();
                                k4 k4Var2 = this.f20604o;
                                ImageReceiver imageReceiver = k4Var2.f20537f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = k4Var2.E;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.T1(u1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f20605p = false;
                    this.f20604o = null;
                }
            }
            z10 = false;
            k4Var = this.f20604o;
            if (k4Var != null) {
                u1Var = this.f20593a;
                if (u1Var.getDelegate() != null) {
                    MessageObject messageObject2 = u1Var.getMessageObject();
                    if (!this.f20605p) {
                    }
                    l1 delegate2 = u1Var.getDelegate();
                    k4 k4Var22 = this.f20604o;
                    ImageReceiver imageReceiver2 = k4Var22.f20537f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = k4Var22.E;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.T1(u1Var, messageExtendedMedia2);
                }
            }
            this.f20605p = false;
            this.f20604o = null;
        }
        if (this.f20604o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f20603n.c(z11);
        if (this.f20604o == null) {
            return false;
        }
        return true;
    }

    public final void g(org.telegram.messenger.MessageObject r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l4.g(org.telegram.messenger.MessageObject):void");
    }

    public final void h(MessageObject messageObject) {
        boolean z10;
        boolean z11;
        int i10;
        float f7;
        int i11;
        int i12;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z14;
        u1 u1Var = this.f20593a;
        if (u1Var.Lc <= 0 && (!u1Var.f21510u1 || TextUtils.isEmpty(messageObject.caption))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((u1Var.f21510u1 || TextUtils.isEmpty(messageObject.caption)) && u1Var.N.f49445s && !u1Var.f21360j9) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i18 = this.f20602m;
        if (i18 > 0) {
            f7 = 1000.0f / this.f20594b.d;
            this.f20596f = i18;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f20596f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                int min = Math.min(u1Var.getParentWidth(), AndroidUtilities.displaySize.y);
                if (u1Var.M0(messageObject)) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                this.f20596f = min - AndroidUtilities.dp(i10 + 64);
            }
            if (u1Var.z3()) {
                this.f20596f -= AndroidUtilities.dp(52.0f);
            }
            f7 = 1.0f;
        }
        j4 j4Var = this.f20594b;
        this.f20597g = (int) ((j4Var.d / 1000.0f) * f7 * this.f20596f);
        this.h = (int) (j4Var.f20469g * j4Var.f20470i);
        this.f20598i = false;
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        if (SharedConfig.bubbleRadius > 2) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        int dp3 = AndroidUtilities.dp(i11 - i12);
        int min2 = Math.min(AndroidUtilities.dp(3.0f), dp3);
        int i19 = 0;
        while (true) {
            ArrayList arrayList = this.f20595c;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i19 >= arrayList.size()) {
                break;
            }
            k4 k4Var = (k4) arrayList.get(i19);
            j4 j4Var2 = this.f20594b;
            TLRPC.MessageExtendedMedia messageExtendedMedia = k4Var.E;
            ImageReceiver imageReceiver = k4Var.f20537f;
            if (messageExtendedMedia == null) {
                j4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) j4Var2.f20467c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z12 = z10;
                z13 = z11;
                i13 = dp;
            } else {
                float f10 = this.f20596f;
                int i20 = (int) ((groupedMessagePosition.left / 1000.0f) * f7 * f10);
                z12 = z10;
                float f11 = groupedMessagePosition.top;
                float f12 = this.f20594b.f20470i;
                int i21 = (int) (f11 * f12);
                int i22 = (int) (groupedMessagePosition.f15819ph * f12);
                int i23 = (int) ((groupedMessagePosition.pw / 1000.0f) * f7 * f10);
                int i24 = groupedMessagePosition.flags;
                if ((i24 & 1) == 0) {
                    i20 += dp;
                    i23 -= dp;
                }
                if ((i24 & 4) == 0) {
                    i21 += dp;
                    i22 -= dp;
                }
                int i25 = i21;
                int i26 = i22;
                if ((i24 & 2) == 0) {
                    i23 -= dp;
                }
                int i27 = i23;
                if ((i24 & 8) == 0) {
                    i26 -= dp;
                }
                z13 = z11;
                int i28 = i26;
                k4Var.f20534a = i20;
                k4Var.f20535b = i25;
                i13 = dp;
                k4Var.f20536c = i20 + i27;
                k4Var.d = i25 + i28;
                imageReceiver.setImageCoords(i20, i25, i27, i28);
                int i29 = groupedMessagePosition.flags;
                int i30 = i29 & 4;
                if (i30 != 0 && (i29 & 1) != 0 && !z12) {
                    i14 = dp3;
                } else {
                    i14 = dp2;
                }
                if (i30 != 0 && (i29 & 2) != 0 && !z12) {
                    i15 = dp3;
                } else {
                    i15 = dp2;
                }
                int i31 = i29 & 8;
                if (i31 != 0 && (i29 & 1) != 0 && !z13) {
                    i16 = dp3;
                } else {
                    i16 = dp2;
                }
                if (i31 != 0 && (i29 & 2) != 0 && !z13) {
                    i17 = dp3;
                } else {
                    i17 = dp2;
                }
                if (!z13) {
                    if (messageObject.isOutOwner()) {
                        i17 = dp2;
                    } else {
                        i16 = dp2;
                    }
                }
                if (!z12 && u1Var.E) {
                    if (messageObject.isOutOwner()) {
                        i15 = min2;
                    } else {
                        i14 = min2;
                    }
                }
                imageReceiver.setRoundRadius(i14, i15, i17, i16);
                float[] fArr = k4Var.f20540s;
                float f13 = i14;
                fArr[1] = f13;
                fArr[0] = f13;
                float f14 = i15;
                fArr[3] = f14;
                fArr[2] = f14;
                float f15 = i17;
                fArr[5] = f15;
                fArr[4] = f15;
                float f16 = i16;
                fArr[7] = f16;
                fArr[6] = f16;
                if (messageObject != null && messageObject.isSending()) {
                    k4Var.b(3);
                }
                if (!this.f20598i && !k4Var.h) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                this.f20598i = z14;
            }
            i19++;
            z10 = z12;
            dp = i13;
            z11 = z13;
        }
        if (this.f20598i) {
            if (messageObject == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                u01 u01Var = new u01(yh.w7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.f20606q = u01Var;
                if (u01Var.f28493c > this.f20597g - AndroidUtilities.dp(30.0f)) {
                    this.f20606q = new u01(yh.w7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
