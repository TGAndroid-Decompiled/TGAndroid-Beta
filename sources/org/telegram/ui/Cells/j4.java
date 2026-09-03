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
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rc;
public final class j4 {
    public int A;
    public int B;
    public boolean C;
    public final s1 f21211a;
    public h4 f21212b;
    public int d;
    public int e;
    public int f21214f;
    public int f21215g;
    public int h;
    public boolean f21216i;
    public final org.telegram.ui.Components.z5 f21217j;
    public j90 f21218k;
    public final ih.j f21219l;
    public int f21220m;
    public final rc f21221n;
    public i4 f21222o;
    public boolean f21223p;
    public k01 f21224q;
    public k01 f21225r;
    public long f21226s;
    public Bitmap f21229w;
    public Paint f21230x;
    public int f21231y;
    public int f21232z;
    public final ArrayList f21213c = new ArrayList();
    public final Path f21227t = new Path();
    public final Path f21228u = new Path();
    public final RectF v = new RectF();

    public j4(s1 s1Var) {
        this.f21211a = s1Var;
        this.f21219l = ih.j.e(s1Var);
        this.f21217j = new org.telegram.ui.Components.z5(s1Var, 0L, 350L, mr.h);
        this.f21221n = new rc(s1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f21213c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((i4) obj).f21174f.getVisible()) {
                return false;
            }
        }
        return true;
    }

    public final void b(Canvas canvas) {
        ArrayList arrayList;
        s1 s1Var;
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
        if (this.f21212b != null) {
            boolean z4 = this.f21216i;
            org.telegram.ui.Components.z5 z5Var = this.f21217j;
            float e = z5Var.e(z4);
            float e6 = z5Var.e(this.f21216i);
            s1 s1Var2 = this.f21211a;
            MessageObject messageObject = s1Var2.getMessageObject();
            Path path3 = this.f21228u;
            path3.rewind();
            float f15 = Float.MAX_VALUE;
            float f16 = Float.MAX_VALUE;
            float f17 = Float.MIN_VALUE;
            float f18 = Float.MIN_VALUE;
            int i10 = 0;
            while (true) {
                arrayList = this.f21213c;
                if (i10 >= arrayList.size()) {
                    break;
                }
                i4 i4Var = (i4) arrayList.get(i10);
                ImageReceiver imageReceiver = i4Var.f21174f;
                RadialProgress2 radialProgress2 = i4Var.D;
                int i11 = this.d;
                int i12 = i4Var.f21171a;
                float f19 = e;
                int i13 = this.e;
                int i14 = i4Var.f21172b;
                float f20 = e6;
                s1 s1Var3 = s1Var2;
                imageReceiver.setImageCoords(i11 + i12, i13 + i14, i4Var.f21173c - i12, i4Var.d - i14);
                imageReceiver.draw(canvas2);
                if (imageReceiver.getAnimation() != null) {
                    imageReceiver.getAnimation().getClass();
                    int round = Math.round(((float) 0) / 1000.0f);
                    if (!i4Var.f21179x && i4Var.H != (max = Math.max(0, i4Var.G - round))) {
                        i4Var.H = max;
                        i4Var.I = new k01(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                    }
                }
                if (f20 > 0.0f) {
                    float min = Math.min(this.d + i4Var.f21171a, f16);
                    float min2 = Math.min(this.e + i4Var.f21172b, f15);
                    f18 = Math.max(this.d + i4Var.f21173c, f18);
                    f17 = Math.max(this.e + i4Var.d, f17);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i15 = this.d;
                    int i16 = this.e;
                    rectF2.set(i4Var.f21171a + i15, i4Var.f21172b + i16, i15 + i4Var.f21173c, i16 + i4Var.d);
                    path3.addRoundRect(rectF2, i4Var.f21177s, Path.Direction.CW);
                    f15 = min2;
                    f16 = min;
                }
                radialProgress2.g(org.telegram.ui.ActionBar.j6.f20032le, org.telegram.ui.ActionBar.j6.f20049me, org.telegram.ui.ActionBar.j6.f20067ne, org.telegram.ui.ActionBar.j6.f20085oe);
                RectF rectF3 = radialProgress2.f23085a;
                float f21 = f15;
                rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.f23104x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.f23104x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.f23104x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.f23104x + imageReceiver.getImageY());
                if (messageObject.isSending()) {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                    long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(i4Var.C);
                    boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                    if (fileProgressSizes == null && isSendingPaidMessage) {
                        radialProgress2.o(1.0f, true);
                        if (i4Var.f21178w) {
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
                canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f20) * 255.0f), 31);
                radialProgress2.draw(canvas2);
                canvas2.restore();
                i10++;
                f15 = f21;
                e = f19;
                s1Var2 = s1Var3;
                e6 = f20;
            }
            float f22 = e;
            float f23 = e6;
            s1 s1Var4 = s1Var2;
            if (f23 > 0.0f) {
                canvas2.save();
                canvas2.clipPath(path3);
                canvas2.translate(f16, f15);
                int i17 = (int) (f18 - f16);
                int i18 = (int) (f17 - f15);
                canvas2.saveLayerAlpha(0.0f, 0.0f, i17, i18, (int) (f23 * 255.0f), 31);
                this.f21219l.c(canvas, s1Var4, i17, i18, 1.0f, s1Var4.f22076le);
                canvas2 = canvas;
                s1Var = s1Var4;
                canvas2.restore();
                canvas2.restore();
                s1Var.invalidate();
            } else {
                s1Var = s1Var4;
            }
            int i19 = 0;
            while (true) {
                int size = arrayList.size();
                rectF = this.v;
                path = this.f21227t;
                if (i19 >= size) {
                    break;
                }
                i4 i4Var2 = (i4) arrayList.get(i19);
                if (i4Var2.I != null) {
                    float dp = AndroidUtilities.dp(11.4f) + i4Var2.I.f26124c;
                    float dp2 = AndroidUtilities.dp(17.0f);
                    float dp3 = AndroidUtilities.dp(5.0f);
                    float f24 = this.d + i4Var2.f21171a + dp3;
                    float f25 = this.e + i4Var2.f21172b + dp3;
                    rectF.set(f24, f25, dp + f24, f25 + dp2);
                    if (this.f21225r == null || rectF.right <= ((this.d + this.f21215g) - (AndroidUtilities.dp(11.32f) + this.f21225r.f26124c)) - dp3 || rectF.top > this.e + dp3) {
                        path.rewind();
                        float f26 = dp2 / 2.0f;
                        path.addRoundRect(rectF, f26, f26, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        f14 = f23;
                        c(canvas2, f14);
                        canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(1.0f, 1073741824));
                        i4Var2.I.c(this.d + i4Var2.f21171a + dp3 + AndroidUtilities.dp(5.66f), this.e + i4Var2.f21172b + dp3 + f26, 1.0f, -1, canvas2);
                        canvas2.restore();
                        i19++;
                        f23 = f14;
                    }
                }
                f14 = f23;
                i19++;
                f23 = f14;
            }
            if (this.f21224q != null && f22 > 0.0f) {
                float a10 = this.f21221n.a(0.05f);
                float dp4 = AndroidUtilities.dp(28.0f) + this.f21224q.f26124c;
                float dp5 = AndroidUtilities.dp(32.0f);
                float f27 = this.d;
                float f28 = this.f21215g;
                float x10 = e2.c.x(f28, dp4, 2.0f, f27);
                f11 = 11.32f;
                float f29 = this.e;
                f12 = 5.0f;
                float f30 = this.h;
                f13 = 17.0f;
                rectF.set(x10, e2.c.x(f30, dp5, 2.0f, f29), kf.k0.b(f28, dp4, 2.0f, f27), kf.k0.b(f30, dp5, 2.0f, f29));
                path.rewind();
                float f31 = dp5 / 2.0f;
                path.addRoundRect(rectF, f31, f31, Path.Direction.CW);
                canvas2.save();
                canvas2.scale(a10, a10, (this.f21215g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
                canvas2.save();
                canvas2.clipPath(path);
                f10 = f22;
                c(canvas2, f10);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(f10, 1342177280));
                path2 = path;
                this.f21224q.c((((this.f21215g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.e + (this.h / 2.0f), f10, -1, canvas2);
                canvas2.restore();
                if (s1Var.getDelegate() != null && s1Var.getDelegate().h1(5, s1Var)) {
                    j90 j90Var = this.f21218k;
                    if (j90Var == null) {
                        j90 j90Var2 = new j90();
                        this.f21218k = j90Var2;
                        j90Var2.setCallback(s1Var);
                        this.f21218k.f(org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.35f, -1), org.telegram.ui.ActionBar.j6.l1(0.8f, -1));
                        j90 j90Var3 = this.f21218k;
                        j90Var3.C = true;
                        j90Var3.f25922w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    } else if (j90Var.b() || this.f21218k.c()) {
                        j90 j90Var4 = this.f21218k;
                        j90Var4.f25905b = -1L;
                        j90Var4.f25906c = -1L;
                    }
                } else {
                    j90 j90Var5 = this.f21218k;
                    if (j90Var5 != null && !j90Var5.c() && !this.f21218k.b()) {
                        this.f21218k.a();
                    }
                }
                j90 j90Var6 = this.f21218k;
                if (j90Var6 != null) {
                    j90Var6.d(rectF);
                    this.f21218k.j(f31);
                    this.f21218k.setAlpha((int) (f10 * 255.0f));
                    this.f21218k.draw(canvas2);
                }
                canvas2.restore();
            } else {
                path2 = path;
                f10 = f22;
                f11 = 11.32f;
                f12 = 5.0f;
                f13 = 17.0f;
            }
            if (this.f21225r != null && f10 < 1.0f && a()) {
                float timeAlpha = s1Var.getTimeAlpha() * (1.0f - f10);
                float dp6 = AndroidUtilities.dp(f11) + this.f21225r.f26124c;
                float dp7 = AndroidUtilities.dp(f13);
                float dp8 = AndroidUtilities.dp(f12);
                float f32 = this.d + this.f21215g;
                float f33 = this.e + dp8;
                rectF.set((f32 - dp6) - dp8, f33, f32 - dp8, f33 + dp7);
                path2.rewind();
                float f34 = dp7 / 2.0f;
                path2.addRoundRect(rectF, f34, f34, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path2);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(timeAlpha, 1073741824));
                this.f21225r.c((((this.d + this.f21215g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.e + dp8 + f34, timeAlpha, -1, canvas2);
                canvas.restore();
            }
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i10;
        float f11;
        ArrayList arrayList;
        if (this.f21212b != null) {
            s1 s1Var = this.f21211a;
            if (s1Var.getMessageObject() != null) {
                i10 = s1Var.getMessageObject().getId();
            } else {
                i10 = 0;
            }
            int i11 = this.f21215g;
            int i12 = this.h;
            float f12 = 100.0f;
            if (i11 > i12) {
                f11 = 100.0f;
            } else {
                f11 = (i11 / i12) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f11);
            int i13 = this.h;
            int i14 = this.f21215g;
            if (i13 <= i14) {
                f12 = 100.0f * (i13 / i14);
            }
            int max2 = (int) Math.max(1.0f, f12);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                arrayList = this.f21213c;
                if (i15 >= arrayList.size()) {
                    break;
                }
                i4 i4Var = (i4) arrayList.get(i15);
                if (i4Var.f21174f.hasImageSet() && i4Var.f21174f.getBitmap() != null) {
                    i16 |= 1 << i15;
                }
                i15++;
            }
            Bitmap bitmap = this.f21229w;
            if (bitmap == null || this.f21232z != i10 || this.f21231y != i16 || this.A != max || this.B != max2) {
                this.f21231y = i16;
                this.f21232z = i10;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f21229w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f21229w);
                float f13 = max / this.f21215g;
                canvas2.scale(f13, f13);
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    i4 i4Var2 = (i4) arrayList.get(i17);
                    ImageReceiver imageReceiver = i4Var2.f21174f;
                    int i18 = i4Var2.f21171a;
                    int i19 = i4Var2.f21172b;
                    imageReceiver.setImageCoords(i18, i19, i4Var2.f21173c - i18, i4Var2.d - i19);
                    i4Var2.f21174f.draw(canvas2);
                }
                Utilities.stackBlurBitmap(this.f21229w, 12);
                if (this.f21230x == null) {
                    this.f21230x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f21230x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f21229w != null) {
                canvas.save();
                canvas.translate(this.d, this.e);
                canvas.scale(this.f21215g / this.f21229w.getWidth(), this.f21215g / this.f21229w.getWidth());
                this.f21230x.setAlpha((int) (f10 * 255.0f));
                canvas.drawBitmap(this.f21229w, 0.0f, 0.0f, this.f21230x);
                canvas.restore();
            }
        }
    }

    public final i4 d(float f10, float f11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f21213c;
            if (i10 < arrayList.size()) {
                if (((i4) arrayList.get(i10)).f21174f.isInsideImage(f10, f11)) {
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
            ih.j jVar = this.f21219l;
            if (jVar != null) {
                jVar.a(this.f21211a);
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f21213c;
                if (i10 < arrayList.size()) {
                    i4 i4Var = (i4) arrayList.get(i10);
                    if (i4Var.J) {
                        i4Var.J = false;
                        i4Var.f21174f.onDetachedFromWindow();
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
        i4 i4Var;
        s1 s1Var;
        boolean z10;
        boolean z11;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            i4 d = d(x10, y10);
            this.f21222o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.D;
                if (radialProgress2.f23090i.f29432q != 4 && radialProgress2.f23085a.contains(x10, y10)) {
                    z11 = true;
                    this.f21223p = z11;
                }
            }
            z11 = false;
            this.f21223p = z11;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            i4 d10 = d(x10, y10);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.D;
                if (radialProgress22.f23090i.f29432q != 4 && radialProgress22.f23085a.contains(x10, y10)) {
                    z4 = true;
                    i4Var = this.f21222o;
                    if (i4Var != null && i4Var == d10) {
                        s1Var = this.f21211a;
                        if (s1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = s1Var.getMessageObject();
                            if (!this.f21223p && z4 && d10.D.f23090i.f29432q == 3 && messageObject != null) {
                                if (messageObject.isSending()) {
                                    SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                                }
                            } else {
                                j1 delegate = s1Var.getDelegate();
                                i4 i4Var2 = this.f21222o;
                                ImageReceiver imageReceiver = i4Var2.f21174f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = i4Var2.B;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.Y1(s1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f21223p = false;
                    this.f21222o = null;
                }
            }
            z4 = false;
            i4Var = this.f21222o;
            if (i4Var != null) {
                s1Var = this.f21211a;
                if (s1Var.getDelegate() != null) {
                    MessageObject messageObject2 = s1Var.getMessageObject();
                    if (!this.f21223p) {
                    }
                    j1 delegate2 = s1Var.getDelegate();
                    i4 i4Var22 = this.f21222o;
                    ImageReceiver imageReceiver2 = i4Var22.f21174f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = i4Var22.B;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.Y1(s1Var, messageExtendedMedia2);
                }
            }
            this.f21223p = false;
            this.f21222o = null;
        }
        if (this.f21222o != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21221n.c(z10);
        if (this.f21222o == null) {
            return false;
        }
        return true;
    }

    public final void g(org.telegram.messenger.MessageObject r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j4.g(org.telegram.messenger.MessageObject):void");
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
        s1 s1Var = this.f21211a;
        if (s1Var.Ic <= 0 && (!s1Var.f22150r1 || TextUtils.isEmpty(messageObject.caption))) {
            z4 = false;
        } else {
            z4 = true;
        }
        if ((s1Var.f22150r1 || TextUtils.isEmpty(messageObject.caption)) && s1Var.K.f14116s && !s1Var.f22000g9) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i18 = this.f21220m;
        if (i18 > 0) {
            f10 = 1000.0f / this.f21212b.d;
            this.f21214f = i18;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f21214f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                int min = Math.min(s1Var.getParentWidth(), AndroidUtilities.displaySize.y);
                if (s1Var.M0(messageObject)) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                this.f21214f = min - AndroidUtilities.dp(i10 + 64);
            }
            if (s1Var.z3()) {
                this.f21214f -= AndroidUtilities.dp(52.0f);
            }
            f10 = 1.0f;
        }
        h4 h4Var = this.f21212b;
        this.f21215g = (int) ((h4Var.d / 1000.0f) * f10 * this.f21214f);
        this.h = (int) (h4Var.f21143g * h4Var.f21144i);
        this.f21216i = false;
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
            ArrayList arrayList = this.f21213c;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i19 >= arrayList.size()) {
                break;
            }
            i4 i4Var = (i4) arrayList.get(i19);
            h4 h4Var2 = this.f21212b;
            TLRPC.MessageExtendedMedia messageExtendedMedia = i4Var.B;
            ImageReceiver imageReceiver = i4Var.f21174f;
            if (messageExtendedMedia == null) {
                h4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) h4Var2.f21141c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z11 = z4;
                z12 = z10;
                i13 = dp;
            } else {
                float f11 = this.f21214f;
                int i20 = (int) ((groupedMessagePosition.left / 1000.0f) * f10 * f11);
                z11 = z4;
                float f12 = groupedMessagePosition.top;
                float f13 = this.f21212b.f21144i;
                int i21 = (int) (f12 * f13);
                int i22 = (int) (groupedMessagePosition.f16646ph * f13);
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
                i4Var.f21171a = i20;
                i4Var.f21172b = i25;
                i13 = dp;
                i4Var.f21173c = i20 + i27;
                i4Var.d = i25 + i28;
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
                if (!z11 && s1Var.B) {
                    if (messageObject.isOutOwner()) {
                        i15 = min2;
                    } else {
                        i14 = min2;
                    }
                }
                imageReceiver.setRoundRadius(i14, i15, i17, i16);
                float[] fArr = i4Var.f21177s;
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
                    i4Var.b(3);
                }
                if (!this.f21216i && !i4Var.h) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f21216i = z13;
            }
            i19++;
            z4 = z11;
            dp = i13;
            z10 = z12;
        }
        if (this.f21216i) {
            if (messageObject == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                k01 k01Var = new k01(lh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.f21224q = k01Var;
                if (k01Var.f26124c > this.f21215g - AndroidUtilities.dp(30.0f)) {
                    this.f21224q = new k01(lh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
