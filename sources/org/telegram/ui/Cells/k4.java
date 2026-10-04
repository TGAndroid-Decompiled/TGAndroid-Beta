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
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.zc;
public final class k4 {
    public int A;
    public int B;
    public boolean C;
    public final u1 f22383a;
    public i4 f22384b;
    public int d;
    public int f22386e;
    public int f22387f;
    public int f22388g;
    public int h;
    public boolean f22389i;
    public final org.telegram.ui.Components.e6 f22390j;
    public u90 f22391k;
    public final vh.f f22392l;
    public int f22393m;
    public final zc f22394n;
    public j4 f22395o;
    public boolean f22396p;
    public e11 f22397q;
    public e11 f22398r;
    public long f22399s;
    public Bitmap f22402w;
    public Paint f22403x;
    public int f22404y;
    public int f22405z;
    public final ArrayList f22385c = new ArrayList();
    public final Path f22400t = new Path();
    public final Path f22401u = new Path();
    public final RectF v = new RectF();

    public k4(u1 u1Var) {
        this.f22383a = u1Var;
        this.f22392l = vh.f.e(u1Var);
        this.f22390j = new org.telegram.ui.Components.e6(u1Var, 0L, 350L, tr.h);
        this.f22394n = new zc(u1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f22385c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((j4) obj).f22323f.getVisible()) {
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
        if (this.f22384b != null) {
            boolean z10 = this.f22389i;
            org.telegram.ui.Components.e6 e6Var = this.f22390j;
            float e7 = e6Var.e(z10);
            float e10 = e6Var.e(this.f22389i);
            u1 u1Var2 = this.f22383a;
            MessageObject messageObject = u1Var2.getMessageObject();
            Path path3 = this.f22401u;
            path3.rewind();
            float f14 = Float.MAX_VALUE;
            float f15 = Float.MAX_VALUE;
            float f16 = Float.MIN_VALUE;
            float f17 = Float.MIN_VALUE;
            int i10 = 0;
            while (true) {
                arrayList = this.f22385c;
                if (i10 >= arrayList.size()) {
                    break;
                }
                j4 j4Var = (j4) arrayList.get(i10);
                ImageReceiver imageReceiver = j4Var.f22323f;
                RadialProgress2 radialProgress2 = j4Var.G;
                int i11 = this.d;
                int i12 = j4Var.f22319a;
                float f18 = e7;
                int i13 = this.f22386e;
                int i14 = j4Var.f22320b;
                float f19 = e10;
                u1 u1Var3 = u1Var2;
                imageReceiver.setImageCoords(i11 + i12, i13 + i14, j4Var.f22321c - i12, j4Var.d - i14);
                imageReceiver.draw(canvas2);
                if (imageReceiver.getAnimation() != null) {
                    imageReceiver.getAnimation().getClass();
                    int round = Math.round(((float) 0) / 1000.0f);
                    if (!j4Var.f22328x && j4Var.K != (max = Math.max(0, j4Var.J - round))) {
                        j4Var.K = max;
                        j4Var.L = new e11(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                    }
                }
                if (f19 > 0.0f) {
                    float min = Math.min(this.d + j4Var.f22319a, f15);
                    float min2 = Math.min(this.f22386e + j4Var.f22320b, f14);
                    f17 = Math.max(this.d + j4Var.f22321c, f17);
                    f16 = Math.max(this.f22386e + j4Var.d, f16);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i15 = this.d;
                    int i16 = this.f22386e;
                    rectF2.set(j4Var.f22319a + i15, j4Var.f22320b + i16, i15 + j4Var.f22321c, i16 + j4Var.d);
                    path3.addRoundRect(rectF2, j4Var.f22326s, Path.Direction.CW);
                    f14 = min2;
                    f15 = min;
                }
                radialProgress2.g(org.telegram.ui.ActionBar.i6.f20977le, org.telegram.ui.ActionBar.i6.f20996me, org.telegram.ui.ActionBar.i6.ne, org.telegram.ui.ActionBar.i6.f21032oe);
                RectF rectF3 = radialProgress2.f24261a;
                float f20 = f14;
                rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.f24281x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.f24281x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.f24281x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.f24281x + imageReceiver.getImageY());
                if (messageObject.isSending()) {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                    long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(j4Var.F);
                    boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                    if (fileProgressSizes == null && isSendingPaidMessage) {
                        radialProgress2.o(1.0f, true);
                        if (j4Var.f22327w) {
                            a2 = 6;
                        } else {
                            a2 = j4Var.a();
                        }
                        j4Var.b(a2);
                    }
                } else if (FileLoader.getInstance(messageObject.currentAccount).isLoadingFile(j4Var.v)) {
                    j4Var.b(3);
                } else {
                    j4Var.b(j4Var.a());
                }
                canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f19) * 255.0f), 31);
                radialProgress2.draw(canvas2);
                canvas2.restore();
                i10++;
                f14 = f20;
                e7 = f18;
                u1Var2 = u1Var3;
                e10 = f19;
            }
            float f21 = e7;
            float f22 = e10;
            u1 u1Var4 = u1Var2;
            if (f22 > 0.0f) {
                canvas2.save();
                canvas2.clipPath(path3);
                canvas2.translate(f15, f14);
                int i17 = (int) (f17 - f15);
                int i18 = (int) (f16 - f14);
                canvas2.saveLayerAlpha(0.0f, 0.0f, i17, i18, (int) (f22 * 255.0f), 31);
                this.f22392l.c(canvas, u1Var4, i17, i18, 1.0f, u1Var4.f23347pe);
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
                path = this.f22400t;
                if (i19 >= size) {
                    break;
                }
                j4 j4Var2 = (j4) arrayList.get(i19);
                if (j4Var2.L != null) {
                    float dp = AndroidUtilities.dp(11.4f) + j4Var2.L.f25884c;
                    float dp2 = AndroidUtilities.dp(17.0f);
                    float dp3 = AndroidUtilities.dp(5.0f);
                    float f23 = this.d + j4Var2.f22319a + dp3;
                    float f24 = this.f22386e + j4Var2.f22320b + dp3;
                    rectF.set(f23, f24, dp + f23, f24 + dp2);
                    if (this.f22398r == null || rectF.right <= ((this.d + this.f22388g) - (AndroidUtilities.dp(11.32f) + this.f22398r.f25884c)) - dp3 || rectF.top > this.f22386e + dp3) {
                        path.rewind();
                        float f25 = dp2 / 2.0f;
                        path.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        f13 = f22;
                        c(canvas2, f13);
                        canvas2.drawColor(org.telegram.ui.ActionBar.i6.l1(1.0f, 1073741824));
                        j4Var2.L.c(this.d + j4Var2.f22319a + dp3 + AndroidUtilities.dp(5.66f), this.f22386e + j4Var2.f22320b + dp3 + f25, 1.0f, -1, canvas2);
                        canvas2.restore();
                        i19++;
                        f22 = f13;
                    }
                }
                f13 = f22;
                i19++;
                f22 = f13;
            }
            if (this.f22397q != null && f21 > 0.0f) {
                float a10 = this.f22394n.a(0.05f);
                float dp4 = AndroidUtilities.dp(28.0f) + this.f22397q.f25884c;
                float dp5 = AndroidUtilities.dp(32.0f);
                float f26 = this.d;
                float f27 = this.f22388g;
                float A = com.google.android.gms.internal.vision.e2.A(f27, dp4, 2.0f, f26);
                f10 = 11.32f;
                float f28 = this.f22386e;
                f11 = 5.0f;
                float f29 = this.h;
                f12 = 17.0f;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f29, dp5, 2.0f, f28), org.telegram.messenger.q.a(f27, dp4, 2.0f, f26), org.telegram.messenger.q.a(f29, dp5, 2.0f, f28));
                path.rewind();
                float f30 = dp5 / 2.0f;
                path.addRoundRect(rectF, f30, f30, Path.Direction.CW);
                canvas2.save();
                canvas2.scale(a10, a10, (this.f22388g / 2.0f) + this.d, (this.h / 2.0f) + this.f22386e);
                canvas2.save();
                canvas2.clipPath(path);
                f7 = f21;
                c(canvas2, f7);
                canvas2.drawColor(org.telegram.ui.ActionBar.i6.l1(f7, 1342177280));
                path2 = path;
                this.f22397q.c((((this.f22388g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.f22386e + (this.h / 2.0f), f7, -1, canvas2);
                canvas2.restore();
                if (u1Var.getDelegate() != null && u1Var.getDelegate().c1(5, u1Var)) {
                    u90 u90Var = this.f22391k;
                    if (u90Var == null) {
                        u90 u90Var2 = new u90();
                        this.f22391k = u90Var2;
                        u90Var2.setCallback(u1Var);
                        this.f22391k.f(org.telegram.ui.ActionBar.i6.l1(0.1f, -1), org.telegram.ui.ActionBar.i6.l1(0.3f, -1), org.telegram.ui.ActionBar.i6.l1(0.35f, -1), org.telegram.ui.ActionBar.i6.l1(0.8f, -1));
                        u90 u90Var3 = this.f22391k;
                        u90Var3.C = true;
                        u90Var3.f31352w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    } else if (u90Var.b() || this.f22391k.c()) {
                        u90 u90Var4 = this.f22391k;
                        u90Var4.f31334b = -1L;
                        u90Var4.f31335c = -1L;
                    }
                } else {
                    u90 u90Var5 = this.f22391k;
                    if (u90Var5 != null && !u90Var5.c() && !this.f22391k.b()) {
                        this.f22391k.a();
                    }
                }
                u90 u90Var6 = this.f22391k;
                if (u90Var6 != null) {
                    u90Var6.d(rectF);
                    this.f22391k.j(f30);
                    this.f22391k.setAlpha((int) (f7 * 255.0f));
                    this.f22391k.draw(canvas2);
                }
                canvas2.restore();
            } else {
                path2 = path;
                f7 = f21;
                f10 = 11.32f;
                f11 = 5.0f;
                f12 = 17.0f;
            }
            if (this.f22398r != null && f7 < 1.0f && a()) {
                float timeAlpha = u1Var.getTimeAlpha() * (1.0f - f7);
                float dp6 = AndroidUtilities.dp(f10) + this.f22398r.f25884c;
                float dp7 = AndroidUtilities.dp(f12);
                float dp8 = AndroidUtilities.dp(f11);
                float f31 = this.d + this.f22388g;
                float f32 = this.f22386e + dp8;
                rectF.set((f31 - dp6) - dp8, f32, f31 - dp8, f32 + dp7);
                path2.rewind();
                float f33 = dp7 / 2.0f;
                path2.addRoundRect(rectF, f33, f33, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path2);
                canvas2.drawColor(org.telegram.ui.ActionBar.i6.l1(timeAlpha, 1073741824));
                this.f22398r.c((((this.d + this.f22388g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.f22386e + dp8 + f33, timeAlpha, -1, canvas2);
                canvas.restore();
            }
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        float f10;
        ArrayList arrayList;
        if (this.f22384b != null) {
            u1 u1Var = this.f22383a;
            if (u1Var.getMessageObject() != null) {
                i10 = u1Var.getMessageObject().getId();
            } else {
                i10 = 0;
            }
            int i11 = this.f22388g;
            int i12 = this.h;
            float f11 = 100.0f;
            if (i11 > i12) {
                f10 = 100.0f;
            } else {
                f10 = (i11 / i12) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f10);
            int i13 = this.h;
            int i14 = this.f22388g;
            if (i13 <= i14) {
                f11 = 100.0f * (i13 / i14);
            }
            int max2 = (int) Math.max(1.0f, f11);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                arrayList = this.f22385c;
                if (i15 >= arrayList.size()) {
                    break;
                }
                j4 j4Var = (j4) arrayList.get(i15);
                if (j4Var.f22323f.hasImageSet() && j4Var.f22323f.getBitmap() != null) {
                    i16 |= 1 << i15;
                }
                i15++;
            }
            Bitmap bitmap = this.f22402w;
            if (bitmap == null || this.f22405z != i10 || this.f22404y != i16 || this.A != max || this.B != max2) {
                this.f22404y = i16;
                this.f22405z = i10;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f22402w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f22402w);
                float f12 = max / this.f22388g;
                canvas2.scale(f12, f12);
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    j4 j4Var2 = (j4) arrayList.get(i17);
                    ImageReceiver imageReceiver = j4Var2.f22323f;
                    int i18 = j4Var2.f22319a;
                    int i19 = j4Var2.f22320b;
                    imageReceiver.setImageCoords(i18, i19, j4Var2.f22321c - i18, j4Var2.d - i19);
                    j4Var2.f22323f.draw(canvas2);
                }
                Utilities.stackBlurBitmap(this.f22402w, 12);
                if (this.f22403x == null) {
                    this.f22403x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f22403x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f22402w != null) {
                canvas.save();
                canvas.translate(this.d, this.f22386e);
                canvas.scale(this.f22388g / this.f22402w.getWidth(), this.f22388g / this.f22402w.getWidth());
                this.f22403x.setAlpha((int) (f7 * 255.0f));
                canvas.drawBitmap(this.f22402w, 0.0f, 0.0f, this.f22403x);
                canvas.restore();
            }
        }
    }

    public final j4 d(float f7, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22385c;
            if (i10 < arrayList.size()) {
                if (((j4) arrayList.get(i10)).f22323f.isInsideImage(f7, f10)) {
                    return (j4) arrayList.get(i10);
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
            vh.f fVar = this.f22392l;
            if (fVar != null) {
                fVar.a(this.f22383a);
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f22385c;
                if (i10 < arrayList.size()) {
                    j4 j4Var = (j4) arrayList.get(i10);
                    if (j4Var.M) {
                        j4Var.M = false;
                        j4Var.f22323f.onDetachedFromWindow();
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
        j4 j4Var;
        u1 u1Var;
        boolean z11;
        boolean z12;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            j4 d = d(x10, y3);
            this.f22395o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.G;
                if (radialProgress2.f24267i.f26782q != 4 && radialProgress2.f24261a.contains(x10, y3)) {
                    z12 = true;
                    this.f22396p = z12;
                }
            }
            z12 = false;
            this.f22396p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            j4 d10 = d(x10, y3);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.G;
                if (radialProgress22.f24267i.f26782q != 4 && radialProgress22.f24261a.contains(x10, y3)) {
                    z10 = true;
                    j4Var = this.f22395o;
                    if (j4Var != null && j4Var == d10) {
                        u1Var = this.f22383a;
                        if (u1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = u1Var.getMessageObject();
                            if (!this.f22396p && z10 && d10.G.f24267i.f26782q == 3 && messageObject != null) {
                                if (messageObject.isSending()) {
                                    SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                                }
                            } else {
                                l1 delegate = u1Var.getDelegate();
                                j4 j4Var2 = this.f22395o;
                                ImageReceiver imageReceiver = j4Var2.f22323f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = j4Var2.E;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.T1(u1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f22396p = false;
                    this.f22395o = null;
                }
            }
            z10 = false;
            j4Var = this.f22395o;
            if (j4Var != null) {
                u1Var = this.f22383a;
                if (u1Var.getDelegate() != null) {
                    MessageObject messageObject2 = u1Var.getMessageObject();
                    if (!this.f22396p) {
                    }
                    l1 delegate2 = u1Var.getDelegate();
                    j4 j4Var22 = this.f22395o;
                    ImageReceiver imageReceiver2 = j4Var22.f22323f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = j4Var22.E;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.T1(u1Var, messageExtendedMedia2);
                }
            }
            this.f22396p = false;
            this.f22395o = null;
        }
        if (this.f22395o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22394n.c(z11);
        if (this.f22395o == null) {
            return false;
        }
        return true;
    }

    public final void g(org.telegram.messenger.MessageObject r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k4.g(org.telegram.messenger.MessageObject):void");
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
        u1 u1Var = this.f22383a;
        if (u1Var.Lc <= 0 && (!u1Var.f23409u1 || TextUtils.isEmpty(messageObject.caption))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((u1Var.f23409u1 || TextUtils.isEmpty(messageObject.caption)) && u1Var.N.f53508s && !u1Var.f23259j9) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i18 = this.f22393m;
        if (i18 > 0) {
            f7 = 1000.0f / this.f22384b.d;
            this.f22387f = i18;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f22387f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                int min = Math.min(u1Var.getParentWidth(), AndroidUtilities.displaySize.y);
                if (u1Var.M0(messageObject)) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                this.f22387f = min - AndroidUtilities.dp(i10 + 64);
            }
            if (u1Var.z3()) {
                this.f22387f -= AndroidUtilities.dp(52.0f);
            }
            f7 = 1.0f;
        }
        i4 i4Var = this.f22384b;
        this.f22388g = (int) ((i4Var.d / 1000.0f) * f7 * this.f22387f);
        this.h = (int) (i4Var.f22245g * i4Var.f22246i);
        this.f22389i = false;
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
            ArrayList arrayList = this.f22385c;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i19 >= arrayList.size()) {
                break;
            }
            j4 j4Var = (j4) arrayList.get(i19);
            i4 i4Var2 = this.f22384b;
            TLRPC.MessageExtendedMedia messageExtendedMedia = j4Var.E;
            ImageReceiver imageReceiver = j4Var.f22323f;
            if (messageExtendedMedia == null) {
                i4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) i4Var2.f22242c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z12 = z10;
                z13 = z11;
                i13 = dp;
            } else {
                float f10 = this.f22387f;
                int i20 = (int) ((groupedMessagePosition.left / 1000.0f) * f7 * f10);
                z12 = z10;
                float f11 = groupedMessagePosition.top;
                float f12 = this.f22384b.f22246i;
                int i21 = (int) (f11 * f12);
                int i22 = (int) (groupedMessagePosition.f17258ph * f12);
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
                j4Var.f22319a = i20;
                j4Var.f22320b = i25;
                i13 = dp;
                j4Var.f22321c = i20 + i27;
                j4Var.d = i25 + i28;
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
                float[] fArr = j4Var.f22326s;
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
                    j4Var.b(3);
                }
                if (!this.f22389i && !j4Var.h) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                this.f22389i = z14;
            }
            i19++;
            z10 = z12;
            dp = i13;
            z11 = z13;
        }
        if (this.f22389i) {
            if (messageObject == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                e11 e11Var = new e11(yh.x7.d1(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.f22397q = e11Var;
                if (e11Var.f25884c > this.f22388g - AndroidUtilities.dp(30.0f)) {
                    this.f22397q = new e11(yh.x7.d1(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
