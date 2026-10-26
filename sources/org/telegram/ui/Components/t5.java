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
public class t5 extends Drawable {
    public static SparseArray f32839r;
    public static HashMap f32840s;
    public static boolean f32841t;
    public static boolean f32842u;
    public static boolean v;
    public static final k5 f32843w = new k5(0);
    public static HashMap f32844x;
    public boolean f32845a;
    public ArrayList f32846b;
    public ArrayList f32847c;
    public int d;
    public TLRPC.Document e;
    public long f32848f;
    public int f32849g;
    public int h;
    public String f32850i;
    public boolean f32851j;
    public di.f3 f32852k;
    public boolean f32854m;
    public ColorFilter f32857p;
    public ColorFilter f32858q;
    public float f32853l = 1.0f;
    public Boolean f32855n = null;
    public Boolean f32856o = null;

    public t5(int i10, int i11, long j10) {
        this.h = i11;
        this.f32849g = i10;
        y();
        this.f32848f = j10;
        h(i11).b(j10, new l5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j10) {
        HashMap hashMap = h(i10).f31446a;
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

    public static p5 h(int i10) {
        if (f32840s == null) {
            f32840s = new HashMap();
        }
        p5 p5Var = (p5) f32840s.get(Integer.valueOf(i10));
        if (p5Var == null) {
            HashMap hashMap = f32840s;
            Integer valueOf = Integer.valueOf(i10);
            p5 p5Var2 = new p5(i10);
            hashMap.put(valueOf, p5Var2);
            return p5Var2;
        }
        return p5Var;
    }

    public static t5 m(int i10, int i11, TLRPC.Document document) {
        if (f32839r == null) {
            f32839r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f32839r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f32839r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        t5 t5Var = (t5) longSparseArray.get(document.f22033id);
        if (t5Var == null) {
            long j10 = document.f22033id;
            t5 t5Var2 = new t5(i11, i10, document);
            longSparseArray.put(j10, t5Var2);
            return t5Var2;
        }
        return t5Var;
    }

    public static t5 n(int i10, long j10, String str, int i11) {
        if (f32839r == null) {
            f32839r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f32839r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f32839r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        t5 t5Var = (t5) longSparseArray.get(j10);
        if (t5Var == null) {
            ?? drawable = new Drawable();
            drawable.f32853l = 1.0f;
            drawable.f32855n = null;
            drawable.f32856o = null;
            drawable.h = i10;
            drawable.f32849g = i11;
            drawable.y();
            drawable.f32848f = j10;
            drawable.f32850i = str;
            h(i10).b(j10, new l5(drawable, 1));
            longSparseArray.put(j10, drawable);
            return drawable;
        }
        return t5Var;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        di.f3 f3Var;
        boolean z11 = !z10;
        if (v != z11) {
            v = z11;
            if (f32839r != null && (longSparseArray = (LongSparseArray) f32839r.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    t5 t5Var = (t5) longSparseArray.valueAt(i11);
                    if (t5Var != null && (f3Var = t5Var.f32852k) != null) {
                        if (z10) {
                            f3Var.setAllowStartLottieAnimation(true);
                            f3Var.setAllowStartAnimation(true);
                            f3Var.setAutoRepeat(1);
                            g6 animation = f3Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = f3Var.useSharedAnimationQueue;
                                if (!animation.f28451n0) {
                                    animation.f28461v0 = z12;
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
        if (f32839r != null) {
            x();
            for (int i10 = 0; i10 < f32839r.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f32839r.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    t5 t5Var = (t5) longSparseArray.get(keyAt);
                    if (t5Var != null && t5Var.f32845a) {
                        t5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f32841t = LiteMode.isEnabled(16388);
        f32842u = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.e51)) {
            this.f32854m = false;
            if (this.f32846b == null) {
                this.f32846b = new ArrayList(10);
            }
            if (!this.f32846b.contains(view)) {
                this.f32846b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(z5 z5Var) {
        if (this.f32847c == null) {
            this.f32847c = new ArrayList(10);
        }
        this.f32854m = false;
        if (!this.f32847c.contains(z5Var)) {
            this.f32847c.add(z5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f32849g == 19) {
            return true;
        }
        Boolean bool = this.f32855n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.e)) {
            z10 = false;
        }
        this.f32855n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f32847c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f32846b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f32854m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        di.f3 f3Var = this.f32852k;
        if (f3Var == null) {
            return;
        }
        f3Var.setImageCoords(getBounds());
        this.f32852k.setAlpha(this.f32853l);
        this.f32852k.draw(canvas);
    }

    public final void e() {
        if (this.f32852k == null) {
            di.f3 f3Var = new di.f3(this, 4);
            this.f32852k = f3Var;
            f3Var.setCurrentAccount(this.h);
            this.f32852k.setAllowLoadingOnAttachedOnly(true);
            if (this.f32849g == 12) {
                this.f32852k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f32853l * 255.0f);
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.f32858q;
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
            return document.f22033id;
        }
        return this.f32848f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t5.j(boolean):void");
    }

    public final void k() {
        if (this.f32846b != null) {
            for (int i10 = 0; i10 < this.f32846b.size(); i10++) {
                View view = (View) this.f32846b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f32847c != null) {
            for (int i11 = 0; i11 < this.f32847c.size(); i11++) {
                z5 z5Var = (z5) this.f32847c.get(i11);
                if (z5Var != null) {
                    z5Var.invalidate();
                }
            }
        }
    }

    public final boolean l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t5.l():boolean");
    }

    public final void o(View view) {
        ArrayList arrayList = this.f32846b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f32854m = false;
        v();
    }

    public final void p(z5 z5Var) {
        ArrayList arrayList = this.f32847c;
        if (arrayList != null) {
            arrayList.remove(z5Var);
        }
        this.f32854m = false;
        v();
    }

    public final void q(long j10) {
        di.f3 f3Var = this.f32852k;
        if (f3Var != null) {
            if (this.f32849g == 8) {
                j10 = 0;
            }
            f3Var.setCurrentTime(j10);
        }
    }

    public final void r(String str) {
        int i10 = this.f32849g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f32852k != null) {
            return;
        }
        e();
        this.f32851j = true;
        this.f32852k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f32852k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f32853l = f7;
        di.f3 f3Var = this.f32852k;
        if (f3Var != null) {
            f3Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32858q = colorFilter;
        if (this.f32852k != null && this.e != null) {
            if (c()) {
                this.f32852k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f32857p = colorFilter;
    }

    public final void t(long j10) {
        di.f3 f3Var = this.f32852k;
        if (f3Var != null) {
            if (this.f32849g == 8) {
                j10 = 0;
            }
            if (f3Var.getLottieAnimation() != null) {
                this.f32852k.getLottieAnimation().V(j10);
            }
            if (this.f32852k.getAnimation() != null) {
                this.f32852k.getAnimation().D(j10);
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
        if (this.f32852k != null) {
            ArrayList arrayList2 = this.f32846b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f32847c) != null && arrayList.size() > 0) || this.f32854m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f32845a) {
                this.f32845a = z10;
                if (z10) {
                    this.f32852k.onAttachedToWindow();
                } else {
                    this.f32852k.onDetachedFromWindow();
                }
                if (!this.f32845a) {
                    k5 k5Var = f32843w;
                    AndroidUtilities.cancelRunOnUIThread(k5Var);
                    AndroidUtilities.runOnUIThread(k5Var, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f32849g;
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
        int i10 = this.f32849g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.y6.f23745y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.y6.f23745y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.y6.f23745y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.y6.f23556o2.descent()) + Math.abs(org.telegram.ui.ActionBar.y6.f23556o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public t5(int i10, int i11, TLRPC.Document document) {
        this.f32849g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
