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
public class s5 extends Drawable {
    public static SparseArray f28726q;
    public static HashMap f28727r;
    public static boolean f28728s;
    public static boolean f28729t;
    public static boolean f28730u;
    public static final ah.j v = new ah.j(24);
    public static HashMap f28731w;
    public boolean f28732a;
    public ArrayList f28733b;
    public ArrayList f28734c;
    public int d;
    public TLRPC.Document e;
    public long f28735f;
    public int f28736g;
    public int h;
    public String f28737i;
    public boolean f28738j;
    public bi.b4 f28739k;
    public boolean f28741m;
    public ColorFilter f28744p;
    public float f28740l = 1.0f;
    public Boolean f28742n = null;
    public Boolean f28743o = null;

    public s5(int i10, int i11, long j10) {
        this.h = i11;
        this.f28736g = i10;
        y();
        this.f28735f = j10;
        h(i11).b(j10, new k5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j10) {
        HashMap hashMap = h(i10).f27540a;
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

    public static o5 h(int i10) {
        if (f28727r == null) {
            f28727r = new HashMap();
        }
        o5 o5Var = (o5) f28727r.get(Integer.valueOf(i10));
        if (o5Var == null) {
            HashMap hashMap = f28727r;
            Integer valueOf = Integer.valueOf(i10);
            o5 o5Var2 = new o5(i10);
            hashMap.put(valueOf, o5Var2);
            return o5Var2;
        }
        return o5Var;
    }

    public static s5 m(int i10, int i11, TLRPC.Document document) {
        if (f28726q == null) {
            f28726q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f28726q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f28726q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        s5 s5Var = (s5) longSparseArray.get(document.f18922id);
        if (s5Var == null) {
            long j10 = document.f18922id;
            s5 s5Var2 = new s5(i11, i10, document);
            longSparseArray.put(j10, s5Var2);
            return s5Var2;
        }
        return s5Var;
    }

    public static s5 n(int i10, long j10, String str, int i11) {
        if (f28726q == null) {
            f28726q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f28726q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f28726q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        s5 s5Var = (s5) longSparseArray.get(j10);
        if (s5Var == null) {
            ?? drawable = new Drawable();
            drawable.f28740l = 1.0f;
            drawable.f28742n = null;
            drawable.f28743o = null;
            drawable.h = i10;
            drawable.f28736g = i11;
            drawable.y();
            drawable.f28735f = j10;
            drawable.f28737i = str;
            h(i10).b(j10, new k5(drawable, 1));
            longSparseArray.put(j10, drawable);
            return drawable;
        }
        return s5Var;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        bi.b4 b4Var;
        boolean z11 = !z10;
        if (f28730u != z11) {
            f28730u = z11;
            if (f28726q != null && (longSparseArray = (LongSparseArray) f28726q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    s5 s5Var = (s5) longSparseArray.valueAt(i11);
                    if (s5Var != null && (b4Var = s5Var.f28739k) != null) {
                        if (z10) {
                            b4Var.setAllowStartLottieAnimation(true);
                            b4Var.setAllowStartAnimation(true);
                            b4Var.setAutoRepeat(1);
                            f6 animation = b4Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = b4Var.useSharedAnimationQueue;
                                if (!animation.f24619n0) {
                                    animation.f24629v0 = z12;
                                }
                                animation.start();
                            } else {
                                yj0 lottieAnimation = b4Var.getLottieAnimation();
                                if (lottieAnimation != null) {
                                    lottieAnimation.start();
                                }
                            }
                        } else {
                            b4Var.setAllowStartAnimation(false);
                            b4Var.setAllowStartLottieAnimation(false);
                            b4Var.setAutoRepeat(0);
                            b4Var.stopAnimation();
                        }
                    }
                }
            }
        }
    }

    public static void u() {
        if (f28726q != null) {
            x();
            for (int i10 = 0; i10 < f28726q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f28726q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    s5 s5Var = (s5) longSparseArray.get(keyAt);
                    if (s5Var != null && s5Var.f28732a) {
                        s5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f28728s = LiteMode.isEnabled(16388);
        f28729t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.t61)) {
            this.f28741m = false;
            if (this.f28733b == null) {
                this.f28733b = new ArrayList(10);
            }
            if (!this.f28733b.contains(view)) {
                this.f28733b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(y5 y5Var) {
        if (this.f28734c == null) {
            this.f28734c = new ArrayList(10);
        }
        this.f28741m = false;
        if (!this.f28734c.contains(y5Var)) {
            this.f28734c.add(y5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f28736g == 19) {
            return true;
        }
        Boolean bool = this.f28742n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.e)) {
            z10 = false;
        }
        this.f28742n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f28734c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f28733b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f28741m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        bi.b4 b4Var = this.f28739k;
        if (b4Var == null) {
            return;
        }
        b4Var.setImageCoords(getBounds());
        this.f28739k.setAlpha(this.f28740l);
        this.f28739k.draw(canvas);
    }

    public final void e() {
        if (this.f28739k == null) {
            bi.b4 b4Var = new bi.b4(this, 4);
            this.f28739k = b4Var;
            b4Var.setCurrentAccount(this.h);
            this.f28739k.setAllowLoadingOnAttachedOnly(true);
            if (this.f28736g == 12) {
                this.f28739k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f28740l * 255.0f);
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
            return document.f18922id;
        }
        return this.f28735f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s5.j(boolean):void");
    }

    public final void k() {
        if (this.f28733b != null) {
            for (int i10 = 0; i10 < this.f28733b.size(); i10++) {
                View view = (View) this.f28733b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f28734c != null) {
            for (int i11 = 0; i11 < this.f28734c.size(); i11++) {
                y5 y5Var = (y5) this.f28734c.get(i11);
                if (y5Var != null) {
                    y5Var.invalidate();
                }
            }
        }
    }

    public final boolean l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s5.l():boolean");
    }

    public final void o(View view) {
        ArrayList arrayList = this.f28733b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f28741m = false;
        v();
    }

    public final void p(y5 y5Var) {
        ArrayList arrayList = this.f28734c;
        if (arrayList != null) {
            arrayList.remove(y5Var);
        }
        this.f28741m = false;
        v();
    }

    public final void q(long j10) {
        bi.b4 b4Var = this.f28739k;
        if (b4Var != null) {
            if (this.f28736g == 8) {
                j10 = 0;
            }
            b4Var.setCurrentTime(j10);
        }
    }

    public final void r(String str) {
        int i10 = this.f28736g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f28739k != null) {
            return;
        }
        e();
        this.f28738j = true;
        this.f28739k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f28739k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f28740l = f7;
        bi.b4 b4Var = this.f28739k;
        if (b4Var != null) {
            b4Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f28739k != null && this.e != null) {
            if (c()) {
                this.f28739k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f28744p = colorFilter;
    }

    public final void t(long j10) {
        bi.b4 b4Var = this.f28739k;
        if (b4Var != null) {
            if (this.f28736g == 8) {
                j10 = 0;
            }
            if (b4Var.getLottieAnimation() != null) {
                this.f28739k.getLottieAnimation().V(j10);
            }
            if (this.f28739k.getAnimation() != null) {
                this.f28739k.getAnimation().D(j10);
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
        if (this.f28739k != null) {
            ArrayList arrayList2 = this.f28733b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f28734c) != null && arrayList.size() > 0) || this.f28741m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f28732a) {
                this.f28732a = z10;
                if (z10) {
                    this.f28739k.onAttachedToWindow();
                } else {
                    this.f28739k.onDetachedFromWindow();
                }
                if (!this.f28732a) {
                    ah.j jVar = v;
                    AndroidUtilities.cancelRunOnUIThread(jVar);
                    AndroidUtilities.runOnUIThread(jVar, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f28736g;
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
        int i10 = this.f28736g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.f19985y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.g6.f19985y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.g6.f19985y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.g6.f19800o2.descent()) + Math.abs(org.telegram.ui.ActionBar.g6.f19800o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public s5(int i10, int i11, TLRPC.Document document) {
        this.f28736g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
