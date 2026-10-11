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
    public static SparseArray f30725q;
    public static HashMap f30726r;
    public static boolean f30727s;
    public static boolean f30728t;
    public static boolean f30729u;
    public static final ai.f v = new ai.f(23);
    public static HashMap f30730w;
    public boolean f30731a;
    public ArrayList f30732b;
    public ArrayList f30733c;
    public int d;
    public TLRPC.Document f30734e;
    public long f30735f;
    public int f30736g;
    public int h;
    public String f30737i;
    public boolean f30738j;
    public ai.m4 f30739k;
    public boolean f30741m;
    public ColorFilter f30744p;
    public float f30740l = 1.0f;
    public Boolean f30742n = null;
    public Boolean f30743o = null;

    public s5(int i10, int i11, long j3) {
        this.h = i11;
        this.f30736g = i10;
        y();
        this.f30735f = j3;
        h(i11).b(j3, new k5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j3) {
        HashMap hashMap = h(i10).f29384a;
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
        if (f30726r == null) {
            f30726r = new HashMap();
        }
        o5 o5Var = (o5) f30726r.get(Integer.valueOf(i10));
        if (o5Var == null) {
            HashMap hashMap = f30726r;
            Integer valueOf = Integer.valueOf(i10);
            o5 o5Var2 = new o5(i10);
            hashMap.put(valueOf, o5Var2);
            return o5Var2;
        }
        return o5Var;
    }

    public static s5 m(int i10, int i11, TLRPC.Document document) {
        if (f30725q == null) {
            f30725q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f30725q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f30725q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        s5 s5Var = (s5) longSparseArray.get(document.f20074id);
        if (s5Var == null) {
            long j3 = document.f20074id;
            s5 s5Var2 = new s5(i11, i10, document);
            longSparseArray.put(j3, s5Var2);
            return s5Var2;
        }
        return s5Var;
    }

    public static s5 n(int i10, long j3, String str, int i11) {
        if (f30725q == null) {
            f30725q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f30725q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f30725q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        s5 s5Var = (s5) longSparseArray.get(j3);
        if (s5Var == null) {
            ?? drawable = new Drawable();
            drawable.f30740l = 1.0f;
            drawable.f30742n = null;
            drawable.f30743o = null;
            drawable.h = i10;
            drawable.f30736g = i11;
            drawable.y();
            drawable.f30735f = j3;
            drawable.f30737i = str;
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
        if (f30729u != z11) {
            f30729u = z11;
            if (f30725q != null && (longSparseArray = (LongSparseArray) f30725q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    s5 s5Var = (s5) longSparseArray.valueAt(i11);
                    if (s5Var != null && (m4Var = s5Var.f30739k) != null) {
                        if (z10) {
                            m4Var.setAllowStartLottieAnimation(true);
                            m4Var.setAllowStartAnimation(true);
                            m4Var.setAutoRepeat(1);
                            f6 animation = m4Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = m4Var.useSharedAnimationQueue;
                                if (!animation.f26339n0) {
                                    animation.f26349v0 = z12;
                                }
                                animation.start();
                            } else {
                                dk0 lottieAnimation = m4Var.getLottieAnimation();
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
        if (f30725q != null) {
            x();
            for (int i10 = 0; i10 < f30725q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f30725q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    s5 s5Var = (s5) longSparseArray.get(keyAt);
                    if (s5Var != null && s5Var.f30731a) {
                        s5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f30727s = LiteMode.isEnabled(16388);
        f30728t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.l61)) {
            this.f30741m = false;
            if (this.f30732b == null) {
                this.f30732b = new ArrayList(10);
            }
            if (!this.f30732b.contains(view)) {
                this.f30732b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(y5 y5Var) {
        if (this.f30733c == null) {
            this.f30733c = new ArrayList(10);
        }
        this.f30741m = false;
        if (!this.f30733c.contains(y5Var)) {
            this.f30733c.add(y5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f30736g == 19) {
            return true;
        }
        Boolean bool = this.f30742n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f30734e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.f30734e)) {
            z10 = false;
        }
        this.f30742n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f30733c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f30732b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f30741m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        ai.m4 m4Var = this.f30739k;
        if (m4Var == null) {
            return;
        }
        m4Var.setImageCoords(getBounds());
        this.f30739k.setAlpha(this.f30740l);
        this.f30739k.draw(canvas);
    }

    public final void e() {
        if (this.f30739k == null) {
            ai.m4 m4Var = new ai.m4(this, 4);
            this.f30739k = m4Var;
            m4Var.setCurrentAccount(this.h);
            this.f30739k.setAllowLoadingOnAttachedOnly(true);
            if (this.f30736g == 12) {
                this.f30739k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f30740l * 255.0f);
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
        TLRPC.Document document = this.f30734e;
        if (document != null) {
            return document.f20074id;
        }
        return this.f30735f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s5.j(boolean):void");
    }

    public final void k() {
        if (this.f30732b != null) {
            for (int i10 = 0; i10 < this.f30732b.size(); i10++) {
                View view = (View) this.f30732b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f30733c != null) {
            for (int i11 = 0; i11 < this.f30733c.size(); i11++) {
                y5 y5Var = (y5) this.f30733c.get(i11);
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
        ArrayList arrayList = this.f30732b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f30741m = false;
        v();
    }

    public final void p(y5 y5Var) {
        ArrayList arrayList = this.f30733c;
        if (arrayList != null) {
            arrayList.remove(y5Var);
        }
        this.f30741m = false;
        v();
    }

    public final void q(long j3) {
        ai.m4 m4Var = this.f30739k;
        if (m4Var != null) {
            if (this.f30736g == 8) {
                j3 = 0;
            }
            m4Var.setCurrentTime(j3);
        }
    }

    public final void r(String str) {
        int i10 = this.f30736g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f30739k != null) {
            return;
        }
        e();
        this.f30738j = true;
        this.f30739k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f30739k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f30740l = f7;
        ai.m4 m4Var = this.f30739k;
        if (m4Var != null) {
            m4Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f30739k != null && this.f30734e != null) {
            if (c()) {
                this.f30739k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f30744p = colorFilter;
    }

    public final void t(long j3) {
        ai.m4 m4Var = this.f30739k;
        if (m4Var != null) {
            if (this.f30736g == 8) {
                j3 = 0;
            }
            if (m4Var.getLottieAnimation() != null) {
                this.f30739k.getLottieAnimation().V(j3);
            }
            if (this.f30739k.getAnimation() != null) {
                this.f30739k.getAnimation().D(j3);
            }
        }
    }

    public final String toString() {
        String findAnimatedEmojiEmoticon;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f30734e;
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
        if (this.f30739k != null) {
            ArrayList arrayList2 = this.f30732b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f30733c) != null && arrayList.size() > 0) || this.f30741m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f30731a) {
                this.f30731a = z10;
                if (z10) {
                    this.f30739k.onAttachedToWindow();
                } else {
                    this.f30739k.onDetachedFromWindow();
                }
                if (!this.f30731a) {
                    ai.f fVar = v;
                    AndroidUtilities.cancelRunOnUIThread(fVar);
                    AndroidUtilities.runOnUIThread(fVar, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f30736g;
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
        int i10 = this.f30736g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.f21204y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.h6.f21204y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.h6.f21204y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.h6.f21021o2.descent()) + Math.abs(org.telegram.ui.ActionBar.h6.f21021o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public s5(int i10, int i11, TLRPC.Document document) {
        this.f30736g = i10;
        this.h = i11;
        this.f30734e = document;
        y();
        x();
        j(false);
    }
}
