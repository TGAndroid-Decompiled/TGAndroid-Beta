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
import org.telegram.messenger.lz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.za0;
import org.telegram.ui.pc1;
import org.telegram.ui.qc1;
public final class va extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final fi.t3 f32294a;
    public final ImageView f32295b;
    public final CheckBox f32296c;
    public final View d;
    public boolean f32297e;
    public AnimatorSet f32298f;
    public Object h;
    public int f32299n;
    public int f32300r;
    public final wa f32301s;

    public va(wa waVar, Context context) {
        super(context);
        this.f32301s = waVar;
        setWillNotDraw(false);
        fi.t3 t3Var = new fi.t3(4, context, this);
        this.f32294a = t3Var;
        addView(t3Var, c8.na.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f32295b = imageView;
        imageView.setImageResource(2131231275);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.na.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
        addView(view, c8.na.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, 2131232681);
        this.f32296c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.i7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29581k7, false));
        addView(checkBox, c8.na.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int V0;
        long j3;
        long j10;
        int V02;
        org.telegram.ui.Components.p9 p9Var;
        this.h = obj;
        org.telegram.ui.Components.p9 p9Var2 = this.f32294a;
        int i7 = 0;
        p9Var2.setVisibility(0);
        this.f32295b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        p9Var2.setBackgroundDrawable(null);
        p9Var2.getImageReceiver().f22751p1 = null;
        p9Var2.getImageReceiver().setAlpha(1.0f);
        p9Var2.getImageReceiver().a0(null);
        p9Var2.getImageReceiver().n0(null);
        if (obj == obj2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32297e = z10;
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
                    za0 za0Var = new za0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.n6.I.q()) {
                        p9Var2.getImageReceiver().n0(za0Var.f42795k);
                    } else {
                        p9Var2.setBackground(za0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            p9Var2.getImageReceiver().a0(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    V02 = za0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    p9Var2.setBackgroundColor(org.telegram.ui.ActionBar.n6.a1(wallPaperSettings.background_color));
                    V02 = org.telegram.messenger.g0.V0(tL_wallPaper.settings.background_color, false);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    p9Var2.getImageReceiver().f22751p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(V02, false), PorterDuff.Mode.SRC_IN);
                }
                if (photoSize != null) {
                    fc c10 = fc.c(photoSize, tL_wallPaper.document);
                    fc c11 = fc.c(w10, tL_wallPaper.document);
                    p9Var = p9Var2;
                    p9Var.g(1, j10, tL_wallPaper, "180_180", null, "jpg", c10, c11);
                } else {
                    fc c12 = fc.c(w10, tL_wallPaper.document);
                    p9Var = p9Var2;
                    p9Var.g(1, j10, tL_wallPaper, "180_180", null, "jpg", c12, null);
                }
                p9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                p9Var2.g(1, j10, tL_wallPaper, "180_180", "100_100_b", "jpg", fc.c(photoSize, tL_wallPaper.document), fc.c(w10, tL_wallPaper.document));
            } else {
                p9Var2.g(1, j10, tL_wallPaper, "180_180", "100_100_b", "jpg", fc.b(tL_wallPaper.document), fc.c(w10, tL_wallPaper.document));
            }
        } else if (obj instanceof pc1) {
            pc1 pc1Var = (pc1) obj;
            File file = pc1Var.f50985i;
            int i10 = pc1Var.d;
            int i11 = pc1Var.f50981c;
            int i12 = pc1Var.f50980b;
            if (file == null && pc1Var.f50984g == null && !"d".equals(pc1Var.f50979a)) {
                p9Var2.setImageBitmap(null);
                if (pc1Var.f50987k) {
                    p9Var2.setBackground(new za0(true, pc1Var.f50980b, pc1Var.f50981c, pc1Var.d, pc1Var.f50982e));
                    return;
                } else if (i11 != 0) {
                    p9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                    return;
                } else {
                    p9Var2.setBackgroundColor(i12 | (-16777216));
                    return;
                }
            }
            if (i10 != 0) {
                za0 za0Var2 = new za0(true, pc1Var.f50980b, pc1Var.f50981c, pc1Var.d, pc1Var.f50982e);
                if (pc1Var.h >= 0.0f) {
                    p9Var2.setBackground(new za0(true, pc1Var.f50980b, pc1Var.f50981c, pc1Var.d, pc1Var.f50982e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        p9Var2.getImageReceiver().a0(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    p9Var2.getImageReceiver().n0(za0Var2.f42795k);
                }
                V0 = za0.g(i12, i11, i10, pc1Var.f50982e);
            } else {
                V0 = org.telegram.messenger.g0.V0(i12, false);
            }
            int i13 = V0;
            if ("d".equals(pc1Var.f50979a)) {
                if (pc1Var.f50989m == null) {
                    pc1Var.f50989m = lz.d(2131623998, 100, 180, -16777216);
                }
                p9Var2.setImageBitmap(pc1Var.f50989m);
                p9Var2.getImageReceiver().setAlpha(Math.abs(pc1Var.h));
            } else if (file != null) {
                p9Var2.h(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(pc1Var.f50984g.document.thumbs, 100, false, null, false);
                if (w12 != null) {
                    j3 = w12.size;
                } else {
                    j3 = pc1Var.f50984g.document.size;
                }
                p9Var2.g(1, j3, pc1Var.f50984g, "180_180", null, "jpg", fc.c(w12, pc1Var.f50984g.document), null);
                p9Var2.getImageReceiver().setAlpha(Math.abs(pc1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i10 != 0) {
                    return;
                }
                p9Var2.getImageReceiver().f22751p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(i13, false), PorterDuff.Mode.SRC_IN);
            }
        } else if (obj instanceof qc1) {
            qc1 qc1Var = (qc1) obj;
            File file2 = qc1Var.f51442e;
            if (file2 != null) {
                p9Var2.h(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = qc1Var.d;
            if (file3 != null) {
                p9Var2.h(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(qc1Var.f51439a)) {
                p9Var2.setImageDrawable(org.telegram.ui.ActionBar.n6.Z0(p9Var2, true));
            } else {
                p9Var2.setImageResource(qc1Var.f51441c);
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
                p9Var2.g(1, i7, hfVar, "180_180", "100_100_b", "jpg", fc.i(w14, hfVar.K), fc.i(w13, hfVar.K));
                return;
            }
            p9Var2.h(hfVar.D, "180_180", null);
        } else {
            this.f32297e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f32298f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f32298f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f32294a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wa waVar = this.f32301s;
        if (!waVar.f32365b || !this.f32296c.f32923y) {
            fi.t3 t3Var = this.f32294a;
            if (t3Var.getImageReceiver().J() && t3Var.getImageReceiver().f22739i1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), waVar.f32371s);
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
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29581k7, false);
            CheckBox checkBox = this.f32296c;
            if (checkBox != null) {
                if (x02 == this.f32299n) {
                    if (x03 != this.f32300r) {
                    }
                }
                this.f32299n = x02;
                this.f32300r = x03;
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
