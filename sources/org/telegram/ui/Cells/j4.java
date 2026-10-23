package org.telegram.ui.Cells;

import ai.md;
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
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.yc;
public final class j4 {
    public int A;
    public int B;
    public boolean C;
    public final u1 f22466a;
    public h4 f22467b;
    public int d;
    public int e;
    public int f22469f;
    public int f22470g;
    public int h;
    public boolean f22471i;
    public final org.telegram.ui.Components.f6 f22472j;
    public ba0 f22473k;
    public final wh.f f22474l;
    public int f22475m;
    public final yc f22476n;
    public i4 f22477o;
    public boolean f22478p;
    public f11 f22479q;
    public f11 f22480r;
    public long f22481s;
    public Bitmap f22484w;
    public Paint f22485x;
    public int f22486y;
    public int f22487z;
    public final ArrayList f22468c = new ArrayList();
    public final Path f22482t = new Path();
    public final Path f22483u = new Path();
    public final RectF v = new RectF();

    public j4(u1 u1Var) {
        this.f22466a = u1Var;
        this.f22474l = wh.f.e(u1Var);
        this.f22472j = new org.telegram.ui.Components.f6(u1Var, 0L, 350L, bs.h);
        this.f22476n = new yc(u1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f22468c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((i4) obj).f22416f.getVisible()) {
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
        if (this.f22467b != null) {
            boolean z10 = this.f22471i;
            org.telegram.ui.Components.f6 f6Var = this.f22472j;
            float e = f6Var.e(z10);
            float e7 = f6Var.e(this.f22471i);
            u1 u1Var2 = this.f22466a;
            MessageObject messageObject = u1Var2.getMessageObject();
            Path path3 = this.f22483u;
            path3.rewind();
            float f14 = Float.MAX_VALUE;
            float f15 = Float.MIN_VALUE;
            float f16 = Float.MIN_VALUE;
            int i10 = 0;
            float f17 = Float.MAX_VALUE;
            while (true) {
                arrayList = this.f22468c;
                if (i10 >= arrayList.size()) {
                    break;
                }
                i4 i4Var = (i4) arrayList.get(i10);
                ImageReceiver imageReceiver = i4Var.f22416f;
                RadialProgress2 radialProgress2 = i4Var.G;
                int i11 = this.d;
                int i12 = i4Var.f22413a;
                float f18 = e;
                int i13 = this.e;
                int i14 = i4Var.f22414b;
                float f19 = e7;
                u1 u1Var3 = u1Var2;
                imageReceiver.setImageCoords(i11 + i12, i13 + i14, i4Var.f22415c - i12, i4Var.d - i14);
                imageReceiver.draw(canvas2);
                if (imageReceiver.getAnimation() != null) {
                    imageReceiver.getAnimation().getClass();
                    int round = Math.round(((float) 0) / 1000.0f);
                    if (!i4Var.f22421x && i4Var.K != (max = Math.max(0, i4Var.J - round))) {
                        i4Var.K = max;
                        i4Var.L = new f11(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                    }
                }
                if (f19 > 0.0f) {
                    float min = Math.min(this.d + i4Var.f22413a, f17);
                    float min2 = Math.min(this.e + i4Var.f22414b, f14);
                    f16 = Math.max(this.d + i4Var.f22415c, f16);
                    f15 = Math.max(this.e + i4Var.d, f15);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    int i15 = this.d;
                    int i16 = this.e;
                    rectF2.set(i4Var.f22413a + i15, i4Var.f22414b + i16, i15 + i4Var.f22415c, i16 + i4Var.d);
                    path3.addRoundRect(rectF2, i4Var.f22419s, Path.Direction.CW);
                    f14 = min2;
                    f17 = min;
                }
                radialProgress2.g(org.telegram.ui.ActionBar.h6.f21146le, org.telegram.ui.ActionBar.h6.f21165me, org.telegram.ui.ActionBar.h6.f21185ne, org.telegram.ui.ActionBar.h6.f21203oe);
                RectF rectF3 = radialProgress2.f24308a;
                float f20 = f14;
                rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.f24327x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.f24327x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.f24327x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.f24327x + imageReceiver.getImageY());
                if (messageObject.isSending()) {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                    long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(i4Var.F);
                    boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                    if (fileProgressSizes == null && isSendingPaidMessage) {
                        radialProgress2.o(1.0f, true);
                        if (i4Var.f22420w) {
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
                u1Var2 = u1Var3;
                e7 = f19;
            }
            float f21 = e;
            float f22 = e7;
            u1 u1Var4 = u1Var2;
            if (f22 > 0.0f) {
                canvas2.save();
                canvas2.clipPath(path3);
                canvas2.translate(f17, f14);
                int i17 = (int) (f16 - f17);
                int i18 = (int) (f15 - f14);
                canvas2.saveLayerAlpha(0.0f, 0.0f, i17, i18, (int) (f22 * 255.0f), 31);
                this.f22474l.c(canvas, u1Var4, i17, i18, 1.0f, u1Var4.pe);
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
                path = this.f22482t;
                if (i19 >= size) {
                    break;
                }
                i4 i4Var2 = (i4) arrayList.get(i19);
                if (i4Var2.L != null) {
                    float dp = AndroidUtilities.dp(11.4f) + i4Var2.L.f26025c;
                    float dp2 = AndroidUtilities.dp(17.0f);
                    float dp3 = AndroidUtilities.dp(5.0f);
                    float f23 = this.d + i4Var2.f22413a + dp3;
                    float f24 = this.e + i4Var2.f22414b + dp3;
                    rectF.set(f23, f24, dp + f23, f24 + dp2);
                    if (this.f22480r == null || rectF.right <= ((this.d + this.f22470g) - (AndroidUtilities.dp(11.32f) + this.f22480r.f26025c)) - dp3 || rectF.top > this.e + dp3) {
                        path.rewind();
                        float f25 = dp2 / 2.0f;
                        path.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        f13 = f22;
                        c(canvas2, f13);
                        canvas2.drawColor(org.telegram.ui.ActionBar.h6.m1(1.0f, 1073741824));
                        i4Var2.L.c(this.d + i4Var2.f22413a + dp3 + AndroidUtilities.dp(5.66f), this.e + i4Var2.f22414b + dp3 + f25, 1.0f, -1, canvas2);
                        canvas2.restore();
                        i19++;
                        f22 = f13;
                    }
                }
                f13 = f22;
                i19++;
                f22 = f13;
            }
            if (this.f22479q != null && f21 > 0.0f) {
                float a10 = this.f22476n.a(0.05f);
                float dp4 = AndroidUtilities.dp(28.0f) + this.f22479q.f26025c;
                float dp5 = AndroidUtilities.dp(32.0f);
                float f26 = this.d;
                float f27 = this.f22470g;
                float z11 = com.google.android.gms.internal.play_billing.k3.z(f27, dp4, 2.0f, f26);
                f7 = 11.32f;
                float f28 = this.e;
                f10 = 5.0f;
                float f29 = this.h;
                f11 = 17.0f;
                rectF.set(z11, com.google.android.gms.internal.play_billing.k3.z(f29, dp5, 2.0f, f28), org.telegram.messenger.g0.a(f27, dp4, 2.0f, f26), org.telegram.messenger.g0.a(f29, dp5, 2.0f, f28));
                path.rewind();
                float f30 = dp5 / 2.0f;
                path.addRoundRect(rectF, f30, f30, Path.Direction.CW);
                canvas2.save();
                canvas2.scale(a10, a10, (this.f22470g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
                canvas2.save();
                canvas2.clipPath(path);
                f12 = f21;
                c(canvas2, f12);
                canvas2.drawColor(org.telegram.ui.ActionBar.h6.m1(f12, 1342177280));
                path2 = path;
                this.f22479q.c((((this.f22470g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.e + (this.h / 2.0f), f12, -1, canvas2);
                canvas2.restore();
                if (u1Var.getDelegate() != null && u1Var.getDelegate().Z0(5, u1Var)) {
                    ba0 ba0Var = this.f22473k;
                    if (ba0Var == null) {
                        ba0 ba0Var2 = new ba0();
                        this.f22473k = ba0Var2;
                        ba0Var2.setCallback(u1Var);
                        this.f22473k.g(org.telegram.ui.ActionBar.h6.m1(0.1f, -1), org.telegram.ui.ActionBar.h6.m1(0.3f, -1), org.telegram.ui.ActionBar.h6.m1(0.35f, -1), org.telegram.ui.ActionBar.h6.m1(0.8f, -1));
                        ba0 ba0Var3 = this.f22473k;
                        ba0Var3.D = true;
                        ba0Var3.f24880x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    } else if (ba0Var.c() || this.f22473k.d()) {
                        ba0 ba0Var4 = this.f22473k;
                        ba0Var4.f24862b = -1L;
                        ba0Var4.f24863c = -1L;
                    }
                } else {
                    ba0 ba0Var5 = this.f22473k;
                    if (ba0Var5 != null && !ba0Var5.d() && !this.f22473k.c()) {
                        this.f22473k.a();
                    }
                }
                ba0 ba0Var6 = this.f22473k;
                if (ba0Var6 != null) {
                    ba0Var6.e(rectF);
                    this.f22473k.k(f30);
                    this.f22473k.setAlpha((int) (f12 * 255.0f));
                    this.f22473k.draw(canvas2);
                }
                canvas2.restore();
            } else {
                f7 = 11.32f;
                f10 = 5.0f;
                f11 = 17.0f;
                f12 = f21;
                path2 = path;
            }
            if (this.f22480r != null && f12 < 1.0f && a()) {
                float timeAlpha = u1Var.getTimeAlpha() * (1.0f - f12);
                float dp6 = AndroidUtilities.dp(f7) + this.f22480r.f26025c;
                float dp7 = AndroidUtilities.dp(f11);
                float dp8 = AndroidUtilities.dp(f10);
                float f31 = this.d + this.f22470g;
                float f32 = this.e + dp8;
                rectF.set((f31 - dp6) - dp8, f32, f31 - dp8, f32 + dp7);
                path2.rewind();
                float f33 = dp7 / 2.0f;
                path2.addRoundRect(rectF, f33, f33, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path2);
                canvas2.drawColor(org.telegram.ui.ActionBar.h6.m1(timeAlpha, 1073741824));
                this.f22480r.c((((this.d + this.f22470g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.e + dp8 + f33, timeAlpha, -1, canvas2);
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
        if (this.f22467b != null) {
            u1 u1Var = this.f22466a;
            if (u1Var.getMessageObject() != null) {
                i10 = u1Var.getMessageObject().getId();
            } else {
                i10 = 0;
            }
            int i13 = this.f22470g;
            int i14 = this.h;
            float f11 = 100.0f;
            if (i13 > i14) {
                f10 = 100.0f;
            } else {
                f10 = (i13 / i14) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f10);
            int i15 = this.h;
            int i16 = this.f22470g;
            if (i15 <= i16) {
                f11 = 100.0f * (i15 / i16);
            }
            int max2 = (int) Math.max(1.0f, f11);
            int i17 = 0;
            int i18 = 0;
            while (true) {
                arrayList = this.f22468c;
                if (i17 >= arrayList.size()) {
                    break;
                }
                i4 i4Var = (i4) arrayList.get(i17);
                if (i4Var.f22416f.hasImageSet() && i4Var.f22416f.getBitmap() != null) {
                    i18 |= 1 << i17;
                }
                i17++;
            }
            Bitmap bitmap = this.f22484w;
            if (bitmap == null || this.f22487z != i10 || this.f22486y != i18 || this.A != max || this.B != max2) {
                this.f22486y = i18;
                this.f22487z = i10;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f22484w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f22484w);
                float f12 = max / this.f22470g;
                canvas2.scale(f12, f12);
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    i4 i4Var2 = (i4) arrayList.get(i19);
                    i4Var2.f22416f.setImageCoords(i4Var2.f22413a, i4Var2.f22414b, i4Var2.f22415c - i11, i4Var2.d - i12);
                    i4Var2.f22416f.draw(canvas2);
                }
                Utilities.stackBlurBitmap(this.f22484w, 12);
                if (this.f22485x == null) {
                    this.f22485x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f22485x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f22484w != null) {
                canvas.save();
                canvas.translate(this.d, this.e);
                canvas.scale(this.f22470g / this.f22484w.getWidth(), this.f22470g / this.f22484w.getWidth());
                this.f22485x.setAlpha((int) (f7 * 255.0f));
                canvas.drawBitmap(this.f22484w, 0.0f, 0.0f, this.f22485x);
                canvas.restore();
            }
        }
    }

    public final i4 d(float f7, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22468c;
            if (i10 < arrayList.size()) {
                if (((i4) arrayList.get(i10)).f22416f.isInsideImage(f7, f10)) {
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
            wh.f fVar = this.f22474l;
            if (fVar != null) {
                fVar.a(this.f22466a);
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f22468c;
                if (i10 < arrayList.size()) {
                    i4 i4Var = (i4) arrayList.get(i10);
                    if (i4Var.M) {
                        i4Var.M = false;
                        i4Var.f22416f.onDetachedFromWindow();
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
        u1 u1Var;
        boolean z11;
        boolean z12;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            i4 d = d(x10, y3);
            this.f22477o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.G;
                if (radialProgress2.f24313i.f28768q != 4 && radialProgress2.f24308a.contains(x10, y3)) {
                    z12 = true;
                    this.f22478p = z12;
                }
            }
            z12 = false;
            this.f22478p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            i4 d10 = d(x10, y3);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.G;
                if (radialProgress22.f24313i.f28768q != 4 && radialProgress22.f24308a.contains(x10, y3)) {
                    z10 = true;
                    i4Var = this.f22477o;
                    if (i4Var != null && i4Var == d10) {
                        u1Var = this.f22466a;
                        if (u1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = u1Var.getMessageObject();
                            if (!this.f22478p && z10 && d10.G.f24313i.f28768q == 3 && messageObject != null) {
                                if (messageObject.isSending()) {
                                    SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                                }
                            } else {
                                l1 delegate = u1Var.getDelegate();
                                i4 i4Var2 = this.f22477o;
                                ImageReceiver imageReceiver = i4Var2.f22416f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = i4Var2.E;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.M1(u1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f22478p = false;
                    this.f22477o = null;
                }
            }
            z10 = false;
            i4Var = this.f22477o;
            if (i4Var != null) {
                u1Var = this.f22466a;
                if (u1Var.getDelegate() != null) {
                    MessageObject messageObject2 = u1Var.getMessageObject();
                    if (!this.f22478p) {
                    }
                    l1 delegate2 = u1Var.getDelegate();
                    i4 i4Var22 = this.f22477o;
                    ImageReceiver imageReceiver2 = i4Var22.f22416f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = i4Var22.E;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.M1(u1Var, messageExtendedMedia2);
                }
            }
            this.f22478p = false;
            this.f22477o = null;
        }
        if (this.f22477o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22476n.c(z11);
        if (this.f22477o == null) {
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
        u1 u1Var = this.f22466a;
        boolean z15 = false;
        if (u1Var.Lc <= 0 && (!u1Var.f23506u1 || TextUtils.isEmpty(messageObject.caption))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((u1Var.f23506u1 || TextUtils.isEmpty(messageObject.caption)) && u1Var.N.f806s && !u1Var.f23356j9) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i18 = this.f22475m;
        float f10 = 1000.0f;
        if (i18 > 0) {
            f7 = 1000.0f / this.f22467b.d;
            this.f22469f = i18;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f22469f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                int min = Math.min(u1Var.getParentWidth(), AndroidUtilities.displaySize.y);
                if (u1Var.M0(messageObject)) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                this.f22469f = min - AndroidUtilities.dp(i10 + 64);
            }
            if (u1Var.z3()) {
                this.f22469f -= AndroidUtilities.dp(52.0f);
            }
            f7 = 1.0f;
        }
        h4 h4Var = this.f22467b;
        this.f22470g = (int) ((h4Var.d / 1000.0f) * f7 * this.f22469f);
        this.h = (int) (h4Var.f22338g * h4Var.f22339i);
        this.f22471i = false;
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
            ArrayList arrayList = this.f22468c;
            float f11 = f10;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i19 >= arrayList.size()) {
                break;
            }
            i4 i4Var = (i4) arrayList.get(i19);
            h4 h4Var2 = this.f22467b;
            char c11 = c10;
            TLRPC.MessageExtendedMedia messageExtendedMedia = i4Var.E;
            boolean z16 = z15;
            ImageReceiver imageReceiver = i4Var.f22416f;
            if (messageExtendedMedia == null) {
                h4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) h4Var2.f22336c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z12 = z10;
                z13 = z11;
                i13 = dp;
            } else {
                float f12 = this.f22469f;
                int i20 = (int) ((groupedMessagePosition.left / f11) * f7 * f12);
                z12 = z10;
                float f13 = groupedMessagePosition.top;
                float f14 = this.f22467b.f22339i;
                int i21 = (int) (f13 * f14);
                int i22 = (int) (groupedMessagePosition.f17796ph * f14);
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
                i4Var.f22413a = i20;
                i4Var.f22414b = i25;
                i13 = dp;
                i4Var.f22415c = i20 + i27;
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
                if (!z12 && u1Var.E) {
                    if (messageObject.isOutOwner()) {
                        i15 = min2;
                    } else {
                        i14 = min2;
                    }
                }
                imageReceiver.setRoundRadius(i14, i15, i17, i16);
                float[] fArr = i4Var.f22419s;
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
                if (!this.f22471i && !i4Var.h) {
                    z14 = z16 ? 1 : 0;
                } else {
                    z14 = true;
                }
                this.f22471i = z14;
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
        if (this.f22471i) {
            if (messageObject == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                f11 f11Var = new f11(md.Y0(z17, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.f22479q = f11Var;
                if (f11Var.f26025c > this.f22470g - AndroidUtilities.dp(30.0f)) {
                    this.f22479q = new f11(md.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
