package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;

public class k5 extends Drawable {

    public static SparseArray f29947q;

    public static HashMap f29948r;

    public static boolean f29949s;

    public static boolean f29950t;

    public static boolean f29951u;
    public static final ag.l3 v = new ag.l3(27);

    public static HashMap f29952w;

    public boolean f29953a;

    public ArrayList f29954b;

    public ArrayList f29955c;
    public int d;

    public TLRPC.Document f29956e;

    public long f29957f;

    public int f29958g;
    public int h;

    public String f29959i;

    public boolean f29960j;

    public jh.y2 f29961k;

    public boolean f29963m;

    public ColorFilter f29966p;

    public float f29962l = 1.0f;

    public Boolean f29964n = null;

    public Boolean f29965o = null;

    public k5(int i10, int i11, long j10) {
        this.h = i11;
        this.f29958g = i10;
        y();
        this.f29957f = j10;
        h(i11).b(j10, new c5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j10) {
        HashMap map = h(i10).f28531a;
        if (map == null) {
            return null;
        }
        return (TLRPC.Document) map.get(Long.valueOf(j10));
    }

    public static int g() {
        return SharedConfig.getDevicePerformanceClass() == 0 ? 0 : 2;
    }

    public static g5 h(int i10) {
        if (f29948r == null) {
            f29948r = new HashMap();
        }
        g5 g5Var = (g5) f29948r.get(Integer.valueOf(i10));
        if (g5Var != null) {
            return g5Var;
        }
        HashMap map = f29948r;
        Integer numValueOf = Integer.valueOf(i10);
        g5 g5Var2 = new g5(i10);
        map.put(numValueOf, g5Var2);
        return g5Var2;
    }

    public static k5 m(int i10, int i11, TLRPC.Document document) {
        if (f29947q == null) {
            f29947q = new SparseArray();
        }
        int iHash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f29947q.get(iHash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f29947q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(iHash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        k5 k5Var = (k5) longSparseArray.get(document.f22386id);
        if (k5Var != null) {
            return k5Var;
        }
        long j10 = document.f22386id;
        k5 k5Var2 = new k5(i11, i10, document);
        longSparseArray.put(j10, k5Var2);
        return k5Var2;
    }

    public static k5 n(int i10, long j10, String str, int i11) {
        if (f29947q == null) {
            f29947q = new SparseArray();
        }
        int i12 = 1;
        int iHash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f29947q.get(iHash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f29947q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(iHash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        k5 k5Var = (k5) longSparseArray.get(j10);
        if (k5Var != null) {
            return k5Var;
        }
        k5 k5Var2 = new k5();
        k5Var2.f29962l = 1.0f;
        k5Var2.f29964n = null;
        k5Var2.f29965o = null;
        k5Var2.h = i10;
        k5Var2.f29958g = i11;
        k5Var2.y();
        k5Var2.f29957f = j10;
        k5Var2.f29959i = str;
        h(i10).b(j10, new c5(k5Var2, i12));
        longSparseArray.put(j10, k5Var2);
        return k5Var2;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        jh.y2 y2Var;
        boolean z11 = !z10;
        if (f29951u == z11) {
            return;
        }
        f29951u = z11;
        if (f29947q == null || (longSparseArray = (LongSparseArray) f29947q.get(Objects.hash(Integer.valueOf(i10), 25))) == null) {
            return;
        }
        for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
            k5 k5Var = (k5) longSparseArray.valueAt(i11);
            if (k5Var != null && (y2Var = k5Var.f29961k) != null) {
                if (z10) {
                    y2Var.setAllowStartLottieAnimation(true);
                    y2Var.setAllowStartAnimation(true);
                    y2Var.setAutoRepeat(1);
                    x5 animation = y2Var.getAnimation();
                    if (animation != null) {
                        boolean z12 = y2Var.useSharedAnimationQueue;
                        if (!animation.f34481j0) {
                            animation.f34490r0 = z12;
                        }
                        animation.start();
                    } else {
                        oi0 lottieAnimation = y2Var.getLottieAnimation();
                        if (lottieAnimation != null) {
                            lottieAnimation.start();
                        }
                    }
                } else {
                    y2Var.setAllowStartAnimation(false);
                    y2Var.setAllowStartLottieAnimation(false);
                    y2Var.setAutoRepeat(0);
                    y2Var.stopAnimation();
                }
            }
        }
    }

    public static void u() {
        if (f29947q == null) {
            return;
        }
        x();
        for (int i10 = 0; i10 < f29947q.size(); i10++) {
            LongSparseArray longSparseArray = (LongSparseArray) f29947q.valueAt(i10);
            for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                long jKeyAt = longSparseArray.keyAt(i11);
                k5 k5Var = (k5) longSparseArray.get(jKeyAt);
                if (k5Var == null || !k5Var.f29953a) {
                    longSparseArray.remove(jKeyAt);
                } else {
                    k5Var.j(true);
                }
            }
        }
    }

    public static void x() {
        f29949s = LiteMode.isEnabled(16388);
        f29950t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (view instanceof org.telegram.ui.c51) {
            throw new RuntimeException();
        }
        this.f29963m = false;
        if (this.f29954b == null) {
            this.f29954b = new ArrayList(10);
        }
        if (!this.f29954b.contains(view)) {
            this.f29954b.add(view);
        }
        v();
    }

    public final void b(q5 q5Var) {
        if (this.f29955c == null) {
            this.f29955c = new ArrayList(10);
        }
        this.f29963m = false;
        if (!this.f29955c.contains(q5Var)) {
            this.f29955c.add(q5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f29958g == 19) {
            return true;
        }
        Boolean bool = this.f29964n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f29956e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.f29956e)) {
            z10 = false;
        }
        this.f29964n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f29955c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f29954b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f29963m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        jh.y2 y2Var = this.f29961k;
        if (y2Var == null) {
            return;
        }
        y2Var.setImageCoords(getBounds());
        this.f29961k.setAlpha(this.f29962l);
        this.f29961k.draw(canvas);
    }

    public final void e() {
        if (this.f29961k == null) {
            jh.y2 y2Var = new jh.y2(this, 3);
            this.f29961k = y2Var;
            y2Var.setCurrentAccount(this.h);
            this.f29961k.setAllowLoadingOnAttachedOnly(true);
            if (this.f29958g == 12) {
                this.f29961k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f29962l * 255.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.d);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.d);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final long i() {
        TLRPC.Document document = this.f29956e;
        return document != null ? document.f22386id : this.f29957f;
    }

    public final void j(boolean z10) {
        SvgHelper.SvgDrawable svgThumb;
        String str;
        int i10;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        ImageLocation imageLocation2;
        Emoji.EmojiDrawable emojiDrawable;
        Drawable drawable;
        ImageLocation imageLocation3;
        String str2;
        ImageLocation forDocument2;
        int iDp;
        String str3 = this.f29959i;
        int i11 = this.f29958g;
        TLRPC.Document document = this.f29956e;
        if (document != null) {
            if (this.f29961k == null || this.f29960j || z10) {
                if ((i11 == 20 || i11 == 21) && (document instanceof TLRPC.TL_documentEmpty)) {
                    return;
                }
                this.f29960j = false;
                e();
                if (this.f29966p != null && c()) {
                    this.f29961k.setColorFilter(this.f29966p);
                }
                if (i11 != 0) {
                    int i12 = i11 == 12 ? 2 : i11;
                    this.f29961k.setUniqKeyPrefix(i12 + "_");
                }
                this.f29961k.setVideoThumbIsSame(true);
                boolean z11 = (SharedConfig.getDevicePerformanceClass() == 0 && i11 == 5) || ((i11 == 2 || i11 == 25) && !f29949s) || (i11 == 3 && !f29950t);
                if (i11 == 13 || i11 == 16) {
                    z11 = true;
                }
                if (i11 == 24 || i11 == 27) {
                    z11 = false;
                }
                String strL = this.d + "_" + this.d;
                if (i11 == 12) {
                    strL = s3.c.l(strL, "_d_nostream");
                }
                if (i11 != 17 && i11 != 15 && i11 != 14 && i11 != 8 && ((i11 != 1 || SharedConfig.getDevicePerformanceClass() < 2) && i11 != 12)) {
                    strL = s3.c.l(strL, "_pcache");
                }
                if (i11 != 17 && i11 != 0 && i11 != 26 && i11 != 1 && i11 != 14 && i11 != 15 && i11 != 19 && i11 != 20 && i11 != 21) {
                    strL = s3.c.l(strL, "_compress");
                }
                if (i11 == 8) {
                    strL = s3.c.l(strL, "firstframe");
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.f29956e.thumbs, 90);
                if (!"video/webm".equals(this.f29956e.mime_type)) {
                    if ("application/x-tgsticker".equals(this.f29956e.mime_type)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i11 != 0 ? s3.c.d(i11, "_") : "");
                        sb2.append(this.f29957f);
                        sb2.append("@");
                        sb2.append(strL);
                        String string = sb2.toString();
                        if (SharedConfig.getDevicePerformanceClass() != 0 || i11 == 2 || i11 == 25 || i11 == 22 || !ImageLoader.getInstance().hasLottieMemCache(string)) {
                            SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(this.f29956e.thumbs, org.telegram.ui.ActionBar.g6.f23215m6, i11 == 22 ? 0.8f : 0.2f);
                            if (svgThumb2 != null && MessageObject.isAnimatedStickerDocument(this.f29956e, true)) {
                                svgThumb2.overrideWidthAndHeight(512, 512);
                            }
                            svgThumb = svgThumb2;
                        } else {
                            svgThumb = null;
                        }
                        forDocument = ImageLocation.getForDocument(this.f29956e);
                    } else {
                        svgThumb = DocumentObject.getSvgThumb(this.f29956e.thumbs, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f, true);
                        if (svgThumb != null && MessageObject.isAnimatedStickerDocument(this.f29956e, true)) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        str = strL;
                        i10 = 20;
                        imageLocation = null;
                    }
                    if (i11 != i10 || i11 == 21) {
                        imageLocation2 = null;
                        emojiDrawable = Emoji.getEmojiDrawable(MessageObject.findAnimatedEmojiEmoticon(this.f29956e, null));
                        if (emojiDrawable != null) {
                            drawable = emojiDrawable;
                        }
                        if (str3 != null) {
                            this.f29961k.setImageBitmap(new x5(new File(str3), true, 0L, 0, null, null, null, 0L, this.h, true, 512, 512, null, 0, true));
                        } else if (i11 == 8) {
                            jh.y2 y2Var = this.f29961k;
                            TLRPC.Document document2 = this.f29956e;
                            y2Var.setImage(null, null, imageLocation, str, null, null, drawable, document2.size, null, document2, 1);
                        } else {
                            imageLocation3 = imageLocation;
                            str2 = str;
                            if (z11 && (f29949s || i11 == 14)) {
                                ImageLocation forDocument3 = i11 == 17 ? ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e) : imageLocation2;
                                jh.y2 y2Var2 = this.f29961k;
                                ImageLocation forDocument4 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                                String str4 = this.d + "_" + this.d;
                                TLRPC.Document document3 = this.f29956e;
                                y2Var2.setImage(imageLocation3, str2, forDocument4, str4, forDocument3, null, drawable, document3.size, null, document3, 1);
                            } else {
                                if (i11 == 16) {
                                    forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                                } else {
                                    forDocument2 = imageLocation2;
                                }
                                if ("video/webm".equals(this.f29956e.mime_type)) {
                                    jh.y2 y2Var3 = this.f29961k;
                                    ImageLocation forDocument5 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                                    String str5 = this.d + "_" + this.d;
                                    TLRPC.Document document4 = this.f29956e;
                                    y2Var3.setImage(null, null, forDocument5, str5, forDocument2, null, drawable, document4.size, null, document4, 1);
                                } else if (MessageObject.isAnimatedStickerDocument(this.f29956e, true)) {
                                    jh.y2 y2Var4 = this.f29961k;
                                    String strL2 = s3.c.l(str2, "_firstframe");
                                    TLRPC.Document document5 = this.f29956e;
                                    y2Var4.setImage(imageLocation3, strL2, forDocument2, null, drawable, document5.size, null, document5, 1);
                                } else {
                                    jh.y2 y2Var5 = this.f29961k;
                                    ImageLocation forDocument6 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                                    String str6 = this.d + "_" + this.d;
                                    TLRPC.Document document6 = this.f29956e;
                                    y2Var5.setImage(forDocument6, str6, forDocument2, null, drawable, document6.size, null, document6, 1);
                                }
                            }
                        }
                        w(this.f29961k);
                        if (i11 != 13 || i11 == 16 || i11 == 3 || i11 == 5 || i11 == 4 || i11 == 24) {
                            this.f29961k.setLayerNum(7);
                        }
                        if (i11 != 9 || i11 == 21 || i11 == 27) {
                            this.f29961k.setLayerNum(6656);
                        }
                        this.f29961k.setAspectFit(true);
                        if (i11 != 12 || i11 == 26 || i11 == 18 || i11 == 8 || i11 == 6 || i11 == 5 || (i11 == 25 && f29951u)) {
                            this.f29961k.setAllowStartAnimation(false);
                            this.f29961k.setAllowStartLottieAnimation(false);
                            this.f29961k.setAutoRepeat(0);
                        } else {
                            this.f29961k.setAllowStartLottieAnimation(true);
                            this.f29961k.setAllowStartAnimation(true);
                            this.f29961k.setAutoRepeat(1);
                        }
                        this.f29961k.setAllowDecodeSingleFrame(true);
                        if (i11 != 5 || i11 == 6 || i11 == 27) {
                            iDp = AndroidUtilities.dp(6.0f);
                        } else {
                            iDp = i11 == 24 ? AndroidUtilities.dp(14.0f) : 0;
                        }
                        this.f29961k.setRoundRadius(iDp);
                        v();
                        k();
                    }
                    imageLocation2 = null;
                    drawable = svgThumb;
                    if (str3 != null) {
                        this.f29961k.setImageBitmap(new x5(new File(str3), true, 0L, 0, null, null, null, 0L, this.h, true, 512, 512, null, 0, true));
                    } else if (i11 == 8) {
                        jh.y2 y2Var6 = this.f29961k;
                        TLRPC.Document document7 = this.f29956e;
                        y2Var6.setImage(null, null, imageLocation, str, null, null, drawable, document7.size, null, document7, 1);
                    } else {
                        imageLocation3 = imageLocation;
                        str2 = str;
                        if (z11) {
                            if (i11 == 16) {
                                forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                            } else {
                                forDocument2 = imageLocation2;
                            }
                            if ("video/webm".equals(this.f29956e.mime_type)) {
                                jh.y2 y2Var7 = this.f29961k;
                                ImageLocation forDocument7 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                                String str7 = this.d + "_" + this.d;
                                TLRPC.Document document8 = this.f29956e;
                                y2Var7.setImage(null, null, forDocument7, str7, forDocument2, null, drawable, document8.size, null, document8, 1);
                            } else if (MessageObject.isAnimatedStickerDocument(this.f29956e, true)) {
                                jh.y2 y2Var8 = this.f29961k;
                                String strL3 = s3.c.l(str2, "_firstframe");
                                TLRPC.Document document9 = this.f29956e;
                                y2Var8.setImage(imageLocation3, strL3, forDocument2, null, drawable, document9.size, null, document9, 1);
                            } else {
                                jh.y2 y2Var9 = this.f29961k;
                                ImageLocation forDocument8 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                                String str8 = this.d + "_" + this.d;
                                TLRPC.Document document10 = this.f29956e;
                                y2Var9.setImage(forDocument8, str8, forDocument2, null, drawable, document10.size, null, document10, 1);
                            }
                        } else {
                            if (i11 == 16) {
                                forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                            } else {
                                forDocument2 = imageLocation2;
                            }
                            if ("video/webm".equals(this.f29956e.mime_type)) {
                                jh.y2 y2Var10 = this.f29961k;
                                ImageLocation forDocument9 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                                String str9 = this.d + "_" + this.d;
                                TLRPC.Document document11 = this.f29956e;
                                y2Var10.setImage(null, null, forDocument9, str9, forDocument2, null, drawable, document11.size, null, document11, 1);
                            } else if (MessageObject.isAnimatedStickerDocument(this.f29956e, true)) {
                                jh.y2 y2Var11 = this.f29961k;
                                String strL4 = s3.c.l(str2, "_firstframe");
                                TLRPC.Document document12 = this.f29956e;
                                y2Var11.setImage(imageLocation3, strL4, forDocument2, null, drawable, document12.size, null, document12, 1);
                            } else {
                                jh.y2 y2Var12 = this.f29961k;
                                ImageLocation forDocument10 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                                String str10 = this.d + "_" + this.d;
                                TLRPC.Document document13 = this.f29956e;
                                y2Var12.setImage(forDocument10, str10, forDocument2, null, drawable, document13.size, null, document13, 1);
                            }
                        }
                    }
                    w(this.f29961k);
                    if (i11 != 13) {
                        this.f29961k.setLayerNum(7);
                    } else {
                        this.f29961k.setLayerNum(7);
                    }
                    if (i11 != 9) {
                        this.f29961k.setLayerNum(6656);
                    } else {
                        this.f29961k.setLayerNum(6656);
                    }
                    this.f29961k.setAspectFit(true);
                    if (i11 != 12) {
                        this.f29961k.setAllowStartAnimation(false);
                        this.f29961k.setAllowStartLottieAnimation(false);
                        this.f29961k.setAutoRepeat(0);
                    } else {
                        this.f29961k.setAllowStartAnimation(false);
                        this.f29961k.setAllowStartLottieAnimation(false);
                        this.f29961k.setAutoRepeat(0);
                    }
                    this.f29961k.setAllowDecodeSingleFrame(true);
                    if (i11 != 5) {
                        iDp = AndroidUtilities.dp(6.0f);
                    } else {
                        iDp = AndroidUtilities.dp(6.0f);
                    }
                    this.f29961k.setRoundRadius(iDp);
                    v();
                    k();
                }
                forDocument = ImageLocation.getForDocument(this.f29956e);
                strL = s3.c.l(strL, "_g");
                svgThumb = DocumentObject.getSvgThumb(this.f29956e.thumbs, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f, true);
                str = strL;
                imageLocation = forDocument;
                i10 = 20;
                if (i11 != i10) {
                    imageLocation2 = null;
                    emojiDrawable = Emoji.getEmojiDrawable(MessageObject.findAnimatedEmojiEmoticon(this.f29956e, null));
                    if (emojiDrawable != null) {
                        drawable = emojiDrawable;
                    } else {
                        drawable = svgThumb;
                    }
                } else {
                    imageLocation2 = null;
                    emojiDrawable = Emoji.getEmojiDrawable(MessageObject.findAnimatedEmojiEmoticon(this.f29956e, null));
                    if (emojiDrawable != null) {
                        drawable = emojiDrawable;
                    } else {
                        drawable = svgThumb;
                    }
                }
                if (str3 != null) {
                    this.f29961k.setImageBitmap(new x5(new File(str3), true, 0L, 0, null, null, null, 0L, this.h, true, 512, 512, null, 0, true));
                } else if (i11 == 8) {
                    jh.y2 y2Var13 = this.f29961k;
                    TLRPC.Document document14 = this.f29956e;
                    y2Var13.setImage(null, null, imageLocation, str, null, null, drawable, document14.size, null, document14, 1);
                } else {
                    imageLocation3 = imageLocation;
                    str2 = str;
                    if (z11) {
                        if (i11 == 16) {
                            forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                        } else {
                            forDocument2 = imageLocation2;
                        }
                        if ("video/webm".equals(this.f29956e.mime_type)) {
                            jh.y2 y2Var14 = this.f29961k;
                            ImageLocation forDocument11 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                            String str11 = this.d + "_" + this.d;
                            TLRPC.Document document15 = this.f29956e;
                            y2Var14.setImage(null, null, forDocument11, str11, forDocument2, null, drawable, document15.size, null, document15, 1);
                        } else if (MessageObject.isAnimatedStickerDocument(this.f29956e, true)) {
                            jh.y2 y2Var15 = this.f29961k;
                            String strL5 = s3.c.l(str2, "_firstframe");
                            TLRPC.Document document16 = this.f29956e;
                            y2Var15.setImage(imageLocation3, strL5, forDocument2, null, drawable, document16.size, null, document16, 1);
                        } else {
                            jh.y2 y2Var16 = this.f29961k;
                            ImageLocation forDocument12 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                            String str12 = this.d + "_" + this.d;
                            TLRPC.Document document17 = this.f29956e;
                            y2Var16.setImage(forDocument12, str12, forDocument2, null, drawable, document17.size, null, document17, 1);
                        }
                    } else {
                        if (i11 == 16) {
                            forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                        } else {
                            forDocument2 = imageLocation2;
                        }
                        if ("video/webm".equals(this.f29956e.mime_type)) {
                            jh.y2 y2Var17 = this.f29961k;
                            ImageLocation forDocument13 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                            String str13 = this.d + "_" + this.d;
                            TLRPC.Document document18 = this.f29956e;
                            y2Var17.setImage(null, null, forDocument13, str13, forDocument2, null, drawable, document18.size, null, document18, 1);
                        } else if (MessageObject.isAnimatedStickerDocument(this.f29956e, true)) {
                            jh.y2 y2Var18 = this.f29961k;
                            String strL6 = s3.c.l(str2, "_firstframe");
                            TLRPC.Document document19 = this.f29956e;
                            y2Var18.setImage(imageLocation3, strL6, forDocument2, null, drawable, document19.size, null, document19, 1);
                        } else {
                            jh.y2 y2Var19 = this.f29961k;
                            ImageLocation forDocument14 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.f29956e);
                            String str14 = this.d + "_" + this.d;
                            TLRPC.Document document110 = this.f29956e;
                            y2Var19.setImage(forDocument14, str14, forDocument2, null, drawable, document110.size, null, document110, 1);
                        }
                    }
                }
                w(this.f29961k);
                if (i11 != 13) {
                    this.f29961k.setLayerNum(7);
                } else {
                    this.f29961k.setLayerNum(7);
                }
                if (i11 != 9) {
                    this.f29961k.setLayerNum(6656);
                } else {
                    this.f29961k.setLayerNum(6656);
                }
                this.f29961k.setAspectFit(true);
                if (i11 != 12) {
                    this.f29961k.setAllowStartAnimation(false);
                    this.f29961k.setAllowStartLottieAnimation(false);
                    this.f29961k.setAutoRepeat(0);
                } else {
                    this.f29961k.setAllowStartAnimation(false);
                    this.f29961k.setAllowStartLottieAnimation(false);
                    this.f29961k.setAutoRepeat(0);
                }
                this.f29961k.setAllowDecodeSingleFrame(true);
                if (i11 != 5) {
                    iDp = AndroidUtilities.dp(6.0f);
                } else {
                    iDp = AndroidUtilities.dp(6.0f);
                }
                this.f29961k.setRoundRadius(iDp);
                v();
                k();
            }
        }
    }

