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
    public static SparseArray f26626q;
    public static HashMap f26627r;
    public static boolean f26628s;
    public static boolean f26629t;
    public static boolean f26630u;
    public static final ai.f v = new ai.f(23);
    public static HashMap f26631w;
    public boolean f26632a;
    public ArrayList f26633b;
    public ArrayList f26634c;
    public int d;
    public TLRPC.Document e;
    public long f26635f;
    public int f26636g;
    public int h;
    public String f26637i;
    public boolean f26638j;
    public ai.l4 f26639k;
    public boolean f26641m;
    public ColorFilter f26644p;
    public float f26640l = 1.0f;
    public Boolean f26642n = null;
    public Boolean f26643o = null;

    public o5(int i10, int i11, long j3) {
        this.h = i11;
        this.f26636g = i10;
        y();
        this.f26635f = j3;
        h(i11).b(j3, new g5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j3) {
        HashMap hashMap = h(i10).f25565a;
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
        if (f26627r == null) {
            f26627r = new HashMap();
        }
        k5 k5Var = (k5) f26627r.get(Integer.valueOf(i10));
        if (k5Var == null) {
            HashMap hashMap = f26627r;
            Integer valueOf = Integer.valueOf(i10);
            k5 k5Var2 = new k5(i10);
            hashMap.put(valueOf, k5Var2);
            return k5Var2;
        }
        return k5Var;
    }

    public static o5 m(int i10, int i11, TLRPC.Document document) {
        if (f26626q == null) {
            f26626q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f26626q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f26626q;
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
        if (f26626q == null) {
            f26626q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f26626q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f26626q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        o5 o5Var = (o5) longSparseArray.get(j3);
        if (o5Var == null) {
            ?? drawable = new Drawable();
            drawable.f26640l = 1.0f;
            drawable.f26642n = null;
            drawable.f26643o = null;
            drawable.h = i10;
            drawable.f26636g = i11;
            drawable.y();
            drawable.f26635f = j3;
            drawable.f26637i = str;
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
        if (f26630u != z11) {
            f26630u = z11;
            if (f26626q != null && (longSparseArray = (LongSparseArray) f26626q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    o5 o5Var = (o5) longSparseArray.valueAt(i11);
                    if (o5Var != null && (l4Var = o5Var.f26639k) != null) {
                        if (z10) {
                            l4Var.setAllowStartLottieAnimation(true);
                            l4Var.setAllowStartAnimation(true);
                            l4Var.setAutoRepeat(1);
                            b6 animation = l4Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = l4Var.useSharedAnimationQueue;
                                if (!animation.f22600n0) {
                                    animation.f22610v0 = z12;
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
        if (f26626q != null) {
            x();
            for (int i10 = 0; i10 < f26626q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f26626q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    o5 o5Var = (o5) longSparseArray.get(keyAt);
                    if (o5Var != null && o5Var.f26632a) {
                        o5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f26628s = LiteMode.isEnabled(16388);
        f26629t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.k61)) {
            this.f26641m = false;
            if (this.f26633b == null) {
                this.f26633b = new ArrayList(10);
            }
            if (!this.f26633b.contains(view)) {
                this.f26633b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(u5 u5Var) {
        if (this.f26634c == null) {
            this.f26634c = new ArrayList(10);
        }
        this.f26641m = false;
        if (!this.f26634c.contains(u5Var)) {
            this.f26634c.add(u5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f26636g == 19) {
            return true;
        }
        Boolean bool = this.f26642n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.e)) {
            z10 = false;
        }
        this.f26642n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f26634c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f26633b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f26641m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        ai.l4 l4Var = this.f26639k;
        if (l4Var == null) {
            return;
        }
        l4Var.setImageCoords(getBounds());
        this.f26639k.setAlpha(this.f26640l);
        this.f26639k.draw(canvas);
    }

    public final void e() {
        if (this.f26639k == null) {
            ai.l4 l4Var = new ai.l4(this, 4);
            this.f26639k = l4Var;
            l4Var.setCurrentAccount(this.h);
            this.f26639k.setAllowLoadingOnAttachedOnly(true);
            if (this.f26636g == 12) {
                this.f26639k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f26640l * 255.0f);
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
        return this.f26635f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o5.j(boolean):void");
    }

    public final void k() {
        if (this.f26633b != null) {
            for (int i10 = 0; i10 < this.f26633b.size(); i10++) {
                View view = (View) this.f26633b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f26634c != null) {
            for (int i11 = 0; i11 < this.f26634c.size(); i11++) {
                u5 u5Var = (u5) this.f26634c.get(i11);
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
        ArrayList arrayList = this.f26633b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f26641m = false;
        v();
    }

    public final void p(u5 u5Var) {
        ArrayList arrayList = this.f26634c;
        if (arrayList != null) {
            arrayList.remove(u5Var);
        }
        this.f26641m = false;
        v();
    }

    public final void q(long j3) {
        ai.l4 l4Var = this.f26639k;
        if (l4Var != null) {
            if (this.f26636g == 8) {
                j3 = 0;
            }
            l4Var.setCurrentTime(j3);
        }
    }

    public final void r(String str) {
        int i10 = this.f26636g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f26639k != null) {
            return;
        }
        e();
        this.f26638j = true;
        this.f26639k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f26639k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f26640l = f7;
        ai.l4 l4Var = this.f26639k;
        if (l4Var != null) {
            l4Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f26639k != null && this.e != null) {
            if (c()) {
                this.f26639k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f26644p = colorFilter;
    }

    public final void t(long j3) {
        ai.l4 l4Var = this.f26639k;
        if (l4Var != null) {
            if (this.f26636g == 8) {
                j3 = 0;
            }
            if (l4Var.getLottieAnimation() != null) {
                this.f26639k.getLottieAnimation().V(j3);
            }
            if (this.f26639k.getAnimation() != null) {
                this.f26639k.getAnimation().D(j3);
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
        if (this.f26639k != null) {
            ArrayList arrayList2 = this.f26633b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f26634c) != null && arrayList.size() > 0) || this.f26641m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f26632a) {
                this.f26632a = z10;
                if (z10) {
                    this.f26639k.onAttachedToWindow();
                } else {
                    this.f26639k.onDetachedFromWindow();
                }
                if (!this.f26632a) {
                    ai.f fVar = v;
                    AndroidUtilities.cancelRunOnUIThread(fVar);
                    AndroidUtilities.runOnUIThread(fVar, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f26636g;
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
        int i10 = this.f26636g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.f19242y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f19242y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f19242y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f19061o2.descent()) + Math.abs(org.telegram.ui.ActionBar.j6.f19061o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public o5(int i10, int i11, TLRPC.Document document) {
        this.f26636g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
