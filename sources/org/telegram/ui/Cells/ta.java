package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.util.HashSet;
import org.telegram.messenger.hc;
import org.telegram.messenger.kf;
import org.telegram.messenger.sz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.sc1;
import org.telegram.ui.tc1;
public final class ta extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final di.d4 f30548a;
    public final ImageView f30549b;
    public final CheckBox f30550c;
    public final View d;
    public boolean f30551e;
    public AnimatorSet f30552f;
    public Object h;
    public int f30553n;
    public int f30554r;
    public final ua f30555s;

    public ta(ua uaVar, Context context) {
        super(context);
        this.f30555s = uaVar;
        setWillNotDraw(false);
        di.d4 d4Var = new di.d4(4, context, this);
        this.f30548a = d4Var;
        addView(d4Var, c8.ha.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f30549b = imageView;
        imageView.setImageResource(2131231272);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.N0(false));
        addView(view, c8.ha.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, 2131232676);
        this.f30550c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.i7, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27995k7, false));
        addView(checkBox, c8.ha.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z9;
        int V0;
        long j3;
        long j10;
        int V02;
        org.telegram.ui.Components.l9 l9Var;
        this.h = obj;
        org.telegram.ui.Components.l9 l9Var2 = this.f30548a;
        int i7 = 0;
        l9Var2.setVisibility(0);
        this.f30549b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        l9Var2.setBackgroundDrawable(null);
        l9Var2.getImageReceiver().f21209o1 = null;
        l9Var2.getImageReceiver().setAlpha(1.0f);
        l9Var2.getImageReceiver().Z(null);
        l9Var2.getImageReceiver().m0(null);
        if (obj == obj2) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f30551e = z9;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(100), false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(180), false, null, false);
            if (w11 != w10) {
                photoSize = w11;
            }
            if (photoSize != null) {
                j10 = photoSize.size;
            } else {
                j10 = tL_wallPaper.document.size;
            }
            if (tL_wallPaper.pattern) {
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                if (wallPaperSettings.third_background_color != 0) {
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                    ra0 ra0Var = new ra0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.l6.I.q()) {
                        l9Var2.getImageReceiver().m0(ra0Var.f37624k);
                    } else {
                        l9Var2.setBackground(ra0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            l9Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    V02 = ra0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    l9Var2.setBackgroundColor(org.telegram.ui.ActionBar.l6.a1(wallPaperSettings.background_color));
                    V02 = org.telegram.messenger.g0.V0(tL_wallPaper.settings.background_color, false);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    l9Var2.getImageReceiver().f21209o1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(V02, false), PorterDuff.Mode.SRC_IN);
                }
                if (photoSize != null) {
                    hc c10 = hc.c(photoSize, tL_wallPaper.document);
                    hc c11 = hc.c(w10, tL_wallPaper.document);
                    l9Var = l9Var2;
                    l9Var.g(1, j10, tL_wallPaper, "180_180", null, "jpg", c10, c11);
                } else {
                    hc c12 = hc.c(w10, tL_wallPaper.document);
                    l9Var = l9Var2;
                    l9Var.g(1, j10, tL_wallPaper, "180_180", null, "jpg", c12, null);
                }
                l9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                l9Var2.g(1, j10, tL_wallPaper, "180_180", "100_100_b", "jpg", hc.c(photoSize, tL_wallPaper.document), hc.c(w10, tL_wallPaper.document));
            } else {
                l9Var2.g(1, j10, tL_wallPaper, "180_180", "100_100_b", "jpg", hc.b(tL_wallPaper.document), hc.c(w10, tL_wallPaper.document));
            }
        } else if (obj instanceof sc1) {
            sc1 sc1Var = (sc1) obj;
            File file = sc1Var.f49880i;
            int i10 = sc1Var.d;
            int i11 = sc1Var.f49876c;
            int i12 = sc1Var.f49875b;
            if (file == null && sc1Var.f49879g == null && !"d".equals(sc1Var.f49874a)) {
                l9Var2.setImageBitmap(null);
                if (sc1Var.f49882k) {
                    l9Var2.setBackground(new ra0(true, sc1Var.f49875b, sc1Var.f49876c, sc1Var.d, sc1Var.f49877e));
                    return;
                } else if (i11 != 0) {
                    l9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                    return;
                } else {
                    l9Var2.setBackgroundColor(i12 | (-16777216));
                    return;
                }
            }
            if (i10 != 0) {
                ra0 ra0Var2 = new ra0(true, sc1Var.f49875b, sc1Var.f49876c, sc1Var.d, sc1Var.f49877e);
                if (sc1Var.h >= 0.0f) {
                    l9Var2.setBackground(new ra0(true, sc1Var.f49875b, sc1Var.f49876c, sc1Var.d, sc1Var.f49877e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        l9Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    l9Var2.getImageReceiver().m0(ra0Var2.f37624k);
                }
                V0 = ra0.g(i12, i11, i10, sc1Var.f49877e);
            } else {
                V0 = org.telegram.messenger.g0.V0(i12, false);
            }
            int i13 = V0;
            if ("d".equals(sc1Var.f49874a)) {
                if (sc1Var.f49884m == null) {
                    sc1Var.f49884m = sz.d(2131623997, 100, 180, -16777216);
                }
                l9Var2.setImageBitmap(sc1Var.f49884m);
                l9Var2.getImageReceiver().setAlpha(Math.abs(sc1Var.h));
            } else if (file != null) {
                l9Var2.h(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(sc1Var.f49879g.document.thumbs, 100, false, null, false);
                if (w12 != null) {
                    j3 = w12.size;
                } else {
                    j3 = sc1Var.f49879g.document.size;
                }
                l9Var2.g(1, j3, sc1Var.f49879g, "180_180", null, "jpg", hc.c(w12, sc1Var.f49879g.document), null);
                l9Var2.getImageReceiver().setAlpha(Math.abs(sc1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i10 != 0) {
                    return;
                }
                l9Var2.getImageReceiver().f21209o1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(i13, false), PorterDuff.Mode.SRC_IN);
            }
        } else if (obj instanceof tc1) {
            tc1 tc1Var = (tc1) obj;
            File file2 = tc1Var.f50161e;
            if (file2 != null) {
                l9Var2.h(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = tc1Var.d;
            if (file3 != null) {
                l9Var2.h(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(tc1Var.f50158a)) {
                l9Var2.setImageDrawable(org.telegram.ui.ActionBar.l6.Z0(l9Var2, true));
            } else {
                l9Var2.setImageResource(tc1Var.f50160c);
            }
        } else if (obj instanceof kf) {
            kf kfVar = (kf) obj;
            TLRPC.Photo photo = kfVar.K;
            if (photo != null) {
                TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(100), false, null, false);
                TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(kfVar.K.sizes, org.telegram.messenger.g0.L(180), false, null, false);
                if (w14 == w13) {
                    w14 = null;
                }
                if (w14 != null) {
                    i7 = w14.size;
                }
                l9Var2.g(1, i7, kfVar, "180_180", "100_100_b", "jpg", hc.i(w14, kfVar.K), hc.i(w13, kfVar.K));
                return;
            }
            l9Var2.h(kfVar.D, "180_180", null);
        } else {
            this.f30551e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f30552f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f30552f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f30548a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ua uaVar = this.f30555s;
        if (!uaVar.f30598b || !this.f30550c.f31253y) {
            di.d4 d4Var = this.f30548a;
            if (d4Var.getImageReceiver().I() && d4Var.getImageReceiver().f21197h1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), uaVar.f30604s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.i7, false);
            int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27995k7, false);
            CheckBox checkBox = this.f30550c;
            if (checkBox != null) {
                if (x02 == this.f30553n) {
                    if (x03 != this.f30554r) {
                    }
                }
                this.f30553n = x02;
                this.f30554r = x03;
                checkBox.c(x02, x03);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
