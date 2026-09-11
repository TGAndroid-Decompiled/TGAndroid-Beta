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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zc;
public final class j4 {
    public int A;
    public int B;
    public boolean C;
    public final t1 f22157a;
    public h4 f22158b;
    public int d;
    public int f22160e;
    public int f22161f;
    public int f22162g;
    public int h;
    public boolean f22163i;
    public final org.telegram.ui.Components.e6 f22164j;
    public h90 f22165k;
    public final wh.g f22166l;
    public int f22167m;
    public final zc f22168n;
    public i4 f22169o;
    public boolean f22170p;
    public f01 f22171q;
    public f01 f22172r;
    public long f22173s;
    public Bitmap f22176w;
    public Paint f22177x;
    public int f22178y;
    public int f22179z;
    public final ArrayList f22159c = new ArrayList();
    public final Path f22174t = new Path();
    public final Path f22175u = new Path();
    public final RectF v = new RectF();

    public j4(t1 t1Var) {
        this.f22157a = t1Var;
        this.f22166l = wh.g.e(t1Var);
        this.f22164j = new org.telegram.ui.Components.e6(t1Var, 0L, 350L, pr.h);
        this.f22168n = new zc(t1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f22159c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((i4) obj).f22086f.getVisible()) {
                return false;
            }
        }
        return true;
    }

    public final void b(Canvas canvas) {
        ArrayList arrayList;
        t1 t1Var;
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
        if (this.f22158b != null) {
            boolean z10 = this.f22163i;
            org.telegram.ui.Components.e6 e6Var = this.f22164j;
            float e7 = e6Var.e(z10);
            float e10 = e6Var.e(this.f22163i);
            t1 t1Var2 = this.f22157a;
            MessageObject messageObject = t1Var2.getMessageObject();
            Path path3 = this.f22175u;
            path3.rewind();
            float f14 = Float.MAX_VALUE;
            float f15 = Float.MAX_VALUE;
            float f16 = Float.MIN_VALUE;
            float f17 = Float.MIN_VALUE;
            int i10 = 0;
            while (true) {
                arrayList = this.f22159c;
                if (i10 >= arrayList.size()) {
                    break;
                }
                i4 i4Var = (i4) arrayList.get(i10);
                ImageReceiver imageReceiver = i4Var.f22086f;
                RadialProgress2 radialProgress2 = i4Var.G;
                int i11 = this.d;
                int i12 = i4Var.f22082a;
                float f18 = e7;
                int i13 = this.f22160e;
                int i14 = i4Var.f22083b;
                float f19 = e10;
                t1 t1Var3 = t1Var2;
                imageReceiver.setImageCoords(i11 + i12, i13 + i14, i4Var.f22084c - i12, i4Var.d - i14);
                imageReceiver.draw(canvas2);
                if (imageReceiver.getAnimation() != null) {
                    imageReceiver.getAnimation().getClass();
                    int round = Math.round(((float) 0) / 1000.0f);
                    if (!i4Var.f22091x && i4Var.K != (max = Math.max(0, i4Var.J - round))) {
                        i4Var.K = max;
                        i4Var.L = new f01(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                    }
                }
                if (f19 > 0.0f) {
                    float min = Math.min(this.d + i4Var.f22082a, f15);
                    float min2 = Math.min(this.f22160e + i4Var.f22083b, f14);
                    f17 = Math.max(this.d + i4Var.f22084c, f17);
                    f16 = Math.max(this.f22160e + i4Var.d, f16);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i15 = this.d;
                    int i16 = this.f22160e;
                    rectF2.set(i4Var.f22082a + i15, i4Var.f22083b + i16, i15 + i4Var.f22084c, i16 + i4Var.d);
                    path3.addRoundRect(rectF2, i4Var.f22089s, Path.Direction.CW);
                    f14 = min2;
                    f15 = min;
                }
                radialProgress2.g(org.telegram.ui.ActionBar.j6.f20817le, org.telegram.ui.ActionBar.j6.f20835me, org.telegram.ui.ActionBar.j6.ne, org.telegram.ui.ActionBar.j6.f20869oe);
                RectF rectF3 = radialProgress2.f24070a;
                float f20 = f14;
                rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.f24090x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.f24090x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.f24090x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.f24090x + imageReceiver.getImageY());
                if (messageObject.isSending()) {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                    long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(i4Var.F);
                    boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                    if (fileProgressSizes == null && isSendingPaidMessage) {
                        radialProgress2.o(1.0f, true);
                        if (i4Var.f22090w) {
                            a2 = 6;
                        } else {
                            a2 = i4Var.a();
                        }
                        i4Var.b(a2);
                    }
                } else if (FileLoader.getInstance(messageObject.currentAccount).isLoadingFile(i4Var.v)) {
                    i4Var.b(3);
                } else {
                    i4Var.b(i4Var.a());
                }
                canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f19) * 255.0f), 31);
                radialProgress2.draw(canvas2);
                canvas2.restore();
                i10++;
                f14 = f20;
                e7 = f18;
                t1Var2 = t1Var3;
                e10 = f19;
            }
            float f21 = e7;
            float f22 = e10;
            t1 t1Var4 = t1Var2;
            if (f22 > 0.0f) {
                canvas2.save();
                canvas2.clipPath(path3);
                canvas2.translate(f15, f14);
                int i17 = (int) (f17 - f15);
                int i18 = (int) (f16 - f14);
                canvas2.saveLayerAlpha(0.0f, 0.0f, i17, i18, (int) (f22 * 255.0f), 31);
                this.f22166l.c(canvas, t1Var4, i17, i18, 1.0f, t1Var4.f23064oe);
                canvas2 = canvas;
                t1Var = t1Var4;
                canvas2.restore();
                canvas2.restore();
                t1Var.invalidate();
            } else {
                t1Var = t1Var4;
            }
            int i19 = 0;
            while (true) {
                int size = arrayList.size();
                rectF = this.v;
                path = this.f22174t;
                if (i19 >= size) {
                    break;
                }
                i4 i4Var2 = (i4) arrayList.get(i19);
                if (i4Var2.L != null) {
                    float dp = AndroidUtilities.dp(11.4f) + i4Var2.L.f25847c;
                    float dp2 = AndroidUtilities.dp(17.0f);
                    float dp3 = AndroidUtilities.dp(5.0f);
                    float f23 = this.d + i4Var2.f22082a + dp3;
                    float f24 = this.f22160e + i4Var2.f22083b + dp3;
                    rectF.set(f23, f24, dp + f23, f24 + dp2);
                    if (this.f22172r == null || rectF.right <= ((this.d + this.f22162g) - (AndroidUtilities.dp(11.32f) + this.f22172r.f25847c)) - dp3 || rectF.top > this.f22160e + dp3) {
                        path.rewind();
                        float f25 = dp2 / 2.0f;
                        path.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        f13 = f22;
                        c(canvas2, f13);
                        canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(1.0f, 1073741824));
                        i4Var2.L.c(this.d + i4Var2.f22082a + dp3 + AndroidUtilities.dp(5.66f), this.f22160e + i4Var2.f22083b + dp3 + f25, 1.0f, -1, canvas2);
                        canvas2.restore();
                        i19++;
                        f22 = f13;
                    }
                }
                f13 = f22;
                i19++;
                f22 = f13;
            }
            if (this.f22171q != null && f21 > 0.0f) {
                float a10 = this.f22168n.a(0.05f);
                float dp4 = AndroidUtilities.dp(28.0f) + this.f22171q.f25847c;
                float dp5 = AndroidUtilities.dp(32.0f);
                float f26 = this.d;
                float f27 = this.f22162g;
                float A = com.google.android.gms.internal.vision.e2.A(f27, dp4, 2.0f, f26);
                f10 = 11.32f;
                float f28 = this.f22160e;
                f11 = 5.0f;
                float f29 = this.h;
                f12 = 17.0f;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f29, dp5, 2.0f, f28), org.telegram.messenger.w1.a(f27, dp4, 2.0f, f26), org.telegram.messenger.w1.a(f29, dp5, 2.0f, f28));
                path.rewind();
                float f30 = dp5 / 2.0f;
                path.addRoundRect(rectF, f30, f30, Path.Direction.CW);
                canvas2.save();
                canvas2.scale(a10, a10, (this.f22162g / 2.0f) + this.d, (this.h / 2.0f) + this.f22160e);
                canvas2.save();
                canvas2.clipPath(path);
                f7 = f21;
                c(canvas2, f7);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(f7, 1342177280));
                path2 = path;
                this.f22171q.c((((this.f22162g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.f22160e + (this.h / 2.0f), f7, -1, canvas2);
                canvas2.restore();
                if (t1Var.getDelegate() != null && t1Var.getDelegate().X0(5, t1Var)) {
                    h90 h90Var = this.f22165k;
                    if (h90Var == null) {
                        h90 h90Var2 = new h90();
                        this.f22165k = h90Var2;
                        h90Var2.setCallback(t1Var);
                        this.f22165k.f(org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.35f, -1), org.telegram.ui.ActionBar.j6.l1(0.8f, -1));
                        h90 h90Var3 = this.f22165k;
                        h90Var3.C = true;
                        h90Var3.f26690w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    } else if (h90Var.b() || this.f22165k.c()) {
                        h90 h90Var4 = this.f22165k;
                        h90Var4.f26672b = -1L;
                        h90Var4.f26673c = -1L;
                    }
                } else {
                    h90 h90Var5 = this.f22165k;
                    if (h90Var5 != null && !h90Var5.c() && !this.f22165k.b()) {
                        this.f22165k.a();
                    }
                }
                h90 h90Var6 = this.f22165k;
                if (h90Var6 != null) {
                    h90Var6.d(rectF);
                    this.f22165k.j(f30);
                    this.f22165k.setAlpha((int) (f7 * 255.0f));
                    this.f22165k.draw(canvas2);
                }
                canvas2.restore();
            } else {
                path2 = path;
                f7 = f21;
                f10 = 11.32f;
                f11 = 5.0f;
                f12 = 17.0f;
            }
            if (this.f22172r != null && f7 < 1.0f && a()) {
                float timeAlpha = t1Var.getTimeAlpha() * (1.0f - f7);
                float dp6 = AndroidUtilities.dp(f10) + this.f22172r.f25847c;
                float dp7 = AndroidUtilities.dp(f12);
                float dp8 = AndroidUtilities.dp(f11);
                float f31 = this.d + this.f22162g;
                float f32 = this.f22160e + dp8;
                rectF.set((f31 - dp6) - dp8, f32, f31 - dp8, f32 + dp7);
                path2.rewind();
                float f33 = dp7 / 2.0f;
                path2.addRoundRect(rectF, f33, f33, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path2);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(timeAlpha, 1073741824));
                this.f22172r.c((((this.d + this.f22162g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.f22160e + dp8 + f33, timeAlpha, -1, canvas2);
                canvas.restore();
            }
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        float f10;
        ArrayList arrayList;
        if (this.f22158b != null) {
            t1 t1Var = this.f22157a;
            if (t1Var.getMessageObject() != null) {
                i10 = t1Var.getMessageObject().getId();
            } else {
                i10 = 0;
            }
            int i11 = this.f22162g;
            int i12 = this.h;
            float f11 = 100.0f;
            if (i11 > i12) {
                f10 = 100.0f;
            } else {
                f10 = (i11 / i12) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f10);
            int i13 = this.h;
            int i14 = this.f22162g;
            if (i13 <= i14) {
                f11 = 100.0f * (i13 / i14);
            }
            int max2 = (int) Math.max(1.0f, f11);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                arrayList = this.f22159c;
                if (i15 >= arrayList.size()) {
                    break;
                }
                i4 i4Var = (i4) arrayList.get(i15);
                if (i4Var.f22086f.hasImageSet() && i4Var.f22086f.getBitmap() != null) {
                    i16 |= 1 << i15;
                }
                i15++;
            }
            Bitmap bitmap = this.f22176w;
            if (bitmap == null || this.f22179z != i10 || this.f22178y != i16 || this.A != max || this.B != max2) {
                this.f22178y = i16;
                this.f22179z = i10;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f22176w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f22176w);
                float f12 = max / this.f22162g;
                canvas2.scale(f12, f12);
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    i4 i4Var2 = (i4) arrayList.get(i17);
                    ImageReceiver imageReceiver = i4Var2.f22086f;
                    int i18 = i4Var2.f22082a;
                    int i19 = i4Var2.f22083b;
                    imageReceiver.setImageCoords(i18, i19, i4Var2.f22084c - i18, i4Var2.d - i19);
                    i4Var2.f22086f.draw(canvas2);
                }
                Utilities.stackBlurBitmap(this.f22176w, 12);
                if (this.f22177x == null) {
                    this.f22177x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f22177x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f22176w != null) {
                canvas.save();
                canvas.translate(this.d, this.f22160e);
                canvas.scale(this.f22162g / this.f22176w.getWidth(), this.f22162g / this.f22176w.getWidth());
                this.f22177x.setAlpha((int) (f7 * 255.0f));
                canvas.drawBitmap(this.f22176w, 0.0f, 0.0f, this.f22177x);
                canvas.restore();
            }
        }
    }

    public final i4 d(float f7, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22159c;
            if (i10 < arrayList.size()) {
                if (((i4) arrayList.get(i10)).f22086f.isInsideImage(f7, f10)) {
                    return (i4) arrayList.get(i10);
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
            wh.g gVar = this.f22166l;
            if (gVar != null) {
                gVar.a(this.f22157a);
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f22159c;
                if (i10 < arrayList.size()) {
                    i4 i4Var = (i4) arrayList.get(i10);
                    if (i4Var.M) {
                        i4Var.M = false;
                        i4Var.f22086f.onDetachedFromWindow();
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
        i4 i4Var;
        t1 t1Var;
        boolean z11;
        boolean z12;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            i4 d = d(x10, y3);
            this.f22169o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.G;
                if (radialProgress2.f24076i.f30573q != 4 && radialProgress2.f24070a.contains(x10, y3)) {
                    z12 = true;
                    this.f22170p = z12;
                }
            }
            z12 = false;
            this.f22170p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            i4 d10 = d(x10, y3);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.G;
                if (radialProgress22.f24076i.f30573q != 4 && radialProgress22.f24070a.contains(x10, y3)) {
                    z10 = true;
                    i4Var = this.f22169o;
                    if (i4Var != null && i4Var == d10) {
                        t1Var = this.f22157a;
                        if (t1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = t1Var.getMessageObject();
                            if (!this.f22170p && z10 && d10.G.f24076i.f30573q == 3 && messageObject != null) {
                                if (messageObject.isSending()) {
                                    SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                                }
                            } else {
                                k1 delegate = t1Var.getDelegate();
                                i4 i4Var2 = this.f22169o;
                                ImageReceiver imageReceiver = i4Var2.f22086f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = i4Var2.E;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.M1(t1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f22170p = false;
                    this.f22169o = null;
                }
            }
            z10 = false;
            i4Var = this.f22169o;
            if (i4Var != null) {
                t1Var = this.f22157a;
                if (t1Var.getDelegate() != null) {
                    MessageObject messageObject2 = t1Var.getMessageObject();
                    if (!this.f22170p) {
                    }
                    k1 delegate2 = t1Var.getDelegate();
                    i4 i4Var22 = this.f22169o;
                    ImageReceiver imageReceiver2 = i4Var22.f22086f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = i4Var22.E;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.M1(t1Var, messageExtendedMedia2);
                }
            }
            this.f22170p = false;
            this.f22169o = null;
        }
        if (this.f22169o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22168n.c(z11);
        if (this.f22169o == null) {
            return false;
        }
        return true;
    }

    public final void g(org.telegram.messenger.MessageObject r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j4.g(org.telegram.messenger.MessageObject):void");
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
        t1 t1Var = this.f22157a;
        if (t1Var.Lc <= 0 && (!t1Var.f23140u1 || TextUtils.isEmpty(messageObject.caption))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((t1Var.f23140u1 || TextUtils.isEmpty(messageObject.caption)) && t1Var.N.f622s && !t1Var.f22990j9) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i18 = this.f22167m;
        if (i18 > 0) {
            f7 = 1000.0f / this.f22158b.d;
            this.f22161f = i18;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f22161f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                int min = Math.min(t1Var.getParentWidth(), AndroidUtilities.displaySize.y);
                if (t1Var.M0(messageObject)) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                this.f22161f = min - AndroidUtilities.dp(i10 + 64);
            }
            if (t1Var.z3()) {
                this.f22161f -= AndroidUtilities.dp(52.0f);
            }
            f7 = 1.0f;
        }
        h4 h4Var = this.f22158b;
        this.f22162g = (int) ((h4Var.d / 1000.0f) * f7 * this.f22161f);
        this.h = (int) (h4Var.f22025g * h4Var.f22026i);
        this.f22163i = false;
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
            ArrayList arrayList = this.f22159c;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i19 >= arrayList.size()) {
                break;
            }
            i4 i4Var = (i4) arrayList.get(i19);
            h4 h4Var2 = this.f22158b;
            TLRPC.MessageExtendedMedia messageExtendedMedia = i4Var.E;
            ImageReceiver imageReceiver = i4Var.f22086f;
            if (messageExtendedMedia == null) {
                h4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) h4Var2.f22022c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z12 = z10;
                z13 = z11;
                i13 = dp;
            } else {
                float f10 = this.f22161f;
                int i20 = (int) ((groupedMessagePosition.left / 1000.0f) * f7 * f10);
                z12 = z10;
                float f11 = groupedMessagePosition.top;
                float f12 = this.f22158b.f22026i;
                int i21 = (int) (f11 * f12);
                int i22 = (int) (groupedMessagePosition.f17077ph * f12);
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
                i4Var.f22082a = i20;
                i4Var.f22083b = i25;
                i13 = dp;
                i4Var.f22084c = i20 + i27;
                i4Var.d = i25 + i28;
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
                if (!z12 && t1Var.E) {
                    if (messageObject.isOutOwner()) {
                        i15 = min2;
                    } else {
                        i14 = min2;
                    }
                }
                imageReceiver.setRoundRadius(i14, i15, i17, i16);
                float[] fArr = i4Var.f22089s;
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
                    i4Var.b(3);
                }
                if (!this.f22163i && !i4Var.h) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                this.f22163i = z14;
            }
            i19++;
            z10 = z12;
            dp = i13;
            z11 = z13;
        }
        if (this.f22163i) {
            if (messageObject == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                f01 f01Var = new f01(zh.v7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.f22171q = f01Var;
                if (f01Var.f25847c > this.f22162g - AndroidUtilities.dp(30.0f)) {
                    this.f22171q = new f01(zh.v7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
