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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zz0;
public final class i4 {
    public int A;
    public int B;
    public boolean C;
    public final s1 f24476a;
    public g4 f24477b;
    public int d;
    public int f24479e;
    public int f24480f;
    public int f24481g;
    public int h;
    public boolean f24482i;
    public final org.telegram.ui.Components.d6 f24483j;
    public c90 f24484k;
    public final gh.j f24485l;
    public int f24486m;
    public final uc f24487n;
    public h4 f24488o;
    public boolean f24489p;
    public zz0 f24490q;
    public zz0 f24491r;
    public long f24492s;
    public Bitmap f24495w;
    public Paint f24496x;
    public int f24497y;
    public int f24498z;
    public final ArrayList f24478c = new ArrayList();
    public final Path f24493t = new Path();
    public final Path f24494u = new Path();
    public final RectF v = new RectF();

    public i4(s1 s1Var) {
        this.f24476a = s1Var;
        this.f24485l = gh.j.e(s1Var);
        this.f24483j = new org.telegram.ui.Components.d6(s1Var, 0L, 350L, jr.h);
        this.f24487n = new uc(s1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f24478c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((h4) obj).f24443f.getVisible()) {
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
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        int a2;
        int max;
        Canvas canvas2 = canvas;
        if (this.f24477b != null) {
            boolean z10 = this.f24482i;
            org.telegram.ui.Components.d6 d6Var = this.f24483j;
            float e10 = d6Var.e(z10);
            float e11 = d6Var.e(this.f24482i);
            s1 s1Var2 = this.f24476a;
            MessageObject messageObject = s1Var2.getMessageObject();
            Path path3 = this.f24494u;
            path3.rewind();
            float f14 = Float.MAX_VALUE;
            float f15 = Float.MAX_VALUE;
            float f16 = Float.MIN_VALUE;
            float f17 = Float.MIN_VALUE;
            int i10 = 0;
            while (true) {
                arrayList = this.f24478c;
                if (i10 >= arrayList.size()) {
                    break;
                }
                h4 h4Var = (h4) arrayList.get(i10);
                ImageReceiver imageReceiver = h4Var.f24443f;
                RadialProgress2 radialProgress2 = h4Var.C;
                int i11 = this.d;
                int i12 = h4Var.f24439a;
                float f18 = e10;
                int i13 = this.f24479e;
                int i14 = h4Var.f24440b;
                float f19 = e11;
                s1 s1Var3 = s1Var2;
                imageReceiver.setImageCoords(i11 + i12, i13 + i14, h4Var.f24441c - i12, h4Var.d - i14);
                imageReceiver.draw(canvas2);
                if (imageReceiver.getAnimation() != null) {
                    imageReceiver.getAnimation().getClass();
                    int round = Math.round(((float) 0) / 1000.0f);
                    if (!h4Var.f24448x && h4Var.G != (max = Math.max(0, h4Var.F - round))) {
                        h4Var.G = max;
                        h4Var.H = new zz0(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                    }
                }
                if (f19 > 0.0f) {
                    float min = Math.min(this.d + h4Var.f24439a, f15);
                    float min2 = Math.min(this.f24479e + h4Var.f24440b, f14);
                    f17 = Math.max(this.d + h4Var.f24441c, f17);
                    f16 = Math.max(this.f24479e + h4Var.d, f16);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i15 = this.d;
                    int i16 = this.f24479e;
                    rectF2.set(h4Var.f24439a + i15, h4Var.f24440b + i16, i15 + h4Var.f24441c, i16 + h4Var.d);
                    path3.addRoundRect(rectF2, h4Var.f24446s, Path.Direction.CW);
                    f14 = min2;
                    f15 = min;
                }
                radialProgress2.g(org.telegram.ui.ActionBar.g6.f23213le, org.telegram.ui.ActionBar.g6.f23230me, org.telegram.ui.ActionBar.g6.f23249ne, org.telegram.ui.ActionBar.g6.f23267oe);
                RectF rectF3 = radialProgress2.f26479a;
                float f20 = f14;
                rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.f26499x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.f26499x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.f26499x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.f26499x + imageReceiver.getImageY());
                if (messageObject.isSending()) {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                    long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(h4Var.B);
                    boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                    if (fileProgressSizes == null && isSendingPaidMessage) {
                        radialProgress2.o(1.0f, true);
                        if (h4Var.f24447w) {
                            a2 = 6;
                        } else {
                            a2 = h4Var.a();
                        }
                        h4Var.b(a2);
                    }
                } else if (FileLoader.getInstance(messageObject.currentAccount).isLoadingFile(h4Var.v)) {
                    h4Var.b(3);
                } else {
                    h4Var.b(h4Var.a());
                }
                canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f19) * 255.0f), 31);
                radialProgress2.draw(canvas2);
                canvas2.restore();
                i10++;
                f14 = f20;
                e10 = f18;
                s1Var2 = s1Var3;
                e11 = f19;
            }
            float f21 = e10;
            float f22 = e11;
            s1 s1Var4 = s1Var2;
            if (f22 > 0.0f) {
                canvas2.save();
                canvas2.clipPath(path3);
                canvas2.translate(f15, f14);
                int i17 = (int) (f17 - f15);
                int i18 = (int) (f16 - f14);
                canvas2.saveLayerAlpha(0.0f, 0.0f, i17, i18, (int) (f22 * 255.0f), 31);
                this.f24485l.c(canvas, s1Var4, i17, i18, 1.0f, s1Var4.f25422ke);
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
                path = this.f24493t;
                if (i19 >= size) {
                    break;
                }
                h4 h4Var2 = (h4) arrayList.get(i19);
                if (h4Var2.H != null) {
                    float dp = AndroidUtilities.dp(11.4f) + h4Var2.H.f35462c;
                    float dp2 = AndroidUtilities.dp(17.0f);
                    float dp3 = AndroidUtilities.dp(5.0f);
                    float f23 = this.d + h4Var2.f24439a + dp3;
                    float f24 = this.f24479e + h4Var2.f24440b + dp3;
                    rectF.set(f23, f24, dp + f23, f24 + dp2);
                    if (this.f24491r == null || rectF.right <= ((this.d + this.f24481g) - (AndroidUtilities.dp(11.32f) + this.f24491r.f35462c)) - dp3 || rectF.top > this.f24479e + dp3) {
                        path.rewind();
                        float f25 = dp2 / 2.0f;
                        path.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        f13 = f22;
                        c(canvas2, f13);
                        canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(1.0f, 1073741824));
                        h4Var2.H.c(this.d + h4Var2.f24439a + dp3 + AndroidUtilities.dp(5.66f), this.f24479e + h4Var2.f24440b + dp3 + f25, 1.0f, -1, canvas2);
                        canvas2.restore();
                        i19++;
                        f22 = f13;
                    }
                }
                f13 = f22;
                i19++;
                f22 = f13;
            }
            if (this.f24490q != null && f21 > 0.0f) {
                float a10 = this.f24487n.a(0.05f);
                float dp4 = AndroidUtilities.dp(28.0f) + this.f24490q.f35462c;
                float dp5 = AndroidUtilities.dp(32.0f);
                float f26 = this.d;
                float f27 = this.f24481g;
                float A = com.google.android.recaptcha.internal.a.A(f27, dp4, 2.0f, f26);
                f10 = 11.32f;
                float f28 = this.f24479e;
                f11 = 5.0f;
                float f29 = this.h;
                f12 = 17.0f;
                rectF.set(A, com.google.android.recaptcha.internal.a.A(f29, dp5, 2.0f, f28), j7.l1.c(f27, dp4, 2.0f, f26), j7.l1.c(f29, dp5, 2.0f, f28));
                path.rewind();
                float f30 = dp5 / 2.0f;
                path.addRoundRect(rectF, f30, f30, Path.Direction.CW);
                canvas2.save();
                canvas2.scale(a10, a10, (this.f24481g / 2.0f) + this.d, (this.h / 2.0f) + this.f24479e);
                canvas2.save();
                canvas2.clipPath(path);
                f9 = f21;
                c(canvas2, f9);
                canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(f9, 1342177280));
                path2 = path;
                this.f24490q.c((((this.f24481g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.f24479e + (this.h / 2.0f), f9, -1, canvas2);
                canvas2.restore();
                if (s1Var.getDelegate() != null && s1Var.getDelegate().c1(5, s1Var)) {
                    c90 c90Var = this.f24484k;
                    if (c90Var == null) {
                        c90 c90Var2 = new c90();
                        this.f24484k = c90Var2;
                        c90Var2.setCallback(s1Var);
                        this.f24484k.f(org.telegram.ui.ActionBar.g6.l1(0.1f, -1), org.telegram.ui.ActionBar.g6.l1(0.3f, -1), org.telegram.ui.ActionBar.g6.l1(0.35f, -1), org.telegram.ui.ActionBar.g6.l1(0.8f, -1));
                        c90 c90Var3 = this.f24484k;
                        c90Var3.C = true;
                        c90Var3.f27399w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    } else if (c90Var.b() || this.f24484k.c()) {
                        c90 c90Var4 = this.f24484k;
                        c90Var4.f27381b = -1L;
                        c90Var4.f27382c = -1L;
                    }
                } else {
                    c90 c90Var5 = this.f24484k;
                    if (c90Var5 != null && !c90Var5.c() && !this.f24484k.b()) {
                        this.f24484k.a();
                    }
                }
                c90 c90Var6 = this.f24484k;
                if (c90Var6 != null) {
                    c90Var6.d(rectF);
                    this.f24484k.j(f30);
                    this.f24484k.setAlpha((int) (f9 * 255.0f));
                    this.f24484k.draw(canvas2);
                }
                canvas2.restore();
            } else {
                path2 = path;
                f9 = f21;
                f10 = 11.32f;
                f11 = 5.0f;
                f12 = 17.0f;
            }
            if (this.f24491r != null && f9 < 1.0f && a()) {
                float timeAlpha = s1Var.getTimeAlpha() * (1.0f - f9);
                float dp6 = AndroidUtilities.dp(f10) + this.f24491r.f35462c;
                float dp7 = AndroidUtilities.dp(f12);
                float dp8 = AndroidUtilities.dp(f11);
                float f31 = this.d + this.f24481g;
                float f32 = this.f24479e + dp8;
                rectF.set((f31 - dp6) - dp8, f32, f31 - dp8, f32 + dp7);
                path2.rewind();
                float f33 = dp7 / 2.0f;
                path2.addRoundRect(rectF, f33, f33, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path2);
                canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(timeAlpha, 1073741824));
                this.f24491r.c((((this.d + this.f24481g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.f24479e + dp8 + f33, timeAlpha, -1, canvas2);
                canvas.restore();
            }
        }
    }

    public final void c(Canvas canvas, float f9) {
        int i10;
        float f10;
        ArrayList arrayList;
        if (this.f24477b != null) {
            s1 s1Var = this.f24476a;
            if (s1Var.getMessageObject() != null) {
                i10 = s1Var.getMessageObject().getId();
            } else {
                i10 = 0;
            }
            int i11 = this.f24481g;
            int i12 = this.h;
            float f11 = 100.0f;
            if (i11 > i12) {
                f10 = 100.0f;
            } else {
                f10 = (i11 / i12) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f10);
            int i13 = this.h;
            int i14 = this.f24481g;
            if (i13 <= i14) {
                f11 = 100.0f * (i13 / i14);
            }
            int max2 = (int) Math.max(1.0f, f11);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                arrayList = this.f24478c;
                if (i15 >= arrayList.size()) {
                    break;
                }
                h4 h4Var = (h4) arrayList.get(i15);
                if (h4Var.f24443f.hasImageSet() && h4Var.f24443f.getBitmap() != null) {
                    i16 |= 1 << i15;
                }
                i15++;
            }
            Bitmap bitmap = this.f24495w;
            if (bitmap == null || this.f24498z != i10 || this.f24497y != i16 || this.A != max || this.B != max2) {
                this.f24497y = i16;
                this.f24498z = i10;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f24495w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f24495w);
                float f12 = max / this.f24481g;
                canvas2.scale(f12, f12);
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    h4 h4Var2 = (h4) arrayList.get(i17);
                    ImageReceiver imageReceiver = h4Var2.f24443f;
                    int i18 = h4Var2.f24439a;
                    int i19 = h4Var2.f24440b;
                    imageReceiver.setImageCoords(i18, i19, h4Var2.f24441c - i18, h4Var2.d - i19);
                    h4Var2.f24443f.draw(canvas2);
                }
                Utilities.stackBlurBitmap(this.f24495w, 12);
                if (this.f24496x == null) {
                    this.f24496x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f24496x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f24495w != null) {
                canvas.save();
                canvas.translate(this.d, this.f24479e);
                canvas.scale(this.f24481g / this.f24495w.getWidth(), this.f24481g / this.f24495w.getWidth());
                this.f24496x.setAlpha((int) (f9 * 255.0f));
                canvas.drawBitmap(this.f24495w, 0.0f, 0.0f, this.f24496x);
                canvas.restore();
            }
        }
    }

    public final h4 d(float f9, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24478c;
            if (i10 < arrayList.size()) {
                if (((h4) arrayList.get(i10)).f24443f.isInsideImage(f9, f10)) {
                    return (h4) arrayList.get(i10);
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
            gh.j jVar = this.f24485l;
            if (jVar != null) {
                jVar.a(this.f24476a);
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f24478c;
                if (i10 < arrayList.size()) {
                    h4 h4Var = (h4) arrayList.get(i10);
                    if (h4Var.I) {
                        h4Var.I = false;
                        h4Var.f24443f.onDetachedFromWindow();
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
        h4 h4Var;
        s1 s1Var;
        boolean z11;
        boolean z12;
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            h4 d = d(x4, y8);
            this.f24488o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.C;
                if (radialProgress2.f26485i.f31311q != 4 && radialProgress2.f26479a.contains(x4, y8)) {
                    z12 = true;
                    this.f24489p = z12;
                }
            }
            z12 = false;
            this.f24489p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            h4 d10 = d(x4, y8);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.C;
                if (radialProgress22.f26485i.f31311q != 4 && radialProgress22.f26479a.contains(x4, y8)) {
                    z10 = true;
                    h4Var = this.f24488o;
                    if (h4Var != null && h4Var == d10) {
                        s1Var = this.f24476a;
                        if (s1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = s1Var.getMessageObject();
                            if (!this.f24489p && z10 && d10.C.f26485i.f31311q == 3 && messageObject != null) {
                                if (messageObject.isSending()) {
                                    SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                                }
                            } else {
                                j1 delegate = s1Var.getDelegate();
                                h4 h4Var2 = this.f24488o;
                                ImageReceiver imageReceiver = h4Var2.f24443f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = h4Var2.A;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.U1(s1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f24489p = false;
                    this.f24488o = null;
                }
            }
            z10 = false;
            h4Var = this.f24488o;
            if (h4Var != null) {
                s1Var = this.f24476a;
                if (s1Var.getDelegate() != null) {
                    MessageObject messageObject2 = s1Var.getMessageObject();
                    if (!this.f24489p) {
                    }
                    j1 delegate2 = s1Var.getDelegate();
                    h4 h4Var22 = this.f24488o;
                    ImageReceiver imageReceiver2 = h4Var22.f24443f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = h4Var22.A;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.U1(s1Var, messageExtendedMedia2);
                }
            }
            this.f24489p = false;
            this.f24488o = null;
        }
        if (this.f24488o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24487n.c(z11);
        if (this.f24488o == null) {
            return false;
        }
        return true;
    }

    public final void g(org.telegram.messenger.MessageObject r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i4.g(org.telegram.messenger.MessageObject):void");
    }

    public final void h(MessageObject messageObject) {
        boolean z10;
        boolean z11;
        int i10;
        float f9;
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
        s1 s1Var = this.f24476a;
        if (s1Var.Hc <= 0 && (!s1Var.f25494q1 || TextUtils.isEmpty(messageObject.caption))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((s1Var.f25494q1 || TextUtils.isEmpty(messageObject.caption)) && s1Var.J.f13847s && !s1Var.f9) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i18 = this.f24486m;
        if (i18 > 0) {
            f9 = 1000.0f / this.f24477b.d;
            this.f24480f = i18;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f24480f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                int min = Math.min(s1Var.getParentWidth(), AndroidUtilities.displaySize.y);
                if (s1Var.M0(messageObject)) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                this.f24480f = min - AndroidUtilities.dp(i10 + 64);
            }
            if (s1Var.z3()) {
                this.f24480f -= AndroidUtilities.dp(52.0f);
            }
            f9 = 1.0f;
        }
        g4 g4Var = this.f24477b;
        this.f24481g = (int) ((g4Var.d / 1000.0f) * f9 * this.f24480f);
        this.h = (int) (g4Var.f24400g * g4Var.f24401i);
        this.f24482i = false;
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
            ArrayList arrayList = this.f24478c;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i19 >= arrayList.size()) {
                break;
            }
            h4 h4Var = (h4) arrayList.get(i19);
            g4 g4Var2 = this.f24477b;
            TLRPC.MessageExtendedMedia messageExtendedMedia = h4Var.A;
            ImageReceiver imageReceiver = h4Var.f24443f;
            if (messageExtendedMedia == null) {
                g4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) g4Var2.f24397c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z12 = z10;
                z13 = z11;
                i13 = dp;
            } else {
                float f10 = this.f24480f;
                int i20 = (int) ((groupedMessagePosition.left / 1000.0f) * f9 * f10);
                z12 = z10;
                float f11 = groupedMessagePosition.top;
                float f12 = this.f24477b.f24401i;
                int i21 = (int) (f11 * f12);
                int i22 = (int) (groupedMessagePosition.f19617ph * f12);
                int i23 = (int) ((groupedMessagePosition.pw / 1000.0f) * f9 * f10);
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
                h4Var.f24439a = i20;
                h4Var.f24440b = i25;
                i13 = dp;
                h4Var.f24441c = i20 + i27;
                h4Var.d = i25 + i28;
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
                if (!z12 && s1Var.A) {
                    if (messageObject.isOutOwner()) {
                        i15 = min2;
                    } else {
                        i14 = min2;
                    }
                }
                imageReceiver.setRoundRadius(i14, i15, i17, i16);
                float[] fArr = h4Var.f24446s;
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
                    h4Var.b(3);
                }
                if (!this.f24482i && !h4Var.h) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                this.f24482i = z14;
            }
            i19++;
            z10 = z12;
            dp = i13;
            z11 = z13;
        }
        if (this.f24482i) {
            if (messageObject == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                zz0 zz0Var = new zz0(jh.ia.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.f24490q = zz0Var;
                if (zz0Var.f35462c > this.f24481g - AndroidUtilities.dp(30.0f)) {
                    this.f24490q = new zz0(jh.ia.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
