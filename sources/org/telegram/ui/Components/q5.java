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
public class q5 extends Drawable {
    public static SparseArray f27448q;
    public static HashMap f27449r;
    public static boolean f27450s;
    public static boolean f27451t;
    public static boolean f27452u;
    public static final ai.f v = new ai.f(23);
    public static HashMap f27453w;
    public boolean f27454a;
    public ArrayList f27455b;
    public ArrayList f27456c;
    public int d;
    public TLRPC.Document e;
    public long f27457f;
    public int f27458g;
    public int h;
    public String f27459i;
    public boolean f27460j;
    public ai.l4 f27461k;
    public boolean f27463m;
    public ColorFilter f27466p;
    public float f27462l = 1.0f;
    public Boolean f27464n = null;
    public Boolean f27465o = null;

    public q5(int i10, int i11, long j3) {
        this.h = i11;
        this.f27458g = i10;
        y();
        this.f27457f = j3;
        h(i11).b(j3, new i5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j3) {
        HashMap hashMap = h(i10).f26328a;
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

    public static m5 h(int i10) {
        if (f27449r == null) {
            f27449r = new HashMap();
        }
        m5 m5Var = (m5) f27449r.get(Integer.valueOf(i10));
        if (m5Var == null) {
            HashMap hashMap = f27449r;
            Integer valueOf = Integer.valueOf(i10);
            m5 m5Var2 = new m5(i10);
            hashMap.put(valueOf, m5Var2);
            return m5Var2;
        }
        return m5Var;
    }

    public static q5 m(int i10, int i11, TLRPC.Document document) {
        if (f27448q == null) {
            f27448q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f27448q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f27448q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        q5 q5Var = (q5) longSparseArray.get(document.f18302id);
        if (q5Var == null) {
            long j3 = document.f18302id;
            q5 q5Var2 = new q5(i11, i10, document);
            longSparseArray.put(j3, q5Var2);
            return q5Var2;
        }
        return q5Var;
    }

    public static q5 n(int i10, long j3, String str, int i11) {
        if (f27448q == null) {
            f27448q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f27448q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f27448q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        q5 q5Var = (q5) longSparseArray.get(j3);
        if (q5Var == null) {
            ?? drawable = new Drawable();
            drawable.f27462l = 1.0f;
            drawable.f27464n = null;
            drawable.f27465o = null;
            drawable.h = i10;
            drawable.f27458g = i11;
            drawable.y();
            drawable.f27457f = j3;
            drawable.f27459i = str;
            h(i10).b(j3, new i5(drawable, 1));
            longSparseArray.put(j3, drawable);
            return drawable;
        }
        return q5Var;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        ai.l4 l4Var;
        boolean z11 = !z10;
        if (f27452u != z11) {
            f27452u = z11;
            if (f27448q != null && (longSparseArray = (LongSparseArray) f27448q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    q5 q5Var = (q5) longSparseArray.valueAt(i11);
                    if (q5Var != null && (l4Var = q5Var.f27461k) != null) {
                        if (z10) {
                            l4Var.setAllowStartLottieAnimation(true);
                            l4Var.setAllowStartAnimation(true);
                            l4Var.setAutoRepeat(1);
                            d6 animation = l4Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = l4Var.useSharedAnimationQueue;
                                if (!animation.f23446n0) {
                                    animation.f23456v0 = z12;
                                }
                                animation.start();
                            } else {
                                ij0 lottieAnimation = l4Var.getLottieAnimation();
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
        if (f27448q != null) {
            x();
            for (int i10 = 0; i10 < f27448q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f27448q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    q5 q5Var = (q5) longSparseArray.get(keyAt);
                    if (q5Var != null && q5Var.f27454a) {
                        q5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f27450s = LiteMode.isEnabled(16388);
        f27451t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.i61)) {
            this.f27463m = false;
            if (this.f27455b == null) {
                this.f27455b = new ArrayList(10);
            }
            if (!this.f27455b.contains(view)) {
                this.f27455b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(w5 w5Var) {
        if (this.f27456c == null) {
            this.f27456c = new ArrayList(10);
        }
        this.f27463m = false;
        if (!this.f27456c.contains(w5Var)) {
            this.f27456c.add(w5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f27458g == 19) {
            return true;
        }
        Boolean bool = this.f27464n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.e)) {
            z10 = false;
        }
        this.f27464n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f27456c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f27455b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f27463m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        ai.l4 l4Var = this.f27461k;
        if (l4Var == null) {
            return;
        }
        l4Var.setImageCoords(getBounds());
        this.f27461k.setAlpha(this.f27462l);
        this.f27461k.draw(canvas);
    }

    public final void e() {
        if (this.f27461k == null) {
            ai.l4 l4Var = new ai.l4(this, 4);
            this.f27461k = l4Var;
            l4Var.setCurrentAccount(this.h);
            this.f27461k.setAllowLoadingOnAttachedOnly(true);
            if (this.f27458g == 12) {
                this.f27461k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f27462l * 255.0f);
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
            return document.f18302id;
        }
        return this.f27457f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q5.j(boolean):void");
    }

    public final void k() {
        if (this.f27455b != null) {
            for (int i10 = 0; i10 < this.f27455b.size(); i10++) {
                View view = (View) this.f27455b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f27456c != null) {
            for (int i11 = 0; i11 < this.f27456c.size(); i11++) {
                w5 w5Var = (w5) this.f27456c.get(i11);
                if (w5Var != null) {
                    w5Var.invalidate();
                }
            }
        }
    }

    public final boolean l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q5.l():boolean");
    }

    public final void o(View view) {
        ArrayList arrayList = this.f27455b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f27463m = false;
        v();
    }

    public final void p(w5 w5Var) {
        ArrayList arrayList = this.f27456c;
        if (arrayList != null) {
            arrayList.remove(w5Var);
        }
        this.f27463m = false;
        v();
    }

    public final void q(long j3) {
        ai.l4 l4Var = this.f27461k;
        if (l4Var != null) {
            if (this.f27458g == 8) {
                j3 = 0;
            }
            l4Var.setCurrentTime(j3);
        }
    }

    public final void r(String str) {
        int i10 = this.f27458g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f27461k != null) {
            return;
        }
        e();
        this.f27460j = true;
        this.f27461k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f27461k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f27462l = f7;
        ai.l4 l4Var = this.f27461k;
        if (l4Var != null) {
            l4Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f27461k != null && this.e != null) {
            if (c()) {
                this.f27461k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f27466p = colorFilter;
    }

    public final void t(long j3) {
        ai.l4 l4Var = this.f27461k;
        if (l4Var != null) {
            if (this.f27458g == 8) {
                j3 = 0;
            }
            if (l4Var.getLottieAnimation() != null) {
                this.f27461k.getLottieAnimation().V(j3);
            }
            if (this.f27461k.getAnimation() != null) {
                this.f27461k.getAnimation().D(j3);
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
        if (this.f27461k != null) {
            ArrayList arrayList2 = this.f27455b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f27456c) != null && arrayList.size() > 0) || this.f27463m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f27454a) {
                this.f27454a = z10;
                if (z10) {
                    this.f27461k.onAttachedToWindow();
                } else {
                    this.f27461k.onDetachedFromWindow();
                }
                if (!this.f27454a) {
                    ai.f fVar = v;
                    AndroidUtilities.cancelRunOnUIThread(fVar);
                    AndroidUtilities.runOnUIThread(fVar, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f27458g;
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
        int i10 = this.f27458g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.f19442y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f19442y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f19442y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f19260o2.descent()) + Math.abs(org.telegram.ui.ActionBar.j6.f19260o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public q5(int i10, int i11, TLRPC.Document document) {
        this.f27458g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
