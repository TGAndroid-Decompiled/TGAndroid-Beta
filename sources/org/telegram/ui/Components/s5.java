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
    public static SparseArray f30640q;
    public static HashMap f30641r;
    public static boolean f30642s;
    public static boolean f30643t;
    public static boolean f30644u;
    public static final ai.f v = new ai.f(23);
    public static HashMap f30645w;
    public boolean f30646a;
    public ArrayList f30647b;
    public ArrayList f30648c;
    public int d;
    public TLRPC.Document f30649e;
    public long f30650f;
    public int f30651g;
    public int h;
    public String f30652i;
    public boolean f30653j;
    public ai.m4 f30654k;
    public boolean f30656m;
    public ColorFilter f30659p;
    public float f30655l = 1.0f;
    public Boolean f30657n = null;
    public Boolean f30658o = null;

    public s5(int i10, int i11, long j3) {
        this.h = i11;
        this.f30651g = i10;
        y();
        this.f30650f = j3;
        h(i11).b(j3, new k5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j3) {
        HashMap hashMap = h(i10).f29386a;
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

    public static o5 h(int i10) {
        if (f30641r == null) {
            f30641r = new HashMap();
        }
        o5 o5Var = (o5) f30641r.get(Integer.valueOf(i10));
        if (o5Var == null) {
            HashMap hashMap = f30641r;
            Integer valueOf = Integer.valueOf(i10);
            o5 o5Var2 = new o5(i10);
            hashMap.put(valueOf, o5Var2);
            return o5Var2;
        }
        return o5Var;
    }

    public static s5 m(int i10, int i11, TLRPC.Document document) {
        if (f30640q == null) {
            f30640q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f30640q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f30640q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        s5 s5Var = (s5) longSparseArray.get(document.f20044id);
        if (s5Var == null) {
            long j3 = document.f20044id;
            s5 s5Var2 = new s5(i11, i10, document);
            longSparseArray.put(j3, s5Var2);
            return s5Var2;
        }
        return s5Var;
    }

    public static s5 n(int i10, long j3, String str, int i11) {
        if (f30640q == null) {
            f30640q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f30640q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f30640q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        s5 s5Var = (s5) longSparseArray.get(j3);
        if (s5Var == null) {
            ?? drawable = new Drawable();
            drawable.f30655l = 1.0f;
            drawable.f30657n = null;
            drawable.f30658o = null;
            drawable.h = i10;
            drawable.f30651g = i11;
            drawable.y();
            drawable.f30650f = j3;
            drawable.f30652i = str;
            h(i10).b(j3, new k5(drawable, 1));
            longSparseArray.put(j3, drawable);
            return drawable;
        }
        return s5Var;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        ai.m4 m4Var;
        boolean z11 = !z10;
        if (f30644u != z11) {
            f30644u = z11;
            if (f30640q != null && (longSparseArray = (LongSparseArray) f30640q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    s5 s5Var = (s5) longSparseArray.valueAt(i11);
                    if (s5Var != null && (m4Var = s5Var.f30654k) != null) {
                        if (z10) {
                            m4Var.setAllowStartLottieAnimation(true);
                            m4Var.setAllowStartAnimation(true);
                            m4Var.setAutoRepeat(1);
                            f6 animation = m4Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = m4Var.useSharedAnimationQueue;
                                if (!animation.f26265n0) {
                                    animation.f26275v0 = z12;
                                }
                                animation.start();
                            } else {
                                ck0 lottieAnimation = m4Var.getLottieAnimation();
                                if (lottieAnimation != null) {
                                    lottieAnimation.start();
                                }
                            }
                        } else {
                            m4Var.setAllowStartAnimation(false);
                            m4Var.setAllowStartLottieAnimation(false);
                            m4Var.setAutoRepeat(0);
                            m4Var.stopAnimation();
                        }
                    }
                }
            }
        }
    }

    public static void u() {
        if (f30640q != null) {
            x();
            for (int i10 = 0; i10 < f30640q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f30640q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    s5 s5Var = (s5) longSparseArray.get(keyAt);
                    if (s5Var != null && s5Var.f30646a) {
                        s5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f30642s = LiteMode.isEnabled(16388);
        f30643t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.m61)) {
            this.f30656m = false;
            if (this.f30647b == null) {
                this.f30647b = new ArrayList(10);
            }
            if (!this.f30647b.contains(view)) {
                this.f30647b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(y5 y5Var) {
        if (this.f30648c == null) {
            this.f30648c = new ArrayList(10);
        }
        this.f30656m = false;
        if (!this.f30648c.contains(y5Var)) {
            this.f30648c.add(y5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f30651g == 19) {
            return true;
        }
        Boolean bool = this.f30657n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f30649e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.f30649e)) {
            z10 = false;
        }
        this.f30657n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f30648c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f30647b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f30656m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        ai.m4 m4Var = this.f30654k;
        if (m4Var == null) {
            return;
        }
        m4Var.setImageCoords(getBounds());
        this.f30654k.setAlpha(this.f30655l);
        this.f30654k.draw(canvas);
    }

    public final void e() {
        if (this.f30654k == null) {
            ai.m4 m4Var = new ai.m4(this, 4);
            this.f30654k = m4Var;
            m4Var.setCurrentAccount(this.h);
            this.f30654k.setAllowLoadingOnAttachedOnly(true);
            if (this.f30651g == 12) {
                this.f30654k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f30655l * 255.0f);
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
        TLRPC.Document document = this.f30649e;
        if (document != null) {
            return document.f20044id;
        }
        return this.f30650f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s5.j(boolean):void");
    }

    public final void k() {
        if (this.f30647b != null) {
            for (int i10 = 0; i10 < this.f30647b.size(); i10++) {
                View view = (View) this.f30647b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f30648c != null) {
            for (int i11 = 0; i11 < this.f30648c.size(); i11++) {
                y5 y5Var = (y5) this.f30648c.get(i11);
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
        ArrayList arrayList = this.f30647b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f30656m = false;
        v();
    }

    public final void p(y5 y5Var) {
        ArrayList arrayList = this.f30648c;
        if (arrayList != null) {
            arrayList.remove(y5Var);
        }
        this.f30656m = false;
        v();
    }

    public final void q(long j3) {
        ai.m4 m4Var = this.f30654k;
        if (m4Var != null) {
            if (this.f30651g == 8) {
                j3 = 0;
            }
            m4Var.setCurrentTime(j3);
        }
    }

    public final void r(String str) {
        int i10 = this.f30651g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f30654k != null) {
            return;
        }
        e();
        this.f30653j = true;
        this.f30654k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f30654k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f30655l = f7;
        ai.m4 m4Var = this.f30654k;
        if (m4Var != null) {
            m4Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f30654k != null && this.f30649e != null) {
            if (c()) {
                this.f30654k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f30659p = colorFilter;
    }

    public final void t(long j3) {
        ai.m4 m4Var = this.f30654k;
        if (m4Var != null) {
            if (this.f30651g == 8) {
                j3 = 0;
            }
            if (m4Var.getLottieAnimation() != null) {
                this.f30654k.getLottieAnimation().V(j3);
            }
            if (this.f30654k.getAnimation() != null) {
                this.f30654k.getAnimation().D(j3);
            }
        }
    }

    public final String toString() {
        String findAnimatedEmojiEmoticon;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f30649e;
        if (document == null) {
            findAnimatedEmojiEmoticon = "null";
        } else {
            findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null);
        }
        return a1.g.t(sb2, findAnimatedEmojiEmoticon, "}");
    }

    public final void v() {
        ArrayList arrayList;
        boolean z10;
        if (this.f30654k != null) {
            ArrayList arrayList2 = this.f30647b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f30648c) != null && arrayList.size() > 0) || this.f30656m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f30646a) {
                this.f30646a = z10;
                if (z10) {
                    this.f30654k.onAttachedToWindow();
                } else {
                    this.f30654k.onDetachedFromWindow();
                }
                if (!this.f30646a) {
                    ai.f fVar = v;
                    AndroidUtilities.cancelRunOnUIThread(fVar);
                    AndroidUtilities.runOnUIThread(fVar, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f30651g;
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
        int i10 = this.f30651g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.i6.f21178y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.i6.f21178y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.i6.f21178y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.i6.f20996o2.descent()) + Math.abs(org.telegram.ui.ActionBar.i6.f20996o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public s5(int i10, int i11, TLRPC.Document document) {
        this.f30651g = i10;
        this.h = i11;
        this.f30649e = document;
        y();
        x();
        j(false);
    }
}
