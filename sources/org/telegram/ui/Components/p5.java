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
    public static SparseArray f29471r;
    public static HashMap f29472s;
    public static boolean f29473t;
    public static boolean f29474u;
    public static boolean v;
    public static final ah.j f29475w = new ah.j(28);
    public static HashMap f29476x;
    public boolean f29477a;
    public ArrayList f29478b;
    public ArrayList f29479c;
    public int d;
    public TLRPC.Document e;
    public long f29480f;
    public int f29481g;
    public int h;
    public String f29482i;
    public boolean f29483j;
    public ci.f3 f29484k;
    public boolean f29486m;
    public ColorFilter f29489p;
    public ColorFilter f29490q;
    public float f29485l = 1.0f;
    public Boolean f29487n = null;
    public Boolean f29488o = null;

    public p5(int i10, int i11, long j10) {
        this.h = i11;
        this.f29481g = i10;
        y();
        this.f29480f = j10;
        h(i11).b(j10, new h5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j10) {
        HashMap hashMap = h(i10).f28169a;
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
        if (f29472s == null) {
            f29472s = new HashMap();
        }
        l5 l5Var = (l5) f29472s.get(Integer.valueOf(i10));
        if (l5Var == null) {
            HashMap hashMap = f29472s;
            Integer valueOf = Integer.valueOf(i10);
            l5 l5Var2 = new l5(i10);
            hashMap.put(valueOf, l5Var2);
            return l5Var2;
        }
        return l5Var;
    }

    public static p5 m(int i10, int i11, TLRPC.Document document) {
        if (f29471r == null) {
            f29471r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f29471r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f29471r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        p5 p5Var = (p5) longSparseArray.get(document.f20350id);
        if (p5Var == null) {
            long j10 = document.f20350id;
            p5 p5Var2 = new p5(i11, i10, document);
            longSparseArray.put(j10, p5Var2);
            return p5Var2;
        }
        return p5Var;
    }

    public static p5 n(int i10, long j10, String str, int i11) {
        if (f29471r == null) {
            f29471r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f29471r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f29471r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        p5 p5Var = (p5) longSparseArray.get(j10);
        if (p5Var == null) {
            ?? drawable = new Drawable();
            drawable.f29485l = 1.0f;
            drawable.f29487n = null;
            drawable.f29488o = null;
            drawable.h = i10;
            drawable.f29481g = i11;
            drawable.y();
            drawable.f29480f = j10;
            drawable.f29482i = str;
            h(i10).b(j10, new h5(drawable, 1));
            longSparseArray.put(j10, drawable);
            return drawable;
        }
        return p5Var;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        ci.f3 f3Var;
        boolean z11 = !z10;
        if (v != z11) {
            v = z11;
            if (f29471r != null && (longSparseArray = (LongSparseArray) f29471r.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    p5 p5Var = (p5) longSparseArray.valueAt(i11);
                    if (p5Var != null && (f3Var = p5Var.f29484k) != null) {
                        if (z10) {
                            f3Var.setAllowStartLottieAnimation(true);
                            f3Var.setAllowStartAnimation(true);
                            f3Var.setAutoRepeat(1);
                            c6 animation = f3Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = f3Var.useSharedAnimationQueue;
                                if (!animation.f25215n0) {
                                    animation.f25225v0 = z12;
                                }
                                animation.start();
                            } else {
                                xj0 lottieAnimation = f3Var.getLottieAnimation();
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
        if (f29471r != null) {
            x();
            for (int i10 = 0; i10 < f29471r.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f29471r.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    p5 p5Var = (p5) longSparseArray.get(keyAt);
                    if (p5Var != null && p5Var.f29477a) {
                        p5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f29473t = LiteMode.isEnabled(16388);
        f29474u = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.c51)) {
            this.f29486m = false;
            if (this.f29478b == null) {
                this.f29478b = new ArrayList(10);
            }
            if (!this.f29478b.contains(view)) {
                this.f29478b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(v5 v5Var) {
        if (this.f29479c == null) {
            this.f29479c = new ArrayList(10);
        }
        this.f29486m = false;
        if (!this.f29479c.contains(v5Var)) {
            this.f29479c.add(v5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f29481g == 19) {
            return true;
        }
        Boolean bool = this.f29487n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.e)) {
            z10 = false;
        }
        this.f29487n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f29479c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f29478b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f29486m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        ci.f3 f3Var = this.f29484k;
        if (f3Var == null) {
            return;
        }
        f3Var.setImageCoords(getBounds());
        this.f29484k.setAlpha(this.f29485l);
        this.f29484k.draw(canvas);
    }

    public final void e() {
        if (this.f29484k == null) {
            ci.f3 f3Var = new ci.f3(this, 4);
            this.f29484k = f3Var;
            f3Var.setCurrentAccount(this.h);
            this.f29484k.setAllowLoadingOnAttachedOnly(true);
            if (this.f29481g == 12) {
                this.f29484k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f29485l * 255.0f);
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.f29490q;
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
            return document.f20350id;
        }
        return this.f29480f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p5.j(boolean):void");
    }

    public final void k() {
        if (this.f29478b != null) {
            for (int i10 = 0; i10 < this.f29478b.size(); i10++) {
                View view = (View) this.f29478b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f29479c != null) {
            for (int i11 = 0; i11 < this.f29479c.size(); i11++) {
                v5 v5Var = (v5) this.f29479c.get(i11);
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
        ArrayList arrayList = this.f29478b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f29486m = false;
        v();
    }

    public final void p(v5 v5Var) {
        ArrayList arrayList = this.f29479c;
        if (arrayList != null) {
            arrayList.remove(v5Var);
        }
        this.f29486m = false;
        v();
    }

    public final void q(long j10) {
        ci.f3 f3Var = this.f29484k;
        if (f3Var != null) {
            if (this.f29481g == 8) {
                j10 = 0;
            }
            f3Var.setCurrentTime(j10);
        }
    }

    public final void r(String str) {
        int i10 = this.f29481g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f29484k != null) {
            return;
        }
        e();
        this.f29483j = true;
        this.f29484k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f29484k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f29485l = f7;
        ci.f3 f3Var = this.f29484k;
        if (f3Var != null) {
            f3Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29490q = colorFilter;
        if (this.f29484k != null && this.e != null) {
            if (c()) {
                this.f29484k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f29489p = colorFilter;
    }

    public final void t(long j10) {
        ci.f3 f3Var = this.f29484k;
        if (f3Var != null) {
            if (this.f29481g == 8) {
                j10 = 0;
            }
            if (f3Var.getLottieAnimation() != null) {
                this.f29484k.getLottieAnimation().V(j10);
            }
            if (this.f29484k.getAnimation() != null) {
                this.f29484k.getAnimation().D(j10);
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
        if (this.f29484k != null) {
            ArrayList arrayList2 = this.f29478b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f29479c) != null && arrayList.size() > 0) || this.f29486m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f29477a) {
                this.f29477a = z10;
                if (z10) {
                    this.f29484k.onAttachedToWindow();
                } else {
                    this.f29484k.onDetachedFromWindow();
                }
                if (!this.f29477a) {
                    ah.j jVar = f29475w;
                    AndroidUtilities.cancelRunOnUIThread(jVar);
                    AndroidUtilities.runOnUIThread(jVar, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f29481g;
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
        int i10 = this.f29481g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.f21569y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.f21569y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.f21569y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.f21383o2.descent()) + Math.abs(org.telegram.ui.ActionBar.k6.f21383o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public p5(int i10, int i11, TLRPC.Document document) {
        this.f29481g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
