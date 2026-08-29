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
    public static SparseArray f31579q;
    public static HashMap f31580r;
    public static boolean f31581s;
    public static boolean f31582t;
    public static boolean f31583u;
    public static final g5 v = new g5(0);
    public static HashMap f31584w;
    public boolean f31585a;
    public ArrayList f31586b;
    public ArrayList f31587c;
    public int d;
    public TLRPC.Document f31588e;
    public long f31589f;
    public int f31590g;
    public int h;
    public String f31591i;
    public boolean f31592j;
    public lh.x2 f31593k;
    public boolean f31595m;
    public ColorFilter f31598p;
    public float f31594l = 1.0f;
    public Boolean f31596n = null;
    public Boolean f31597o = null;

    public p5(int i10, int i11, long j10) {
        this.h = i11;
        this.f31590g = i10;
        y();
        this.f31589f = j10;
        h(i11).b(j10, new h5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j10) {
        HashMap hashMap = h(i10).f30229a;
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

    public static l5 h(int i10) {
        if (f31580r == null) {
            f31580r = new HashMap();
        }
        l5 l5Var = (l5) f31580r.get(Integer.valueOf(i10));
        if (l5Var == null) {
            HashMap hashMap = f31580r;
            Integer valueOf = Integer.valueOf(i10);
            l5 l5Var2 = new l5(i10);
            hashMap.put(valueOf, l5Var2);
            return l5Var2;
        }
        return l5Var;
    }

    public static p5 m(int i10, int i11, TLRPC.Document document) {
        if (f31579q == null) {
            f31579q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f31579q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f31579q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        p5 p5Var = (p5) longSparseArray.get(document.f22398id);
        if (p5Var == null) {
            long j10 = document.f22398id;
            p5 p5Var2 = new p5(i11, i10, document);
            longSparseArray.put(j10, p5Var2);
            return p5Var2;
        }
        return p5Var;
    }

    public static p5 n(int i10, long j10, String str, int i11) {
        if (f31579q == null) {
            f31579q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f31579q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f31579q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        p5 p5Var = (p5) longSparseArray.get(j10);
        if (p5Var == null) {
            ?? drawable = new Drawable();
            drawable.f31594l = 1.0f;
            drawable.f31596n = null;
            drawable.f31597o = null;
            drawable.h = i10;
            drawable.f31590g = i11;
            drawable.y();
            drawable.f31589f = j10;
            drawable.f31591i = str;
            h(i10).b(j10, new h5(drawable, 1));
            longSparseArray.put(j10, drawable);
            return drawable;
        }
        return p5Var;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        lh.x2 x2Var;
        boolean z11 = !z10;
        if (f31583u != z11) {
            f31583u = z11;
            if (f31579q != null && (longSparseArray = (LongSparseArray) f31579q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    p5 p5Var = (p5) longSparseArray.valueAt(i11);
                    if (p5Var != null && (x2Var = p5Var.f31593k) != null) {
                        if (z10) {
                            x2Var.setAllowStartLottieAnimation(true);
                            x2Var.setAllowStartAnimation(true);
                            x2Var.setAutoRepeat(1);
                            c6 animation = x2Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = x2Var.useSharedAnimationQueue;
                                if (!animation.f27327j0) {
                                    animation.f27336r0 = z12;
                                }
                                animation.start();
                            } else {
                                xi0 lottieAnimation = x2Var.getLottieAnimation();
                                if (lottieAnimation != null) {
                                    lottieAnimation.start();
                                }
                            }
                        } else {
                            x2Var.setAllowStartAnimation(false);
                            x2Var.setAllowStartLottieAnimation(false);
                            x2Var.setAutoRepeat(0);
                            x2Var.stopAnimation();
                        }
                    }
                }
            }
        }
    }

    public static void u() {
        if (f31579q != null) {
            x();
            for (int i10 = 0; i10 < f31579q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f31579q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    p5 p5Var = (p5) longSparseArray.get(keyAt);
                    if (p5Var != null && p5Var.f31585a) {
                        p5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f31581s = LiteMode.isEnabled(16388);
        f31582t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.f51)) {
            this.f31595m = false;
            if (this.f31586b == null) {
                this.f31586b = new ArrayList(10);
            }
            if (!this.f31586b.contains(view)) {
                this.f31586b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(v5 v5Var) {
        if (this.f31587c == null) {
            this.f31587c = new ArrayList(10);
        }
        this.f31595m = false;
        if (!this.f31587c.contains(v5Var)) {
            this.f31587c.add(v5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f31590g == 19) {
            return true;
        }
        Boolean bool = this.f31596n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f31588e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.f31588e)) {
            z10 = false;
        }
        this.f31596n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f31587c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f31586b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f31595m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        lh.x2 x2Var = this.f31593k;
        if (x2Var == null) {
            return;
        }
        x2Var.setImageCoords(getBounds());
        this.f31593k.setAlpha(this.f31594l);
        this.f31593k.draw(canvas);
    }

    public final void e() {
        if (this.f31593k == null) {
            lh.x2 x2Var = new lh.x2(this, 3);
            this.f31593k = x2Var;
            x2Var.setCurrentAccount(this.h);
            this.f31593k.setAllowLoadingOnAttachedOnly(true);
            if (this.f31590g == 12) {
                this.f31593k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f31594l * 255.0f);
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
        TLRPC.Document document = this.f31588e;
        if (document != null) {
            return document.f22398id;
        }
        return this.f31589f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p5.j(boolean):void");
    }

    public final void k() {
        if (this.f31586b != null) {
            for (int i10 = 0; i10 < this.f31586b.size(); i10++) {
                View view = (View) this.f31586b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f31587c != null) {
            for (int i11 = 0; i11 < this.f31587c.size(); i11++) {
                v5 v5Var = (v5) this.f31587c.get(i11);
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
        ArrayList arrayList = this.f31586b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f31595m = false;
        v();
    }

    public final void p(v5 v5Var) {
        ArrayList arrayList = this.f31587c;
        if (arrayList != null) {
            arrayList.remove(v5Var);
        }
        this.f31595m = false;
        v();
    }

    public final void q(long j10) {
        lh.x2 x2Var = this.f31593k;
        if (x2Var != null) {
            if (this.f31590g == 8) {
                j10 = 0;
            }
            x2Var.setCurrentTime(j10);
        }
    }

    public final void r(String str) {
        int i10 = this.f31590g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f31593k != null) {
            return;
        }
        e();
        this.f31592j = true;
        this.f31593k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f31593k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f9 = i10 / 255.0f;
        this.f31594l = f9;
        lh.x2 x2Var = this.f31593k;
        if (x2Var != null) {
            x2Var.setAlpha(f9);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f31593k != null && this.f31588e != null) {
            if (c()) {
                this.f31593k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f31598p = colorFilter;
    }

    public final void t(long j10) {
        lh.x2 x2Var = this.f31593k;
        if (x2Var != null) {
            if (this.f31590g == 8) {
                j10 = 0;
            }
            if (x2Var.getLottieAnimation() != null) {
                this.f31593k.getLottieAnimation().S(j10);
            }
            if (this.f31593k.getAnimation() != null) {
                this.f31593k.getAnimation().D(j10);
            }
        }
    }

    public final String toString() {
        String findAnimatedEmojiEmoticon;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f31588e;
        if (document == null) {
            findAnimatedEmojiEmoticon = "null";
        } else {
            findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null);
        }
        return a4.w.q(sb2, findAnimatedEmojiEmoticon, "}");
    }

    public final void v() {
        ArrayList arrayList;
        boolean z10;
        if (this.f31593k != null) {
            ArrayList arrayList2 = this.f31586b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f31587c) != null && arrayList.size() > 0) || this.f31595m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f31585a) {
                this.f31585a = z10;
                if (z10) {
                    this.f31593k.onAttachedToWindow();
                } else {
                    this.f31593k.onDetachedFromWindow();
                }
                if (!this.f31585a) {
                    g5 g5Var = v;
                    AndroidUtilities.cancelRunOnUIThread(g5Var);
                    AndroidUtilities.runOnUIThread(g5Var, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f31590g;
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
        int i10 = this.f31590g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.f23429y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.g6.f23429y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.g6.f23429y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.g6.f23256o2.descent()) + Math.abs(org.telegram.ui.ActionBar.g6.f23256o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public p5(int i10, int i11, TLRPC.Document document) {
        this.f31590g = i10;
        this.h = i11;
        this.f31588e = document;
        y();
        x();
        j(false);
    }
}