    public final void k() {
        if (this.f29954b != null) {
            for (int i10 = 0; i10 < this.f29954b.size(); i10++) {
                View view = (View) this.f29954b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f29955c != null) {
            for (int i11 = 0; i11 < this.f29955c.size(); i11++) {
                q5 q5Var = (q5) this.f29955c.get(i11);
                if (q5Var != null) {
                    q5Var.invalidate();
                }
            }
        }
    }

    public final boolean l() {
        Boolean bool = this.f29965o;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC.Document document = this.f29956e;
        boolean z10 = false;
        if (document != null) {
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(document);
            if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses) {
                z10 = true;
            } else if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
                long j10 = inputStickerSet.f22400id;
                if (j10 == 773947703670341676L || j10 == 2964141614563343L) {
                    z10 = true;
                }
            }
            this.f29965o = Boolean.valueOf(z10);
        }
        return z10;
    }

    public final void o(View view) {
        ArrayList arrayList = this.f29954b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f29963m = false;
        v();
    }

    public final void p(q5 q5Var) {
        ArrayList arrayList = this.f29955c;
        if (arrayList != null) {
            arrayList.remove(q5Var);
        }
        this.f29963m = false;
        v();
    }

    public final void q(long j10) {
        jh.y2 y2Var = this.f29961k;
        if (y2Var != null) {
            if (this.f29958g == 8) {
                j10 = 0;
            }
            y2Var.setCurrentTime(j10);
        }
    }

    public final void r(String str) {
        int i10 = this.f29958g;
        if ((i10 == 20 || i10 == 21) && !TextUtils.isEmpty(str) && this.f29961k == null) {
            e();
            this.f29960j = true;
            this.f29961k.setImageBitmap(Emoji.getEmojiDrawable(str));
            this.f29961k.setCrossfadeWithOldImage(true);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        float f10 = i10 / 255.0f;
        this.f29962l = f10;
        jh.y2 y2Var = this.f29961k;
        if (y2Var != null) {
            y2Var.setAlpha(f10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f29961k == null || this.f29956e == null) {
            this.f29966p = colorFilter;
        } else if (c()) {
            this.f29961k.setColorFilter(colorFilter);
        }
    }

    public final void t(long j10) {
        jh.y2 y2Var = this.f29961k;
        if (y2Var != null) {
            if (this.f29958g == 8) {
                j10 = 0;
            }
            if (y2Var.getLottieAnimation() != null) {
                this.f29961k.getLottieAnimation().S(j10);
            }
            if (this.f29961k.getAnimation() != null) {
                this.f29961k.getAnimation().D(j10);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f29956e;
        return a9.p.p(sb2, document == null ? "null" : MessageObject.findAnimatedEmojiEmoticon(document, null), "}");
    }

    public final void v() {
        ArrayList arrayList;
        if (this.f29961k == null) {
            return;
        }
        ArrayList arrayList2 = this.f29954b;
        boolean z10 = (arrayList2 != null && arrayList2.size() > 0) || ((arrayList = this.f29955c) != null && arrayList.size() > 0) || this.f29963m;
        if (z10 != this.f29953a) {
            this.f29953a = z10;
            if (z10) {
                this.f29961k.onAttachedToWindow();
            } else {
                this.f29961k.onDetachedFromWindow();
            }
            if (this.f29953a) {
                return;
            }
            ag.l3 l3Var = v;
            AndroidUtilities.cancelRunOnUIThread(l3Var);
            AndroidUtilities.runOnUIThread(l3Var, 5000L);
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f29958g;
        if (i10 == 7 || i10 == 9 || i10 == 10) {
            imageReceiver.setAutoRepeatCount(2);
            return;
        }
        if (i10 == 11 || i10 == 18 || i10 == 14 || i10 == 6 || i10 == 5 || i10 == 22) {
            imageReceiver.setAutoRepeatCount(1);
        } else if (i10 == 17) {
            imageReceiver.setAutoRepeatCount(0);
        }
    }

    public final void y() {
        int i10 = this.f29958g;
        if (i10 == 0 || i10 == 26) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.g6.f23247o2.descent()) + Math.abs(org.telegram.ui.ActionBar.g6.f23247o2.ascent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.f23419y2;
        if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.g6.f23419y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        if (textPaintArr != null && i10 == 8) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.g6.f23419y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        if (i10 == 14 || i10 == 15 || i10 == 17) {
            this.d = 100;
            return;
        }
        if (i10 == 11 || i10 == 22) {
            this.d = 56;
            return;
        }
        if (i10 == 27) {
            this.d = 50;
            return;
        }
        if (i10 == 24) {
            this.d = 140;
            return;
        }
        if (i10 == 23) {
            this.d = 14;
        } else if (i10 == 21) {
            this.d = 90;
        } else {
            this.d = 34;
        }
    }

    public k5(int i10, int i11, TLRPC.Document document) {
        this.f29958g = i10;
        this.h = i11;
        this.f29956e = document;
        y();
        x();
        j(false);
    }
}
