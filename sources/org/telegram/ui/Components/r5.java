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
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
public class r5 extends Drawable {
    public static SparseArray f29829q;
    public static HashMap f29830r;
    public static boolean f29831s;
    public static boolean f29832t;
    public static boolean f29833u;
    public static final ah.j v = new ah.j(27);
    public static HashMap f29834w;
    public boolean f29835a;
    public ArrayList f29836b;
    public ArrayList f29837c;
    public int d;
    public TLRPC.Document e;
    public long f29838f;
    public int f29839g;
    public int h;
    public String f29840i;
    public boolean f29841j;
    public ci.f3 f29842k;
    public boolean f29844m;
    public ColorFilter f29847p;
    public float f29843l = 1.0f;
    public Boolean f29845n = null;
    public Boolean f29846o = null;

    public r5(int i10, int i11, long j10) {
        this.h = i11;
        this.f29839g = i10;
        y();
        this.f29838f = j10;
        h(i11).b(j10, new j5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j10) {
        HashMap hashMap = h(i10).f28656a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j10));
    }

    public static int g() {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return 0;
        }
        return 2;
    }

    public static n5 h(int i10) {
        if (f29830r == null) {
            f29830r = new HashMap();
        }
        n5 n5Var = (n5) f29830r.get(Integer.valueOf(i10));
        if (n5Var == null) {
            HashMap hashMap = f29830r;
            Integer valueOf = Integer.valueOf(i10);
            n5 n5Var2 = new n5(i10);
            hashMap.put(valueOf, n5Var2);
            return n5Var2;
        }
        return n5Var;
    }

    public static r5 m(int i10, int i11, TLRPC.Document document) {
        if (f29829q == null) {
            f29829q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f29829q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f29829q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        r5 r5Var = (r5) longSparseArray.get(document.f20278id);
        if (r5Var == null) {
            long j10 = document.f20278id;
            r5 r5Var2 = new r5(i11, i10, document);
            longSparseArray.put(j10, r5Var2);
            return r5Var2;
        }
        return r5Var;
    }

    public static r5 n(int i10, long j10, String str, int i11) {
        if (f29829q == null) {
            f29829q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f29829q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f29829q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        r5 r5Var = (r5) longSparseArray.get(j10);
        if (r5Var == null) {
            ?? drawable = new Drawable();
            drawable.f29843l = 1.0f;
            drawable.f29845n = null;
            drawable.f29846o = null;
            drawable.h = i10;
            drawable.f29839g = i11;
            drawable.y();
            drawable.f29838f = j10;
            drawable.f29840i = str;
            h(i10).b(j10, new j5(drawable, 1));
            longSparseArray.put(j10, drawable);
            return drawable;
        }
        return r5Var;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        ci.f3 f3Var;
        boolean z11 = !z10;
        if (f29833u != z11) {
            f29833u = z11;
            if (f29829q != null && (longSparseArray = (LongSparseArray) f29829q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    r5 r5Var = (r5) longSparseArray.valueAt(i11);
                    if (r5Var != null && (f3Var = r5Var.f29842k) != null) {
                        if (z10) {
                            f3Var.setAllowStartLottieAnimation(true);
                            f3Var.setAllowStartAnimation(true);
                            f3Var.setAutoRepeat(1);
                            e6 animation = f3Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = f3Var.useSharedAnimationQueue;
                                if (!animation.f25835n0) {
                                    animation.f25845v0 = z12;
                                }
                                animation.start();
                            } else {
                                uj0 lottieAnimation = f3Var.getLottieAnimation();
                                if (lottieAnimation != null) {
                                    lottieAnimation.start();
                                }
                            }
                        } else {
                            f3Var.setAllowStartAnimation(false);
                            f3Var.setAllowStartLottieAnimation(false);
                            f3Var.setAutoRepeat(0);
                            f3Var.stopAnimation();
                        }
                    }
                }
            }
        }
    }

    public static void u() {
        if (f29829q != null) {
            x();
            for (int i10 = 0; i10 < f29829q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f29829q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    r5 r5Var = (r5) longSparseArray.get(keyAt);
                    if (r5Var != null && r5Var.f29835a) {
                        r5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f29831s = LiteMode.isEnabled(16388);
        f29832t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.b51)) {
            this.f29844m = false;
            if (this.f29836b == null) {
                this.f29836b = new ArrayList(10);
            }
            if (!this.f29836b.contains(view)) {
                this.f29836b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(x5 x5Var) {
        if (this.f29837c == null) {
            this.f29837c = new ArrayList(10);
        }
        this.f29844m = false;
        if (!this.f29837c.contains(x5Var)) {
            this.f29837c.add(x5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f29839g == 19) {
            return true;
        }
        Boolean bool = this.f29845n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.e)) {
            z10 = false;
        }
        this.f29845n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f29837c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f29836b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f29844m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        ci.f3 f3Var = this.f29842k;
        if (f3Var == null) {
            return;
        }
        f3Var.setImageCoords(getBounds());
        this.f29842k.setAlpha(this.f29843l);
        this.f29842k.draw(canvas);
    }

    public final void e() {
        if (this.f29842k == null) {
            ci.f3 f3Var = new ci.f3(this, 4);
            this.f29842k = f3Var;
            f3Var.setCurrentAccount(this.h);
            this.f29842k.setAllowLoadingOnAttachedOnly(true);
            if (this.f29839g == 12) {
                this.f29842k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f29843l * 255.0f);
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
        TLRPC.Document document = this.e;
        if (document != null) {
            return document.f20278id;
        }
        return this.f29838f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r5.j(boolean):void");
    }

    public final void k() {
        if (this.f29836b != null) {
            for (int i10 = 0; i10 < this.f29836b.size(); i10++) {
                View view = (View) this.f29836b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f29837c != null) {
            for (int i11 = 0; i11 < this.f29837c.size(); i11++) {
                x5 x5Var = (x5) this.f29837c.get(i11);
                if (x5Var != null) {
                    x5Var.invalidate();
                }
            }
        }
    }

    public final boolean l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r5.l():boolean");
    }

    public final void o(View view) {
        ArrayList arrayList = this.f29836b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f29844m = false;
        v();
    }

    public final void p(x5 x5Var) {
        ArrayList arrayList = this.f29837c;
        if (arrayList != null) {
            arrayList.remove(x5Var);
        }
        this.f29844m = false;
        v();
    }

    public final void q(long j10) {
        ci.f3 f3Var = this.f29842k;
        if (f3Var != null) {
            if (this.f29839g == 8) {
                j10 = 0;
            }
            f3Var.setCurrentTime(j10);
        }
    }

    public final void r(String str) {
        int i10 = this.f29839g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f29842k != null) {
            return;
        }
        e();
        this.f29841j = true;
        this.f29842k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f29842k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f29843l = f7;
        ci.f3 f3Var = this.f29842k;
        if (f3Var != null) {
            f3Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f29842k != null && this.e != null) {
            if (c()) {
                this.f29842k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f29847p = colorFilter;
    }

    public final void t(long j10) {
        ci.f3 f3Var = this.f29842k;
        if (f3Var != null) {
            if (this.f29839g == 8) {
                j10 = 0;
            }
            if (f3Var.getLottieAnimation() != null) {
                this.f29842k.getLottieAnimation().V(j10);
            }
            if (this.f29842k.getAnimation() != null) {
                this.f29842k.getAnimation().D(j10);
            }
        }
    }

    public final String toString() {
        String findAnimatedEmojiEmoticon;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.e;
        if (document == null) {
            findAnimatedEmojiEmoticon = "null";
        } else {
            findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null);
        }
        return a1.g.s(sb2, findAnimatedEmojiEmoticon, "}");
    }

    public final void v() {
        ArrayList arrayList;
        boolean z10;
        if (this.f29842k != null) {
            ArrayList arrayList2 = this.f29836b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f29837c) != null && arrayList.size() > 0) || this.f29844m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f29835a) {
                this.f29835a = z10;
                if (z10) {
                    this.f29842k.onAttachedToWindow();
                } else {
                    this.f29842k.onDetachedFromWindow();
                }
                if (!this.f29835a) {
                    ah.j jVar = v;
                    AndroidUtilities.cancelRunOnUIThread(jVar);
                    AndroidUtilities.runOnUIThread(jVar, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f29839g;
        if (i10 != 7 && i10 != 9 && i10 != 10) {
            if (i10 != 11 && i10 != 18 && i10 != 14 && i10 != 6 && i10 != 5 && i10 != 22) {
                if (i10 == 17) {
                    imageReceiver.setAutoRepeatCount(0);
                    return;
                }
                return;
            }
            imageReceiver.setAutoRepeatCount(1);
            return;
        }
        imageReceiver.setAutoRepeatCount(2);
    }

    public final void y() {
        int i10 = this.f29839g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.f21371y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.h6.f21371y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.h6.f21371y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (i10 != 14 && i10 != 15 && i10 != 17) {
                if (i10 != 11 && i10 != 22) {
                    if (i10 == 27) {
                        this.d = 50;
                        return;
                    } else if (i10 == 24) {
                        this.d = 140;
                        return;
                    } else if (i10 == 23) {
                        this.d = 14;
                        return;
                    } else if (i10 == 21) {
                        this.d = 90;
                        return;
                    } else {
                        this.d = 34;
                        return;
                    }
                }
                this.d = 56;
                return;
            } else {
                this.d = 100;
                return;
            }
        }
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.h6.f21185o2.descent()) + Math.abs(org.telegram.ui.ActionBar.h6.f21185o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public r5(int i10, int i11, TLRPC.Document document) {
        this.f29839g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
