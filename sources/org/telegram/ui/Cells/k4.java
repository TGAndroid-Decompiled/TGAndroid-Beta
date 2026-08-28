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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pc;
public final class k4 {
    public int A;
    public int B;
    public boolean C;
    public final t1 f24590a;
    public i4 f24591b;
    public int d;
    public int f24593e;
    public int f24594f;
    public int f24595g;
    public int h;
    public boolean f24596i;
    public final org.telegram.ui.Components.y5 f24597j;
    public p80 f24598k;
    public final dh.k f24599l;
    public int f24600m;
    public final pc f24601n;
    public j4 f24602o;
    public boolean f24603p;
    public nz0 f24604q;
    public nz0 f24605r;
    public long f24606s;
    public Bitmap f24609w;
    public Paint f24610x;
    public int f24611y;
    public int f24612z;
    public final ArrayList f24592c = new ArrayList();
    public final Path f24607t = new Path();
    public final Path f24608u = new Path();
    public final RectF v = new RectF();

    public k4(t1 t1Var) {
        this.f24590a = t1Var;
        this.f24599l = dh.k.e(t1Var);
        this.f24597j = new org.telegram.ui.Components.y5(t1Var, 0L, 350L, gr.h);
        this.f24601n = new pc(t1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f24592c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            if (!((j4) obj).f24556f.getVisible()) {
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
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int a2;
        int max;
        Canvas canvas2 = canvas;
        if (this.f24591b != null) {
            boolean z10 = this.f24596i;
            org.telegram.ui.Components.y5 y5Var = this.f24597j;
            float e10 = y5Var.e(z10);
            float e11 = y5Var.e(this.f24596i);
            t1 t1Var2 = this.f24590a;
            MessageObject messageObject = t1Var2.getMessageObject();
            Path path3 = this.f24608u;
            path3.rewind();
            float f15 = Float.MAX_VALUE;
            float f16 = Float.MAX_VALUE;
            float f17 = Float.MIN_VALUE;
            float f18 = Float.MIN_VALUE;
            int i9 = 0;
            while (true) {
                arrayList = this.f24592c;
                if (i9 >= arrayList.size()) {
                    break;
                }
                j4 j4Var = (j4) arrayList.get(i9);
                ImageReceiver imageReceiver = j4Var.f24556f;
                RadialProgress2 radialProgress2 = j4Var.C;
                int i10 = this.d;
                int i11 = j4Var.f24552a;
                float f19 = e10;
                int i12 = this.f24593e;
                int i13 = j4Var.f24553b;
                float f20 = e11;
                t1 t1Var3 = t1Var2;
                imageReceiver.setImageCoords(i10 + i11, i12 + i13, j4Var.f24554c - i11, j4Var.d - i13);
                imageReceiver.draw(canvas2);
                if (imageReceiver.getAnimation() != null) {
                    imageReceiver.getAnimation().getClass();
                    int round = Math.round(((float) 0) / 1000.0f);
                    if (!j4Var.f24561x && j4Var.G != (max = Math.max(0, j4Var.F - round))) {
                        j4Var.G = max;
                        j4Var.H = new nz0(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                    }
                }
                if (f20 > 0.0f) {
                    float min = Math.min(this.d + j4Var.f24552a, f16);
                    float min2 = Math.min(this.f24593e + j4Var.f24553b, f15);
                    f18 = Math.max(this.d + j4Var.f24554c, f18);
                    f17 = Math.max(this.f24593e + j4Var.d, f17);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i14 = this.d;
                    int i15 = this.f24593e;
                    rectF2.set(j4Var.f24552a + i14, j4Var.f24553b + i15, i14 + j4Var.f24554c, i15 + j4Var.d);
                    path3.addRoundRect(rectF2, j4Var.f24559s, Path.Direction.CW);
                    f15 = min2;
                    f16 = min;
                }
                radialProgress2.g(org.telegram.ui.ActionBar.f6.f23152le, org.telegram.ui.ActionBar.f6.f23169me, org.telegram.ui.ActionBar.f6.f23186ne, org.telegram.ui.ActionBar.f6.oe);
                RectF rectF3 = radialProgress2.f26468a;
                float f21 = f15;
                rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.f26488x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.f26488x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.f26488x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.f26488x + imageReceiver.getImageY());
                if (messageObject.isSending()) {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                    long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(j4Var.B);
                    boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i9);
                    if (fileProgressSizes == null && isSendingPaidMessage) {
                        radialProgress2.o(1.0f, true);
                        if (j4Var.f24560w) {
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
                canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f20) * 255.0f), 31);
                radialProgress2.draw(canvas2);
                canvas2.restore();
                i9++;
                f15 = f21;
                e10 = f19;
                t1Var2 = t1Var3;
                e11 = f20;
            }
            float f22 = e10;
            float f23 = e11;
            t1 t1Var4 = t1Var2;
            if (f23 > 0.0f) {
                canvas2.save();
                canvas2.clipPath(path3);
                canvas2.translate(f16, f15);
                int i16 = (int) (f18 - f16);
                int i17 = (int) (f17 - f15);
                canvas2.saveLayerAlpha(0.0f, 0.0f, i16, i17, (int) (f23 * 255.0f), 31);
                this.f24599l.c(canvas, t1Var4, i16, i17, 1.0f, t1Var4.f25457ke);
                canvas2 = canvas;
                t1Var = t1Var4;
                canvas2.restore();
                canvas2.restore();
                t1Var.invalidate();
            } else {
                t1Var = t1Var4;
            }
            int i18 = 0;
            while (true) {
                int size = arrayList.size();
                rectF = this.v;
                path = this.f24607t;
                if (i18 >= size) {
                    break;
                }
                j4 j4Var2 = (j4) arrayList.get(i18);
                if (j4Var2.H != null) {
                    float dp = AndroidUtilities.dp(11.4f) + j4Var2.H.f31223c;
                    float dp2 = AndroidUtilities.dp(17.0f);
                    float dp3 = AndroidUtilities.dp(5.0f);
                    float f24 = this.d + j4Var2.f24552a + dp3;
                    float f25 = this.f24593e + j4Var2.f24553b + dp3;
                    rectF.set(f24, f25, dp + f24, f25 + dp2);
                    if (this.f24605r == null || rectF.right <= ((this.d + this.f24595g) - (AndroidUtilities.dp(11.32f) + this.f24605r.f31223c)) - dp3 || rectF.top > this.f24593e + dp3) {
                        path.rewind();
                        float f26 = dp2 / 2.0f;
                        path.addRoundRect(rectF, f26, f26, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        f14 = f23;
                        c(canvas2, f14);
                        canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(1.0f, 1073741824));
                        j4Var2.H.c(this.d + j4Var2.f24552a + dp3 + AndroidUtilities.dp(5.66f), this.f24593e + j4Var2.f24553b + dp3 + f26, 1.0f, -1, canvas2);
                        canvas2.restore();
                        i18++;
                        f23 = f14;
                    }
                }
                f14 = f23;
                i18++;
                f23 = f14;
            }
            if (this.f24604q != null && f22 > 0.0f) {
                float a3 = this.f24601n.a(0.05f);
                float dp4 = AndroidUtilities.dp(28.0f) + this.f24604q.f31223c;
                float dp5 = AndroidUtilities.dp(32.0f);
                float f27 = this.d;
                float f28 = this.f24595g;
                float A = e2.c.A(f28, dp4, 2.0f, f27);
                f11 = 11.32f;
                float f29 = this.f24593e;
                f12 = 5.0f;
                float f30 = this.h;
                f13 = 17.0f;
                rectF.set(A, e2.c.A(f30, dp5, 2.0f, f29), j3.r0.c(f28, dp4, 2.0f, f27), j3.r0.c(f30, dp5, 2.0f, f29));
                path.rewind();
                float f31 = dp5 / 2.0f;
                path.addRoundRect(rectF, f31, f31, Path.Direction.CW);
                canvas2.save();
                canvas2.scale(a3, a3, (this.f24595g / 2.0f) + this.d, (this.h / 2.0f) + this.f24593e);
                canvas2.save();
                canvas2.clipPath(path);
                f10 = f22;
                c(canvas2, f10);
                canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(f10, 1342177280));
                path2 = path;
                this.f24604q.c((((this.f24595g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.f24593e + (this.h / 2.0f), f10, -1, canvas2);
                canvas2.restore();
                if (t1Var.getDelegate() != null && t1Var.getDelegate().Y0(5, t1Var)) {
                    p80 p80Var = this.f24598k;
                    if (p80Var == null) {
                        p80 p80Var2 = new p80();
                        this.f24598k = p80Var2;
                        p80Var2.setCallback(t1Var);
                        this.f24598k.f(org.telegram.ui.ActionBar.f6.l1(0.1f, -1), org.telegram.ui.ActionBar.f6.l1(0.3f, -1), org.telegram.ui.ActionBar.f6.l1(0.35f, -1), org.telegram.ui.ActionBar.f6.l1(0.8f, -1));
                        p80 p80Var3 = this.f24598k;
                        p80Var3.C = true;
                        p80Var3.f31590w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    } else if (p80Var.b() || this.f24598k.c()) {
                        p80 p80Var4 = this.f24598k;
                        p80Var4.f31572b = -1L;
                        p80Var4.f31573c = -1L;
                    }
                } else {
                    p80 p80Var5 = this.f24598k;
                    if (p80Var5 != null && !p80Var5.c() && !this.f24598k.b()) {
                        this.f24598k.a();
                    }
                }
                p80 p80Var6 = this.f24598k;
                if (p80Var6 != null) {
                    p80Var6.d(rectF);
                    this.f24598k.j(f31);
                    this.f24598k.setAlpha((int) (f10 * 255.0f));
                    this.f24598k.draw(canvas2);
                }
                canvas2.restore();
            } else {
                path2 = path;
                f10 = f22;
                f11 = 11.32f;
                f12 = 5.0f;
                f13 = 17.0f;
            }
            if (this.f24605r != null && f10 < 1.0f && a()) {
                float timeAlpha = t1Var.getTimeAlpha() * (1.0f - f10);
                float dp6 = AndroidUtilities.dp(f11) + this.f24605r.f31223c;
                float dp7 = AndroidUtilities.dp(f13);
                float dp8 = AndroidUtilities.dp(f12);
                float f32 = this.d + this.f24595g;
                float f33 = this.f24593e + dp8;
                rectF.set((f32 - dp6) - dp8, f33, f32 - dp8, f33 + dp7);
                path2.rewind();
                float f34 = dp7 / 2.0f;
                path2.addRoundRect(rectF, f34, f34, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path2);
                canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(timeAlpha, 1073741824));
                this.f24605r.c((((this.d + this.f24595g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.f24593e + dp8 + f34, timeAlpha, -1, canvas2);
                canvas.restore();
            }
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i9;
        float f11;
        ArrayList arrayList;
        if (this.f24591b != null) {
            t1 t1Var = this.f24590a;
            if (t1Var.getMessageObject() != null) {
                i9 = t1Var.getMessageObject().getId();
            } else {
                i9 = 0;
            }
            int i10 = this.f24595g;
            int i11 = this.h;
            float f12 = 100.0f;
            if (i10 > i11) {
                f11 = 100.0f;
            } else {
                f11 = (i10 / i11) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f11);
            int i12 = this.h;
            int i13 = this.f24595g;
            if (i12 <= i13) {
                f12 = 100.0f * (i12 / i13);
            }
            int max2 = (int) Math.max(1.0f, f12);
            int i14 = 0;
            int i15 = 0;
            while (true) {
                arrayList = this.f24592c;
                if (i14 >= arrayList.size()) {
                    break;
                }
                j4 j4Var = (j4) arrayList.get(i14);
                if (j4Var.f24556f.hasImageSet() && j4Var.f24556f.getBitmap() != null) {
                    i15 |= 1 << i14;
                }
                i14++;
            }
            Bitmap bitmap = this.f24609w;
            if (bitmap == null || this.f24612z != i9 || this.f24611y != i15 || this.A != max || this.B != max2) {
                this.f24611y = i15;
                this.f24612z = i9;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f24609w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f24609w);
                float f13 = max / this.f24595g;
                canvas2.scale(f13, f13);
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    j4 j4Var2 = (j4) arrayList.get(i16);
                    ImageReceiver imageReceiver = j4Var2.f24556f;
                    int i17 = j4Var2.f24552a;
                    int i18 = j4Var2.f24553b;
                    imageReceiver.setImageCoords(i17, i18, j4Var2.f24554c - i17, j4Var2.d - i18);
                    j4Var2.f24556f.draw(canvas2);
                }
                Utilities.stackBlurBitmap(this.f24609w, 12);
                if (this.f24610x == null) {
                    this.f24610x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f24610x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f24609w != null) {
                canvas.save();
                canvas.translate(this.d, this.f24593e);
                canvas.scale(this.f24595g / this.f24609w.getWidth(), this.f24595g / this.f24609w.getWidth());
                this.f24610x.setAlpha((int) (f10 * 255.0f));
                canvas.drawBitmap(this.f24609w, 0.0f, 0.0f, this.f24610x);
                canvas.restore();
            }
        }
    }

    public final j4 d(float f10, float f11) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f24592c;
            if (i9 < arrayList.size()) {
                if (((j4) arrayList.get(i9)).f24556f.isInsideImage(f10, f11)) {
                    return (j4) arrayList.get(i9);
                }
                i9++;
            } else {
                return null;
            }
        }
    }

    public final void e() {
        if (this.C) {
            this.C = false;
            dh.k kVar = this.f24599l;
            if (kVar != null) {
                kVar.a(this.f24590a);
            }
            int i9 = 0;
            while (true) {
                ArrayList arrayList = this.f24592c;
                if (i9 < arrayList.size()) {
                    j4 j4Var = (j4) arrayList.get(i9);
                    if (j4Var.I) {
                        j4Var.I = false;
                        j4Var.f24556f.onDetachedFromWindow();
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z10;
        j4 j4Var;
        t1 t1Var;
        boolean z11;
        boolean z12;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            j4 d = d(x10, y10);
            this.f24602o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.C;
                if (radialProgress2.f26474i.f27111q != 4 && radialProgress2.f26468a.contains(x10, y10)) {
                    z12 = true;
                    this.f24603p = z12;
                }
            }
            z12 = false;
            this.f24603p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            j4 d9 = d(x10, y10);
            if (d9 != null) {
                RadialProgress2 radialProgress22 = d9.C;
                if (radialProgress22.f26474i.f27111q != 4 && radialProgress22.f26468a.contains(x10, y10)) {
                    z10 = true;
                    j4Var = this.f24602o;
                    if (j4Var != null && j4Var == d9) {
                        t1Var = this.f24590a;
                        if (t1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = t1Var.getMessageObject();
                            if (!this.f24603p && z10 && d9.C.f26474i.f27111q == 3 && messageObject != null) {
                                if (messageObject.isSending()) {
                                    SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                                }
                            } else {
                                k1 delegate = t1Var.getDelegate();
                                j4 j4Var2 = this.f24602o;
                                ImageReceiver imageReceiver = j4Var2.f24556f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = j4Var2.A;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.L1(t1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f24603p = false;
                    this.f24602o = null;
                }
            }
            z10 = false;
            j4Var = this.f24602o;
            if (j4Var != null) {
                t1Var = this.f24590a;
                if (t1Var.getDelegate() != null) {
                    MessageObject messageObject2 = t1Var.getMessageObject();
                    if (!this.f24603p) {
                    }
                    k1 delegate2 = t1Var.getDelegate();
                    j4 j4Var22 = this.f24602o;
                    ImageReceiver imageReceiver2 = j4Var22.f24556f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = j4Var22.A;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.L1(t1Var, messageExtendedMedia2);
                }
            }
            this.f24603p = false;
            this.f24602o = null;
        }
        if (this.f24602o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24601n.c(z11);
        if (this.f24602o == null) {
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
        int i9;
        float f10;
        int i10;
        int i11;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z14;
        t1 t1Var = this.f24590a;
        if (t1Var.Hc <= 0 && (!t1Var.f25525q1 || TextUtils.isEmpty(messageObject.caption))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((t1Var.f25525q1 || TextUtils.isEmpty(messageObject.caption)) && t1Var.J.f10749s && !t1Var.f25381f9) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i17 = this.f24600m;
        if (i17 > 0) {
            f10 = 1000.0f / this.f24591b.d;
            this.f24594f = i17;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f24594f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                int min = Math.min(t1Var.getParentWidth(), AndroidUtilities.displaySize.y);
                if (t1Var.M0(messageObject)) {
                    i9 = 10;
                } else {
                    i9 = 0;
                }
                this.f24594f = min - AndroidUtilities.dp(i9 + 64);
            }
            if (t1Var.z3()) {
                this.f24594f -= AndroidUtilities.dp(52.0f);
            }
            f10 = 1.0f;
        }
        i4 i4Var = this.f24591b;
        this.f24595g = (int) ((i4Var.d / 1000.0f) * f10 * this.f24594f);
        this.h = (int) (i4Var.f24508g * i4Var.f24509i);
        this.f24596i = false;
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        if (SharedConfig.bubbleRadius > 2) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        int dp3 = AndroidUtilities.dp(i10 - i11);
        int min2 = Math.min(AndroidUtilities.dp(3.0f), dp3);
        int i18 = 0;
        while (true) {
            ArrayList arrayList = this.f24592c;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i18 >= arrayList.size()) {
                break;
            }
            j4 j4Var = (j4) arrayList.get(i18);
            i4 i4Var2 = this.f24591b;
            TLRPC.MessageExtendedMedia messageExtendedMedia = j4Var.A;
            ImageReceiver imageReceiver = j4Var.f24556f;
            if (messageExtendedMedia == null) {
                i4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) i4Var2.f24505c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z12 = z10;
                z13 = z11;
                i12 = dp;
            } else {
                float f11 = this.f24594f;
                int i19 = (int) ((groupedMessagePosition.left / 1000.0f) * f10 * f11);
                z12 = z10;
                float f12 = groupedMessagePosition.top;
                float f13 = this.f24591b.f24509i;
                int i20 = (int) (f12 * f13);
                int i21 = (int) (groupedMessagePosition.f19646ph * f13);
                int i22 = (int) ((groupedMessagePosition.pw / 1000.0f) * f10 * f11);
                int i23 = groupedMessagePosition.flags;
                if ((i23 & 1) == 0) {
                    i19 += dp;
                    i22 -= dp;
                }
                if ((i23 & 4) == 0) {
                    i20 += dp;
                    i21 -= dp;
                }
                int i24 = i20;
                int i25 = i21;
                if ((i23 & 2) == 0) {
                    i22 -= dp;
                }
                int i26 = i22;
                if ((i23 & 8) == 0) {
                    i25 -= dp;
                }
                z13 = z11;
                int i27 = i25;
                j4Var.f24552a = i19;
                j4Var.f24553b = i24;
                i12 = dp;
                j4Var.f24554c = i19 + i26;
                j4Var.d = i24 + i27;
                imageReceiver.setImageCoords(i19, i24, i26, i27);
                int i28 = groupedMessagePosition.flags;
                int i29 = i28 & 4;
                if (i29 != 0 && (i28 & 1) != 0 && !z12) {
                    i13 = dp3;
                } else {
                    i13 = dp2;
                }
                if (i29 != 0 && (i28 & 2) != 0 && !z12) {
                    i14 = dp3;
                } else {
                    i14 = dp2;
                }
                int i30 = i28 & 8;
                if (i30 != 0 && (i28 & 1) != 0 && !z13) {
                    i15 = dp3;
                } else {
                    i15 = dp2;
                }
                if (i30 != 0 && (i28 & 2) != 0 && !z13) {
                    i16 = dp3;
                } else {
                    i16 = dp2;
                }
                if (!z13) {
                    if (messageObject.isOutOwner()) {
                        i16 = dp2;
                    } else {
                        i15 = dp2;
                    }
                }
                if (!z12 && t1Var.A) {
                    if (messageObject.isOutOwner()) {
                        i14 = min2;
                    } else {
                        i13 = min2;
                    }
                }
                imageReceiver.setRoundRadius(i13, i14, i16, i15);
                float[] fArr = j4Var.f24559s;
                float f14 = i13;
                fArr[1] = f14;
                fArr[0] = f14;
                float f15 = i14;
                fArr[3] = f15;
                fArr[2] = f15;
                float f16 = i16;
                fArr[5] = f16;
                fArr[4] = f16;
                float f17 = i15;
                fArr[7] = f17;
                fArr[6] = f17;
                if (messageObject != null && messageObject.isSending()) {
                    j4Var.b(3);
                }
                if (!this.f24596i && !j4Var.h) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                this.f24596i = z14;
            }
            i18++;
            z10 = z12;
            dp = i12;
            z11 = z13;
        }
        if (this.f24596i) {
            if (messageObject == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                nz0 nz0Var = new nz0(gh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.f24604q = nz0Var;
                if (nz0Var.f31223c > this.f24595g - AndroidUtilities.dp(30.0f)) {
                    this.f24604q = new nz0(gh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
