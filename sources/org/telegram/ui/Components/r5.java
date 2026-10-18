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
    public static SparseArray f29836q;
    public static HashMap f29837r;
    public static boolean f29838s;
    public static boolean f29839t;
    public static boolean f29840u;
    public static final ah.j v = new ah.j(28);
    public static HashMap f29841w;
    public boolean f29842a;
    public ArrayList f29843b;
    public ArrayList f29844c;
    public int d;
    public TLRPC.Document e;
    public long f29845f;
    public int f29846g;
    public int h;
    public String f29847i;
    public boolean f29848j;
    public ci.g3 f29849k;
    public boolean f29851m;
    public ColorFilter f29854p;
    public float f29850l = 1.0f;
    public Boolean f29852n = null;
    public Boolean f29853o = null;

    public r5(int i10, int i11, long j10) {
        this.h = i11;
        this.f29846g = i10;
        y();
        this.f29845f = j10;
        h(i11).b(j10, new j5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j10) {
        HashMap hashMap = h(i10).f28663a;
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
        if (f29837r == null) {
            f29837r = new HashMap();
        }
        n5 n5Var = (n5) f29837r.get(Integer.valueOf(i10));
        if (n5Var == null) {
            HashMap hashMap = f29837r;
            Integer valueOf = Integer.valueOf(i10);
            n5 n5Var2 = new n5(i10);
            hashMap.put(valueOf, n5Var2);
            return n5Var2;
        }
        return n5Var;
    }

    public static r5 m(int i10, int i11, TLRPC.Document document) {
        if (f29836q == null) {
            f29836q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f29836q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f29836q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        r5 r5Var = (r5) longSparseArray.get(document.f20285id);
        if (r5Var == null) {
            long j10 = document.f20285id;
            r5 r5Var2 = new r5(i11, i10, document);
            longSparseArray.put(j10, r5Var2);
            return r5Var2;
        }
        return r5Var;
    }

    public static r5 n(int i10, long j10, String str, int i11) {
        if (f29836q == null) {
            f29836q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f29836q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f29836q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        r5 r5Var = (r5) longSparseArray.get(j10);
        if (r5Var == null) {
            ?? drawable = new Drawable();
            drawable.f29850l = 1.0f;
            drawable.f29852n = null;
            drawable.f29853o = null;
            drawable.h = i10;
            drawable.f29846g = i11;
            drawable.y();
            drawable.f29845f = j10;
            drawable.f29847i = str;
            h(i10).b(j10, new j5(drawable, 1));
            longSparseArray.put(j10, drawable);
            return drawable;
        }
        return r5Var;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        ci.g3 g3Var;
        boolean z11 = !z10;
        if (f29840u != z11) {
            f29840u = z11;
            if (f29836q != null && (longSparseArray = (LongSparseArray) f29836q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    r5 r5Var = (r5) longSparseArray.valueAt(i11);
                    if (r5Var != null && (g3Var = r5Var.f29849k) != null) {
                        if (z10) {
                            g3Var.setAllowStartLottieAnimation(true);
                            g3Var.setAllowStartAnimation(true);
                            g3Var.setAutoRepeat(1);
                            e6 animation = g3Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = g3Var.useSharedAnimationQueue;
                                if (!animation.f25842n0) {
                                    animation.f25852v0 = z12;
                                }
                                animation.start();
                            } else {
                                uj0 lottieAnimation = g3Var.getLottieAnimation();
                                if (lottieAnimation != null) {
                                    lottieAnimation.start();
                                }
                            }
                        } else {
                            g3Var.setAllowStartAnimation(false);
                            g3Var.setAllowStartLottieAnimation(false);
                            g3Var.setAutoRepeat(0);
                            g3Var.stopAnimation();
                        }
                    }
                }
            }
        }
    }

    public static void u() {
        if (f29836q != null) {
            x();
            for (int i10 = 0; i10 < f29836q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f29836q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    r5 r5Var = (r5) longSparseArray.get(keyAt);
                    if (r5Var != null && r5Var.f29842a) {
                        r5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f29838s = LiteMode.isEnabled(16388);
        f29839t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.b51)) {
            this.f29851m = false;
            if (this.f29843b == null) {
                this.f29843b = new ArrayList(10);
            }
            if (!this.f29843b.contains(view)) {
                this.f29843b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(x5 x5Var) {
        if (this.f29844c == null) {
            this.f29844c = new ArrayList(10);
        }
        this.f29851m = false;
        if (!this.f29844c.contains(x5Var)) {
            this.f29844c.add(x5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f29846g == 19) {
            return true;
        }
        Boolean bool = this.f29852n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.e)) {
            z10 = false;
        }
        this.f29852n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f29844c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f29843b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f29851m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        ci.g3 g3Var = this.f29849k;
        if (g3Var == null) {
            return;
        }
        g3Var.setImageCoords(getBounds());
        this.f29849k.setAlpha(this.f29850l);
        this.f29849k.draw(canvas);
    }

    public final void e() {
        if (this.f29849k == null) {
            ci.g3 g3Var = new ci.g3(this, 4);
            this.f29849k = g3Var;
            g3Var.setCurrentAccount(this.h);
            this.f29849k.setAllowLoadingOnAttachedOnly(true);
            if (this.f29846g == 12) {
                this.f29849k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f29850l * 255.0f);
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
            return document.f20285id;
        }
        return this.f29845f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r5.j(boolean):void");
    }

    public final void k() {
        if (this.f29843b != null) {
            for (int i10 = 0; i10 < this.f29843b.size(); i10++) {
                View view = (View) this.f29843b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f29844c != null) {
            for (int i11 = 0; i11 < this.f29844c.size(); i11++) {
                x5 x5Var = (x5) this.f29844c.get(i11);
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
        ArrayList arrayList = this.f29843b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f29851m = false;
        v();
    }

    public final void p(x5 x5Var) {
        ArrayList arrayList = this.f29844c;
        if (arrayList != null) {
            arrayList.remove(x5Var);
        }
        this.f29851m = false;
        v();
    }

    public final void q(long j10) {
        ci.g3 g3Var = this.f29849k;
        if (g3Var != null) {
            if (this.f29846g == 8) {
                j10 = 0;
            }
            g3Var.setCurrentTime(j10);
        }
    }

    public final void r(String str) {
        int i10 = this.f29846g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f29849k != null) {
            return;
        }
        e();
        this.f29848j = true;
        this.f29849k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f29849k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f29850l = f7;
        ci.g3 g3Var = this.f29849k;
        if (g3Var != null) {
            g3Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f29849k != null && this.e != null) {
            if (c()) {
                this.f29849k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f29854p = colorFilter;
    }

    public final void t(long j10) {
        ci.g3 g3Var = this.f29849k;
        if (g3Var != null) {
            if (this.f29846g == 8) {
                j10 = 0;
            }
            if (g3Var.getLottieAnimation() != null) {
                this.f29849k.getLottieAnimation().V(j10);
            }
            if (this.f29849k.getAnimation() != null) {
                this.f29849k.getAnimation().D(j10);
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
        if (this.f29849k != null) {
            ArrayList arrayList2 = this.f29843b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f29844c) != null && arrayList.size() > 0) || this.f29851m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f29842a) {
                this.f29842a = z10;
                if (z10) {
                    this.f29849k.onAttachedToWindow();
                } else {
                    this.f29849k.onDetachedFromWindow();
                }
                if (!this.f29842a) {
                    ah.j jVar = v;
                    AndroidUtilities.cancelRunOnUIThread(jVar);
                    AndroidUtilities.runOnUIThread(jVar, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f29846g;
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
        int i10 = this.f29846g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.f21378y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.h6.f21378y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.h6.f21378y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.h6.f21192o2.descent()) + Math.abs(org.telegram.ui.ActionBar.h6.f21192o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public r5(int i10, int i11, TLRPC.Document document) {
        this.f29846g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
