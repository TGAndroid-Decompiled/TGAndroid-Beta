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
public class o5 extends Drawable {
    public static SparseArray f26623q;
    public static HashMap f26624r;
    public static boolean f26625s;
    public static boolean f26626t;
    public static boolean f26627u;
    public static final ai.f v = new ai.f(23);
    public static HashMap f26628w;
    public boolean f26629a;
    public ArrayList f26630b;
    public ArrayList f26631c;
    public int d;
    public TLRPC.Document e;
    public long f26632f;
    public int f26633g;
    public int h;
    public String f26634i;
    public boolean f26635j;
    public ai.l4 f26636k;
    public boolean f26638m;
    public ColorFilter f26641p;
    public float f26637l = 1.0f;
    public Boolean f26639n = null;
    public Boolean f26640o = null;

    public o5(int i10, int i11, long j3) {
        this.h = i11;
        this.f26633g = i10;
        y();
        this.f26632f = j3;
        h(i11).b(j3, new g5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j3) {
        HashMap hashMap = h(i10).f25562a;
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

    public static k5 h(int i10) {
        if (f26624r == null) {
            f26624r = new HashMap();
        }
        k5 k5Var = (k5) f26624r.get(Integer.valueOf(i10));
        if (k5Var == null) {
            HashMap hashMap = f26624r;
            Integer valueOf = Integer.valueOf(i10);
            k5 k5Var2 = new k5(i10);
            hashMap.put(valueOf, k5Var2);
            return k5Var2;
        }
        return k5Var;
    }

    public static o5 m(int i10, int i11, TLRPC.Document document) {
        if (f26623q == null) {
            f26623q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f26623q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f26623q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        o5 o5Var = (o5) longSparseArray.get(document.f18127id);
        if (o5Var == null) {
            long j3 = document.f18127id;
            o5 o5Var2 = new o5(i11, i10, document);
            longSparseArray.put(j3, o5Var2);
            return o5Var2;
        }
        return o5Var;
    }

    public static o5 n(int i10, long j3, String str, int i11) {
        if (f26623q == null) {
            f26623q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f26623q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f26623q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        o5 o5Var = (o5) longSparseArray.get(j3);
        if (o5Var == null) {
            ?? drawable = new Drawable();
            drawable.f26637l = 1.0f;
            drawable.f26639n = null;
            drawable.f26640o = null;
            drawable.h = i10;
            drawable.f26633g = i11;
            drawable.y();
            drawable.f26632f = j3;
            drawable.f26634i = str;
            h(i10).b(j3, new g5(drawable, 1));
            longSparseArray.put(j3, drawable);
            return drawable;
        }
        return o5Var;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        ai.l4 l4Var;
        boolean z11 = !z10;
        if (f26627u != z11) {
            f26627u = z11;
            if (f26623q != null && (longSparseArray = (LongSparseArray) f26623q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    o5 o5Var = (o5) longSparseArray.valueAt(i11);
                    if (o5Var != null && (l4Var = o5Var.f26636k) != null) {
                        if (z10) {
                            l4Var.setAllowStartLottieAnimation(true);
                            l4Var.setAllowStartAnimation(true);
                            l4Var.setAutoRepeat(1);
                            b6 animation = l4Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = l4Var.useSharedAnimationQueue;
                                if (!animation.f22597n0) {
                                    animation.f22607v0 = z12;
                                }
                                animation.start();
                            } else {
                                yi0 lottieAnimation = l4Var.getLottieAnimation();
                                if (lottieAnimation != null) {
                                    lottieAnimation.start();
                                }
                            }
                        } else {
                            l4Var.setAllowStartAnimation(false);
                            l4Var.setAllowStartLottieAnimation(false);
                            l4Var.setAutoRepeat(0);
                            l4Var.stopAnimation();
                        }
                    }
                }
            }
        }
    }

    public static void u() {
        if (f26623q != null) {
            x();
            for (int i10 = 0; i10 < f26623q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f26623q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    o5 o5Var = (o5) longSparseArray.get(keyAt);
                    if (o5Var != null && o5Var.f26629a) {
                        o5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f26625s = LiteMode.isEnabled(16388);
        f26626t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.k61)) {
            this.f26638m = false;
            if (this.f26630b == null) {
                this.f26630b = new ArrayList(10);
            }
            if (!this.f26630b.contains(view)) {
                this.f26630b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(u5 u5Var) {
        if (this.f26631c == null) {
            this.f26631c = new ArrayList(10);
        }
        this.f26638m = false;
        if (!this.f26631c.contains(u5Var)) {
            this.f26631c.add(u5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f26633g == 19) {
            return true;
        }
        Boolean bool = this.f26639n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.e)) {
            z10 = false;
        }
        this.f26639n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f26631c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f26630b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f26638m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        ai.l4 l4Var = this.f26636k;
        if (l4Var == null) {
            return;
        }
        l4Var.setImageCoords(getBounds());
        this.f26636k.setAlpha(this.f26637l);
        this.f26636k.draw(canvas);
    }

    public final void e() {
        if (this.f26636k == null) {
            ai.l4 l4Var = new ai.l4(this, 4);
            this.f26636k = l4Var;
            l4Var.setCurrentAccount(this.h);
            this.f26636k.setAllowLoadingOnAttachedOnly(true);
            if (this.f26633g == 12) {
                this.f26636k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f26637l * 255.0f);
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
            return document.f18127id;
        }
        return this.f26632f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o5.j(boolean):void");
    }

    public final void k() {
        if (this.f26630b != null) {
            for (int i10 = 0; i10 < this.f26630b.size(); i10++) {
                View view = (View) this.f26630b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f26631c != null) {
            for (int i11 = 0; i11 < this.f26631c.size(); i11++) {
                u5 u5Var = (u5) this.f26631c.get(i11);
                if (u5Var != null) {
                    u5Var.invalidate();
                }
            }
        }
    }

    public final boolean l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o5.l():boolean");
    }

    public final void o(View view) {
        ArrayList arrayList = this.f26630b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f26638m = false;
        v();
    }

    public final void p(u5 u5Var) {
        ArrayList arrayList = this.f26631c;
        if (arrayList != null) {
            arrayList.remove(u5Var);
        }
        this.f26638m = false;
        v();
    }

    public final void q(long j3) {
        ai.l4 l4Var = this.f26636k;
        if (l4Var != null) {
            if (this.f26633g == 8) {
                j3 = 0;
            }
            l4Var.setCurrentTime(j3);
        }
    }

    public final void r(String str) {
        int i10 = this.f26633g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f26636k != null) {
            return;
        }
        e();
        this.f26635j = true;
        this.f26636k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f26636k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f26637l = f7;
        ai.l4 l4Var = this.f26636k;
        if (l4Var != null) {
            l4Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f26636k != null && this.e != null) {
            if (c()) {
                this.f26636k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f26641p = colorFilter;
    }

    public final void t(long j3) {
        ai.l4 l4Var = this.f26636k;
        if (l4Var != null) {
            if (this.f26633g == 8) {
                j3 = 0;
            }
            if (l4Var.getLottieAnimation() != null) {
                this.f26636k.getLottieAnimation().U(j3);
            }
            if (this.f26636k.getAnimation() != null) {
                this.f26636k.getAnimation().D(j3);
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
        if (this.f26636k != null) {
            ArrayList arrayList2 = this.f26630b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f26631c) != null && arrayList.size() > 0) || this.f26638m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f26629a) {
                this.f26629a = z10;
                if (z10) {
                    this.f26636k.onAttachedToWindow();
                } else {
                    this.f26636k.onDetachedFromWindow();
                }
                if (!this.f26629a) {
                    ai.f fVar = v;
                    AndroidUtilities.cancelRunOnUIThread(fVar);
                    AndroidUtilities.runOnUIThread(fVar, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f26633g;
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
        int i10 = this.f26633g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.f19241y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f19241y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f19241y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f19060o2.descent()) + Math.abs(org.telegram.ui.ActionBar.j6.f19060o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public o5(int i10, int i11, TLRPC.Document document) {
        this.f26633g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
