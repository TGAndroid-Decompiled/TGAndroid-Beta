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
import org.telegram.messenger.gc;
import org.telegram.messenger.jf;
import org.telegram.messenger.qz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.oc1;
import org.telegram.ui.pc1;
public final class sa extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final fi.v3 f31434a;
    public final ImageView f31435b;
    public final CheckBox f31436c;
    public final View d;
    public boolean f31437e;
    public AnimatorSet f31438f;
    public Object h;
    public int f31439n;
    public int f31440r;
    public final ta f31441s;

    public sa(ta taVar, Context context) {
        super(context);
        this.f31441s = taVar;
        setWillNotDraw(false);
        fi.v3 v3Var = new fi.v3(4, context, this);
        this.f31434a = v3Var;
        addView(v3Var, c8.ja.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f31435b = imageView;
        imageView.setImageResource(2131231272);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ja.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
        addView(view, c8.ja.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, 2131232677);
        this.f31436c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28979k7, false));
        addView(checkBox, c8.ja.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int V0;
        long j3;
        long j10;
        int V02;
        org.telegram.ui.Components.i9 i9Var;
        this.h = obj;
        org.telegram.ui.Components.i9 i9Var2 = this.f31434a;
        int i7 = 0;
        i9Var2.setVisibility(0);
        this.f31435b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        i9Var2.setBackgroundDrawable(null);
        i9Var2.getImageReceiver().f22290p1 = null;
        i9Var2.getImageReceiver().setAlpha(1.0f);
        i9Var2.getImageReceiver().Z(null);
        i9Var2.getImageReceiver().m0(null);
        if (obj == obj2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31437e = z10;
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
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.j6.I.q()) {
                        i9Var2.getImageReceiver().m0(ra0Var.f38926k);
                    } else {
                        i9Var2.setBackground(ra0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            i9Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    V02 = ra0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    i9Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.a1(wallPaperSettings.background_color));
                    V02 = org.telegram.messenger.g0.V0(tL_wallPaper.settings.background_color, false);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    i9Var2.getImageReceiver().f22290p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(V02, false), PorterDuff.Mode.SRC_IN);
                }
                if (photoSize != null) {
                    gc c10 = gc.c(photoSize, tL_wallPaper.document);
                    gc c11 = gc.c(w10, tL_wallPaper.document);
                    i9Var = i9Var2;
                    i9Var.g(1, j10, tL_wallPaper, "180_180", null, "jpg", c10, c11);
                } else {
                    gc c12 = gc.c(w10, tL_wallPaper.document);
                    i9Var = i9Var2;
                    i9Var.g(1, j10, tL_wallPaper, "180_180", null, "jpg", c12, null);
                }
                i9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                i9Var2.g(1, j10, tL_wallPaper, "180_180", "100_100_b", "jpg", gc.c(photoSize, tL_wallPaper.document), gc.c(w10, tL_wallPaper.document));
            } else {
                i9Var2.g(1, j10, tL_wallPaper, "180_180", "100_100_b", "jpg", gc.b(tL_wallPaper.document), gc.c(w10, tL_wallPaper.document));
            }
        } else if (obj instanceof oc1) {
            oc1 oc1Var = (oc1) obj;
            File file = oc1Var.f49933i;
            int i10 = oc1Var.d;
            int i11 = oc1Var.f49929c;
            int i12 = oc1Var.f49928b;
            if (file == null && oc1Var.f49932g == null && !"d".equals(oc1Var.f49927a)) {
                i9Var2.setImageBitmap(null);
                if (oc1Var.f49935k) {
                    i9Var2.setBackground(new ra0(true, oc1Var.f49928b, oc1Var.f49929c, oc1Var.d, oc1Var.f49930e));
                    return;
                } else if (i11 != 0) {
                    i9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                    return;
                } else {
                    i9Var2.setBackgroundColor(i12 | (-16777216));
                    return;
                }
            }
            if (i10 != 0) {
                ra0 ra0Var2 = new ra0(true, oc1Var.f49928b, oc1Var.f49929c, oc1Var.d, oc1Var.f49930e);
                if (oc1Var.h >= 0.0f) {
                    i9Var2.setBackground(new ra0(true, oc1Var.f49928b, oc1Var.f49929c, oc1Var.d, oc1Var.f49930e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        i9Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    i9Var2.getImageReceiver().m0(ra0Var2.f38926k);
                }
                V0 = ra0.g(i12, i11, i10, oc1Var.f49930e);
            } else {
                V0 = org.telegram.messenger.g0.V0(i12, false);
            }
            int i13 = V0;
            if ("d".equals(oc1Var.f49927a)) {
                if (oc1Var.f49937m == null) {
                    oc1Var.f49937m = qz.d(2131623998, 100, 180, -16777216);
                }
                i9Var2.setImageBitmap(oc1Var.f49937m);
                i9Var2.getImageReceiver().setAlpha(Math.abs(oc1Var.h));
            } else if (file != null) {
                i9Var2.h(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(oc1Var.f49932g.document.thumbs, 100, false, null, false);
                if (w12 != null) {
                    j3 = w12.size;
                } else {
                    j3 = oc1Var.f49932g.document.size;
                }
                i9Var2.g(1, j3, oc1Var.f49932g, "180_180", null, "jpg", gc.c(w12, oc1Var.f49932g.document), null);
                i9Var2.getImageReceiver().setAlpha(Math.abs(oc1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i10 != 0) {
                    return;
                }
                i9Var2.getImageReceiver().f22290p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(i13, false), PorterDuff.Mode.SRC_IN);
            }
        } else if (obj instanceof pc1) {
            pc1 pc1Var = (pc1) obj;
            File file2 = pc1Var.f50255e;
            if (file2 != null) {
                i9Var2.h(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = pc1Var.d;
            if (file3 != null) {
                i9Var2.h(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(pc1Var.f50252a)) {
                i9Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.Z0(i9Var2, true));
            } else {
                i9Var2.setImageResource(pc1Var.f50254c);
            }
        } else if (obj instanceof jf) {
            jf jfVar = (jf) obj;
            TLRPC.Photo photo = jfVar.K;
            if (photo != null) {
                TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(100), false, null, false);
                TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(jfVar.K.sizes, org.telegram.messenger.g0.L(180), false, null, false);
                if (w14 == w13) {
                    w14 = null;
                }
                if (w14 != null) {
                    i7 = w14.size;
                }
                i9Var2.g(1, i7, jfVar, "180_180", "100_100_b", "jpg", gc.i(w14, jfVar.K), gc.i(w13, jfVar.K));
                return;
            }
            i9Var2.h(jfVar.D, "180_180", null);
        } else {
            this.f31437e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f31438f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f31438f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31434a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ta taVar = this.f31441s;
        if (!taVar.f31692b || !this.f31436c.f32426y) {
            fi.v3 v3Var = this.f31434a;
            if (v3Var.getImageReceiver().I() && v3Var.getImageReceiver().f22278i1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), taVar.f31698s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i7, false);
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28979k7, false);
            CheckBox checkBox = this.f31436c;
            if (checkBox != null) {
                if (x02 == this.f31439n) {
                    if (x03 != this.f31440r) {
                    }
                }
                this.f31439n = x02;
                this.f31440r = x03;
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
