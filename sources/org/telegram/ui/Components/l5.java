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
public class l5 extends Drawable {
    public static SparseArray f28623q;
    public static HashMap f28624r;
    public static boolean f28625s;
    public static boolean f28626t;
    public static boolean f28627u;
    public static final ag.f v = new ag.f(28);
    public static HashMap f28628w;
    public boolean f28629a;
    public ArrayList f28630b;
    public ArrayList f28631c;
    public int d;
    public TLRPC.Document f28632e;
    public long f28633f;
    public int f28634g;
    public int h;
    public String f28635i;
    public boolean f28636j;
    public oh.z2 f28637k;
    public boolean f28639m;
    public ColorFilter f28642p;
    public float f28638l = 1.0f;
    public Boolean f28640n = null;
    public Boolean f28641o = null;

    public l5(int i10, int i11, long j10) {
        this.h = i11;
        this.f28634g = i10;
        y();
        this.f28633f = j10;
        h(i11).b(j10, new d5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j10) {
        HashMap hashMap = h(i10).f27362a;
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

    public static h5 h(int i10) {
        if (f28624r == null) {
            f28624r = new HashMap();
        }
        h5 h5Var = (h5) f28624r.get(Integer.valueOf(i10));
        if (h5Var == null) {
            HashMap hashMap = f28624r;
            Integer valueOf = Integer.valueOf(i10);
            h5 h5Var2 = new h5(i10);
            hashMap.put(valueOf, h5Var2);
            return h5Var2;
        }
        return h5Var;
    }

    public static l5 m(int i10, int i11, TLRPC.Document document) {
        if (f28623q == null) {
            f28623q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f28623q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f28623q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        l5 l5Var = (l5) longSparseArray.get(document.f20851id);
        if (l5Var == null) {
            long j10 = document.f20851id;
            l5 l5Var2 = new l5(i11, i10, document);
            longSparseArray.put(j10, l5Var2);
            return l5Var2;
        }
        return l5Var;
    }

    public static l5 n(int i10, long j10, String str, int i11) {
        if (f28623q == null) {
            f28623q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f28623q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f28623q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        l5 l5Var = (l5) longSparseArray.get(j10);
        if (l5Var == null) {
            ?? drawable = new Drawable();
            drawable.f28638l = 1.0f;
            drawable.f28640n = null;
            drawable.f28641o = null;
            drawable.h = i10;
            drawable.f28634g = i11;
            drawable.y();
            drawable.f28633f = j10;
            drawable.f28635i = str;
            h(i10).b(j10, new d5(drawable, 1));
            longSparseArray.put(j10, drawable);
            return drawable;
        }
        return l5Var;
    }

    public static void s(int i10, boolean z4) {
        LongSparseArray longSparseArray;
        oh.z2 z2Var;
        boolean z10 = !z4;
        if (f28627u != z10) {
            f28627u = z10;
            if (f28623q != null && (longSparseArray = (LongSparseArray) f28623q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    l5 l5Var = (l5) longSparseArray.valueAt(i11);
                    if (l5Var != null && (z2Var = l5Var.f28637k) != null) {
                        if (z4) {
                            z2Var.setAllowStartLottieAnimation(true);
                            z2Var.setAllowStartAnimation(true);
                            z2Var.setAutoRepeat(1);
                            y5 animation = z2Var.getAnimation();
                            if (animation != null) {
                                boolean z11 = z2Var.useSharedAnimationQueue;
                                if (!animation.f33337k0) {
                                    animation.f33347s0 = z11;
                                }
                                animation.start();
                            } else {
                                hj0 lottieAnimation = z2Var.getLottieAnimation();
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
        if (f28623q != null) {
            x();
            for (int i10 = 0; i10 < f28623q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f28623q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    l5 l5Var = (l5) longSparseArray.get(keyAt);
                    if (l5Var != null && l5Var.f28629a) {
                        l5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f28625s = LiteMode.isEnabled(16388);
        f28626t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.y51)) {
            this.f28639m = false;
            if (this.f28630b == null) {
                this.f28630b = new ArrayList(10);
            }
            if (!this.f28630b.contains(view)) {
                this.f28630b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(r5 r5Var) {
        if (this.f28631c == null) {
            this.f28631c = new ArrayList(10);
        }
        this.f28639m = false;
        if (!this.f28631c.contains(r5Var)) {
            this.f28631c.add(r5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z4 = true;
        if (this.f28634g == 19) {
            return true;
        }
        Boolean bool = this.f28640n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f28632e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.f28632e)) {
            z4 = false;
        }
        this.f28640n = Boolean.valueOf(z4);
        return z4;
    }

    public final void d() {
        ArrayList arrayList = this.f28631c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f28630b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f28639m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        oh.z2 z2Var = this.f28637k;
        if (z2Var == null) {
            return;
        }
        z2Var.setImageCoords(getBounds());
        this.f28637k.setAlpha(this.f28638l);
        this.f28637k.draw(canvas);
    }

    public final void e() {
        if (this.f28637k == null) {
            oh.z2 z2Var = new oh.z2(this, 3);
            this.f28637k = z2Var;
            z2Var.setCurrentAccount(this.h);
            this.f28637k.setAllowLoadingOnAttachedOnly(true);
            if (this.f28634g == 12) {
                this.f28637k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f28638l * 255.0f);
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
        TLRPC.Document document = this.f28632e;
        if (document != null) {
            return document.f20851id;
        }
        return this.f28633f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l5.j(boolean):void");
    }

    public final void k() {
        if (this.f28630b != null) {
            for (int i10 = 0; i10 < this.f28630b.size(); i10++) {
                View view = (View) this.f28630b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f28631c != null) {
            for (int i11 = 0; i11 < this.f28631c.size(); i11++) {
                r5 r5Var = (r5) this.f28631c.get(i11);
                if (r5Var != null) {
                    r5Var.invalidate();
                }
            }
        }
    }

    public final boolean l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l5.l():boolean");
    }

    public final void o(View view) {
        ArrayList arrayList = this.f28630b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f28639m = false;
        v();
    }

    public final void p(r5 r5Var) {
        ArrayList arrayList = this.f28631c;
        if (arrayList != null) {
            arrayList.remove(r5Var);
        }
        this.f28639m = false;
        v();
    }

    public final void q(long j10) {
        oh.z2 z2Var = this.f28637k;
        if (z2Var != null) {
            if (this.f28634g == 8) {
                j10 = 0;
            }
            z2Var.setCurrentTime(j10);
        }
    }

    public final void r(String str) {
        int i10 = this.f28634g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f28637k != null) {
            return;
        }
        e();
        this.f28636j = true;
        this.f28637k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f28637k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f10 = i10 / 255.0f;
        this.f28638l = f10;
        oh.z2 z2Var = this.f28637k;
        if (z2Var != null) {
            z2Var.setAlpha(f10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f28637k != null && this.f28632e != null) {
            if (c()) {
                this.f28637k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f28642p = colorFilter;
    }

    public final void t(long j10) {
        oh.z2 z2Var = this.f28637k;
        if (z2Var != null) {
            if (this.f28634g == 8) {
                j10 = 0;
            }
            if (z2Var.getLottieAnimation() != null) {
                this.f28637k.getLottieAnimation().S(j10);
            }
            if (this.f28637k.getAnimation() != null) {
                this.f28637k.getAnimation().D(j10);
            }
        }
    }

    public final String toString() {
        String findAnimatedEmojiEmoticon;
        StringBuilder sb = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f28632e;
        if (document == null) {
            findAnimatedEmojiEmoticon = "null";
        } else {
            findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null);
        }
        return android.support.v4.media.a.r(sb, findAnimatedEmojiEmoticon, "}");
    }

    public final void v() {
        ArrayList arrayList;
        boolean z4;
        if (this.f28637k != null) {
            ArrayList arrayList2 = this.f28630b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f28631c) != null && arrayList.size() > 0) || this.f28639m)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 != this.f28629a) {
                this.f28629a = z4;
                if (z4) {
                    this.f28637k.onAttachedToWindow();
                } else {
                    this.f28637k.onDetachedFromWindow();
                }
                if (!this.f28629a) {
                    ag.f fVar = v;
                    AndroidUtilities.cancelRunOnUIThread(fVar);
                    AndroidUtilities.runOnUIThread(fVar, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f28634g;
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
        int i10 = this.f28634g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.f22034y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.f22034y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.f22034y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.f21855o2.descent()) + Math.abs(org.telegram.ui.ActionBar.k6.f21855o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public l5(int i10, int i11, TLRPC.Document document) {
        this.f28634g = i10;
        this.h = i11;
        this.f28632e = document;
        y();
        x();
        j(false);
    }
}
