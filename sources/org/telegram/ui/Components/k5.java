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
public class k5 extends Drawable {
    public static SparseArray f29937q;
    public static HashMap f29938r;
    public static boolean f29939s;
    public static boolean f29940t;
    public static boolean f29941u;
    public static final bg.d2 v = new bg.d2(28);
    public static HashMap f29942w;
    public boolean f29943a;
    public ArrayList f29944b;
    public ArrayList f29945c;
    public int d;
    public TLRPC.Document f29946e;
    public long f29947f;
    public int f29948g;
    public int h;
    public String f29949i;
    public boolean f29950j;
    public ih.z2 f29951k;
    public boolean f29953m;
    public ColorFilter f29956p;
    public float f29952l = 1.0f;
    public Boolean f29954n = null;
    public Boolean f29955o = null;

    public k5(int i9, int i10, long j10) {
        this.h = i10;
        this.f29948g = i9;
        y();
        this.f29947f = j10;
        h(i10).b(j10, new c5(this, 0));
    }

    public static TLRPC.Document f(int i9, long j10) {
        HashMap hashMap = h(i9).f28651a;
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

    public static g5 h(int i9) {
        if (f29938r == null) {
            f29938r = new HashMap();
        }
        g5 g5Var = (g5) f29938r.get(Integer.valueOf(i9));
        if (g5Var == null) {
            HashMap hashMap = f29938r;
            Integer valueOf = Integer.valueOf(i9);
            g5 g5Var2 = new g5(i9);
            hashMap.put(valueOf, g5Var2);
            return g5Var2;
        }
        return g5Var;
    }

    public static k5 m(int i9, int i10, TLRPC.Document document) {
        if (f29937q == null) {
            f29937q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i9), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f29937q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f29937q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        k5 k5Var = (k5) longSparseArray.get(document.f22386id);
        if (k5Var == null) {
            long j10 = document.f22386id;
            k5 k5Var2 = new k5(i10, i9, document);
            longSparseArray.put(j10, k5Var2);
            return k5Var2;
        }
        return k5Var;
    }

    public static k5 n(int i9, long j10, String str, int i10) {
        if (f29937q == null) {
            f29937q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i9), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f29937q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f29937q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        k5 k5Var = (k5) longSparseArray.get(j10);
        if (k5Var == null) {
            ?? drawable = new Drawable();
            drawable.f29952l = 1.0f;
            drawable.f29954n = null;
            drawable.f29955o = null;
            drawable.h = i9;
            drawable.f29948g = i10;
            drawable.y();
            drawable.f29947f = j10;
            drawable.f29949i = str;
            h(i9).b(j10, new c5(drawable, 1));
            longSparseArray.put(j10, drawable);
            return drawable;
        }
        return k5Var;
    }

    public static void s(int i9, boolean z10) {
        LongSparseArray longSparseArray;
        ih.z2 z2Var;
        boolean z11 = !z10;
        if (f29941u != z11) {
            f29941u = z11;
            if (f29937q != null && (longSparseArray = (LongSparseArray) f29937q.get(Objects.hash(Integer.valueOf(i9), 25))) != null) {
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    k5 k5Var = (k5) longSparseArray.valueAt(i10);
                    if (k5Var != null && (z2Var = k5Var.f29951k) != null) {
                        if (z10) {
                            z2Var.setAllowStartLottieAnimation(true);
                            z2Var.setAllowStartAnimation(true);
                            z2Var.setAutoRepeat(1);
                            x5 animation = z2Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = z2Var.useSharedAnimationQueue;
                                if (!animation.f34520j0) {
                                    animation.f34529r0 = z12;
                                }
                                animation.start();
                            } else {
                                mi0 lottieAnimation = z2Var.getLottieAnimation();
                                if (lottieAnimation != null) {
                                    lottieAnimation.start();
                                }
                            }
                        } else {
                            z2Var.setAllowStartAnimation(false);
                            z2Var.setAllowStartLottieAnimation(false);
                            z2Var.setAutoRepeat(0);
                            z2Var.stopAnimation();
                        }
                    }
                }
            }
        }
    }

    public static void u() {
        if (f29937q != null) {
            x();
            for (int i9 = 0; i9 < f29937q.size(); i9++) {
                LongSparseArray longSparseArray = (LongSparseArray) f29937q.valueAt(i9);
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    long keyAt = longSparseArray.keyAt(i10);
                    k5 k5Var = (k5) longSparseArray.get(keyAt);
                    if (k5Var != null && k5Var.f29943a) {
                        k5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f29939s = LiteMode.isEnabled(16388);
        f29940t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.d51)) {
            this.f29953m = false;
            if (this.f29944b == null) {
                this.f29944b = new ArrayList(10);
            }
            if (!this.f29944b.contains(view)) {
                this.f29944b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(q5 q5Var) {
        if (this.f29945c == null) {
            this.f29945c = new ArrayList(10);
        }
        this.f29953m = false;
        if (!this.f29945c.contains(q5Var)) {
            this.f29945c.add(q5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f29948g == 19) {
            return true;
        }
        Boolean bool = this.f29954n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f29946e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.f29946e)) {
            z10 = false;
        }
        this.f29954n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f29945c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f29944b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f29953m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        ih.z2 z2Var = this.f29951k;
        if (z2Var == null) {
            return;
        }
        z2Var.setImageCoords(getBounds());
        this.f29951k.setAlpha(this.f29952l);
        this.f29951k.draw(canvas);
    }

    public final void e() {
        if (this.f29951k == null) {
            ih.z2 z2Var = new ih.z2(this, 3);
            this.f29951k = z2Var;
            z2Var.setCurrentAccount(this.h);
            this.f29951k.setAllowLoadingOnAttachedOnly(true);
            if (this.f29948g == 12) {
                this.f29951k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f29952l * 255.0f);
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
        TLRPC.Document document = this.f29946e;
        if (document != null) {
            return document.f22386id;
        }
        return this.f29947f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k5.j(boolean):void");
    }

    public final void k() {
        if (this.f29944b != null) {
            for (int i9 = 0; i9 < this.f29944b.size(); i9++) {
                View view = (View) this.f29944b.get(i9);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f29945c != null) {
            for (int i10 = 0; i10 < this.f29945c.size(); i10++) {
                q5 q5Var = (q5) this.f29945c.get(i10);
                if (q5Var != null) {
                    q5Var.invalidate();
                }
            }
        }
    }

    public final boolean l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k5.l():boolean");
    }

    public final void o(View view) {
        ArrayList arrayList = this.f29944b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f29953m = false;
        v();
    }

    public final void p(q5 q5Var) {
        ArrayList arrayList = this.f29945c;
        if (arrayList != null) {
            arrayList.remove(q5Var);
        }
        this.f29953m = false;
        v();
    }

    public final void q(long j10) {
        ih.z2 z2Var = this.f29951k;
        if (z2Var != null) {
            if (this.f29948g == 8) {
                j10 = 0;
            }
            z2Var.setCurrentTime(j10);
        }
    }

    public final void r(String str) {
        int i9 = this.f29948g;
        if ((i9 != 20 && i9 != 21) || TextUtils.isEmpty(str) || this.f29951k != null) {
            return;
        }
        e();
        this.f29950j = true;
        this.f29951k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f29951k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i9) {
        float f10 = i9 / 255.0f;
        this.f29952l = f10;
        ih.z2 z2Var = this.f29951k;
        if (z2Var != null) {
            z2Var.setAlpha(f10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f29951k != null && this.f29946e != null) {
            if (c()) {
                this.f29951k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f29956p = colorFilter;
    }

    public final void t(long j10) {
        ih.z2 z2Var = this.f29951k;
        if (z2Var != null) {
            if (this.f29948g == 8) {
                j10 = 0;
            }
            if (z2Var.getLottieAnimation() != null) {
                this.f29951k.getLottieAnimation().S(j10);
            }
            if (this.f29951k.getAnimation() != null) {
                this.f29951k.getAnimation().D(j10);
            }
        }
    }

    public final String toString() {
        String findAnimatedEmojiEmoticon;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f29946e;
        if (document == null) {
            findAnimatedEmojiEmoticon = "null";
        } else {
            findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null);
        }
        return aa.d.r(sb2, findAnimatedEmojiEmoticon, "}");
    }

    public final void v() {
        ArrayList arrayList;
        boolean z10;
        if (this.f29951k != null) {
            ArrayList arrayList2 = this.f29944b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f29945c) != null && arrayList.size() > 0) || this.f29953m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f29943a) {
                this.f29943a = z10;
                if (z10) {
                    this.f29951k.onAttachedToWindow();
                } else {
                    this.f29951k.onDetachedFromWindow();
                }
                if (!this.f29943a) {
                    bg.d2 d2Var = v;
                    AndroidUtilities.cancelRunOnUIThread(d2Var);
                    AndroidUtilities.runOnUIThread(d2Var, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i9 = this.f29948g;
        if (i9 != 7 && i9 != 9 && i9 != 10) {
            if (i9 != 11 && i9 != 18 && i9 != 14 && i9 != 6 && i9 != 5 && i9 != 22) {
                if (i9 == 17) {
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
        int i9 = this.f29948g;
        if (i9 != 0 && i9 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.f6.f23365y2;
            if (textPaintArr != null && (i9 == 1 || i9 == 4 || i9 == 19 || i9 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.f6.f23365y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i9 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.f6.f23365y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (i9 != 14 && i9 != 15 && i9 != 17) {
                if (i9 != 11 && i9 != 22) {
                    if (i9 == 27) {
                        this.d = 50;
                        return;
                    } else if (i9 == 24) {
                        this.d = 140;
                        return;
                    } else if (i9 == 23) {
                        this.d = 14;
                        return;
                    } else if (i9 == 21) {
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.f6.f23193o2.descent()) + Math.abs(org.telegram.ui.ActionBar.f6.f23193o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public k5(int i9, int i10, TLRPC.Document document) {
        this.f29948g = i9;
        this.h = i10;
        this.f29946e = document;
        y();
        x();
        j(false);
    }
}
