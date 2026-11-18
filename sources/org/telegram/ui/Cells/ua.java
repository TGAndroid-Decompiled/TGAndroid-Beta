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
import org.telegram.messenger.fc;
import org.telegram.messenger.hf;
import org.telegram.messenger.mz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.rc1;
import org.telegram.ui.sc1;
public final class ua extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final fi.t3 f32045a;
    public final ImageView f32046b;
    public final CheckBox f32047c;
    public final View d;
    public boolean f32048e;
    public AnimatorSet f32049f;
    public Object h;
    public int f32050n;
    public int f32051r;
    public final va f32052s;

    public ua(va vaVar, Context context) {
        super(context);
        this.f32052s = vaVar;
        setWillNotDraw(false);
        fi.t3 t3Var = new fi.t3(4, context, this);
        this.f32045a = t3Var;
        addView(t3Var, c8.ma.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f32046b = imageView;
        imageView.setImageResource(2131231272);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ma.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
        addView(view, c8.ma.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, 2131232678);
        this.f32047c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.i7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524k7, false));
        addView(checkBox, c8.ma.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int V0;
        long j3;
        long j10;
        int V02;
        org.telegram.ui.Components.q9 q9Var;
        this.h = obj;
        org.telegram.ui.Components.q9 q9Var2 = this.f32045a;
        int i7 = 0;
        q9Var2.setVisibility(0);
        this.f32046b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        q9Var2.setBackgroundDrawable(null);
        q9Var2.getImageReceiver().f22653p1 = null;
        q9Var2.getImageReceiver().setAlpha(1.0f);
        q9Var2.getImageReceiver().Z(null);
        q9Var2.getImageReceiver().m0(null);
        if (obj == obj2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32048e = z10;
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
                    bb0 bb0Var = new bb0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.n6.I.q()) {
                        q9Var2.getImageReceiver().m0(bb0Var.f33635k);
                    } else {
                        q9Var2.setBackground(bb0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            q9Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    V02 = bb0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    q9Var2.setBackgroundColor(org.telegram.ui.ActionBar.n6.a1(wallPaperSettings.background_color));
                    V02 = org.telegram.messenger.g0.V0(tL_wallPaper.settings.background_color, false);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    q9Var2.getImageReceiver().f22653p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(V02, false), PorterDuff.Mode.SRC_IN);
                }
                if (photoSize != null) {
                    fc c10 = fc.c(photoSize, tL_wallPaper.document);
                    fc c11 = fc.c(w10, tL_wallPaper.document);
                    q9Var = q9Var2;
                    q9Var.g(1, j10, tL_wallPaper, "180_180", null, "jpg", c10, c11);
                } else {
                    fc c12 = fc.c(w10, tL_wallPaper.document);
                    q9Var = q9Var2;
                    q9Var.g(1, j10, tL_wallPaper, "180_180", null, "jpg", c12, null);
                }
                q9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                q9Var2.g(1, j10, tL_wallPaper, "180_180", "100_100_b", "jpg", fc.c(photoSize, tL_wallPaper.document), fc.c(w10, tL_wallPaper.document));
            } else {
                q9Var2.g(1, j10, tL_wallPaper, "180_180", "100_100_b", "jpg", fc.b(tL_wallPaper.document), fc.c(w10, tL_wallPaper.document));
            }
        } else if (obj instanceof rc1) {
            rc1 rc1Var = (rc1) obj;
            File file = rc1Var.f51559i;
            int i10 = rc1Var.d;
            int i11 = rc1Var.f51555c;
            int i12 = rc1Var.f51554b;
            if (file == null && rc1Var.f51558g == null && !"d".equals(rc1Var.f51553a)) {
                q9Var2.setImageBitmap(null);
                if (rc1Var.f51561k) {
                    q9Var2.setBackground(new bb0(true, rc1Var.f51554b, rc1Var.f51555c, rc1Var.d, rc1Var.f51556e));
                    return;
                } else if (i11 != 0) {
                    q9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                    return;
                } else {
                    q9Var2.setBackgroundColor(i12 | (-16777216));
                    return;
                }
            }
            if (i10 != 0) {
                bb0 bb0Var2 = new bb0(true, rc1Var.f51554b, rc1Var.f51555c, rc1Var.d, rc1Var.f51556e);
                if (rc1Var.h >= 0.0f) {
                    q9Var2.setBackground(new bb0(true, rc1Var.f51554b, rc1Var.f51555c, rc1Var.d, rc1Var.f51556e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        q9Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    q9Var2.getImageReceiver().m0(bb0Var2.f33635k);
                }
                V0 = bb0.g(i12, i11, i10, rc1Var.f51556e);
            } else {
                V0 = org.telegram.messenger.g0.V0(i12, false);
            }
            int i13 = V0;
            if ("d".equals(rc1Var.f51553a)) {
                if (rc1Var.f51563m == null) {
                    rc1Var.f51563m = mz.d(2131623998, 100, 180, -16777216);
                }
                q9Var2.setImageBitmap(rc1Var.f51563m);
                q9Var2.getImageReceiver().setAlpha(Math.abs(rc1Var.h));
            } else if (file != null) {
                q9Var2.h(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(rc1Var.f51558g.document.thumbs, 100, false, null, false);
                if (w12 != null) {
                    j3 = w12.size;
                } else {
                    j3 = rc1Var.f51558g.document.size;
                }
                q9Var2.g(1, j3, rc1Var.f51558g, "180_180", null, "jpg", fc.c(w12, rc1Var.f51558g.document), null);
                q9Var2.getImageReceiver().setAlpha(Math.abs(rc1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i10 != 0) {
                    return;
                }
                q9Var2.getImageReceiver().f22653p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(i13, false), PorterDuff.Mode.SRC_IN);
            }
        } else if (obj instanceof sc1) {
            sc1 sc1Var = (sc1) obj;
            File file2 = sc1Var.f51979e;
            if (file2 != null) {
                q9Var2.h(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = sc1Var.d;
            if (file3 != null) {
                q9Var2.h(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(sc1Var.f51976a)) {
                q9Var2.setImageDrawable(org.telegram.ui.ActionBar.n6.Z0(q9Var2, true));
            } else {
                q9Var2.setImageResource(sc1Var.f51978c);
            }
        } else if (obj instanceof hf) {
            hf hfVar = (hf) obj;
            TLRPC.Photo photo = hfVar.K;
            if (photo != null) {
                TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(100), false, null, false);
                TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(hfVar.K.sizes, org.telegram.messenger.g0.L(180), false, null, false);
                if (w14 == w13) {
                    w14 = null;
                }
                if (w14 != null) {
                    i7 = w14.size;
                }
                q9Var2.g(1, i7, hfVar, "180_180", "100_100_b", "jpg", fc.i(w14, hfVar.K), fc.i(w13, hfVar.K));
                return;
            }
            q9Var2.h(hfVar.D, "180_180", null);
        } else {
            this.f32048e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f32049f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f32049f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f32045a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        va vaVar = this.f32052s;
        if (!vaVar.f32189b || !this.f32047c.f32823y) {
            fi.t3 t3Var = this.f32045a;
            if (t3Var.getImageReceiver().I() && t3Var.getImageReceiver().f22641i1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), vaVar.f32195s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.i7, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524k7, false);
            CheckBox checkBox = this.f32047c;
            if (checkBox != null) {
                if (x02 == this.f32050n) {
                    if (x03 != this.f32051r) {
                    }
                }
                this.f32050n = x02;
                this.f32051r = x03;
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
