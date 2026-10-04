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
    public static SparseArray f29894q;
    public static HashMap f29895r;
    public static boolean f29896s;
    public static boolean f29897t;
    public static boolean f29898u;
    public static final ai.f v = new ai.f(23);
    public static HashMap f29899w;
    public boolean f29900a;
    public ArrayList f29901b;
    public ArrayList f29902c;
    public int d;
    public TLRPC.Document f29903e;
    public long f29904f;
    public int f29905g;
    public int h;
    public String f29906i;
    public boolean f29907j;
    public ai.l4 f29908k;
    public boolean f29910m;
    public ColorFilter f29913p;
    public float f29909l = 1.0f;
    public Boolean f29911n = null;
    public Boolean f29912o = null;

    public q5(int i10, int i11, long j3) {
        this.h = i11;
        this.f29905g = i10;
        y();
        this.f29904f = j3;
        h(i11).b(j3, new i5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j3) {
        HashMap hashMap = h(i10).f28527a;
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
        if (f29895r == null) {
            f29895r = new HashMap();
        }
        m5 m5Var = (m5) f29895r.get(Integer.valueOf(i10));
        if (m5Var == null) {
            HashMap hashMap = f29895r;
            Integer valueOf = Integer.valueOf(i10);
            m5 m5Var2 = new m5(i10);
            hashMap.put(valueOf, m5Var2);
            return m5Var2;
        }
        return m5Var;
    }

    public static q5 m(int i10, int i11, TLRPC.Document document) {
        if (f29894q == null) {
            f29894q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f29894q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f29894q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        q5 q5Var = (q5) longSparseArray.get(document.f20043id);
        if (q5Var == null) {
            long j3 = document.f20043id;
            q5 q5Var2 = new q5(i11, i10, document);
            longSparseArray.put(j3, q5Var2);
            return q5Var2;
        }
        return q5Var;
    }

    public static q5 n(int i10, long j3, String str, int i11) {
        if (f29894q == null) {
            f29894q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f29894q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f29894q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        q5 q5Var = (q5) longSparseArray.get(j3);
        if (q5Var == null) {
            ?? drawable = new Drawable();
            drawable.f29909l = 1.0f;
            drawable.f29911n = null;
            drawable.f29912o = null;
            drawable.h = i10;
            drawable.f29905g = i11;
            drawable.y();
            drawable.f29904f = j3;
            drawable.f29906i = str;
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
        if (f29898u != z11) {
            f29898u = z11;
            if (f29894q != null && (longSparseArray = (LongSparseArray) f29894q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    q5 q5Var = (q5) longSparseArray.valueAt(i11);
                    if (q5Var != null && (l4Var = q5Var.f29908k) != null) {
                        if (z10) {
                            l4Var.setAllowStartLottieAnimation(true);
                            l4Var.setAllowStartAnimation(true);
                            l4Var.setAutoRepeat(1);
                            d6 animation = l4Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = l4Var.useSharedAnimationQueue;
                                if (!animation.f25584n0) {
                                    animation.f25594v0 = z12;
                                }
                                animation.start();
                            } else {
                                kj0 lottieAnimation = l4Var.getLottieAnimation();
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
        if (f29894q != null) {
            x();
            for (int i10 = 0; i10 < f29894q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f29894q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    q5 q5Var = (q5) longSparseArray.get(keyAt);
                    if (q5Var != null && q5Var.f29900a) {
                        q5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f29896s = LiteMode.isEnabled(16388);
        f29897t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.e61)) {
            this.f29910m = false;
            if (this.f29901b == null) {
                this.f29901b = new ArrayList(10);
            }
            if (!this.f29901b.contains(view)) {
                this.f29901b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(w5 w5Var) {
        if (this.f29902c == null) {
            this.f29902c = new ArrayList(10);
        }
        this.f29910m = false;
        if (!this.f29902c.contains(w5Var)) {
            this.f29902c.add(w5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f29905g == 19) {
            return true;
        }
        Boolean bool = this.f29911n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f29903e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.f29903e)) {
            z10 = false;
        }
        this.f29911n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f29902c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f29901b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f29910m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        ai.l4 l4Var = this.f29908k;
        if (l4Var == null) {
            return;
        }
        l4Var.setImageCoords(getBounds());
        this.f29908k.setAlpha(this.f29909l);
        this.f29908k.draw(canvas);
    }

    public final void e() {
        if (this.f29908k == null) {
            ai.l4 l4Var = new ai.l4(this, 4);
            this.f29908k = l4Var;
            l4Var.setCurrentAccount(this.h);
            this.f29908k.setAllowLoadingOnAttachedOnly(true);
            if (this.f29905g == 12) {
                this.f29908k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f29909l * 255.0f);
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
        TLRPC.Document document = this.f29903e;
        if (document != null) {
            return document.f20043id;
        }
        return this.f29904f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q5.j(boolean):void");
    }

    public final void k() {
        if (this.f29901b != null) {
            for (int i10 = 0; i10 < this.f29901b.size(); i10++) {
                View view = (View) this.f29901b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f29902c != null) {
            for (int i11 = 0; i11 < this.f29902c.size(); i11++) {
                w5 w5Var = (w5) this.f29902c.get(i11);
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
        ArrayList arrayList = this.f29901b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f29910m = false;
        v();
    }

    public final void p(w5 w5Var) {
        ArrayList arrayList = this.f29902c;
        if (arrayList != null) {
            arrayList.remove(w5Var);
        }
        this.f29910m = false;
        v();
    }

    public final void q(long j3) {
        ai.l4 l4Var = this.f29908k;
        if (l4Var != null) {
            if (this.f29905g == 8) {
                j3 = 0;
            }
            l4Var.setCurrentTime(j3);
        }
    }

    public final void r(String str) {
        int i10 = this.f29905g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f29908k != null) {
            return;
        }
        e();
        this.f29907j = true;
        this.f29908k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f29908k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f29909l = f7;
        ai.l4 l4Var = this.f29908k;
        if (l4Var != null) {
            l4Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f29908k != null && this.f29903e != null) {
            if (c()) {
                this.f29908k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f29913p = colorFilter;
    }

    public final void t(long j3) {
        ai.l4 l4Var = this.f29908k;
        if (l4Var != null) {
            if (this.f29905g == 8) {
                j3 = 0;
            }
            if (l4Var.getLottieAnimation() != null) {
                this.f29908k.getLottieAnimation().V(j3);
            }
            if (this.f29908k.getAnimation() != null) {
                this.f29908k.getAnimation().D(j3);
            }
        }
    }

    public final String toString() {
        String findAnimatedEmojiEmoticon;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f29903e;
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
        if (this.f29908k != null) {
            ArrayList arrayList2 = this.f29901b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f29902c) != null && arrayList.size() > 0) || this.f29910m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f29900a) {
                this.f29900a = z10;
                if (z10) {
                    this.f29908k.onAttachedToWindow();
                } else {
                    this.f29908k.onDetachedFromWindow();
                }
                if (!this.f29900a) {
                    ai.f fVar = v;
                    AndroidUtilities.cancelRunOnUIThread(fVar);
                    AndroidUtilities.runOnUIThread(fVar, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f29905g;
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
        int i10 = this.f29905g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.i6.f21201y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.i6.f21201y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.i6.f21201y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.i6.f21016o2.descent()) + Math.abs(org.telegram.ui.ActionBar.i6.f21016o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public q5(int i10, int i11, TLRPC.Document document) {
        this.f29905g = i10;
        this.h = i11;
        this.f29903e = document;
        y();
        x();
        j(false);
    }
}
