package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.t80;

public final class h4 {
    public int A;
    public int B;
    public boolean C;

    public final s1 f24426a;

    public f4 f24427b;
    public int d;

    public int f24429e;

    public int f24430f;

    public int f24431g;
    public int h;

    public boolean f24432i;

    public final org.telegram.ui.Components.y5 f24433j;

    public t80 f24434k;

    public final eh.j f24435l;

    public int f24436m;

    public final nc f24437n;

    public g4 f24438o;

    public boolean f24439p;

    public pz0 f24440q;

    public pz0 f24441r;

    public long f24442s;

    public Bitmap f24445w;

    public Paint f24446x;

    public int f24447y;

    public int f24448z;

    public final ArrayList f24428c = new ArrayList();

    public final Path f24443t = new Path();

    public final Path f24444u = new Path();
    public final RectF v = new RectF();

    public h4(s1 s1Var) {
        this.f24426a = s1Var;
        this.f24435l = eh.j.e(s1Var);
        this.f24433j = new org.telegram.ui.Components.y5(s1Var, 0L, 350L, er.h);
        this.f24437n = new nc(s1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f24428c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((g4) obj).f24382f.getVisible()) {
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
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int iMax;
        Canvas canvas2 = canvas;
        if (this.f24427b == null) {
            return;
        }
        boolean z10 = this.f24432i;
        org.telegram.ui.Components.y5 y5Var = this.f24433j;
        float fE = y5Var.e(z10);
        float fE2 = y5Var.e(this.f24432i);
        s1 s1Var2 = this.f24426a;
        MessageObject messageObject = s1Var2.getMessageObject();
        Path path2 = this.f24444u;
        path2.rewind();
        float f15 = Float.MAX_VALUE;
        float f16 = Float.MAX_VALUE;
        float fMax = Float.MIN_VALUE;
        float fMax2 = Float.MIN_VALUE;
        int i10 = 0;
        while (true) {
            arrayList = this.f24428c;
            if (i10 >= arrayList.size()) {
                break;
            }
            g4 g4Var = (g4) arrayList.get(i10);
            ImageReceiver imageReceiver = g4Var.f24382f;
            RadialProgress2 radialProgress2 = g4Var.C;
            int i11 = this.d;
            int i12 = g4Var.f24378a;
            float f17 = fE;
            int i13 = this.f24429e;
            int i14 = g4Var.f24379b;
            float f18 = fE2;
            s1 s1Var3 = s1Var2;
            imageReceiver.setImageCoords(i11 + i12, i13 + i14, g4Var.f24380c - i12, g4Var.d - i14);
            imageReceiver.draw(canvas2);
            if (imageReceiver.getAnimation() != null) {
                imageReceiver.getAnimation().getClass();
                int iRound = Math.round(0 / 1000.0f);
                if (!g4Var.f24387x && g4Var.G != (iMax = Math.max(0, g4Var.F - iRound))) {
                    g4Var.G = iMax;
                    g4Var.H = new pz0(AndroidUtilities.formatLongDuration(iMax), 12.0f, null);
                }
            }
            if (f18 > 0.0f) {
                float fMin = Math.min(this.d + g4Var.f24378a, f15);
                float fMin2 = Math.min(this.f24429e + g4Var.f24379b, f16);
                fMax = Math.max(this.d + g4Var.f24380c, fMax);
                fMax2 = Math.max(this.f24429e + g4Var.d, fMax2);
                RectF rectF2 = AndroidUtilities.rectTmp;
                int i15 = this.d;
                float f19 = g4Var.f24378a + i15;
                int i16 = this.f24429e;
                rectF2.set(f19, g4Var.f24379b + i16, i15 + g4Var.f24380c, i16 + g4Var.d);
                path2.addRoundRect(rectF2, g4Var.f24385s, Path.Direction.CW);
                f15 = fMin;
                f16 = fMin2;
            }
            radialProgress2.g(org.telegram.ui.ActionBar.g6.f23205le, org.telegram.ui.ActionBar.g6.f23223me, org.telegram.ui.ActionBar.g6.f23241ne, org.telegram.ui.ActionBar.g6.f23258oe);
            RectF rectF3 = radialProgress2.f26464a;
            float f20 = f15;
            rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.f26484x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.f26484x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.f26484x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.f26484x + imageReceiver.getImageY());
            if (messageObject.isSending()) {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(g4Var.B);
                boolean zIsSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                if (fileProgressSizes == null && zIsSendingPaidMessage) {
                    radialProgress2.o(1.0f, true);
                    g4Var.b(g4Var.f24386w ? 6 : g4Var.a());
                }
            } else if (FileLoader.getInstance(messageObject.currentAccount).isLoadingFile(g4Var.v)) {
                g4Var.b(3);
            } else {
                g4Var.b(g4Var.a());
            }
            canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f18) * 255.0f), 31);
            radialProgress2.draw(canvas2);
            canvas2.restore();
            i10++;
            f15 = f20;
            fE = f17;
            s1Var2 = s1Var3;
            fE2 = f18;
        }
        float f21 = fE;
        float f22 = fE2;
        s1 s1Var4 = s1Var2;
        if (f22 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path2);
            canvas2.translate(f15, f16);
            int i17 = (int) (fMax - f15);
            int i18 = (int) (fMax2 - f16);
            canvas2.saveLayerAlpha(0.0f, 0.0f, i17, i18, (int) (f22 * 255.0f), 31);
            this.f24435l.c(canvas, s1Var4, i17, i18, 1.0f, s1Var4.f25411ke);
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
            path = this.f24443t;
            if (i19 >= size) {
                break;
            }
            g4 g4Var2 = (g4) arrayList.get(i19);
            if (g4Var2.H != null) {
                float fDp = AndroidUtilities.dp(11.4f) + g4Var2.H.f31697c;
                float fDp2 = AndroidUtilities.dp(17.0f);
                float fDp3 = AndroidUtilities.dp(5.0f);
                float f23 = this.d + g4Var2.f24378a + fDp3;
                float f24 = this.f24429e + g4Var2.f24379b + fDp3;
                rectF.set(f23, f24, fDp + f23, f24 + fDp2);
                if (this.f24441r == null || rectF.right <= ((this.d + this.f24431g) - (AndroidUtilities.dp(11.32f) + this.f24441r.f31697c)) - fDp3 || rectF.top > this.f24429e + fDp3) {
                    path.rewind();
                    float f25 = fDp2 / 2.0f;
                    path.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                    canvas2.save();
                    canvas2.clipPath(path);
                    f14 = f22;
                    c(canvas2, f14);
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(1.0f, 1073741824));
                    g4Var2.H.c(this.d + g4Var2.f24378a + fDp3 + AndroidUtilities.dp(5.66f), this.f24429e + g4Var2.f24379b + fDp3 + f25, 1.0f, -1, canvas2);
                    canvas2.restore();
                } else {
                    f14 = f22;
                }
            } else {
                f14 = f22;
            }
            i19++;
            f22 = f14;
        }
        if (this.f24440q == null || f21 <= 0.0f) {
            f10 = f21;
            f11 = 11.32f;
            f12 = 5.0f;
            f13 = 17.0f;
        } else {
            float fA = this.f24437n.a(0.05f);
            float fDp4 = AndroidUtilities.dp(28.0f) + this.f24440q.f31697c;
            float fDp5 = AndroidUtilities.dp(32.0f);
            float f26 = this.d;
            float f27 = this.f24431g;
            float fA2 = com.google.android.recaptcha.internal.a.A(f27, fDp4, 2.0f, f26);
            f11 = 11.32f;
            float f28 = this.f24429e;
            f12 = 5.0f;
            float f29 = this.h;
            f13 = 17.0f;
            rectF.set(fA2, com.google.android.recaptcha.internal.a.A(f29, fDp5, 2.0f, f28), i0.a.c(f27, fDp4, 2.0f, f26), i0.a.c(f29, fDp5, 2.0f, f28));
            path.rewind();
            float f30 = fDp5 / 2.0f;
            path.addRoundRect(rectF, f30, f30, Path.Direction.CW);
            canvas2.save();
            canvas2.scale(fA, fA, (this.f24431g / 2.0f) + this.d, (this.h / 2.0f) + this.f24429e);
            canvas2.save();
            canvas2.clipPath(path);
            f10 = f21;
            c(canvas2, f10);
            canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(f10, 1342177280));
            this.f24440q.c((((this.f24431g / 2.0f) + this.d) - (fDp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.f24429e + (this.h / 2.0f), f10, -1, canvas2);
            canvas2.restore();
            if (s1Var.getDelegate() == null || !s1Var.getDelegate().Y0(5, s1Var)) {
                t80 t80Var = this.f24434k;
                if (t80Var != null && !t80Var.c() && !this.f24434k.b()) {
                    this.f24434k.a();
                }
            } else {
                t80 t80Var2 = this.f24434k;
                if (t80Var2 == null) {
                    t80 t80Var3 = new t80();
                    this.f24434k = t80Var3;
                    t80Var3.setCallback(s1Var);
                    this.f24434k.f(org.telegram.ui.ActionBar.g6.l1(0.1f, -1), org.telegram.ui.ActionBar.g6.l1(0.3f, -1), org.telegram.ui.ActionBar.g6.l1(0.35f, -1), org.telegram.ui.ActionBar.g6.l1(0.8f, -1));
                    t80 t80Var4 = this.f24434k;
                    t80Var4.C = true;
                    t80Var4.f32710w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                } else if (t80Var2.b() || this.f24434k.c()) {
                    t80 t80Var5 = this.f24434k;
                    t80Var5.f32692b = -1L;
                    t80Var5.f32693c = -1L;
                }
            }
            t80 t80Var6 = this.f24434k;
            if (t80Var6 != null) {
                t80Var6.d(rectF);
                this.f24434k.j(f30);
                this.f24434k.setAlpha((int) (f10 * 255.0f));
                this.f24434k.draw(canvas2);
            }
            canvas2.restore();
        }
        if (this.f24441r == null || f10 >= 1.0f || !a()) {
            return;
        }
        float timeAlpha = s1Var.getTimeAlpha() * (1.0f - f10);
        float fDp6 = AndroidUtilities.dp(f11) + this.f24441r.f31697c;
        float fDp7 = AndroidUtilities.dp(f13);
        float fDp8 = AndroidUtilities.dp(f12);
        float f31 = this.d + this.f24431g;
        float f32 = this.f24429e + fDp8;
        rectF.set((f31 - fDp6) - fDp8, f32, f31 - fDp8, f32 + fDp7);
        path.rewind();
        float f33 = fDp7 / 2.0f;
        path.addRoundRect(rectF, f33, f33, Path.Direction.CW);
        canvas2.save();
        canvas2.clipPath(path);
        canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(timeAlpha, 1073741824));
        this.f24441r.c((((this.d + this.f24431g) - fDp6) - fDp8) + AndroidUtilities.dp(5.66f), this.f24429e + fDp8 + f33, timeAlpha, -1, canvas2);
        canvas.restore();
    }

    public final void c(Canvas canvas, float f10) {
        ArrayList arrayList;
        if (this.f24427b == null) {
            return;
        }
        s1 s1Var = this.f24426a;
        int id2 = s1Var.getMessageObject() != null ? s1Var.getMessageObject().getId() : 0;
        int i10 = this.f24431g;
        int i11 = this.h;
        int iMax = (int) Math.max(1.0f, i10 > i11 ? 100.0f : (i10 / i11) * 100.0f);
        int i12 = this.h;
        int i13 = this.f24431g;
        int iMax2 = (int) Math.max(1.0f, i12 <= i13 ? 100.0f * (i12 / i13) : 100.0f);
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.f24428c;
            if (i14 >= arrayList.size()) {
                break;
            }
            g4 g4Var = (g4) arrayList.get(i14);
            if (g4Var.f24382f.hasImageSet() && g4Var.f24382f.getBitmap() != null) {
                i15 |= 1 << i14;
            }
            i14++;
        }
        Bitmap bitmap = this.f24445w;
        if (bitmap == null || this.f24448z != id2 || this.f24447y != i15 || this.A != iMax || this.B != iMax2) {
            this.f24447y = i15;
            this.f24448z = id2;
            this.A = iMax;
            this.B = iMax2;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f24445w = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.f24445w);
            float f11 = iMax / this.f24431g;
            canvas2.scale(f11, f11);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                g4 g4Var2 = (g4) arrayList.get(i16);
                ImageReceiver imageReceiver = g4Var2.f24382f;
                int i17 = g4Var2.f24378a;
                int i18 = g4Var2.f24379b;
                imageReceiver.setImageCoords(i17, i18, g4Var2.f24380c - i17, g4Var2.d - i18);
                g4Var2.f24382f.draw(canvas2);
            }
            Utilities.stackBlurBitmap(this.f24445w, 12);
            if (this.f24446x == null) {
                this.f24446x = new Paint(3);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(1.5f);
                this.f24446x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
        if (this.f24445w != null) {
            canvas.save();
            canvas.translate(this.d, this.f24429e);
            canvas.scale(this.f24431g / this.f24445w.getWidth(), this.f24431g / this.f24445w.getWidth());
            this.f24446x.setAlpha((int) (f10 * 255.0f));
            canvas.drawBitmap(this.f24445w, 0.0f, 0.0f, this.f24446x);
            canvas.restore();
        }
    }

    public final g4 d(float f10, float f11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24428c;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((g4) arrayList.get(i10)).f24382f.isInsideImage(f10, f11)) {
                return (g4) arrayList.get(i10);
            }
            i10++;
        }
    }

    public final void e() {
        if (!this.C) {
            return;
        }
        this.C = false;
        eh.j jVar = this.f24435l;
        if (jVar != null) {
            jVar.a(this.f24426a);
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24428c;
            if (i10 >= arrayList.size()) {
                return;
            }
            g4 g4Var = (g4) arrayList.get(i10);
            if (g4Var.I) {
                g4Var.I = false;
                g4Var.f24382f.onDetachedFromWindow();
            }
            i10++;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            g4 g4VarD = d(x8, y10);
            this.f24438o = g4VarD;
            if (g4VarD != null) {
                RadialProgress2 radialProgress2 = g4VarD.C;
                if (radialProgress2.f26470i.f28309q == 4 || !radialProgress2.f26464a.contains(x8, y10)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            } else {
                z11 = false;
            }
            this.f24439p = z11;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            g4 g4VarD2 = d(x8, y10);
            if (g4VarD2 != null) {
                RadialProgress2 radialProgress3 = g4VarD2.C;
                if (radialProgress3.f26470i.f28309q == 4 || !radialProgress3.f26464a.contains(x8, y10)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            g4 g4Var = this.f24438o;
            if (g4Var != null && g4Var == g4VarD2) {
                s1 s1Var = this.f24426a;
                if (s1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (!this.f24439p || !z10 || g4VarD2.C.f26470i.f28309q != 3 || messageObject == null) {
                        j1 delegate = s1Var.getDelegate();
                        g4 g4Var2 = this.f24438o;
                        ImageReceiver imageReceiver = g4Var2.f24382f;
                        TLRPC.MessageExtendedMedia messageExtendedMedia = g4Var2.A;
                        motionEvent.getX();
                        motionEvent.getY();
                        delegate.K1(s1Var, messageExtendedMedia);
                    } else if (messageObject.isSending()) {
                        SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                    }
                }
            }
            this.f24439p = false;
            this.f24438o = null;
        }
        this.f24437n.c(this.f24438o != null);
        return this.f24438o != null;
    }

    public final void g(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        float[] fArr;
        float f10;
        float f11;
        float f12;
        float f13;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        MessageObject messageObject2;
        ArrayList arrayList;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        h4 h4Var = this;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            if (h4Var.f24427b == null) {
                f4 f4Var = new f4();
                f4Var.f24332a = new ArrayList();
                f4Var.f24333b = new ArrayList();
                f4Var.f24334c = new HashMap();
                f4Var.h = 800;
                f4Var.f24338i = 814.0f;
                h4Var.f24427b = f4Var;
            }
            h4Var.f24427b.f24332a.clear();
            h4Var.f24427b.f24332a.addAll(tL_messageMediaPaidMedia2.extended_media);
            f4 f4Var2 = h4Var.f24427b;
            float f14 = f4Var2.f24338i;
            ArrayList arrayList2 = f4Var2.f24333b;
            arrayList2.clear();
            HashMap map = f4Var2.f24334c;
            map.clear();
            f4Var2.f24335e = 0;
            ArrayList arrayList3 = f4Var2.f24332a;
            int size = arrayList3.size();
            if (size == 0) {
                f4Var2.d = 0;
                f4Var2.f24337g = 0.0f;
                f4Var2.f24336f = 0;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
            } else {
                f4Var2.h = 800;
                StringBuilder sb2 = new StringBuilder();
                int i10 = 0;
                float f15 = 1.0f;
                boolean z10 = false;
                while (i10 < size) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) arrayList3.get(i10);
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = new MessageObject.GroupedMessagePosition();
                    groupedMessagePosition2.last = i10 == size + (-1);
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
                        groupedMessagePosition2.photoWidth = tL_messageExtendedMediaPreview.f22458w;
                        groupedMessagePosition2.photoHeight = tL_messageExtendedMediaPreview.h;
                    } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                            TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia2).photo;
                            if (photo == null) {
                                closestPhotoSizeWithSize = null;
                            } else {
                                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                            }
                        } else if (!(messageMedia2 instanceof TLRPC.TL_messageMediaDocument) || (document = ((TLRPC.TL_messageMediaDocument) messageMedia2).document) == null) {
                            closestPhotoSizeWithSize = null;
                        } else {
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize());
                        }
                        groupedMessagePosition2.photoWidth = closestPhotoSizeWithSize == null ? 100 : closestPhotoSizeWithSize.f22405w;
                        groupedMessagePosition2.photoHeight = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100;
                    } else {
                        groupedMessagePosition2.photoWidth = 100;
                        groupedMessagePosition2.photoHeight = 100;
                    }
                    if (groupedMessagePosition2.photoWidth <= 0 || groupedMessagePosition2.photoHeight <= 0) {
                        groupedMessagePosition2.photoWidth = 50;
                        groupedMessagePosition2.photoHeight = 50;
                    }
                    float f16 = groupedMessagePosition2.photoWidth / groupedMessagePosition2.photoHeight;
                    groupedMessagePosition2.aspectRatio = f16;
                    if (f16 > 1.2f) {
                        sb2.append("w");
                    } else if (f16 < 0.8f) {
                        sb2.append("n");
                    } else {
                        sb2.append("q");
                    }
                    float f17 = groupedMessagePosition2.aspectRatio;
                    f15 += f17;
                    if (f17 > 2.0f) {
                        z10 = true;
                    }
                    map.put(messageExtendedMedia, groupedMessagePosition2);
                    arrayList2.add(groupedMessagePosition2);
                    i10++;
                }
                int iDp = AndroidUtilities.dp(120.0f);
                float fDp = AndroidUtilities.dp(120.0f);
                Point point = AndroidUtilities.displaySize;
                int iMin = (int) (fDp / (Math.min(point.x, point.y) / f4Var2.h));
                float fDp2 = AndroidUtilities.dp(40.0f);
                Point point2 = AndroidUtilities.displaySize;
                float fMin = Math.min(point2.x, point2.y);
                float f18 = f4Var2.h;
                int i11 = (int) (fDp2 / (fMin / f18));
                float f19 = f18 / f14;
                float f20 = f15 / size;
                float fDp3 = AndroidUtilities.dp(100.0f) / f14;
                if (size == 1) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                    float f21 = groupedMessagePosition3.aspectRatio;
                    if (f21 >= 1.0f) {
                        f12 = f4Var2.h;
                        f13 = ((f12 / f21) / f12) * f14;
                    } else {
                        f12 = f4Var2.h * ((f21 * f14) / f14);
                        f13 = f14;
                    }
                    groupedMessagePosition3.set(0, 0, 0, 0, (int) f12, f13 / f14, 15);
                    tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                } else {
                    if (z10) {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                    } else {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                        if (size == 2 || size == 3 || size == 4) {
                            if (size == 2) {
                                MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                String string = sb2.toString();
                                if (string.equals("ww") && f20 > ((double) f19) * 1.4d) {
                                    float f22 = groupedMessagePosition4.aspectRatio;
                                    float f23 = groupedMessagePosition5.aspectRatio;
                                    if (f22 - f23 < 0.2d) {
                                        float f24 = f4Var2.h;
                                        float fRound = Math.round(Math.min(f24 / f22, Math.min(f24 / f23, f14 / 2.0f))) / f14;
                                        groupedMessagePosition4.set(0, 0, 0, 0, f4Var2.h, fRound, 7);
                                        groupedMessagePosition5.set(0, 0, 1, 1, f4Var2.h, fRound, 11);
                                    } else if (string.equals("ww")) {
                                        int i12 = f4Var2.h / 2;
                                        float f25 = i12;
                                        float fRound2 = Math.round(Math.min(f25 / groupedMessagePosition4.aspectRatio, Math.min(f25 / groupedMessagePosition5.aspectRatio, f14))) / f14;
                                        groupedMessagePosition4.set(0, 0, 0, 0, i12, fRound2, 13);
                                        groupedMessagePosition5.set(1, 1, 0, 0, i12, fRound2, 14);
                                        f4Var2.f24335e = 1;
                                    } else {
                                        int i13 = f4Var2.h / 2;
                                        float f26 = i13;
                                        float fRound3 = Math.round(Math.min(f26 / groupedMessagePosition4.aspectRatio, Math.min(f26 / groupedMessagePosition5.aspectRatio, f14))) / f14;
                                        groupedMessagePosition4.set(0, 0, 0, 0, i13, fRound3, 13);
                                        groupedMessagePosition5.set(1, 1, 0, 0, i13, fRound3, 14);
                                        f4Var2.f24335e = 1;
                                    }
                                } else if (string.equals("ww") || string.equals("qq")) {
                                    int i14 = f4Var2.h / 2;
                                    float f27 = i14;
                                    float fRound4 = Math.round(Math.min(f27 / groupedMessagePosition4.aspectRatio, Math.min(f27 / groupedMessagePosition5.aspectRatio, f14))) / f14;
                                    groupedMessagePosition4.set(0, 0, 0, 0, i14, fRound4, 13);
                                    groupedMessagePosition5.set(1, 1, 0, 0, i14, fRound4, 14);
                                    f4Var2.f24335e = 1;
                                } else {
                                    float f28 = f4Var2.h;
                                    float f29 = groupedMessagePosition4.aspectRatio;
                                    int iMax = (int) Math.max(f28 * 0.4f, Math.round((f28 / f29) / ((1.0f / groupedMessagePosition5.aspectRatio) + (1.0f / f29))));
                                    int i15 = f4Var2.h - iMax;
                                    if (i15 < iMin) {
                                        iMax -= iMin - i15;
                                    } else {
                                        iMin = i15;
                                    }
                                    float fMin2 = Math.min(f14, Math.round(Math.min(iMin / groupedMessagePosition4.aspectRatio, iMax / groupedMessagePosition5.aspectRatio))) / f14;
                                    groupedMessagePosition4.set(0, 0, 0, 0, iMin, fMin2, 13);
                                    groupedMessagePosition5.set(1, 1, 0, 0, iMax, fMin2, 14);
                                    f4Var2.f24335e = 1;
                                }
                            } else if (size == 3) {
                                MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                                if (sb2.charAt(0) == 'n') {
                                    float f30 = groupedMessagePosition7.aspectRatio;
                                    float fMin3 = Math.min(f14 * 0.5f, Math.round((f4Var2.h * f30) / (groupedMessagePosition8.aspectRatio + f30)));
                                    float f31 = f14 - fMin3;
                                    int iMax2 = (int) Math.max(iMin, Math.min(f4Var2.h * 0.5f, Math.round(Math.min(groupedMessagePosition8.aspectRatio * fMin3, groupedMessagePosition7.aspectRatio * f31))));
                                    int iRound = Math.round(Math.min((groupedMessagePosition6.aspectRatio * f14) + i11, f4Var2.h - iMax2));
                                    groupedMessagePosition6.set(0, 0, 0, 1, iRound, 1.0f, 13);
                                    float f32 = f31 / f14;
                                    groupedMessagePosition7.set(1, 1, 0, 0, iMax2, f32, 6);
                                    float f33 = fMin3 / f14;
                                    groupedMessagePosition8.set(1, 1, 1, 1, iMax2, f33, 10);
                                    int i16 = f4Var2.h;
                                    groupedMessagePosition8.spanSize = i16;
                                    groupedMessagePosition6.siblingHeights = new float[]{f33, f32};
                                    groupedMessagePosition7.spanSize = i16 - iRound;
                                    groupedMessagePosition8.leftSpanOffset = iRound;
                                    f4Var2.f24335e = 1;
                                } else {
                                    float fRound5 = Math.round(Math.min(f4Var2.h / groupedMessagePosition6.aspectRatio, 0.66f * f14)) / f14;
                                    groupedMessagePosition6.set(0, 1, 0, 0, f4Var2.h, fRound5, 7);
                                    int i17 = f4Var2.h / 2;
                                    float f34 = i17;
                                    float fMin4 = Math.min(f14 - fRound5, Math.round(Math.min(f34 / groupedMessagePosition7.aspectRatio, f34 / groupedMessagePosition8.aspectRatio))) / f14;
                                    float f35 = fMin4 < fDp3 ? fDp3 : fMin4;
                                    groupedMessagePosition7.set(0, 0, 1, 1, i17, f35, 9);
                                    groupedMessagePosition8.set(1, 1, 1, 1, i17, f35, 10);
                                    f4Var2.f24335e = 1;
                                }
                            } else {
                                MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                                MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) arrayList2.get(3);
                                if (sb2.charAt(0) == 'w') {
                                    float fRound6 = Math.round(Math.min(f4Var2.h / groupedMessagePosition9.aspectRatio, f14 * 0.66f)) / f14;
                                    groupedMessagePosition9.set(0, 2, 0, 0, f4Var2.h, fRound6, 7);
                                    float fRound7 = Math.round(f4Var2.h / ((groupedMessagePosition10.aspectRatio + groupedMessagePosition11.aspectRatio) + groupedMessagePosition12.aspectRatio));
                                    float f36 = iMin;
                                    int iMax3 = (int) Math.max(f36, Math.min(f4Var2.h * 0.4f, groupedMessagePosition10.aspectRatio * fRound7));
                                    int iMax4 = (int) Math.max(Math.max(f36, f4Var2.h * 0.33f), groupedMessagePosition12.aspectRatio * fRound7);
                                    int iDp2 = (f4Var2.h - iMax3) - iMax4;
                                    if (iDp2 < AndroidUtilities.dp(58.0f)) {
                                        int iDp3 = AndroidUtilities.dp(58.0f) - iDp2;
                                        iDp2 = AndroidUtilities.dp(58.0f);
                                        int i18 = iDp3 / 2;
                                        iMax3 -= i18;
                                        iMax4 -= iDp3 - i18;
                                    }
                                    int i19 = iMax3;
                                    float fMin5 = Math.min(f14 - fRound6, fRound7) / f14;
                                    float f37 = fMin5 < fDp3 ? fDp3 : fMin5;
                                    groupedMessagePosition10.set(0, 0, 1, 1, i19, f37, 9);
                                    groupedMessagePosition11.set(1, 1, 1, 1, iDp2, f37, 8);
                                    groupedMessagePosition12.set(2, 2, 1, 1, iMax4, f37, 10);
                                    f4Var2.f24335e = 2;
                                } else {
                                    int iMax5 = Math.max(iMin, Math.round(f14 / ((1.0f / groupedMessagePosition12.aspectRatio) + ((1.0f / groupedMessagePosition11.aspectRatio) + (1.0f / groupedMessagePosition10.aspectRatio)))));
                                    float f38 = iDp;
                                    float f39 = iMax5;
                                    float fMin6 = Math.min(0.33f, Math.max(f38, f39 / groupedMessagePosition10.aspectRatio) / f14);
                                    float fMin7 = Math.min(0.33f, Math.max(f38, f39 / groupedMessagePosition11.aspectRatio) / f14);
                                    float f40 = (1.0f - fMin6) - fMin7;
                                    int iRound2 = Math.round(Math.min((groupedMessagePosition9.aspectRatio * f14) + i11, f4Var2.h - iMax5));
                                    groupedMessagePosition9.set(0, 0, 0, 2, iRound2, fMin6 + fMin7 + f40, 13);
                                    groupedMessagePosition10.set(1, 1, 0, 0, iMax5, fMin6, 6);
                                    groupedMessagePosition11.set(1, 1, 1, 1, iMax5, fMin7, 2);
                                    groupedMessagePosition11.spanSize = f4Var2.h;
                                    groupedMessagePosition12.set(1, 1, 2, 2, iMax5, f40, 10);
                                    int i20 = f4Var2.h;
                                    groupedMessagePosition12.spanSize = i20;
                                    groupedMessagePosition10.spanSize = i20 - iRound2;
                                    groupedMessagePosition11.leftSpanOffset = iRound2;
                                    groupedMessagePosition12.leftSpanOffset = iRound2;
                                    groupedMessagePosition9.siblingHeights = new float[]{fMin6, fMin7, f40};
                                    f4Var2.f24335e = 1;
                                }
                            }
                        }
                    }
                    int size2 = arrayList2.size();
                    float[] fArr2 = new float[size2];
                    for (int i21 = 0; i21 < size; i21++) {
                        if (f20 > 1.1f) {
                            fArr2[i21] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i21)).aspectRatio);
                        } else {
                            fArr2[i21] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i21)).aspectRatio);
                        }
                        fArr2[i21] = Math.max(0.66667f, Math.min(1.7f, fArr2[i21]));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (int i22 = 1; i22 < size2; i22++) {
                        int i23 = size2 - i22;
                        if (i22 <= 3 && i23 <= 3) {
                            float fA = f4Var2.a(fArr2, 0, i22);
                            float fA2 = f4Var2.a(fArr2, i22, size2);
                            e4 e4Var = new e4();
                            e4Var.f24260a = new int[]{i22, i23};
                            e4Var.f24261b = new float[]{fA, fA2};
                            arrayList4.add(e4Var);
                        }
                    }
                    int i24 = 1;
                    while (i24 < size2 - 1) {
                        int i25 = 1;
                        while (true) {
                            int i26 = size2 - i24;
                            if (i25 < i26) {
                                int i27 = i26 - i25;
                                if (i24 <= 3) {
                                    if (i25 <= (f20 < 0.85f ? 4 : 3) && i27 <= 3) {
                                        float fA3 = f4Var2.a(fArr2, 0, i24);
                                        int i28 = i24 + i25;
                                        float fA4 = f4Var2.a(fArr2, i24, i28);
                                        float fA5 = f4Var2.a(fArr2, i28, size2);
                                        e4 e4Var2 = new e4();
                                        e4Var2.f24260a = new int[]{i24, i25, i27};
                                        e4Var2.f24261b = new float[]{fA3, fA4, fA5};
                                        arrayList4.add(e4Var2);
                                    }
                                }
                                i25++;
                                i24 = i24;
                            }
                        }
                        i24++;
                    }
                    for (int i29 = 1; i29 < size2 - 2; i29++) {
                        int i30 = 1;
                        while (true) {
                            int i31 = size2 - i29;
                            if (i30 < i31) {
                                int i32 = 1;
                                while (true) {
                                    int i33 = i31 - i30;
                                    if (i32 < i33) {
                                        int i34 = i33 - i32;
                                        if (i29 <= 3 && i30 <= 3 && i32 <= 3 && i34 <= 3) {
                                            float fA6 = f4Var2.a(fArr2, 0, i29);
                                            int i35 = i29 + i30;
                                            float fA7 = f4Var2.a(fArr2, i29, i35);
                                            int i36 = i35 + i32;
                                            float fA8 = f4Var2.a(fArr2, i35, i36);
                                            float fA9 = f4Var2.a(fArr2, i36, size2);
                                            e4 e4Var3 = new e4();
                                            e4Var3.f24260a = new int[]{i29, i30, i32, i34};
                                            e4Var3.f24261b = new float[]{fA6, fA7, fA8, fA9};
                                            arrayList4.add(e4Var3);
                                        }
                                        i32++;
                                        i31 = i31;
                                    }
                                }
                                i30++;
                            }
                        }
                    }
                    float f41 = (f4Var2.h / 3) * 4;
                    e4 e4Var4 = null;
                    float f42 = 0.0f;
                    int i37 = 0;
                    while (i37 < arrayList4.size()) {
                        e4 e4Var5 = (e4) arrayList4.get(i37);
                        float f43 = Float.MAX_VALUE;
                        float f44 = f41;
                        float f45 = 0.0f;
                        int i38 = 0;
                        while (true) {
                            float[] fArr3 = e4Var5.f24261b;
                            fArr = fArr2;
                            if (i38 >= fArr3.length) {
                                break;
                            }
                            float f46 = fArr3[i38];
                            f45 += f46;
                            if (f46 < f43) {
                                f43 = f46;
                            }
                            i38++;
                            fArr2 = fArr;
                        }
                        float fAbs = Math.abs(f45 - f44);
                        int[] iArr = e4Var5.f24260a;
                        if (iArr.length > 1) {
                            int i39 = iArr[0];
                            int i40 = iArr[1];
                            if (i39 <= i40) {
                                f10 = fAbs;
                                if (iArr.length <= 2 || i40 <= iArr[2]) {
                                    if (iArr.length <= 3 || iArr[2] <= iArr[3]) {
                                    }
                                    if (f43 < iMin) {
                                        f11 *= 1.5f;
                                    }
                                    if (e4Var4 != null || f11 < f42) {
                                        f42 = f11;
                                        e4Var4 = e4Var5;
                                    }
                                    i37++;
                                    f41 = f44;
                                    fArr2 = fArr;
                                }
                                f11 = f10 * 1.2f;
                                if (f43 < iMin) {
                                    f11 *= 1.5f;
                                }
                                if (e4Var4 != null) {
                                    f42 = f11;
                                    e4Var4 = e4Var5;
                                } else {
                                    f42 = f11;
                                    e4Var4 = e4Var5;
                                }
                                i37++;
                                f41 = f44;
                                fArr2 = fArr;
                            } else {
                                f10 = fAbs;
                            }
                            f11 = f10 * 1.2f;
                            if (f43 < iMin) {
                                f11 *= 1.5f;
                            }
                            if (e4Var4 != null) {
                                f42 = f11;
                                e4Var4 = e4Var5;
                            } else {
                                f42 = f11;
                                e4Var4 = e4Var5;
                            }
                            i37++;
                            f41 = f44;
                            fArr2 = fArr;
                        } else {
                            f10 = fAbs;
                        }
                        f11 = f10;
                        if (f43 < iMin) {
                            f11 *= 1.5f;
                        }
                        if (e4Var4 != null) {
                            f42 = f11;
                            e4Var4 = e4Var5;
                        } else {
                            f42 = f11;
                            e4Var4 = e4Var5;
                        }
                        i37++;
                        f41 = f44;
                        fArr2 = fArr;
                    }
                    float[] fArr4 = fArr2;
                    if (e4Var4 != null) {
                        int[] iArr2 = e4Var4.f24260a;
                        int i41 = 0;
                        int i42 = 0;
                        while (i41 < iArr2.length) {
                            int i43 = iArr2[i41];
                            float f47 = e4Var4.f24261b[i41];
                            int i44 = f4Var2.h;
                            int i45 = i43 - 1;
                            f4Var2.f24335e = Math.max(f4Var2.f24335e, i45);
                            MessageObject.GroupedMessagePosition groupedMessagePosition13 = null;
                            int i46 = 0;
                            while (i46 < i43) {
                                int i47 = (int) (fArr4[i42] * f47);
                                i44 -= i47;
                                MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList2.get(i42);
                                int i48 = i41 == 0 ? 4 : 0;
                                e4 e4Var6 = e4Var4;
                                if (i41 == iArr2.length - 1) {
                                    i48 |= 8;
                                }
                                if (i46 == 0) {
                                    i48 |= 1;
                                }
                                if (i46 == i45) {
                                    i48 |= 2;
                                    groupedMessagePosition13 = groupedMessagePosition14;
                                }
                                int i49 = i46;
                                groupedMessagePosition14.set(i49, i46, i41, i41, i47, Math.max(fDp3, f47 / f14), i48);
                                i42++;
                                i46 = i49 + 1;
                                e4Var4 = e4Var6;
                            }
                            groupedMessagePosition13.pw += i44;
                            groupedMessagePosition13.spanSize += i44;
                            i41++;
                            e4Var4 = e4Var4;
                        }
                    }
                    h4Var = this;
                }
                for (int i50 = 0; i50 < size; i50++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition15 = (MessageObject.GroupedMessagePosition) arrayList2.get(i50);
                    if (groupedMessagePosition15.maxX == f4Var2.f24335e || (groupedMessagePosition15.flags & 2) != 0) {
                        groupedMessagePosition15.spanSize += 200;
                    }
                    if ((groupedMessagePosition15.flags & 1) != 0) {
                        groupedMessagePosition15.edge = true;
                    }
                    if (groupedMessagePosition15.edge) {
                        int i51 = groupedMessagePosition15.spanSize;
                        if (i51 != 1000) {
                            groupedMessagePosition15.spanSize = i51 + 108;
                        }
                        groupedMessagePosition15.pw += 108;
                    } else if ((groupedMessagePosition15.flags & 2) != 0) {
                        int i52 = groupedMessagePosition15.spanSize;
                        if (i52 != 1000) {
                            groupedMessagePosition15.spanSize = i52 - 108;
                        } else {
                            int i53 = groupedMessagePosition15.leftSpanOffset;
                            if (i53 != 0) {
                                groupedMessagePosition15.leftSpanOffset = i53 + 108;
                            }
                        }
                    }
                }
                int i54 = 0;
                while (i54 < size) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition16 = (MessageObject.GroupedMessagePosition) arrayList2.get(i54);
                    if (groupedMessagePosition16.minX == 0) {
                        groupedMessagePosition16.spanSize += 200;
                    }
                    if ((groupedMessagePosition16.flags & 2) != 0) {
                        groupedMessagePosition16.edge = true;
                    }
                    f4Var2.f24335e = Math.max(f4Var2.f24335e, (int) groupedMessagePosition16.maxX);
                    f4Var2.f24336f = Math.max(f4Var2.f24336f, (int) groupedMessagePosition16.maxY);
                    byte b10 = groupedMessagePosition16.minY;
                    byte b11 = groupedMessagePosition16.maxY;
                    byte b12 = groupedMessagePosition16.minX;
                    int i55 = (b11 - b10) + 1;
                    float[] fArr5 = new float[i55];
                    Arrays.fill(fArr5, 0.0f);
                    int size3 = arrayList2.size();
                    int i56 = 0;
                    while (i56 < size3) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition17 = (MessageObject.GroupedMessagePosition) arrayList2.get(i56);
                        if (groupedMessagePosition17 != groupedMessagePosition16 && groupedMessagePosition17.maxX < b12) {
                            int iMin2 = Math.min((int) groupedMessagePosition17.maxY, (int) b11) - b10;
                            int iMax6 = Math.max(groupedMessagePosition17.minY - b10, 0);
                            while (iMax6 <= iMin2) {
                                fArr5[iMax6] = fArr5[iMax6] + groupedMessagePosition17.pw;
                                iMax6++;
                                i54 = i54;
                            }
                        }
                        i56++;
                        i54 = i54;
                    }
                    int i57 = i54;
                    float f48 = 0.0f;
                    for (int i58 = 0; i58 < i55; i58++) {
                        float f49 = fArr5[i58];
                        if (f48 < f49) {
                            f48 = f49;
                        }
                    }
                    groupedMessagePosition16.left = f48;
                    i54 = i57 + 1;
                }
                for (int i59 = 0; i59 < size; i59++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition18 = (MessageObject.GroupedMessagePosition) arrayList2.get(i59);
                    byte b13 = groupedMessagePosition18.minY;
                    int i60 = f4Var2.f24335e + 1;
                    float[] fArr6 = new float[i60];
                    Arrays.fill(fArr6, 0.0f);
                    int size4 = arrayList2.size();
                    for (int i61 = 0; i61 < size4; i61++) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition19 = (MessageObject.GroupedMessagePosition) arrayList2.get(i61);
                        if (groupedMessagePosition19 != groupedMessagePosition18 && groupedMessagePosition19.maxY < b13) {
                            for (int i62 = groupedMessagePosition19.minX; i62 <= groupedMessagePosition19.maxX; i62++) {
                                fArr6[i62] = fArr6[i62] + groupedMessagePosition19.f19619ph;
                            }
                        }
                    }
                    float f50 = 0.0f;
                    for (int i63 = 0; i63 < i60; i63++) {
                        float f51 = fArr6[i63];
                        if (f50 < f51) {
                            f50 = f51;
                        }
                    }
                    groupedMessagePosition18.top = f50;
                }
                int[] iArr3 = new int[10];
                Arrays.fill(iArr3, 0);
                int size5 = arrayList2.size();
                for (int i64 = 0; i64 < size5; i64++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition20 = (MessageObject.GroupedMessagePosition) arrayList2.get(i64);
                    int i65 = groupedMessagePosition20.pw;
                    for (int i66 = groupedMessagePosition20.minY; i66 <= groupedMessagePosition20.maxY; i66++) {
                        iArr3[i66] = iArr3[i66] + i65;
                    }
                }
                int i67 = iArr3[0];
                for (int i68 = 1; i68 < 10; i68++) {
                    int i69 = iArr3[i68];
                    if (i67 < i69) {
                        i67 = i69;
                    }
                }
                f4Var2.d = i67;
                float[] fArr7 = new float[10];
                Arrays.fill(fArr7, 0.0f);
                int size6 = arrayList2.size();
                for (int i70 = 0; i70 < size6; i70++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition21 = (MessageObject.GroupedMessagePosition) arrayList2.get(i70);
                    float f52 = groupedMessagePosition21.f19619ph;
                    for (int i71 = groupedMessagePosition21.minX; i71 <= groupedMessagePosition21.maxX; i71++) {
                        fArr7[i71] = fArr7[i71] + f52;
                    }
                }
                float f53 = fArr7[0];
                for (int i72 = 1; i72 < 10; i72++) {
                    float f54 = fArr7[i72];
                    if (f53 < f54) {
                        f53 = f54;
                    }
                }
                f4Var2.f24337g = f53;
                h4Var = this;
            }
            int i73 = h4Var.f24436m;
            s1 s1Var = h4Var.f24426a;
            if (i73 > 0) {
                h4Var.f24430f = i73;
                messageObject2 = messageObject;
            } else {
                if (AndroidUtilities.isTablet()) {
                    h4Var.f24430f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
                    messageObject2 = messageObject;
                } else {
                    messageObject2 = messageObject;
                    h4Var.f24430f = Math.min(s1Var.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((s1Var.L0(messageObject2) ? 10 : 0) + 64);
                }
                if (s1Var.y3()) {
                    h4Var.f24430f -= AndroidUtilities.dp(52.0f);
                }
            }
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia3 = tL_messageMediaPaidMedia;
            int i74 = 0;
            while (true) {
                int size7 = tL_messageMediaPaidMedia3.extended_media.size();
                arrayList = h4Var.f24428c;
                if (i74 >= size7) {
                    break;
                }
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia3.extended_media.get(i74);
                g4 g4Var = i74 >= arrayList.size() ? null : (g4) arrayList.get(i74);
                if (g4Var == null) {
                    f4 f4Var3 = h4Var.f24427b;
                    if (messageExtendedMedia2 == null) {
                        f4Var3.getClass();
                        groupedMessagePosition = null;
                    } else {
                        groupedMessagePosition = (MessageObject.GroupedMessagePosition) f4Var3.f24334c.get(messageExtendedMedia2);
                    }
                    g4 g4Var2 = new g4(h4Var.f24426a, messageObject2, messageExtendedMedia2, tL_messageMediaPaidMedia3.extended_media.size() != 1, (int) ((groupedMessagePosition.pw / 1000.0f) * h4Var.f24430f), (int) (groupedMessagePosition.f19619ph * h4Var.f24427b.f24338i));
                    String str = messageExtendedMedia2.attachPath;
                    if (str != null) {
                        g4Var2.B = str;
                    } else if (tL_messageMediaPaidMedia3.extended_media.size() == 1) {
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        g4Var2.B = message2 != null ? message2.attachPath : null;
                    }
                    if (!TextUtils.isEmpty(g4Var2.B)) {
                        DownloadController.getInstance(s1Var.E7).addLoadingFileObserver(g4Var2.B, messageObject2, g4Var2);
                        if (messageObject2.isSending()) {
                            g4Var2.C.o(messageExtendedMedia2.uploadProgress, false);
                        }
                    }
                    if (s1Var.I0 && !g4Var2.I) {
                        g4Var2.I = true;
                        g4Var2.f24382f.onAttachedToWindow();
                    }
                    arrayList.add(g4Var2);
                } else {
                    g4Var.c(messageExtendedMedia2, messageObject2);
                }
                i74++;
            }
            int size8 = tL_messageMediaPaidMedia3.extended_media.size();
            while (size8 < arrayList.size()) {
                g4 g4Var3 = size8 >= arrayList.size() ? null : (g4) arrayList.get(size8);
                if (g4Var3 != null) {
                    if (g4Var3.I) {
                        g4Var3.I = false;
                        g4Var3.f24382f.onDetachedFromWindow();
                    }
                    arrayList.remove(size8);
                    size8--;
                }
                size8++;
            }
            h(messageObject);
            f4 f4Var4 = h4Var.f24427b;
            h4Var.f24431g = (int) ((f4Var4.d / 1000.0f) * h4Var.f24430f);
            h4Var.h = (int) (f4Var4.f24337g * f4Var4.f24338i);
            if (h4Var.f24432i) {
                pz0 pz0Var = new pz0(hh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                h4Var.f24440q = pz0Var;
                if (pz0Var.f31697c > h4Var.f24431g - AndroidUtilities.dp(30.0f)) {
                    h4Var.f24440q = new pz0(hh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
            if (h4Var.f24441r == null || h4Var.f24442s != tL_messageMediaPaidMedia3.stars_amount) {
                long j10 = tL_messageMediaPaidMedia3.stars_amount;
                h4Var.f24442s = j10;
                h4Var.f24441r = new pz0(hh.oa.R0(LocaleController.formatPluralStringComma("PaidMediaPrice", (int) j10), 0.9f, null), 12.0f, AndroidUtilities.bold());
            }
        }
    }

    public final void h(MessageObject messageObject) {
        float f10;
        boolean z10;
        boolean z11;
        s1 s1Var = this.f24426a;
        boolean z12 = s1Var.Hc > 0 || (s1Var.f25480q1 && !TextUtils.isEmpty(messageObject.caption));
        boolean z13 = ((s1Var.f25480q1 || TextUtils.isEmpty(messageObject.caption)) && s1Var.J.f11434s && !s1Var.f25334f9) ? false : true;
        int i10 = this.f24436m;
        if (i10 > 0) {
            f10 = 1000.0f / this.f24427b.d;
            this.f24430f = i10;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f24430f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                this.f24430f = Math.min(s1Var.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((s1Var.L0(messageObject) ? 10 : 0) + 64);
            }
            if (s1Var.y3()) {
                this.f24430f -= AndroidUtilities.dp(52.0f);
            }
            f10 = 1.0f;
        }
        f4 f4Var = this.f24427b;
        this.f24431g = (int) ((f4Var.d / 1000.0f) * f10 * this.f24430f);
        this.h = (int) (f4Var.f24337g * f4Var.f24338i);
        this.f24432i = false;
        int iDp = AndroidUtilities.dp(1.0f);
        int iDp2 = AndroidUtilities.dp(4.0f);
        int i11 = SharedConfig.bubbleRadius;
        int iDp3 = AndroidUtilities.dp(i11 - (i11 > 2 ? 2 : 0));
        int iMin = Math.min(AndroidUtilities.dp(3.0f), iDp3);
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f24428c;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i12 >= arrayList.size()) {
                break;
            }
            g4 g4Var = (g4) arrayList.get(i12);
            f4 f4Var2 = this.f24427b;
            TLRPC.MessageExtendedMedia messageExtendedMedia = g4Var.A;
            ImageReceiver imageReceiver = g4Var.f24382f;
            if (messageExtendedMedia == null) {
                f4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) f4Var2.f24334c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z10 = z12;
                z11 = z13;
            } else {
                float f11 = (groupedMessagePosition.left / 1000.0f) * f10;
                float f12 = this.f24430f;
                int i13 = (int) (f11 * f12);
                z10 = z12;
                float f13 = groupedMessagePosition.top;
                float f14 = this.f24427b.f24338i;
                int i14 = (int) (f13 * f14);
                int i15 = (int) ((groupedMessagePosition.pw / 1000.0f) * f10 * f12);
                int i16 = (int) (groupedMessagePosition.f19619ph * f14);
                int i17 = i15;
                int i18 = groupedMessagePosition.flags;
                if ((i18 & 1) == 0) {
                    i13 += iDp;
                    i17 -= iDp;
                }
                if ((i18 & 4) == 0) {
                    i14 += iDp;
                    i16 -= iDp;
                }
                int i19 = i14;
                int i20 = i16;
                if ((i18 & 2) == 0) {
                    i17 -= iDp;
                }
                int i21 = i17;
                if ((i18 & 8) == 0) {
                    i20 -= iDp;
                }
                z11 = z13;
                int i22 = i20;
                g4Var.f24378a = i13;
                g4Var.f24379b = i19;
                g4Var.f24380c = i13 + i21;
                g4Var.d = i19 + i22;
                imageReceiver.setImageCoords(i13, i19, i21, i22);
                int i23 = groupedMessagePosition.flags;
                int i24 = i23 & 4;
                int i25 = (i24 == 0 || (i23 & 1) == 0 || z10) ? iDp2 : iDp3;
                int i26 = (i24 == 0 || (i23 & 2) == 0 || z10) ? iDp2 : iDp3;
                int i27 = i23 & 8;
                int i28 = (i27 == 0 || (i23 & 1) == 0 || z11) ? iDp2 : iDp3;
                int i29 = (i27 == 0 || (i23 & 2) == 0 || z11) ? iDp2 : iDp3;
                if (!z11) {
                    if (messageObject.isOutOwner()) {
                        i29 = iDp2;
                    } else {
                        i28 = iDp2;
                    }
                }
                if (!z10 && s1Var.A) {
                    if (messageObject.isOutOwner()) {
                        i26 = iMin;
                    } else {
                        i25 = iMin;
                    }
                }
                imageReceiver.setRoundRadius(i25, i26, i29, i28);
                float[] fArr = g4Var.f24385s;
                float f15 = i25;
                fArr[1] = f15;
                fArr[0] = f15;
                float f16 = i26;
                fArr[3] = f16;
                fArr[2] = f16;
                float f17 = i29;
                fArr[5] = f17;
                fArr[4] = f17;
                float f18 = i28;
                fArr[7] = f18;
                fArr[6] = f18;
                if (messageObject != null && messageObject.isSending()) {
                    g4Var.b(3);
                }
                this.f24432i = this.f24432i || g4Var.h;
            }
            i12++;
            z12 = z10;
            iDp = iDp;
            z13 = z11;
        }
        if (this.f24432i) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = messageObject == null ? null : (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            if (tL_messageMediaPaidMedia != null) {
                pz0 pz0Var = new pz0(hh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.f24440q = pz0Var;
                if (pz0Var.f31697c > this.f24431g - AndroidUtilities.dp(30.0f)) {
                    this.f24440q = new pz0(hh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
