package org.telegram.ui.Cells;

import ai.nd;
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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zr;
public final class j4 {
    public int A;
    public int B;
    public boolean C;
    public final t1 f22567a;
    public h4 f22568b;
    public int d;
    public int e;
    public int f22570f;
    public int f22571g;
    public int h;
    public boolean f22572i;
    public final org.telegram.ui.Components.d6 f22573j;
    public aa0 f22574k;
    public final wh.f f22575l;
    public int f22576m;
    public final wc f22577n;
    public i4 f22578o;
    public boolean f22579p;
    public h11 f22580q;
    public h11 f22581r;
    public long f22582s;
    public Bitmap f22585w;
    public Paint f22586x;
    public int f22587y;
    public int f22588z;
    public final ArrayList f22569c = new ArrayList();
    public final Path f22583t = new Path();
    public final Path f22584u = new Path();
    public final RectF v = new RectF();

    public j4(t1 t1Var) {
        this.f22567a = t1Var;
        this.f22575l = wh.f.e(t1Var);
        this.f22573j = new org.telegram.ui.Components.d6(t1Var, 0L, 350L, zr.h);
        this.f22577n = new wc(t1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f22569c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((i4) obj).f22494f.getVisible()) {
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
        float f7;
        float f10;
        float f11;
        float f12;
        Path path2;
        float f13;
        int a2;
        int max;
        Canvas canvas2 = canvas;
        if (this.f22568b != null) {
            boolean z10 = this.f22572i;
            org.telegram.ui.Components.d6 d6Var = this.f22573j;
            float e = d6Var.e(z10);
            float e7 = d6Var.e(this.f22572i);
            t1 t1Var2 = this.f22567a;
            MessageObject messageObject = t1Var2.getMessageObject();
            Path path3 = this.f22584u;
            path3.rewind();
            float f14 = Float.MAX_VALUE;
            float f15 = Float.MIN_VALUE;
            float f16 = Float.MIN_VALUE;
            int i10 = 0;
            float f17 = Float.MAX_VALUE;
            while (true) {
                arrayList = this.f22569c;
                if (i10 >= arrayList.size()) {
                    break;
                }
                i4 i4Var = (i4) arrayList.get(i10);
                ImageReceiver imageReceiver = i4Var.f22494f;
                RadialProgress2 radialProgress2 = i4Var.G;
                int i11 = this.d;
                int i12 = i4Var.f22491a;
                float f18 = e;
                int i13 = this.e;
                int i14 = i4Var.f22492b;
                float f19 = e7;
                t1 t1Var3 = t1Var2;
                imageReceiver.setImageCoords(i11 + i12, i13 + i14, i4Var.f22493c - i12, i4Var.d - i14);
                imageReceiver.draw(canvas2);
                if (imageReceiver.getAnimation() != null) {
                    imageReceiver.getAnimation().getClass();
                    int round = Math.round(((float) 0) / 1000.0f);
                    if (!i4Var.f22499x && i4Var.K != (max = Math.max(0, i4Var.J - round))) {
                        i4Var.K = max;
                        i4Var.L = new h11(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                    }
                }
                if (f19 > 0.0f) {
                    float min = Math.min(this.d + i4Var.f22491a, f17);
                    float min2 = Math.min(this.e + i4Var.f22492b, f14);
                    f16 = Math.max(this.d + i4Var.f22493c, f16);
                    f15 = Math.max(this.e + i4Var.d, f15);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i15 = this.d;
                    int i16 = this.e;
                    rectF2.set(i4Var.f22491a + i15, i4Var.f22492b + i16, i15 + i4Var.f22493c, i16 + i4Var.d);
                    path3.addRoundRect(rectF2, i4Var.f22497s, Path.Direction.CW);
                    f14 = min2;
                    f17 = min;
                }
                radialProgress2.g(org.telegram.ui.ActionBar.k6.f21336le, org.telegram.ui.ActionBar.k6.f21355me, org.telegram.ui.ActionBar.k6.f21375ne, org.telegram.ui.ActionBar.k6.f21393oe);
                RectF rectF3 = radialProgress2.f24451a;
                float f20 = f14;
                rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.f24470x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.f24470x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.f24470x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.f24470x + imageReceiver.getImageY());
                if (messageObject.isSending()) {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                    long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(i4Var.F);
                    boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                    if (fileProgressSizes == null && isSendingPaidMessage) {
                        radialProgress2.p(1.0f, true);
                        if (i4Var.f22498w) {
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
                e = f18;
                t1Var2 = t1Var3;
                e7 = f19;
            }
            float f21 = e;
            float f22 = e7;
            t1 t1Var4 = t1Var2;
            if (f22 > 0.0f) {
                canvas2.save();
                canvas2.clipPath(path3);
                canvas2.translate(f17, f14);
                int i17 = (int) (f16 - f17);
                int i18 = (int) (f15 - f14);
                canvas2.saveLayerAlpha(0.0f, 0.0f, i17, i18, (int) (f22 * 255.0f), 31);
                this.f22575l.c(canvas, t1Var4, i17, i18, 1.0f, t1Var4.pe);
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
                path = this.f22583t;
                if (i19 >= size) {
                    break;
                }
                i4 i4Var2 = (i4) arrayList.get(i19);
                if (i4Var2.L != null) {
                    float dp = AndroidUtilities.dp(11.4f) + i4Var2.L.f26843c;
                    float dp2 = AndroidUtilities.dp(17.0f);
                    float dp3 = AndroidUtilities.dp(5.0f);
                    float f23 = this.d + i4Var2.f22491a + dp3;
                    float f24 = this.e + i4Var2.f22492b + dp3;
                    rectF.set(f23, f24, dp + f23, f24 + dp2);
                    if (this.f22581r == null || rectF.right <= ((this.d + this.f22571g) - (AndroidUtilities.dp(11.32f) + this.f22581r.f26843c)) - dp3 || rectF.top > this.e + dp3) {
                        path.rewind();
                        float f25 = dp2 / 2.0f;
                        path.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        f13 = f22;
                        c(canvas2, f13);
                        canvas2.drawColor(org.telegram.ui.ActionBar.k6.o1(1.0f, 1073741824));
                        i4Var2.L.c(this.d + i4Var2.f22491a + dp3 + AndroidUtilities.dp(5.66f), this.e + i4Var2.f22492b + dp3 + f25, 1.0f, -1, canvas2);
                        canvas2.restore();
                        i19++;
                        f22 = f13;
                    }
                }
                f13 = f22;
                i19++;
                f22 = f13;
            }
            if (this.f22580q != null && f21 > 0.0f) {
                float a10 = this.f22577n.a(0.05f);
                float dp4 = AndroidUtilities.dp(28.0f) + this.f22580q.f26843c;
                float dp5 = AndroidUtilities.dp(32.0f);
                float f26 = this.d;
                float f27 = this.f22571g;
                float z11 = com.google.android.gms.internal.play_billing.k3.z(f27, dp4, 2.0f, f26);
                f7 = 11.32f;
                float f28 = this.e;
                f10 = 5.0f;
                float f29 = this.h;
                f11 = 17.0f;
                rectF.set(z11, com.google.android.gms.internal.play_billing.k3.z(f29, dp5, 2.0f, f28), org.telegram.messenger.v0.a(f27, dp4, 2.0f, f26), org.telegram.messenger.v0.a(f29, dp5, 2.0f, f28));
                path.rewind();
                float f30 = dp5 / 2.0f;
                path.addRoundRect(rectF, f30, f30, Path.Direction.CW);
                canvas2.save();
                canvas2.scale(a10, a10, (this.f22571g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
                canvas2.save();
                canvas2.clipPath(path);
                f12 = f21;
                c(canvas2, f12);
                canvas2.drawColor(org.telegram.ui.ActionBar.k6.o1(f12, 1342177280));
                path2 = path;
                this.f22580q.c((((this.f22571g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.e + (this.h / 2.0f), f12, -1, canvas2);
                canvas2.restore();
                if (t1Var.getDelegate() != null && t1Var.getDelegate().Z0(5, t1Var)) {
                    aa0 aa0Var = this.f22574k;
                    if (aa0Var == null) {
                        aa0 aa0Var2 = new aa0();
                        this.f22574k = aa0Var2;
                        aa0Var2.setCallback(t1Var);
                        this.f22574k.g(org.telegram.ui.ActionBar.k6.o1(0.1f, -1), org.telegram.ui.ActionBar.k6.o1(0.3f, -1), org.telegram.ui.ActionBar.k6.o1(0.35f, -1), org.telegram.ui.ActionBar.k6.o1(0.8f, -1));
                        aa0 aa0Var3 = this.f22574k;
                        aa0Var3.D = true;
                        aa0Var3.f24703x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    } else if (aa0Var.c() || this.f22574k.d()) {
                        aa0 aa0Var4 = this.f22574k;
                        aa0Var4.f24685b = -1L;
                        aa0Var4.f24686c = -1L;
                    }
                } else {
                    aa0 aa0Var5 = this.f22574k;
                    if (aa0Var5 != null && !aa0Var5.d() && !this.f22574k.c()) {
                        this.f22574k.a();
                    }
                }
                aa0 aa0Var6 = this.f22574k;
                if (aa0Var6 != null) {
                    aa0Var6.e(rectF);
                    this.f22574k.k(f30);
                    this.f22574k.setAlpha((int) (f12 * 255.0f));
                    this.f22574k.draw(canvas2);
                }
                canvas2.restore();
            } else {
                f7 = 11.32f;
                f10 = 5.0f;
                f11 = 17.0f;
                f12 = f21;
                path2 = path;
            }
            if (this.f22581r != null && f12 < 1.0f && a()) {
                float timeAlpha = t1Var.getTimeAlpha() * (1.0f - f12);
                float dp6 = AndroidUtilities.dp(f7) + this.f22581r.f26843c;
                float dp7 = AndroidUtilities.dp(f11);
                float dp8 = AndroidUtilities.dp(f10);
                float f31 = this.d + this.f22571g;
                float f32 = this.e + dp8;
                rectF.set((f31 - dp6) - dp8, f32, f31 - dp8, f32 + dp7);
                path2.rewind();
                float f33 = dp7 / 2.0f;
                path2.addRoundRect(rectF, f33, f33, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path2);
                canvas2.drawColor(org.telegram.ui.ActionBar.k6.o1(timeAlpha, 1073741824));
                this.f22581r.c((((this.d + this.f22571g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.e + dp8 + f33, timeAlpha, -1, canvas2);
                canvas.restore();
            }
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        float f10;
        ArrayList arrayList;
        int i11;
        int i12;
        if (this.f22568b != null) {
            t1 t1Var = this.f22567a;
            if (t1Var.getMessageObject() != null) {
                i10 = t1Var.getMessageObject().getId();
            } else {
                i10 = 0;
            }
            int i13 = this.f22571g;
            int i14 = this.h;
            float f11 = 100.0f;
            if (i13 > i14) {
                f10 = 100.0f;
            } else {
                f10 = (i13 / i14) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f10);
            int i15 = this.h;
            int i16 = this.f22571g;
            if (i15 <= i16) {
                f11 = 100.0f * (i15 / i16);
            }
            int max2 = (int) Math.max(1.0f, f11);
            int i17 = 0;
            int i18 = 0;
            while (true) {
                arrayList = this.f22569c;
                if (i17 >= arrayList.size()) {
                    break;
                }
                i4 i4Var = (i4) arrayList.get(i17);
                if (i4Var.f22494f.hasImageSet() && i4Var.f22494f.getBitmap() != null) {
                    i18 |= 1 << i17;
                }
                i17++;
            }
            Bitmap bitmap = this.f22585w;
            if (bitmap == null || this.f22588z != i10 || this.f22587y != i18 || this.A != max || this.B != max2) {
                this.f22587y = i18;
                this.f22588z = i10;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f22585w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f22585w);
                float f12 = max / this.f22571g;
                canvas2.scale(f12, f12);
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    i4 i4Var2 = (i4) arrayList.get(i19);
                    i4Var2.f22494f.setImageCoords(i4Var2.f22491a, i4Var2.f22492b, i4Var2.f22493c - i11, i4Var2.d - i12);
                    i4Var2.f22494f.draw(canvas2);
                }
                Utilities.stackBlurBitmap(this.f22585w, 12);
                if (this.f22586x == null) {
                    this.f22586x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f22586x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f22585w != null) {
                canvas.save();
                canvas.translate(this.d, this.e);
                canvas.scale(this.f22571g / this.f22585w.getWidth(), this.f22571g / this.f22585w.getWidth());
                this.f22586x.setAlpha((int) (f7 * 255.0f));
                canvas.drawBitmap(this.f22585w, 0.0f, 0.0f, this.f22586x);
                canvas.restore();
            }
        }
    }

    public final i4 d(float f7, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22569c;
            if (i10 < arrayList.size()) {
                if (((i4) arrayList.get(i10)).f22494f.isInsideImage(f7, f10)) {
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
            wh.f fVar = this.f22575l;
            if (fVar != null) {
                fVar.a(this.f22567a);
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f22569c;
                if (i10 < arrayList.size()) {
                    i4 i4Var = (i4) arrayList.get(i10);
                    if (i4Var.M) {
                        i4Var.M = false;
                        i4Var.f22494f.onDetachedFromWindow();
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
            this.f22578o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.G;
                if (radialProgress2.f24456i.f28563q != 4 && radialProgress2.f24451a.contains(x10, y3)) {
                    z12 = true;
                    this.f22579p = z12;
                }
            }
            z12 = false;
            this.f22579p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            i4 d10 = d(x10, y3);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.G;
                if (radialProgress22.f24456i.f28563q != 4 && radialProgress22.f24451a.contains(x10, y3)) {
                    z10 = true;
                    i4Var = this.f22578o;
                    if (i4Var != null && i4Var == d10) {
                        t1Var = this.f22567a;
                        if (t1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = t1Var.getMessageObject();
                            if (!this.f22579p && z10 && d10.G.f24456i.f28563q == 3 && messageObject != null) {
                                if (messageObject.isSending()) {
                                    SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                                }
                            } else {
                                k1 delegate = t1Var.getDelegate();
                                i4 i4Var2 = this.f22578o;
                                ImageReceiver imageReceiver = i4Var2.f22494f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = i4Var2.E;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.M1(t1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f22579p = false;
                    this.f22578o = null;
                }
            }
            z10 = false;
            i4Var = this.f22578o;
            if (i4Var != null) {
                t1Var = this.f22567a;
                if (t1Var.getDelegate() != null) {
                    MessageObject messageObject2 = t1Var.getMessageObject();
                    if (!this.f22579p) {
                    }
                    k1 delegate2 = t1Var.getDelegate();
                    i4 i4Var22 = this.f22578o;
                    ImageReceiver imageReceiver2 = i4Var22.f22494f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = i4Var22.E;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.M1(t1Var, messageExtendedMedia2);
                }
            }
            this.f22579p = false;
            this.f22578o = null;
        }
        if (this.f22578o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22577n.c(z11);
        if (this.f22578o == null) {
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
        t1 t1Var = this.f22567a;
        boolean z15 = false;
        if (t1Var.Lc <= 0 && (!t1Var.f23594u1 || TextUtils.isEmpty(messageObject.caption))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((t1Var.f23594u1 || TextUtils.isEmpty(messageObject.caption)) && t1Var.N.f807s && !t1Var.f23444j9) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i18 = this.f22576m;
        float f10 = 1000.0f;
        if (i18 > 0) {
            f7 = 1000.0f / this.f22568b.d;
            this.f22570f = i18;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f22570f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                int min = Math.min(t1Var.getParentWidth(), AndroidUtilities.displaySize.y);
                if (t1Var.L0(messageObject)) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                this.f22570f = min - AndroidUtilities.dp(i10 + 64);
            }
            if (t1Var.y3()) {
                this.f22570f -= AndroidUtilities.dp(52.0f);
            }
            f7 = 1.0f;
        }
        h4 h4Var = this.f22568b;
        this.f22571g = (int) ((h4Var.d / 1000.0f) * f7 * this.f22570f);
        this.h = (int) (h4Var.f22465g * h4Var.f22466i);
        this.f22572i = false;
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        char c10 = 2;
        if (SharedConfig.bubbleRadius > 2) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        int dp3 = AndroidUtilities.dp(i11 - i12);
        int min2 = Math.min(AndroidUtilities.dp(3.0f), dp3);
        int i19 = 0;
        while (true) {
            ArrayList arrayList = this.f22569c;
            float f11 = f10;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i19 >= arrayList.size()) {
                break;
            }
            i4 i4Var = (i4) arrayList.get(i19);
            h4 h4Var2 = this.f22568b;
            char c11 = c10;
            TLRPC.MessageExtendedMedia messageExtendedMedia = i4Var.E;
            boolean z16 = z15;
            ImageReceiver imageReceiver = i4Var.f22494f;
            if (messageExtendedMedia == null) {
                h4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) h4Var2.f22463c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z12 = z10;
                z13 = z11;
                i13 = dp;
            } else {
                float f12 = this.f22570f;
                int i20 = (int) ((groupedMessagePosition.left / f11) * f7 * f12);
                z12 = z10;
                float f13 = groupedMessagePosition.top;
                float f14 = this.f22568b.f22466i;
                int i21 = (int) (f13 * f14);
                int i22 = (int) (groupedMessagePosition.f17859ph * f14);
                int i23 = (int) ((groupedMessagePosition.pw / f11) * f7 * f12);
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
                i4Var.f22491a = i20;
                i4Var.f22492b = i25;
                i13 = dp;
                i4Var.f22493c = i20 + i27;
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
                float[] fArr = i4Var.f22497s;
                float f15 = i14;
                fArr[1] = f15;
                fArr[z16 ? 1 : 0] = f15;
                float f16 = i15;
                fArr[3] = f16;
                fArr[c11] = f16;
                float f17 = i17;
                fArr[5] = f17;
                fArr[4] = f17;
                float f18 = i16;
                fArr[7] = f18;
                fArr[6] = f18;
                if (messageObject != null && messageObject.isSending()) {
                    i4Var.b(3);
                }
                if (!this.f22572i && !i4Var.h) {
                    z14 = z16 ? 1 : 0;
                } else {
                    z14 = true;
                }
                this.f22572i = z14;
            }
            i19++;
            f10 = f11;
            c10 = c11;
            z15 = z16 ? 1 : 0;
            z10 = z12;
            dp = i13;
            z11 = z13;
        }
        boolean z17 = z15;
        if (this.f22572i) {
            if (messageObject == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                h11 h11Var = new h11(nd.Y0(z17, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.f22580q = h11Var;
                if (h11Var.f26843c > this.f22571g - AndroidUtilities.dp(30.0f)) {
                    this.f22580q = new h11(nd.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
