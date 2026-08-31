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
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public final class k4 {
    public int A;
    public int B;
    public boolean C;
    public final t1 f23045a;
    public i4 f23046b;
    public int d;
    public int f23048e;
    public int f23049f;
    public int f23050g;
    public int h;
    public boolean f23051i;
    public final org.telegram.ui.Components.z5 f23052j;
    public k90 f23053k;
    public final jh.j f23054l;
    public int f23055m;
    public final rc f23056n;
    public j4 f23057o;
    public boolean f23058p;
    public l01 f23059q;
    public l01 f23060r;
    public long f23061s;
    public Bitmap f23064w;
    public Paint f23065x;
    public int f23066y;
    public int f23067z;
    public final ArrayList f23047c = new ArrayList();
    public final Path f23062t = new Path();
    public final Path f23063u = new Path();
    public final RectF v = new RectF();

    public k4(t1 t1Var) {
        this.f23045a = t1Var;
        this.f23054l = jh.j.e(t1Var);
        this.f23052j = new org.telegram.ui.Components.z5(t1Var, 0L, 350L, pr.h);
        this.f23056n = new rc(t1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f23047c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((j4) obj).f23009f.getVisible()) {
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
        if (this.f23046b != null) {
            boolean z4 = this.f23051i;
            org.telegram.ui.Components.z5 z5Var = this.f23052j;
            float e6 = z5Var.e(z4);
            float e10 = z5Var.e(this.f23051i);
            t1 t1Var2 = this.f23045a;
            MessageObject messageObject = t1Var2.getMessageObject();
            Path path3 = this.f23063u;
            path3.rewind();
            float f15 = Float.MAX_VALUE;
            float f16 = Float.MAX_VALUE;
            float f17 = Float.MIN_VALUE;
            float f18 = Float.MIN_VALUE;
            int i10 = 0;
            while (true) {
                arrayList = this.f23047c;
                if (i10 >= arrayList.size()) {
                    break;
                }
                j4 j4Var = (j4) arrayList.get(i10);
                ImageReceiver imageReceiver = j4Var.f23009f;
                RadialProgress2 radialProgress2 = j4Var.D;
                int i11 = this.d;
                int i12 = j4Var.f23005a;
                float f19 = e6;
                int i13 = this.f23048e;
                int i14 = j4Var.f23006b;
                float f20 = e10;
                t1 t1Var3 = t1Var2;
                imageReceiver.setImageCoords(i11 + i12, i13 + i14, j4Var.f23007c - i12, j4Var.d - i14);
                imageReceiver.draw(canvas2);
                if (imageReceiver.getAnimation() != null) {
                    imageReceiver.getAnimation().getClass();
                    int round = Math.round(((float) 0) / 1000.0f);
                    if (!j4Var.f23014x && j4Var.H != (max = Math.max(0, j4Var.G - round))) {
                        j4Var.H = max;
                        j4Var.I = new l01(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                    }
                }
                if (f20 > 0.0f) {
                    float min = Math.min(this.d + j4Var.f23005a, f16);
                    float min2 = Math.min(this.f23048e + j4Var.f23006b, f15);
                    f18 = Math.max(this.d + j4Var.f23007c, f18);
                    f17 = Math.max(this.f23048e + j4Var.d, f17);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i15 = this.d;
                    int i16 = this.f23048e;
                    rectF2.set(j4Var.f23005a + i15, j4Var.f23006b + i16, i15 + j4Var.f23007c, i16 + j4Var.d);
                    path3.addRoundRect(rectF2, j4Var.f23012s, Path.Direction.CW);
                    f15 = min2;
                    f16 = min;
                }
                radialProgress2.g(org.telegram.ui.ActionBar.k6.f21811le, org.telegram.ui.ActionBar.k6.f21828me, org.telegram.ui.ActionBar.k6.f21846ne, org.telegram.ui.ActionBar.k6.f21864oe);
                RectF rectF3 = radialProgress2.f24966a;
                float f21 = f15;
                rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.f24986x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.f24986x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.f24986x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.f24986x + imageReceiver.getImageY());
                if (messageObject.isSending()) {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                    long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(j4Var.C);
                    boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                    if (fileProgressSizes == null && isSendingPaidMessage) {
                        radialProgress2.o(1.0f, true);
                        if (j4Var.f23013w) {
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
                i10++;
                f15 = f21;
                e6 = f19;
                t1Var2 = t1Var3;
                e10 = f20;
            }
            float f22 = e6;
            float f23 = e10;
            t1 t1Var4 = t1Var2;
            if (f23 > 0.0f) {
                canvas2.save();
                canvas2.clipPath(path3);
                canvas2.translate(f16, f15);
                int i17 = (int) (f18 - f16);
                int i18 = (int) (f17 - f15);
                canvas2.saveLayerAlpha(0.0f, 0.0f, i17, i18, (int) (f23 * 255.0f), 31);
                this.f23054l.c(canvas, t1Var4, i17, i18, 1.0f, t1Var4.f23939le);
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
                path = this.f23062t;
                if (i19 >= size) {
                    break;
                }
                j4 j4Var2 = (j4) arrayList.get(i19);
                if (j4Var2.I != null) {
                    float dp = AndroidUtilities.dp(11.4f) + j4Var2.I.f28521c;
                    float dp2 = AndroidUtilities.dp(17.0f);
                    float dp3 = AndroidUtilities.dp(5.0f);
                    float f24 = this.d + j4Var2.f23005a + dp3;
                    float f25 = this.f23048e + j4Var2.f23006b + dp3;
                    rectF.set(f24, f25, dp + f24, f25 + dp2);
                    if (this.f23060r == null || rectF.right <= ((this.d + this.f23050g) - (AndroidUtilities.dp(11.32f) + this.f23060r.f28521c)) - dp3 || rectF.top > this.f23048e + dp3) {
                        path.rewind();
                        float f26 = dp2 / 2.0f;
                        path.addRoundRect(rectF, f26, f26, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        f14 = f23;
                        c(canvas2, f14);
                        canvas2.drawColor(org.telegram.ui.ActionBar.k6.l1(1.0f, 1073741824));
                        j4Var2.I.c(this.d + j4Var2.f23005a + dp3 + AndroidUtilities.dp(5.66f), this.f23048e + j4Var2.f23006b + dp3 + f26, 1.0f, -1, canvas2);
                        canvas2.restore();
                        i19++;
                        f23 = f14;
                    }
                }
                f14 = f23;
                i19++;
                f23 = f14;
            }
            if (this.f23059q != null && f22 > 0.0f) {
                float a10 = this.f23056n.a(0.05f);
                float dp4 = AndroidUtilities.dp(28.0f) + this.f23059q.f28521c;
                float dp5 = AndroidUtilities.dp(32.0f);
                float f27 = this.d;
                float f28 = this.f23050g;
                float x10 = e2.c.x(f28, dp4, 2.0f, f27);
                f11 = 11.32f;
                float f29 = this.f23048e;
                f12 = 5.0f;
                float f30 = this.h;
                f13 = 17.0f;
                rectF.set(x10, e2.c.x(f30, dp5, 2.0f, f29), l.d.b(f28, dp4, 2.0f, f27), l.d.b(f30, dp5, 2.0f, f29));
                path.rewind();
                float f31 = dp5 / 2.0f;
                path.addRoundRect(rectF, f31, f31, Path.Direction.CW);
                canvas2.save();
                canvas2.scale(a10, a10, (this.f23050g / 2.0f) + this.d, (this.h / 2.0f) + this.f23048e);
                canvas2.save();
                canvas2.clipPath(path);
                f10 = f22;
                c(canvas2, f10);
                canvas2.drawColor(org.telegram.ui.ActionBar.k6.l1(f10, 1342177280));
                path2 = path;
                this.f23059q.c((((this.f23050g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.f23048e + (this.h / 2.0f), f10, -1, canvas2);
                canvas2.restore();
                if (t1Var.getDelegate() != null && t1Var.getDelegate().g1(5, t1Var)) {
                    k90 k90Var = this.f23053k;
                    if (k90Var == null) {
                        k90 k90Var2 = new k90();
                        this.f23053k = k90Var2;
                        k90Var2.setCallback(t1Var);
                        this.f23053k.f(org.telegram.ui.ActionBar.k6.l1(0.1f, -1), org.telegram.ui.ActionBar.k6.l1(0.3f, -1), org.telegram.ui.ActionBar.k6.l1(0.35f, -1), org.telegram.ui.ActionBar.k6.l1(0.8f, -1));
                        k90 k90Var3 = this.f23053k;
                        k90Var3.C = true;
                        k90Var3.f28347w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    } else if (k90Var.b() || this.f23053k.c()) {
                        k90 k90Var4 = this.f23053k;
                        k90Var4.f28329b = -1L;
                        k90Var4.f28330c = -1L;
                    }
                } else {
                    k90 k90Var5 = this.f23053k;
                    if (k90Var5 != null && !k90Var5.c() && !this.f23053k.b()) {
                        this.f23053k.a();
                    }
                }
                k90 k90Var6 = this.f23053k;
                if (k90Var6 != null) {
                    k90Var6.d(rectF);
                    this.f23053k.j(f31);
                    this.f23053k.setAlpha((int) (f10 * 255.0f));
                    this.f23053k.draw(canvas2);
                }
                canvas2.restore();
            } else {
                path2 = path;
                f10 = f22;
                f11 = 11.32f;
                f12 = 5.0f;
                f13 = 17.0f;
            }
            if (this.f23060r != null && f10 < 1.0f && a()) {
                float timeAlpha = t1Var.getTimeAlpha() * (1.0f - f10);
                float dp6 = AndroidUtilities.dp(f11) + this.f23060r.f28521c;
                float dp7 = AndroidUtilities.dp(f13);
                float dp8 = AndroidUtilities.dp(f12);
                float f32 = this.d + this.f23050g;
                float f33 = this.f23048e + dp8;
                rectF.set((f32 - dp6) - dp8, f33, f32 - dp8, f33 + dp7);
                path2.rewind();
                float f34 = dp7 / 2.0f;
                path2.addRoundRect(rectF, f34, f34, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path2);
                canvas2.drawColor(org.telegram.ui.ActionBar.k6.l1(timeAlpha, 1073741824));
                this.f23060r.c((((this.d + this.f23050g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.f23048e + dp8 + f34, timeAlpha, -1, canvas2);
                canvas.restore();
            }
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i10;
        float f11;
        ArrayList arrayList;
        if (this.f23046b != null) {
            t1 t1Var = this.f23045a;
            if (t1Var.getMessageObject() != null) {
                i10 = t1Var.getMessageObject().getId();
            } else {
                i10 = 0;
            }
            int i11 = this.f23050g;
            int i12 = this.h;
            float f12 = 100.0f;
            if (i11 > i12) {
                f11 = 100.0f;
            } else {
                f11 = (i11 / i12) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f11);
            int i13 = this.h;
            int i14 = this.f23050g;
            if (i13 <= i14) {
                f12 = 100.0f * (i13 / i14);
            }
            int max2 = (int) Math.max(1.0f, f12);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                arrayList = this.f23047c;
                if (i15 >= arrayList.size()) {
                    break;
                }
                j4 j4Var = (j4) arrayList.get(i15);
                if (j4Var.f23009f.hasImageSet() && j4Var.f23009f.getBitmap() != null) {
                    i16 |= 1 << i15;
                }
                i15++;
            }
            Bitmap bitmap = this.f23064w;
            if (bitmap == null || this.f23067z != i10 || this.f23066y != i16 || this.A != max || this.B != max2) {
                this.f23066y = i16;
                this.f23067z = i10;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f23064w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f23064w);
                float f13 = max / this.f23050g;
                canvas2.scale(f13, f13);
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    j4 j4Var2 = (j4) arrayList.get(i17);
                    ImageReceiver imageReceiver = j4Var2.f23009f;
                    int i18 = j4Var2.f23005a;
                    int i19 = j4Var2.f23006b;
                    imageReceiver.setImageCoords(i18, i19, j4Var2.f23007c - i18, j4Var2.d - i19);
                    j4Var2.f23009f.draw(canvas2);
                }
                Utilities.stackBlurBitmap(this.f23064w, 12);
                if (this.f23065x == null) {
                    this.f23065x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f23065x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f23064w != null) {
                canvas.save();
                canvas.translate(this.d, this.f23048e);
                canvas.scale(this.f23050g / this.f23064w.getWidth(), this.f23050g / this.f23064w.getWidth());
                this.f23065x.setAlpha((int) (f10 * 255.0f));
                canvas.drawBitmap(this.f23064w, 0.0f, 0.0f, this.f23065x);
                canvas.restore();
            }
        }
    }

    public final j4 d(float f10, float f11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23047c;
            if (i10 < arrayList.size()) {
                if (((j4) arrayList.get(i10)).f23009f.isInsideImage(f10, f11)) {
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
            jh.j jVar = this.f23054l;
            if (jVar != null) {
                jVar.a(this.f23045a);
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f23047c;
                if (i10 < arrayList.size()) {
                    j4 j4Var = (j4) arrayList.get(i10);
                    if (j4Var.J) {
                        j4Var.J = false;
                        j4Var.f23009f.onDetachedFromWindow();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z4;
        j4 j4Var;
        t1 t1Var;
        boolean z10;
        boolean z11;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            j4 d = d(x10, y10);
            this.f23057o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.D;
                if (radialProgress2.f24972i.f32701q != 4 && radialProgress2.f24966a.contains(x10, y10)) {
                    z11 = true;
                    this.f23058p = z11;
                }
            }
            z11 = false;
            this.f23058p = z11;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            j4 d10 = d(x10, y10);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.D;
                if (radialProgress22.f24972i.f32701q != 4 && radialProgress22.f24966a.contains(x10, y10)) {
                    z4 = true;
                    j4Var = this.f23057o;
                    if (j4Var != null && j4Var == d10) {
                        t1Var = this.f23045a;
                        if (t1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = t1Var.getMessageObject();
                            if (!this.f23058p && z4 && d10.D.f24972i.f32701q == 3 && messageObject != null) {
                                if (messageObject.isSending()) {
                                    SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                                }
                            } else {
                                k1 delegate = t1Var.getDelegate();
                                j4 j4Var2 = this.f23057o;
                                ImageReceiver imageReceiver = j4Var2.f23009f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = j4Var2.B;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.c2(t1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f23058p = false;
                    this.f23057o = null;
                }
            }
            z4 = false;
            j4Var = this.f23057o;
            if (j4Var != null) {
                t1Var = this.f23045a;
                if (t1Var.getDelegate() != null) {
                    MessageObject messageObject2 = t1Var.getMessageObject();
                    if (!this.f23058p) {
                    }
                    k1 delegate2 = t1Var.getDelegate();
                    j4 j4Var22 = this.f23057o;
                    ImageReceiver imageReceiver2 = j4Var22.f23009f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = j4Var22.B;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.c2(t1Var, messageExtendedMedia2);
                }
            }
            this.f23058p = false;
            this.f23057o = null;
        }
        if (this.f23057o != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23056n.c(z10);
        if (this.f23057o == null) {
            return false;
        }
        return true;
    }

    public final void g(org.telegram.messenger.MessageObject r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k4.g(org.telegram.messenger.MessageObject):void");
    }

    public final void h(MessageObject messageObject) {
        boolean z4;
        boolean z10;
        int i10;
        float f10;
        int i11;
        int i12;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z13;
        t1 t1Var = this.f23045a;
        if (t1Var.Ic <= 0 && (!t1Var.f24013r1 || TextUtils.isEmpty(messageObject.caption))) {
            z4 = false;
        } else {
            z4 = true;
        }
        if ((t1Var.f24013r1 || TextUtils.isEmpty(messageObject.caption)) && t1Var.K.f16200s && !t1Var.f23863g9) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i18 = this.f23055m;
        if (i18 > 0) {
            f10 = 1000.0f / this.f23046b.d;
            this.f23049f = i18;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f23049f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                int min = Math.min(t1Var.getParentWidth(), AndroidUtilities.displaySize.y);
                if (t1Var.M0(messageObject)) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                this.f23049f = min - AndroidUtilities.dp(i10 + 64);
            }
            if (t1Var.z3()) {
                this.f23049f -= AndroidUtilities.dp(52.0f);
            }
            f10 = 1.0f;
        }
        i4 i4Var = this.f23046b;
        this.f23050g = (int) ((i4Var.d / 1000.0f) * f10 * this.f23049f);
        this.h = (int) (i4Var.f22968g * i4Var.f22969i);
        this.f23051i = false;
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
            ArrayList arrayList = this.f23047c;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i19 >= arrayList.size()) {
                break;
            }
            j4 j4Var = (j4) arrayList.get(i19);
            i4 i4Var2 = this.f23046b;
            TLRPC.MessageExtendedMedia messageExtendedMedia = j4Var.B;
            ImageReceiver imageReceiver = j4Var.f23009f;
            if (messageExtendedMedia == null) {
                i4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) i4Var2.f22965c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z11 = z4;
                z12 = z10;
                i13 = dp;
            } else {
                float f11 = this.f23049f;
                int i20 = (int) ((groupedMessagePosition.left / 1000.0f) * f10 * f11);
                z11 = z4;
                float f12 = groupedMessagePosition.top;
                float f13 = this.f23046b.f22969i;
                int i21 = (int) (f12 * f13);
                int i22 = (int) (groupedMessagePosition.f18052ph * f13);
                int i23 = (int) ((groupedMessagePosition.pw / 1000.0f) * f10 * f11);
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
                z12 = z10;
                int i28 = i26;
                j4Var.f23005a = i20;
                j4Var.f23006b = i25;
                i13 = dp;
                j4Var.f23007c = i20 + i27;
                j4Var.d = i25 + i28;
                imageReceiver.setImageCoords(i20, i25, i27, i28);
                int i29 = groupedMessagePosition.flags;
                int i30 = i29 & 4;
                if (i30 != 0 && (i29 & 1) != 0 && !z11) {
                    i14 = dp3;
                } else {
                    i14 = dp2;
                }
                if (i30 != 0 && (i29 & 2) != 0 && !z11) {
                    i15 = dp3;
                } else {
                    i15 = dp2;
                }
                int i31 = i29 & 8;
                if (i31 != 0 && (i29 & 1) != 0 && !z12) {
                    i16 = dp3;
                } else {
                    i16 = dp2;
                }
                if (i31 != 0 && (i29 & 2) != 0 && !z12) {
                    i17 = dp3;
                } else {
                    i17 = dp2;
                }
                if (!z12) {
                    if (messageObject.isOutOwner()) {
                        i17 = dp2;
                    } else {
                        i16 = dp2;
                    }
                }
                if (!z11 && t1Var.B) {
                    if (messageObject.isOutOwner()) {
                        i15 = min2;
                    } else {
                        i14 = min2;
                    }
                }
                imageReceiver.setRoundRadius(i14, i15, i17, i16);
                float[] fArr = j4Var.f23012s;
                float f14 = i14;
                fArr[1] = f14;
                fArr[0] = f14;
                float f15 = i15;
                fArr[3] = f15;
                fArr[2] = f15;
                float f16 = i17;
                fArr[5] = f16;
                fArr[4] = f16;
                float f17 = i16;
                fArr[7] = f17;
                fArr[6] = f17;
                if (messageObject != null && messageObject.isSending()) {
                    j4Var.b(3);
                }
                if (!this.f23051i && !j4Var.h) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f23051i = z13;
            }
            i19++;
            z4 = z11;
            dp = i13;
            z10 = z12;
        }
        if (this.f23051i) {
            if (messageObject == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                l01 l01Var = new l01(mh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.f23059q = l01Var;
                if (l01Var.f28521c > this.f23050g - AndroidUtilities.dp(30.0f)) {
                    this.f23059q = new l01(mh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
