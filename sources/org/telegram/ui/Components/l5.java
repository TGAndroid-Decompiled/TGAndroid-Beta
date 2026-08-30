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
    public static SparseArray f26556q;
    public static HashMap f26557r;
    public static boolean f26558s;
    public static boolean f26559t;
    public static boolean f26560u;
    public static final cg.n0 v = new cg.n0(26);
    public static HashMap f26561w;
    public boolean f26562a;
    public ArrayList f26563b;
    public ArrayList f26564c;
    public int d;
    public TLRPC.Document e;
    public long f26565f;
    public int f26566g;
    public int h;
    public String f26567i;
    public boolean f26568j;
    public nh.y2 f26569k;
    public boolean f26571m;
    public ColorFilter f26574p;
    public float f26570l = 1.0f;
    public Boolean f26572n = null;
    public Boolean f26573o = null;

    public l5(int i10, int i11, long j10) {
        this.h = i11;
        this.f26566g = i10;
        y();
        this.f26565f = j10;
        h(i11).b(j10, new d5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j10) {
        HashMap hashMap = h(i10).f25327a;
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
        if (f26557r == null) {
            f26557r = new HashMap();
        }
        h5 h5Var = (h5) f26557r.get(Integer.valueOf(i10));
        if (h5Var == null) {
            HashMap hashMap = f26557r;
            Integer valueOf = Integer.valueOf(i10);
            h5 h5Var2 = new h5(i10);
            hashMap.put(valueOf, h5Var2);
            return h5Var2;
        }
        return h5Var;
    }

    public static l5 m(int i10, int i11, TLRPC.Document document) {
        if (f26556q == null) {
            f26556q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f26556q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f26556q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        l5 l5Var = (l5) longSparseArray.get(document.f19190id);
        if (l5Var == null) {
            long j10 = document.f19190id;
            l5 l5Var2 = new l5(i11, i10, document);
            longSparseArray.put(j10, l5Var2);
            return l5Var2;
        }
        return l5Var;
    }

    public static l5 n(int i10, long j10, String str, int i11) {
        if (f26556q == null) {
            f26556q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f26556q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f26556q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        l5 l5Var = (l5) longSparseArray.get(j10);
        if (l5Var == null) {
            ?? drawable = new Drawable();
            drawable.f26570l = 1.0f;
            drawable.f26572n = null;
            drawable.f26573o = null;
            drawable.h = i10;
            drawable.f26566g = i11;
            drawable.y();
            drawable.f26565f = j10;
            drawable.f26567i = str;
            h(i10).b(j10, new d5(drawable, 1));
            longSparseArray.put(j10, drawable);
            return drawable;
        }
        return l5Var;
    }

    public static void s(int i10, boolean z4) {
        LongSparseArray longSparseArray;
        nh.y2 y2Var;
        boolean z10 = !z4;
        if (f26560u != z10) {
            f26560u = z10;
            if (f26556q != null && (longSparseArray = (LongSparseArray) f26556q.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    l5 l5Var = (l5) longSparseArray.valueAt(i11);
                    if (l5Var != null && (y2Var = l5Var.f26569k) != null) {
                        if (z4) {
                            y2Var.setAllowStartLottieAnimation(true);
                            y2Var.setAllowStartAnimation(true);
                            y2Var.setAutoRepeat(1);
                            y5 animation = y2Var.getAnimation();
                            if (animation != null) {
                                boolean z11 = y2Var.useSharedAnimationQueue;
                                if (!animation.f30863k0) {
                                    animation.f30873s0 = z11;
                                }
                                animation.start();
                            } else {
                                gj0 lottieAnimation = y2Var.getLottieAnimation();
                                if (lottieAnimation != null) {
                                    lottieAnimation.start();
                                }
                            }
                        } else {
                            y2Var.setAllowStartAnimation(false);
                            y2Var.setAllowStartLottieAnimation(false);
                            y2Var.setAutoRepeat(0);
                            y2Var.stopAnimation();
                        }
                    }
                }
            }
        }
    }

    public static void u() {
        if (f26556q != null) {
            x();
            for (int i10 = 0; i10 < f26556q.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f26556q.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    l5 l5Var = (l5) longSparseArray.get(keyAt);
                    if (l5Var != null && l5Var.f26562a) {
                        l5Var.j(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void x() {
        f26558s = LiteMode.isEnabled(16388);
        f26559t = LiteMode.isEnabled(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.r51)) {
            this.f26571m = false;
            if (this.f26563b == null) {
                this.f26563b = new ArrayList(10);
            }
            if (!this.f26563b.contains(view)) {
                this.f26563b.add(view);
            }
            v();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(r5 r5Var) {
        if (this.f26564c == null) {
            this.f26564c = new ArrayList(10);
        }
        this.f26571m = false;
        if (!this.f26564c.contains(r5Var)) {
            this.f26564c.add(r5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z4 = true;
        if (this.f26566g == 19) {
            return true;
        }
        Boolean bool = this.f26572n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.e)) {
            z4 = false;
        }
        this.f26572n = Boolean.valueOf(z4);
        return z4;
    }

    public final void d() {
        ArrayList arrayList = this.f26564c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f26563b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f26571m = false;
        v();
    }

    @Override
    public final void draw(Canvas canvas) {
        nh.y2 y2Var = this.f26569k;
        if (y2Var == null) {
            return;
        }
        y2Var.setImageCoords(getBounds());
        this.f26569k.setAlpha(this.f26570l);
        this.f26569k.draw(canvas);
    }

    public final void e() {
        if (this.f26569k == null) {
            nh.y2 y2Var = new nh.y2(this, 3);
            this.f26569k = y2Var;
            y2Var.setCurrentAccount(this.h);
            this.f26569k.setAllowLoadingOnAttachedOnly(true);
            if (this.f26566g == 12) {
                this.f26569k.ignoreNotifications = true;
            }
        }
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f26570l * 255.0f);
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
            return document.f19190id;
        }
        return this.f26565f;
    }

    public final void j(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l5.j(boolean):void");
    }

    public final void k() {
        if (this.f26563b != null) {
            for (int i10 = 0; i10 < this.f26563b.size(); i10++) {
                View view = (View) this.f26563b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f26564c != null) {
            for (int i11 = 0; i11 < this.f26564c.size(); i11++) {
                r5 r5Var = (r5) this.f26564c.get(i11);
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
        ArrayList arrayList = this.f26563b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f26571m = false;
        v();
    }

    public final void p(r5 r5Var) {
        ArrayList arrayList = this.f26564c;
        if (arrayList != null) {
            arrayList.remove(r5Var);
        }
        this.f26571m = false;
        v();
    }

    public final void q(long j10) {
        nh.y2 y2Var = this.f26569k;
        if (y2Var != null) {
            if (this.f26566g == 8) {
                j10 = 0;
            }
            y2Var.setCurrentTime(j10);
        }
    }

    public final void r(String str) {
        int i10 = this.f26566g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || this.f26569k != null) {
            return;
        }
        e();
        this.f26568j = true;
        this.f26569k.setImageBitmap(Emoji.getEmojiDrawable(str));
        this.f26569k.setCrossfadeWithOldImage(true);
    }

    @Override
    public final void setAlpha(int i10) {
        float f10 = i10 / 255.0f;
        this.f26570l = f10;
        nh.y2 y2Var = this.f26569k;
        if (y2Var != null) {
            y2Var.setAlpha(f10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f26569k != null && this.e != null) {
            if (c()) {
                this.f26569k.setColorFilter(colorFilter);
                return;
            }
            return;
        }
        this.f26574p = colorFilter;
    }

    public final void t(long j10) {
        nh.y2 y2Var = this.f26569k;
        if (y2Var != null) {
            if (this.f26566g == 8) {
                j10 = 0;
            }
            if (y2Var.getLottieAnimation() != null) {
                this.f26569k.getLottieAnimation().S(j10);
            }
            if (this.f26569k.getAnimation() != null) {
                this.f26569k.getAnimation().D(j10);
            }
        }
    }

    public final String toString() {
        String findAnimatedEmojiEmoticon;
        StringBuilder sb = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.e;
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
        if (this.f26569k != null) {
            ArrayList arrayList2 = this.f26563b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f26564c) != null && arrayList.size() > 0) || this.f26571m)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 != this.f26562a) {
                this.f26562a = z4;
                if (z4) {
                    this.f26569k.onAttachedToWindow();
                } else {
                    this.f26569k.onDetachedFromWindow();
                }
                if (!this.f26562a) {
                    cg.n0 n0Var = v;
                    AndroidUtilities.cancelRunOnUIThread(n0Var);
                    AndroidUtilities.runOnUIThread(n0Var, 5000L);
                }
            }
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.f26566g;
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
        int i10 = this.f26566g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.f20277y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f20277y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f20277y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f20099o2.descent()) + Math.abs(org.telegram.ui.ActionBar.j6.f20099o2.ascent())) * 1.15f) / AndroidUtilities.density);
    }

    public l5(int i10, int i11, TLRPC.Document document) {
        this.f26566g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
