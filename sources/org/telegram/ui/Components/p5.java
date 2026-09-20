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
    public static SparseArray f27149q;
    public static HashMap f27150r;
    public static boolean f27151s;
    public static boolean f27152t;
    public static boolean f27153u;
    public static final ai.f v = new ai.f(23);
    public static HashMap f27154w;
    public boolean f27155a;
    public ArrayList f27156b;
    public ArrayList f27157c;
    public int d;
    public TLRPC.Document e;
    public long f27158f;
    public int f27159g;
    public int h;
    public String f27160i;
    public boolean f27161j;
    public ai.l4 f27162k;
    public boolean f27164m;
    public ColorFilter f27167p;
    public float f27163l = 1.0f;
    public Boolean f27165n = null;
    public Boolean f27166o = null;

    public p5(int i10, int i11, long j3) {
        this.h = i11;
        this.f27159g = i10;
        y();
        this.f27158f = j3;
        h(i11).b(j3, new h5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j3) {
        HashMap hashMap = h(i10).f26035a;
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

    public static l5 h(int i10) {
        if (f27150r == null) {
            f27150r = new HashMap();
        }
        l5 l5Var = (l5) f27150r.get(Integer.valueOf(i10));
        if (l5Var == null) {
            HashMap hashMap = f27150r;
            Integer valueOf = Integer.valueOf(i10);
            l5 l5Var2 = new l5(i10);
            hashMap.put(valueOf, l5Var2);
            return l5Var2;
        }
        return l5Var;
    }

    public static p5 m(int i10, int i11, TLRPC.Document document) {
        if (f27149q == null) {
            f27149q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f27149q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f27149q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        p5 p5Var = (p5) longSparseArray.get(document.f18334id);
        if (p5Var == null) {
            long j3 = document.f18334id;
            p5 p5Var2 = new p5(i11, i10, document);
            longSparseArray.put(j3, p5Var2);
            return p5Var2;
        }
        return p5Var;
    }

    public static p5 n(int i10, long j3, String str, int i11) {
        if (f27149q == null) {
            f27149q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f27149q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f27149q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        p5 p5Var = (p5) longSparseArray.get(j3);
        if (p5Var == null) {
            ?? drawable = new Drawable();
            drawable.f27163l = 1.0f;
            drawable.f27165n = null;
            drawable.f27166o = null;
            drawable.h = i10;
            drawable.f27159g = i11;
            drawable.y();
            drawable.f27158f = j3;
            drawable.f27160i = str;
            h(i10).b(j3, new h5(drawable, 1));
            longSparseArray.put(j3, drawable);
            return drawable;
        }
        return p5Var;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        ai.l4 l4Var;
        boolean z11 = !z10;
        if (f27153u != z11) {
            f27153u = z11;
            if (f27149q != null && (longSparseArray = (LongSparseArray) f27149q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    p5 p5Var = (p5) longSparseArray.valueAt(i11);
                    if (p5Var != null && (l4Var = p5Var.f27162k) != null) {
                        if (z10) {
                            l4Var.setAllowStartLottieAnimation(true);
                            l4Var.setAllowStartAnimation(true);
                            l4Var.setAutoRepeat(1);
                            c6 animation = l4Var.getAnimation();
                            if (animation != null) {
                                boolean z12 = l4Var.useSharedAnimationQueue;
                                if (!animation.f23161n0) {
                                    animation.f23171v0 = z12;
                                }
                                animation.start();
                            } else {
                                hj0 lottieAnimation = l4Var.getLottieAnimation();
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
        if (f27149q != null) {
            x();
            for (int i10 = 0; i10 < f27149q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f27149q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    p5 p5Var = (p5) longSparseArray.get(keyAt);
                    if (p5Var != null && p5Var.f27155a) {
                        p5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f27151s = LiteMode.isEnabled(16388);
        f27152t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.l61)) {
            this.f27164m = false;
            if (this.f27156b == null) {
                this.f27156b = new ArrayList(10);
            }
            if (!this.f27156b.contains(view)) {
                this.f27156b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(v5 v5Var) {
        if (this.f27157c == null) {
            this.f27157c = new ArrayList(10);
        }
        this.f27164m = false;
        if (!this.f27157c.contains(v5Var)) {
            this.f27157c.add(v5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f27159g == 19) {
            return true;
        }
        Boolean bool = this.f27165n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.e)) {
            z10 = false;
        }
        this.f27165n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f27157c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f27156b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f27164m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        ai.l4 l4Var = this.f27162k;
        if (l4Var == null) {
            return;
        }
        l4Var.setImageCoords(getBounds());
        this.f27162k.setAlpha(this.f27163l);
        this.f27162k.draw(canvas);
    }

    public final void e() {
        if (this.f27162k == null) {
            ai.l4 l4Var = new ai.l4(this, 4);
            this.f27162k = l4Var;
            l4Var.setCurrentAccount(this.h);
            this.f27162k.setAllowLoadingOnAttachedOnly(true);
            if (this.f27159g == 12) {
                this.f27162k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f27163l * 255.0f);
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
            return document.f18334id;
        }
        return this.f27158f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p5.j(boolean):void");
    }

    public final void k() {
        if (this.f27156b != null) {
            for (int i10 = 0; i10 < this.f27156b.size(); i10++) {
                View view = (View) this.f27156b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f27157c != null) {
            for (int i11 = 0; i11 < this.f27157c.size(); i11++) {
                v5 v5Var = (v5) this.f27157c.get(i11);
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
        ArrayList arrayList = this.f27156b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f27164m = false;
        v();
    }

    public final void p(v5 v5Var) {
        ArrayList arrayList = this.f27157c;
        if (arrayList != null) {
            arrayList.remove(v5Var);
        }
        this.f27164m = false;
        v();
    }

    public final void q(long j3) {
        ai.l4 l4Var = this.f27162k;
        if (l4Var != null) {
            if (this.f27159g == 8) {
                j3 = 0;
            }
            l4Var.setCurrentTime(j3);
        }
    }

    public final void r(String str) {
        int i10 = this.f27159g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f27162k != null) {
            return;
        }
        e();
        this.f27161j = true;
        this.f27162k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f27162k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f27163l = f7;
        ai.l4 l4Var = this.f27162k;
        if (l4Var != null) {
            l4Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f27162k != null && this.e != null) {
            if (c()) {
                this.f27162k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f27167p = colorFilter;
    }

    public final void t(long j3) {
        ai.l4 l4Var = this.f27162k;
        if (l4Var != null) {
            if (this.f27159g == 8) {
                j3 = 0;
            }
            if (l4Var.getLottieAnimation() != null) {
                this.f27162k.getLottieAnimation().V(j3);
            }
            if (this.f27162k.getAnimation() != null) {
                this.f27162k.getAnimation().D(j3);
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
        if (this.f27162k != null) {
            ArrayList arrayList2 = this.f27156b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f27157c) != null && arrayList.size() > 0) || this.f27164m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f27155a) {
                this.f27155a = z10;
                if (z10) {
                    this.f27162k.onAttachedToWindow();
                } else {
                    this.f27162k.onDetachedFromWindow();
                }
                if (!this.f27155a) {
                    ai.f fVar = v;
                    AndroidUtilities.cancelRunOnUIThread(fVar);
                    AndroidUtilities.runOnUIThread(fVar, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f27159g;
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
        int i10 = this.f27159g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.f19474y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f19474y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f19474y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f19292o2.descent()) + Math.abs(org.telegram.ui.ActionBar.j6.f19292o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public p5(int i10, int i11, TLRPC.Document document) {
        this.f27159g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
