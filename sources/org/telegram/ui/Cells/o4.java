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
import bi.dd;
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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.xc;
public final class o4 {
    public int A;
    public int B;
    public boolean C;
    public final s1 f24586a;
    public m4 f24587b;
    public int d;
    public int e;
    public int f24589f;
    public int f24590g;
    public int h;
    public boolean f24591i;
    public final org.telegram.ui.Components.h6 f24592j;
    public ea0 f24593k;
    public final xh.f f24594l;
    public int f24595m;
    public final xc f24596n;
    public n4 f24597o;
    public boolean f24598p;
    public r11 f24599q;
    public r11 f24600r;
    public long f24601s;
    public Bitmap f24604w;
    public Paint f24605x;
    public int f24606y;
    public int f24607z;
    public final ArrayList f24588c = new ArrayList();
    public final Path f24602t = new Path();
    public final Path f24603u = new Path();
    public final RectF v = new RectF();

    public o4(s1 s1Var) {
        this.f24586a = s1Var;
        this.f24594l = xh.f.e(s1Var);
        this.f24592j = new org.telegram.ui.Components.h6(s1Var, 0L, 350L, ds.h);
        this.f24596n = new xc(s1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f24588c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((n4) obj).f24528f.getVisible()) {
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
        float f7;
        float f10;
        float f11;
        float f12;
        Path path2;
        float f13;
        int a2;
        int max;
        Canvas canvas2 = canvas;
        if (this.f24587b != null) {
            boolean z10 = this.f24591i;
            org.telegram.ui.Components.h6 h6Var = this.f24592j;
            float e = h6Var.e(z10);
            float e10 = h6Var.e(this.f24591i);
            s1 s1Var2 = this.f24586a;
            MessageObject messageObject = s1Var2.getMessageObject();
            Path path3 = this.f24603u;
            path3.rewind();
            float f14 = Float.MAX_VALUE;
            float f15 = Float.MIN_VALUE;
            float f16 = Float.MIN_VALUE;
            int i10 = 0;
            float f17 = Float.MAX_VALUE;
            while (true) {
                arrayList = this.f24588c;
                if (i10 >= arrayList.size()) {
                    break;
                }
                n4 n4Var = (n4) arrayList.get(i10);
                ImageReceiver imageReceiver = n4Var.f24528f;
                RadialProgress2 radialProgress2 = n4Var.G;
                int i11 = this.d;
                int i12 = n4Var.f24525a;
                float f18 = e;
                int i13 = this.e;
                int i14 = n4Var.f24526b;
                float f19 = e10;
                s1 s1Var3 = s1Var2;
                imageReceiver.setImageCoords(i11 + i12, i13 + i14, n4Var.f24527c - i12, n4Var.d - i14);
                imageReceiver.draw(canvas2);
                if (imageReceiver.getAnimation() != null) {
                    imageReceiver.getAnimation().getClass();
                    int round = Math.round(((float) 0) / 1000.0f);
                    if (!n4Var.f24533x && n4Var.K != (max = Math.max(0, n4Var.J - round))) {
                        n4Var.K = max;
                        n4Var.L = new r11(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                    }
                }
                if (f19 > 0.0f) {
                    float min = Math.min(this.d + n4Var.f24525a, f17);
                    float min2 = Math.min(this.e + n4Var.f24526b, f14);
                    f16 = Math.max(this.d + n4Var.f24527c, f16);
                    f15 = Math.max(this.e + n4Var.d, f15);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i15 = this.d;
                    int i16 = this.e;
                    rectF2.set(n4Var.f24525a + i15, n4Var.f24526b + i16, i15 + n4Var.f24527c, i16 + n4Var.d);
                    path3.addRoundRect(rectF2, n4Var.f24531s, Path.Direction.CW);
                    f14 = min2;
                    f17 = min;
                }
                radialProgress2.g(org.telegram.ui.ActionBar.y6.f23511le, org.telegram.ui.ActionBar.y6.f23529me, org.telegram.ui.ActionBar.y6.f23549ne, org.telegram.ui.ActionBar.y6.f23569oe);
                RectF rectF3 = radialProgress2.f26245a;
                float f20 = f14;
                rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.f26264x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.f26264x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.f26264x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.f26264x + imageReceiver.getImageY());
                if (messageObject.isSending()) {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                    long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(n4Var.F);
                    boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                    if (fileProgressSizes == null && isSendingPaidMessage) {
                        radialProgress2.p(1.0f, true);
                        if (n4Var.f24532w) {
                            a2 = 6;
                        } else {
                            a2 = n4Var.a();
                        }
                        n4Var.b(a2);
                    }
                } else if (FileLoader.getInstance(messageObject.currentAccount).isLoadingFile(n4Var.v)) {
                    n4Var.b(3);
                } else {
                    n4Var.b(n4Var.a());
                }
                canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f19) * 255.0f), 31);
                radialProgress2.draw(canvas2);
                canvas2.restore();
                i10++;
                f14 = f20;
                e = f18;
                s1Var2 = s1Var3;
                e10 = f19;
            }
            float f21 = e;
            float f22 = e10;
            s1 s1Var4 = s1Var2;
            if (f22 > 0.0f) {
                canvas2.save();
                canvas2.clipPath(path3);
                canvas2.translate(f17, f14);
                int i17 = (int) (f16 - f17);
                int i18 = (int) (f15 - f14);
                canvas2.saveLayerAlpha(0.0f, 0.0f, i17, i18, (int) (f22 * 255.0f), 31);
                this.f24594l.c(canvas, s1Var4, i17, i18, 1.0f, s1Var4.qe);
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
                path = this.f24602t;
                if (i19 >= size) {
                    break;
                }
                n4 n4Var2 = (n4) arrayList.get(i19);
                if (n4Var2.L != null) {
                    float dp = AndroidUtilities.dp(11.4f) + n4Var2.L.f32090c;
                    float dp2 = AndroidUtilities.dp(17.0f);
                    float dp3 = AndroidUtilities.dp(5.0f);
                    float f23 = this.d + n4Var2.f24525a + dp3;
                    float f24 = this.e + n4Var2.f24526b + dp3;
                    rectF.set(f23, f24, dp + f23, f24 + dp2);
                    if (this.f24600r == null || rectF.right <= ((this.d + this.f24590g) - (AndroidUtilities.dp(11.32f) + this.f24600r.f32090c)) - dp3 || rectF.top > this.e + dp3) {
                        path.rewind();
                        float f25 = dp2 / 2.0f;
                        path.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        f13 = f22;
                        c(canvas2, f13);
                        canvas2.drawColor(org.telegram.ui.ActionBar.y6.o1(1.0f, 1073741824));
                        n4Var2.L.c(this.d + n4Var2.f24525a + dp3 + AndroidUtilities.dp(5.66f), this.e + n4Var2.f24526b + dp3 + f25, 1.0f, -1, canvas2);
                        canvas2.restore();
                        i19++;
                        f22 = f13;
                    }
                }
                f13 = f22;
                i19++;
                f22 = f13;
            }
            if (this.f24599q != null && f21 > 0.0f) {
                float a10 = this.f24596n.a(0.05f);
                float dp4 = AndroidUtilities.dp(28.0f) + this.f24599q.f32090c;
                float dp5 = AndroidUtilities.dp(32.0f);
                float f26 = this.d;
                float f27 = this.f24590g;
                float B = c3.h0.B(f27, dp4, 2.0f, f26);
                f7 = 11.32f;
                float f28 = this.e;
                f10 = 5.0f;
                float f29 = this.h;
                f11 = 17.0f;
                rectF.set(B, c3.h0.B(f29, dp5, 2.0f, f28), org.telegram.messenger.t.b(f27, dp4, 2.0f, f26), org.telegram.messenger.t.b(f29, dp5, 2.0f, f28));
                path.rewind();
                float f30 = dp5 / 2.0f;
                path.addRoundRect(rectF, f30, f30, Path.Direction.CW);
                canvas2.save();
                canvas2.scale(a10, a10, (this.f24590g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
                canvas2.save();
                canvas2.clipPath(path);
                f12 = f21;
                c(canvas2, f12);
                canvas2.drawColor(org.telegram.ui.ActionBar.y6.o1(f12, 1342177280));
                path2 = path;
                this.f24599q.c((((this.f24590g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.e + (this.h / 2.0f), f12, -1, canvas2);
                canvas2.restore();
                if (s1Var.getDelegate() != null && s1Var.getDelegate().O0(5, s1Var)) {
                    ea0 ea0Var = this.f24593k;
                    if (ea0Var == null) {
                        ea0 ea0Var2 = new ea0();
                        this.f24593k = ea0Var2;
                        ea0Var2.setCallback(s1Var);
                        this.f24593k.g(org.telegram.ui.ActionBar.y6.o1(0.1f, -1), org.telegram.ui.ActionBar.y6.o1(0.3f, -1), org.telegram.ui.ActionBar.y6.o1(0.35f, -1), org.telegram.ui.ActionBar.y6.o1(0.8f, -1));
                        ea0 ea0Var3 = this.f24593k;
                        ea0Var3.D = true;
                        ea0Var3.f27805x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    } else if (ea0Var.c() || this.f24593k.d()) {
                        ea0 ea0Var4 = this.f24593k;
                        ea0Var4.f27787b = -1L;
                        ea0Var4.f27788c = -1L;
                    }
                } else {
                    ea0 ea0Var5 = this.f24593k;
                    if (ea0Var5 != null && !ea0Var5.d() && !this.f24593k.c()) {
                        this.f24593k.a();
                    }
                }
                ea0 ea0Var6 = this.f24593k;
                if (ea0Var6 != null) {
                    ea0Var6.e(rectF);
                    this.f24593k.k(f30);
                    this.f24593k.setAlpha((int) (f12 * 255.0f));
                    this.f24593k.draw(canvas2);
                }
                canvas2.restore();
            } else {
                f7 = 11.32f;
                f10 = 5.0f;
                f11 = 17.0f;
                f12 = f21;
                path2 = path;
            }
            if (this.f24600r != null && f12 < 1.0f && a()) {
                float timeAlpha = s1Var.getTimeAlpha() * (1.0f - f12);
                float dp6 = AndroidUtilities.dp(f7) + this.f24600r.f32090c;
                float dp7 = AndroidUtilities.dp(f11);
                float dp8 = AndroidUtilities.dp(f10);
                float f31 = this.d + this.f24590g;
                float f32 = this.e + dp8;
                rectF.set((f31 - dp6) - dp8, f32, f31 - dp8, f32 + dp7);
                path2.rewind();
                float f33 = dp7 / 2.0f;
                path2.addRoundRect(rectF, f33, f33, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path2);
                canvas2.drawColor(org.telegram.ui.ActionBar.y6.o1(timeAlpha, 1073741824));
                this.f24600r.c((((this.d + this.f24590g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.e + dp8 + f33, timeAlpha, -1, canvas2);
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
        if (this.f24587b != null) {
            s1 s1Var = this.f24586a;
            if (s1Var.getMessageObject() != null) {
                i10 = s1Var.getMessageObject().getId();
            } else {
                i10 = 0;
            }
            int i13 = this.f24590g;
            int i14 = this.h;
            float f11 = 100.0f;
            if (i13 > i14) {
                f10 = 100.0f;
            } else {
                f10 = (i13 / i14) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f10);
            int i15 = this.h;
            int i16 = this.f24590g;
            if (i15 <= i16) {
                f11 = 100.0f * (i15 / i16);
            }
            int max2 = (int) Math.max(1.0f, f11);
            int i17 = 0;
            int i18 = 0;
            while (true) {
                arrayList = this.f24588c;
                if (i17 >= arrayList.size()) {
                    break;
                }
                n4 n4Var = (n4) arrayList.get(i17);
                if (n4Var.f24528f.hasImageSet() && n4Var.f24528f.getBitmap() != null) {
                    i18 |= 1 << i17;
                }
                i17++;
            }
            Bitmap bitmap = this.f24604w;
            if (bitmap == null || this.f24607z != i10 || this.f24606y != i18 || this.A != max || this.B != max2) {
                this.f24606y = i18;
                this.f24607z = i10;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f24604w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f24604w);
                float f12 = max / this.f24590g;
                canvas2.scale(f12, f12);
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    n4 n4Var2 = (n4) arrayList.get(i19);
                    n4Var2.f24528f.setImageCoords(n4Var2.f24525a, n4Var2.f24526b, n4Var2.f24527c - i11, n4Var2.d - i12);
                    n4Var2.f24528f.draw(canvas2);
                }
                Utilities.stackBlurBitmap(this.f24604w, 12);
                if (this.f24605x == null) {
                    this.f24605x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f24605x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f24604w != null) {
                canvas.save();
                canvas.translate(this.d, this.e);
                canvas.scale(this.f24590g / this.f24604w.getWidth(), this.f24590g / this.f24604w.getWidth());
                this.f24605x.setAlpha((int) (f7 * 255.0f));
                canvas.drawBitmap(this.f24604w, 0.0f, 0.0f, this.f24605x);
                canvas.restore();
            }
        }
    }

    public final n4 d(float f7, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24588c;
            if (i10 < arrayList.size()) {
                if (((n4) arrayList.get(i10)).f24528f.isInsideImage(f7, f10)) {
                    return (n4) arrayList.get(i10);
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
            xh.f fVar = this.f24594l;
            if (fVar != null) {
                fVar.a(this.f24586a);
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f24588c;
                if (i10 < arrayList.size()) {
                    n4 n4Var = (n4) arrayList.get(i10);
                    if (n4Var.M) {
                        n4Var.M = false;
                        n4Var.f24528f.onDetachedFromWindow();
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
        n4 n4Var;
        s1 s1Var;
        boolean z11;
        boolean z12;
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            n4 d = d(x9, y3);
            this.f24597o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.G;
                if (radialProgress2.f26250i.f31839q != 4 && radialProgress2.f26245a.contains(x9, y3)) {
                    z12 = true;
                    this.f24598p = z12;
                }
            }
            z12 = false;
            this.f24598p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            n4 d10 = d(x9, y3);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.G;
                if (radialProgress22.f26250i.f31839q != 4 && radialProgress22.f26245a.contains(x9, y3)) {
                    z10 = true;
                    n4Var = this.f24597o;
                    if (n4Var != null && n4Var == d10) {
                        s1Var = this.f24586a;
                        if (s1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = s1Var.getMessageObject();
                            if (!this.f24598p && z10 && d10.G.f26250i.f31839q == 3 && messageObject != null) {
                                if (messageObject.isSending()) {
                                    SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                                }
                            } else {
                                j1 delegate = s1Var.getDelegate();
                                n4 n4Var2 = this.f24597o;
                                ImageReceiver imageReceiver = n4Var2.f24528f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = n4Var2.E;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.A1(s1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f24598p = false;
                    this.f24597o = null;
                }
            }
            z10 = false;
            n4Var = this.f24597o;
            if (n4Var != null) {
                s1Var = this.f24586a;
                if (s1Var.getDelegate() != null) {
                    MessageObject messageObject2 = s1Var.getMessageObject();
                    if (!this.f24598p) {
                    }
                    j1 delegate2 = s1Var.getDelegate();
                    n4 n4Var22 = this.f24597o;
                    ImageReceiver imageReceiver2 = n4Var22.f24528f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = n4Var22.E;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.A1(s1Var, messageExtendedMedia2);
                }
            }
            this.f24598p = false;
            this.f24597o = null;
        }
        if (this.f24597o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24596n.c(z11);
        if (this.f24597o == null) {
            return false;
        }
        return true;
    }

    public final void g(org.telegram.messenger.MessageObject r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o4.g(org.telegram.messenger.MessageObject):void");
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
        s1 s1Var = this.f24586a;
        boolean z15 = false;
        if (s1Var.Lc <= 0 && (!s1Var.f25301u1 || TextUtils.isEmpty(messageObject.caption))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((s1Var.f25301u1 || TextUtils.isEmpty(messageObject.caption)) && s1Var.N.f4230s && !s1Var.f25152j9) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i18 = this.f24595m;
        float f10 = 1000.0f;
        if (i18 > 0) {
            f7 = 1000.0f / this.f24587b.d;
            this.f24589f = i18;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f24589f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                int min = Math.min(s1Var.getParentWidth(), AndroidUtilities.displaySize.y);
                if (s1Var.L0(messageObject)) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                this.f24589f = min - AndroidUtilities.dp(i10 + 64);
            }
            if (s1Var.B3()) {
                this.f24589f -= AndroidUtilities.dp(52.0f);
            }
            f7 = 1.0f;
        }
        m4 m4Var = this.f24587b;
        this.f24590g = (int) ((m4Var.d / 1000.0f) * f7 * this.f24589f);
        this.h = (int) (m4Var.f24451g * m4Var.f24452i);
        this.f24591i = false;
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
            ArrayList arrayList = this.f24588c;
            float f11 = f10;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i19 >= arrayList.size()) {
                break;
            }
            n4 n4Var = (n4) arrayList.get(i19);
            m4 m4Var2 = this.f24587b;
            char c11 = c10;
            TLRPC.MessageExtendedMedia messageExtendedMedia = n4Var.E;
            boolean z16 = z15;
            ImageReceiver imageReceiver = n4Var.f24528f;
            if (messageExtendedMedia == null) {
                m4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) m4Var2.f24449c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z12 = z10;
                z13 = z11;
                i13 = dp;
            } else {
                float f12 = this.f24589f;
                int i20 = (int) ((groupedMessagePosition.left / f11) * f7 * f12);
                z12 = z10;
                float f13 = groupedMessagePosition.top;
                float f14 = this.f24587b.f24452i;
                int i21 = (int) (f13 * f14);
                int i22 = (int) (groupedMessagePosition.f19545ph * f14);
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
                n4Var.f24525a = i20;
                n4Var.f24526b = i25;
                i13 = dp;
                n4Var.f24527c = i20 + i27;
                n4Var.d = i25 + i28;
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
                if (!z12 && s1Var.E) {
                    if (messageObject.isOutOwner()) {
                        i15 = min2;
                    } else {
                        i14 = min2;
                    }
                }
                imageReceiver.setRoundRadius(i14, i15, i17, i16);
                float[] fArr = n4Var.f24531s;
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
                    n4Var.b(3);
                }
                if (!this.f24591i && !n4Var.h) {
                    z14 = z16 ? 1 : 0;
                } else {
                    z14 = true;
                }
                this.f24591i = z14;
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
        if (this.f24591i) {
            if (messageObject == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                r11 r11Var = new r11(dd.W0(z17, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.f24599q = r11Var;
                if (r11Var.f32090c > this.f24590g - AndroidUtilities.dp(30.0f)) {
                    this.f24599q = new r11(dd.W0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
