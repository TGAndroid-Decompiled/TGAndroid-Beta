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
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.l11;
public final class k4 {
    public int A;
    public int B;
    public boolean C;
    public final u1 f22367a;
    public i4 f22368b;
    public int d;
    public int f22370e;
    public int f22371f;
    public int f22372g;
    public int h;
    public boolean f22373i;
    public final org.telegram.ui.Components.g6 f22374j;
    public ia0 f22375k;
    public final vh.f f22376l;
    public int f22377m;
    public final bd f22378n;
    public j4 f22379o;
    public boolean f22380p;
    public l11 f22381q;
    public l11 f22382r;
    public long f22383s;
    public Bitmap f22386w;
    public Paint f22387x;
    public int f22388y;
    public int f22389z;
    public final ArrayList f22369c = new ArrayList();
    public final Path f22384t = new Path();
    public final Path f22385u = new Path();
    public final RectF v = new RectF();

    public k4(u1 u1Var) {
        this.f22367a = u1Var;
        this.f22376l = vh.f.e(u1Var);
        this.f22374j = new org.telegram.ui.Components.g6(u1Var, 0L, 350L, hs.h);
        this.f22378n = new bd(u1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f22369c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((j4) obj).f22309f.getVisible()) {
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
        float f7;
        float f10;
        float f11;
        float f12;
        Path path2;
        float f13;
        int a2;
        int max;
        Canvas canvas2 = canvas;
        if (this.f22368b != null) {
            boolean z10 = this.f22373i;
            org.telegram.ui.Components.g6 g6Var = this.f22374j;
            float e7 = g6Var.e(z10);
            float e10 = g6Var.e(this.f22373i);
            u1 u1Var2 = this.f22367a;
            MessageObject messageObject = u1Var2.getMessageObject();
            Path path3 = this.f22385u;
            path3.rewind();
            float f14 = Float.MAX_VALUE;
            float f15 = Float.MIN_VALUE;
            float f16 = Float.MIN_VALUE;
            int i10 = 0;
            float f17 = Float.MAX_VALUE;
            while (true) {
                arrayList = this.f22369c;
                if (i10 >= arrayList.size()) {
                    break;
                }
                j4 j4Var = (j4) arrayList.get(i10);
                ImageReceiver imageReceiver = j4Var.f22309f;
                RadialProgress2 radialProgress2 = j4Var.G;
                int i11 = this.d;
                int i12 = j4Var.f22305a;
                float f18 = e7;
                int i13 = this.f22370e;
                int i14 = j4Var.f22306b;
                float f19 = e10;
                u1 u1Var3 = u1Var2;
                imageReceiver.setImageCoords(i11 + i12, i13 + i14, j4Var.f22307c - i12, j4Var.d - i14);
                imageReceiver.draw(canvas2);
                if (imageReceiver.getAnimation() != null) {
                    imageReceiver.getAnimation().getClass();
                    int round = Math.round(((float) 0) / 1000.0f);
                    if (!j4Var.f22314x && j4Var.K != (max = Math.max(0, j4Var.J - round))) {
                        j4Var.K = max;
                        j4Var.L = new l11(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                    }
                }
                if (f19 > 0.0f) {
                    float min = Math.min(this.d + j4Var.f22305a, f17);
                    float min2 = Math.min(this.f22370e + j4Var.f22306b, f14);
                    f16 = Math.max(this.d + j4Var.f22307c, f16);
                    f15 = Math.max(this.f22370e + j4Var.d, f15);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i15 = this.d;
                    int i16 = this.f22370e;
                    rectF2.set(j4Var.f22305a + i15, j4Var.f22306b + i16, i15 + j4Var.f22307c, i16 + j4Var.d);
                    path3.addRoundRect(rectF2, j4Var.f22312s, Path.Direction.CW);
                    f14 = min2;
                    f17 = min;
                }
                radialProgress2.g(org.telegram.ui.ActionBar.i6.f20951le, org.telegram.ui.ActionBar.i6.f20970me, org.telegram.ui.ActionBar.i6.f20988ne, org.telegram.ui.ActionBar.i6.oe);
                RectF rectF3 = radialProgress2.f24260a;
                float f20 = f14;
                rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.f24280x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.f24280x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.f24280x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.f24280x + imageReceiver.getImageY());
                if (messageObject.isSending()) {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                    long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(j4Var.F);
                    boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                    if (fileProgressSizes == null && isSendingPaidMessage) {
                        radialProgress2.o(1.0f, true);
                        if (j4Var.f22313w) {
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
                canvas2.translate(f17, f14);
                int i17 = (int) (f16 - f17);
                int i18 = (int) (f15 - f14);
                canvas2.saveLayerAlpha(0.0f, 0.0f, i17, i18, (int) (f22 * 255.0f), 31);
                this.f22376l.c(canvas, u1Var4, i17, i18, 1.0f, u1Var4.f23331pe);
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
                path = this.f22384t;
                if (i19 >= size) {
                    break;
                }
                j4 j4Var2 = (j4) arrayList.get(i19);
                if (j4Var2.L != null) {
                    float dp = AndroidUtilities.dp(11.4f) + j4Var2.L.f28222c;
                    float dp2 = AndroidUtilities.dp(17.0f);
                    float dp3 = AndroidUtilities.dp(5.0f);
                    float f23 = this.d + j4Var2.f22305a + dp3;
                    float f24 = this.f22370e + j4Var2.f22306b + dp3;
                    rectF.set(f23, f24, dp + f23, f24 + dp2);
                    if (this.f22382r == null || rectF.right <= ((this.d + this.f22372g) - (AndroidUtilities.dp(11.32f) + this.f22382r.f28222c)) - dp3 || rectF.top > this.f22370e + dp3) {
                        path.rewind();
                        float f25 = dp2 / 2.0f;
                        path.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        f13 = f22;
                        c(canvas2, f13);
                        canvas2.drawColor(org.telegram.ui.ActionBar.i6.m1(1.0f, 1073741824));
                        j4Var2.L.c(this.d + j4Var2.f22305a + dp3 + AndroidUtilities.dp(5.66f), this.f22370e + j4Var2.f22306b + dp3 + f25, 1.0f, -1, canvas2);
                        canvas2.restore();
                        i19++;
                        f22 = f13;
                    }
                }
                f13 = f22;
                i19++;
                f22 = f13;
            }
            if (this.f22381q != null && f21 > 0.0f) {
                float a10 = this.f22378n.a(0.05f);
                float dp4 = AndroidUtilities.dp(28.0f) + this.f22381q.f28222c;
                float dp5 = AndroidUtilities.dp(32.0f);
                float f26 = this.d;
                float f27 = this.f22372g;
                float z11 = com.google.android.gms.internal.vision.e2.z(f27, dp4, 2.0f, f26);
                f7 = 11.32f;
                float f28 = this.f22370e;
                f10 = 5.0f;
                float f29 = this.h;
                f11 = 17.0f;
                rectF.set(z11, com.google.android.gms.internal.vision.e2.z(f29, dp5, 2.0f, f28), org.telegram.messenger.q.a(f27, dp4, 2.0f, f26), org.telegram.messenger.q.a(f29, dp5, 2.0f, f28));
                path.rewind();
                float f30 = dp5 / 2.0f;
                path.addRoundRect(rectF, f30, f30, Path.Direction.CW);
                canvas2.save();
                canvas2.scale(a10, a10, (this.f22372g / 2.0f) + this.d, (this.h / 2.0f) + this.f22370e);
                canvas2.save();
                canvas2.clipPath(path);
                f12 = f21;
                c(canvas2, f12);
                canvas2.drawColor(org.telegram.ui.ActionBar.i6.m1(f12, 1342177280));
                path2 = path;
                this.f22381q.c((((this.f22372g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.f22370e + (this.h / 2.0f), f12, -1, canvas2);
                canvas2.restore();
                if (u1Var.getDelegate() != null && u1Var.getDelegate().i1(5, u1Var)) {
                    ia0 ia0Var = this.f22375k;
                    if (ia0Var == null) {
                        ia0 ia0Var2 = new ia0();
                        this.f22375k = ia0Var2;
                        ia0Var2.setCallback(u1Var);
                        this.f22375k.g(org.telegram.ui.ActionBar.i6.m1(0.1f, -1), org.telegram.ui.ActionBar.i6.m1(0.3f, -1), org.telegram.ui.ActionBar.i6.m1(0.35f, -1), org.telegram.ui.ActionBar.i6.m1(0.8f, -1));
                        ia0 ia0Var3 = this.f22375k;
                        ia0Var3.D = true;
                        ia0Var3.f27340x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    } else if (ia0Var.c() || this.f22375k.d()) {
                        ia0 ia0Var4 = this.f22375k;
                        ia0Var4.f27321b = -1L;
                        ia0Var4.f27322c = -1L;
                    }
                } else {
                    ia0 ia0Var5 = this.f22375k;
                    if (ia0Var5 != null && !ia0Var5.d() && !this.f22375k.c()) {
                        this.f22375k.a();
                    }
                }
                ia0 ia0Var6 = this.f22375k;
                if (ia0Var6 != null) {
                    ia0Var6.e(rectF);
                    this.f22375k.k(f30);
                    this.f22375k.setAlpha((int) (f12 * 255.0f));
                    this.f22375k.draw(canvas2);
                }
                canvas2.restore();
            } else {
                f7 = 11.32f;
                f10 = 5.0f;
                f11 = 17.0f;
                f12 = f21;
                path2 = path;
            }
            if (this.f22382r != null && f12 < 1.0f && a()) {
                float timeAlpha = u1Var.getTimeAlpha() * (1.0f - f12);
                float dp6 = AndroidUtilities.dp(f7) + this.f22382r.f28222c;
                float dp7 = AndroidUtilities.dp(f11);
                float dp8 = AndroidUtilities.dp(f10);
                float f31 = this.d + this.f22372g;
                float f32 = this.f22370e + dp8;
                rectF.set((f31 - dp6) - dp8, f32, f31 - dp8, f32 + dp7);
                path2.rewind();
                float f33 = dp7 / 2.0f;
                path2.addRoundRect(rectF, f33, f33, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path2);
                canvas2.drawColor(org.telegram.ui.ActionBar.i6.m1(timeAlpha, 1073741824));
                this.f22382r.c((((this.d + this.f22372g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.f22370e + dp8 + f33, timeAlpha, -1, canvas2);
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
        if (this.f22368b != null) {
            u1 u1Var = this.f22367a;
            if (u1Var.getMessageObject() != null) {
                i10 = u1Var.getMessageObject().getId();
            } else {
                i10 = 0;
            }
            int i13 = this.f22372g;
            int i14 = this.h;
            float f11 = 100.0f;
            if (i13 > i14) {
                f10 = 100.0f;
            } else {
                f10 = (i13 / i14) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f10);
            int i15 = this.h;
            int i16 = this.f22372g;
            if (i15 <= i16) {
                f11 = 100.0f * (i15 / i16);
            }
            int max2 = (int) Math.max(1.0f, f11);
            int i17 = 0;
            int i18 = 0;
            while (true) {
                arrayList = this.f22369c;
                if (i17 >= arrayList.size()) {
                    break;
                }
                j4 j4Var = (j4) arrayList.get(i17);
                if (j4Var.f22309f.hasImageSet() && j4Var.f22309f.getBitmap() != null) {
                    i18 |= 1 << i17;
                }
                i17++;
            }
            Bitmap bitmap = this.f22386w;
            if (bitmap == null || this.f22389z != i10 || this.f22388y != i18 || this.A != max || this.B != max2) {
                this.f22388y = i18;
                this.f22389z = i10;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f22386w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f22386w);
                float f12 = max / this.f22372g;
                canvas2.scale(f12, f12);
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    j4 j4Var2 = (j4) arrayList.get(i19);
                    j4Var2.f22309f.setImageCoords(j4Var2.f22305a, j4Var2.f22306b, j4Var2.f22307c - i11, j4Var2.d - i12);
                    j4Var2.f22309f.draw(canvas2);
                }
                Utilities.stackBlurBitmap(this.f22386w, 12);
                if (this.f22387x == null) {
                    this.f22387x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f22387x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f22386w != null) {
                canvas.save();
                canvas.translate(this.d, this.f22370e);
                canvas.scale(this.f22372g / this.f22386w.getWidth(), this.f22372g / this.f22386w.getWidth());
                this.f22387x.setAlpha((int) (f7 * 255.0f));
                canvas.drawBitmap(this.f22386w, 0.0f, 0.0f, this.f22387x);
                canvas.restore();
            }
        }
    }

    public final j4 d(float f7, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22369c;
            if (i10 < arrayList.size()) {
                if (((j4) arrayList.get(i10)).f22309f.isInsideImage(f7, f10)) {
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
            vh.f fVar = this.f22376l;
            if (fVar != null) {
                fVar.a(this.f22367a);
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f22369c;
                if (i10 < arrayList.size()) {
                    j4 j4Var = (j4) arrayList.get(i10);
                    if (j4Var.M) {
                        j4Var.M = false;
                        j4Var.f22309f.onDetachedFromWindow();
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
            this.f22379o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.G;
                if (radialProgress2.f24266i.f31421q != 4 && radialProgress2.f24260a.contains(x10, y3)) {
                    z12 = true;
                    this.f22380p = z12;
                }
            }
            z12 = false;
            this.f22380p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            j4 d10 = d(x10, y3);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.G;
                if (radialProgress22.f24266i.f31421q != 4 && radialProgress22.f24260a.contains(x10, y3)) {
                    z10 = true;
                    j4Var = this.f22379o;
                    if (j4Var != null && j4Var == d10) {
                        u1Var = this.f22367a;
                        if (u1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = u1Var.getMessageObject();
                            if (!this.f22380p && z10 && d10.G.f24266i.f31421q == 3 && messageObject != null) {
                                if (messageObject.isSending()) {
                                    SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                                }
                            } else {
                                l1 delegate = u1Var.getDelegate();
                                j4 j4Var2 = this.f22379o;
                                ImageReceiver imageReceiver = j4Var2.f22309f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = j4Var2.E;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.Z1(u1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f22380p = false;
                    this.f22379o = null;
                }
            }
            z10 = false;
            j4Var = this.f22379o;
            if (j4Var != null) {
                u1Var = this.f22367a;
                if (u1Var.getDelegate() != null) {
                    MessageObject messageObject2 = u1Var.getMessageObject();
                    if (!this.f22380p) {
                    }
                    l1 delegate2 = u1Var.getDelegate();
                    j4 j4Var22 = this.f22379o;
                    ImageReceiver imageReceiver2 = j4Var22.f22309f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = j4Var22.E;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.Z1(u1Var, messageExtendedMedia2);
                }
            }
            this.f22380p = false;
            this.f22379o = null;
        }
        if (this.f22379o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22378n.c(z11);
        if (this.f22379o == null) {
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
        u1 u1Var = this.f22367a;
        boolean z15 = false;
        if (u1Var.Lc <= 0 && (!u1Var.f23392u1 || TextUtils.isEmpty(messageObject.caption))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((u1Var.f23392u1 || TextUtils.isEmpty(messageObject.caption)) && u1Var.N.f54638s && !u1Var.f23243j9) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i18 = this.f22377m;
        float f10 = 1000.0f;
        if (i18 > 0) {
            f7 = 1000.0f / this.f22368b.d;
            this.f22371f = i18;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f22371f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                int min = Math.min(u1Var.getParentWidth(), AndroidUtilities.displaySize.y);
                if (u1Var.M0(messageObject)) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                this.f22371f = min - AndroidUtilities.dp(i10 + 64);
            }
            if (u1Var.z3()) {
                this.f22371f -= AndroidUtilities.dp(52.0f);
            }
            f7 = 1.0f;
        }
        i4 i4Var = this.f22368b;
        this.f22372g = (int) ((i4Var.d / 1000.0f) * f7 * this.f22371f);
        this.h = (int) (i4Var.f22240g * i4Var.f22241i);
        this.f22373i = false;
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
            ArrayList arrayList = this.f22369c;
            float f11 = f10;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i19 >= arrayList.size()) {
                break;
            }
            j4 j4Var = (j4) arrayList.get(i19);
            i4 i4Var2 = this.f22368b;
            char c11 = c10;
            TLRPC.MessageExtendedMedia messageExtendedMedia = j4Var.E;
            boolean z16 = z15;
            ImageReceiver imageReceiver = j4Var.f22309f;
            if (messageExtendedMedia == null) {
                i4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) i4Var2.f22237c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z12 = z10;
                z13 = z11;
                i13 = dp;
            } else {
                float f12 = this.f22371f;
                int i20 = (int) ((groupedMessagePosition.left / f11) * f7 * f12);
                z12 = z10;
                float f13 = groupedMessagePosition.top;
                float f14 = this.f22368b.f22241i;
                int i21 = (int) (f13 * f14);
                int i22 = (int) (groupedMessagePosition.f17249ph * f14);
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
                j4Var.f22305a = i20;
                j4Var.f22306b = i25;
                i13 = dp;
                j4Var.f22307c = i20 + i27;
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
                float[] fArr = j4Var.f22312s;
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
                    j4Var.b(3);
                }
                if (!this.f22373i && !j4Var.h) {
                    z14 = z16 ? 1 : 0;
                } else {
                    z14 = true;
                }
                this.f22373i = z14;
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
        if (this.f22373i) {
            if (messageObject == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                l11 l11Var = new l11(yh.p7.Y0(z17, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.f22381q = l11Var;
                if (l11Var.f28222c > this.f22372g - AndroidUtilities.dp(30.0f)) {
                    this.f22381q = new l11(yh.p7.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
