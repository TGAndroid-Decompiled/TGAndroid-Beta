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
public class p5 extends Drawable {
    public static SparseArray f26020q;
    public static HashMap f26021r;
    public static boolean f26022s;
    public static boolean f26023t;
    public static boolean f26024u;
    public static final bi.f0 v = new bi.f0(18);
    public static HashMap f26025w;
    public boolean f26026a;
    public ArrayList f26027b;
    public ArrayList f26028c;
    public int d;
    public TLRPC.Document e;
    public long f26029f;
    public int f26030g;
    public int h;
    public String f26031i;
    public boolean f26032j;
    public gg.h1 f26033k;
    public boolean f26035m;
    public ColorFilter f26038p;
    public float f26034l = 1.0f;
    public Boolean f26036n = null;
    public Boolean f26037o = null;

    public p5(int i10, int i11, long j3) {
        this.h = i11;
        this.f26030g = i10;
        y();
        this.f26029f = j3;
        h(i11).b(j3, new h5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j3) {
        HashMap hashMap = h(i10).f24876a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j3));
    }

    public static int g() {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return 0;
        }
        return 2;
    }

    public static l5 h(int i10) {
        if (f26021r == null) {
            f26021r = new HashMap();
        }
        l5 l5Var = (l5) f26021r.get(Integer.valueOf(i10));
        if (l5Var == null) {
            HashMap hashMap = f26021r;
            Integer valueOf = Integer.valueOf(i10);
            l5 l5Var2 = new l5(i10);
            hashMap.put(valueOf, l5Var2);
            return l5Var2;
        }
        return l5Var;
    }

    public static p5 m(int i10, int i11, TLRPC.Document document) {
        if (f26020q == null) {
            f26020q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f26020q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f26020q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        p5 p5Var = (p5) longSparseArray.get(document.f17201id);
        if (p5Var == null) {
            long j3 = document.f17201id;
            p5 p5Var2 = new p5(i11, i10, document);
            longSparseArray.put(j3, p5Var2);
            return p5Var2;
        }
        return p5Var;
    }

    public static p5 n(int i10, long j3, String str, int i11) {
        if (f26020q == null) {
            f26020q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f26020q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f26020q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        p5 p5Var = (p5) longSparseArray.get(j3);
        if (p5Var == null) {
            ?? drawable = new Drawable();
            drawable.f26034l = 1.0f;
            drawable.f26036n = null;
            drawable.f26037o = null;
            drawable.h = i10;
            drawable.f26030g = i11;
            drawable.y();
            drawable.f26029f = j3;
            drawable.f26031i = str;
            h(i10).b(j3, new h5(drawable, 1));
            longSparseArray.put(j3, drawable);
            return drawable;
        }
        return p5Var;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        gg.h1 h1Var;
        boolean z11 = !z10;
        if (f26024u != z11) {
            f26024u = z11;
            if (f26020q != null && (longSparseArray = (LongSparseArray) f26020q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    p5 p5Var = (p5) longSparseArray.valueAt(i11);
                    if (p5Var != null && (h1Var = p5Var.f26033k) != null) {
                        if (z10) {
                            h1Var.setAllowStartLottieAnimation(true);
                            h1Var.setAllowStartAnimation(true);
                            h1Var.setAutoRepeat(1);
                            c6 animation = h1Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = h1Var.useSharedAnimationQueue;
                                if (!animation.f22013n0) {
                                    animation.f22023v0 = z12;
                                }
                                animation.start();
                            } else {
                                hj0 lottieAnimation = h1Var.getLottieAnimation();
                                if (lottieAnimation != null) {
                                    lottieAnimation.start();
                                }
                            }
                        } else {
                            h1Var.setAllowStartAnimation(false);
                            h1Var.setAllowStartLottieAnimation(false);
                            h1Var.setAutoRepeat(0);
                            h1Var.stopAnimation();
                        }
                    }
                }
            }
        }
    }

    public static void u() {
        if (f26020q != null) {
            x();
            for (int i10 = 0; i10 < f26020q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f26020q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    p5 p5Var = (p5) longSparseArray.get(keyAt);
                    if (p5Var != null && p5Var.f26026a) {
                        p5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f26022s = LiteMode.isEnabled(16388);
        f26023t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.n61)) {
            this.f26035m = false;
            if (this.f26027b == null) {
                this.f26027b = new ArrayList(10);
            }
            if (!this.f26027b.contains(view)) {
                this.f26027b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(v5 v5Var) {
        if (this.f26028c == null) {
            this.f26028c = new ArrayList(10);
        }
        this.f26035m = false;
        if (!this.f26028c.contains(v5Var)) {
            this.f26028c.add(v5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f26030g == 19) {
            return true;
        }
        Boolean bool = this.f26036n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.e)) {
            z10 = false;
        }
        this.f26036n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f26028c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f26027b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f26035m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        gg.h1 h1Var = this.f26033k;
        if (h1Var == null) {
            return;
        }
        h1Var.setImageCoords(getBounds());
        this.f26033k.setAlpha(this.f26034l);
        this.f26033k.draw(canvas);
    }

    public final void e() {
        if (this.f26033k == null) {
            gg.h1 h1Var = new gg.h1(this, 3);
            this.f26033k = h1Var;
            h1Var.setCurrentAccount(this.h);
            this.f26033k.setAllowLoadingOnAttachedOnly(true);
            if (this.f26030g == 12) {
                this.f26033k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f26034l * 255.0f);
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
            return document.f17201id;
        }
        return this.f26029f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p5.j(boolean):void");
    }

    public final void k() {
        if (this.f26027b != null) {
            for (int i10 = 0; i10 < this.f26027b.size(); i10++) {
                View view = (View) this.f26027b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f26028c != null) {
            for (int i11 = 0; i11 < this.f26028c.size(); i11++) {
                v5 v5Var = (v5) this.f26028c.get(i11);
                if (v5Var != null) {
                    v5Var.invalidate();
                }
            }
        }
    }

    public final boolean l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p5.l():boolean");
    }

    public final void o(View view) {
        ArrayList arrayList = this.f26027b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f26035m = false;
        v();
    }

    public final void p(v5 v5Var) {
        ArrayList arrayList = this.f26028c;
        if (arrayList != null) {
            arrayList.remove(v5Var);
        }
        this.f26035m = false;
        v();
    }

    public final void q(long j3) {
        gg.h1 h1Var = this.f26033k;
        if (h1Var != null) {
            if (this.f26030g == 8) {
                j3 = 0;
            }
            h1Var.setCurrentTime(j3);
        }
    }

    public final void r(String str) {
        int i10 = this.f26030g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f26033k != null) {
            return;
        }
        e();
        this.f26032j = true;
        this.f26033k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f26033k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f26034l = f7;
        gg.h1 h1Var = this.f26033k;
        if (h1Var != null) {
            h1Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f26033k != null && this.e != null) {
            if (c()) {
                this.f26033k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f26038p = colorFilter;
    }

    public final void t(long j3) {
        gg.h1 h1Var = this.f26033k;
        if (h1Var != null) {
            if (this.f26030g == 8) {
                j3 = 0;
            }
            if (h1Var.getLottieAnimation() != null) {
                this.f26033k.getLottieAnimation().U(j3);
            }
            if (this.f26033k.getAnimation() != null) {
                this.f26033k.getAnimation().D(j3);
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
        return a4.a.s(sb2, findAnimatedEmojiEmoticon, "}");
    }

    public final void v() {
        ArrayList arrayList;
        boolean z10;
        if (this.f26033k != null) {
            ArrayList arrayList2 = this.f26027b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f26028c) != null && arrayList.size() > 0) || this.f26035m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f26026a) {
                this.f26026a = z10;
                if (z10) {
                    this.f26033k.onAttachedToWindow();
                } else {
                    this.f26033k.onDetachedFromWindow();
                }
                if (!this.f26026a) {
                    bi.f0 f0Var = v;
                    AndroidUtilities.cancelRunOnUIThread(f0Var);
                    AndroidUtilities.runOnUIThread(f0Var, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f26030g;
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
        int i10 = this.f26030g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.f18303y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f18303y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f18303y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f18122o2.descent()) + Math.abs(org.telegram.ui.ActionBar.j6.f18122o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public p5(int i10, int i11, TLRPC.Document document) {
        this.f26030g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
