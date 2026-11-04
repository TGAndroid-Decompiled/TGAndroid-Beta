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
import b8.mf;
import java.io.File;
import java.util.HashSet;
import org.telegram.messenger.ac;
import org.telegram.messenger.bf;
import org.telegram.messenger.kz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.la0;
import org.telegram.ui.kc1;
import org.telegram.ui.lc1;
public final class sa extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ei.d4 f30358a;
    public final ImageView f30359b;
    public final CheckBox f30360c;
    public final View d;
    public boolean f30361e;
    public AnimatorSet f30362f;
    public Object h;
    public int f30363n;
    public int f30364r;
    public final ta f30365s;

    public sa(ta taVar, Context context) {
        super(context);
        this.f30365s = taVar;
        setWillNotDraw(false);
        ei.d4 d4Var = new ei.d4(4, context, this);
        this.f30358a = d4Var;
        addView(d4Var, mf.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f30359b = imageView;
        imageView.setImageResource(2131231272);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, mf.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
        addView(view, mf.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, 2131232674);
        this.f30360c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27973i7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28008k7, false));
        addView(checkBox, mf.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int V0;
        long j10;
        long j11;
        int V02;
        org.telegram.ui.Components.k9 k9Var;
        this.h = obj;
        org.telegram.ui.Components.k9 k9Var2 = this.f30358a;
        int i3 = 0;
        k9Var2.setVisibility(0);
        this.f30359b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        k9Var2.setBackgroundDrawable(null);
        k9Var2.getImageReceiver().f21261p1 = null;
        k9Var2.getImageReceiver().setAlpha(1.0f);
        k9Var2.getImageReceiver().Z(null);
        k9Var2.getImageReceiver().m0(null);
        if (obj == obj2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30361e = z10;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(100), false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(180), false, null, false);
            if (w11 != w10) {
                photoSize = w11;
            }
            if (photoSize != null) {
                j11 = photoSize.size;
            } else {
                j11 = tL_wallPaper.document.size;
            }
            if (tL_wallPaper.pattern) {
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                if (wallPaperSettings.third_background_color != 0) {
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                    la0 la0Var = new la0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.k6.I.q()) {
                        k9Var2.getImageReceiver().m0(la0Var.f35658k);
                    } else {
                        k9Var2.setBackground(la0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            k9Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    V02 = la0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    k9Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.a1(wallPaperSettings.background_color));
                    V02 = org.telegram.messenger.g0.V0(tL_wallPaper.settings.background_color, false);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    k9Var2.getImageReceiver().f21261p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(V02, false), PorterDuff.Mode.SRC_IN);
                }
                if (photoSize != null) {
                    ac c2 = ac.c(photoSize, tL_wallPaper.document);
                    ac c10 = ac.c(w10, tL_wallPaper.document);
                    k9Var = k9Var2;
                    k9Var.g(1, j11, tL_wallPaper, "180_180", null, "jpg", c2, c10);
                } else {
                    ac c11 = ac.c(w10, tL_wallPaper.document);
                    k9Var = k9Var2;
                    k9Var.g(1, j11, tL_wallPaper, "180_180", null, "jpg", c11, null);
                }
                k9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                k9Var2.g(1, j11, tL_wallPaper, "180_180", "100_100_b", "jpg", ac.c(photoSize, tL_wallPaper.document), ac.c(w10, tL_wallPaper.document));
            } else {
                k9Var2.g(1, j11, tL_wallPaper, "180_180", "100_100_b", "jpg", ac.b(tL_wallPaper.document), ac.c(w10, tL_wallPaper.document));
            }
        } else if (obj instanceof kc1) {
            kc1 kc1Var = (kc1) obj;
            File file = kc1Var.f46903i;
            int i10 = kc1Var.d;
            int i11 = kc1Var.f46899c;
            int i12 = kc1Var.f46898b;
            if (file == null && kc1Var.f46902g == null && !"d".equals(kc1Var.f46897a)) {
                k9Var2.setImageBitmap(null);
                if (kc1Var.f46905k) {
                    k9Var2.setBackground(new la0(true, kc1Var.f46898b, kc1Var.f46899c, kc1Var.d, kc1Var.f46900e));
                    return;
                } else if (i11 != 0) {
                    k9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                    return;
                } else {
                    k9Var2.setBackgroundColor(i12 | (-16777216));
                    return;
                }
            }
            if (i10 != 0) {
                la0 la0Var2 = new la0(true, kc1Var.f46898b, kc1Var.f46899c, kc1Var.d, kc1Var.f46900e);
                if (kc1Var.h >= 0.0f) {
                    k9Var2.setBackground(new la0(true, kc1Var.f46898b, kc1Var.f46899c, kc1Var.d, kc1Var.f46900e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        k9Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    k9Var2.getImageReceiver().m0(la0Var2.f35658k);
                }
                V0 = la0.g(i12, i11, i10, kc1Var.f46900e);
            } else {
                V0 = org.telegram.messenger.g0.V0(i12, false);
            }
            int i13 = V0;
            if ("d".equals(kc1Var.f46897a)) {
                if (kc1Var.f46907m == null) {
                    kc1Var.f46907m = kz.d(2131623997, 100, 180, -16777216);
                }
                k9Var2.setImageBitmap(kc1Var.f46907m);
                k9Var2.getImageReceiver().setAlpha(Math.abs(kc1Var.h));
            } else if (file != null) {
                k9Var2.h(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(kc1Var.f46902g.document.thumbs, 100, false, null, false);
                if (w12 != null) {
                    j10 = w12.size;
                } else {
                    j10 = kc1Var.f46902g.document.size;
                }
                k9Var2.g(1, j10, kc1Var.f46902g, "180_180", null, "jpg", ac.c(w12, kc1Var.f46902g.document), null);
                k9Var2.getImageReceiver().setAlpha(Math.abs(kc1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i10 != 0) {
                    return;
                }
                k9Var2.getImageReceiver().f21261p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(i13, false), PorterDuff.Mode.SRC_IN);
            }
        } else if (obj instanceof lc1) {
            lc1 lc1Var = (lc1) obj;
            File file2 = lc1Var.f47304e;
            if (file2 != null) {
                k9Var2.h(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = lc1Var.d;
            if (file3 != null) {
                k9Var2.h(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(lc1Var.f47301a)) {
                k9Var2.setImageDrawable(org.telegram.ui.ActionBar.k6.Z0(k9Var2, true));
            } else {
                k9Var2.setImageResource(lc1Var.f47303c);
            }
        } else if (obj instanceof bf) {
            bf bfVar = (bf) obj;
            TLRPC.Photo photo = bfVar.K;
            if (photo != null) {
                TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(100), false, null, false);
                TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(bfVar.K.sizes, org.telegram.messenger.g0.L(180), false, null, false);
                if (w14 == w13) {
                    w14 = null;
                }
                if (w14 != null) {
                    i3 = w14.size;
                }
                k9Var2.g(1, i3, bfVar, "180_180", "100_100_b", "jpg", ac.i(w14, bfVar.K), ac.i(w13, bfVar.K));
                return;
            }
            k9Var2.h(bfVar.D, "180_180", null);
        } else {
            this.f30361e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f30362f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f30362f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f30358a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ta taVar = this.f30365s;
        if (!taVar.f30616b || !this.f30360c.f31319y) {
            ei.d4 d4Var = this.f30358a;
            if (d4Var.getImageReceiver().I() && d4Var.getImageReceiver().f21249i1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), taVar.f30622s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27973i7, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28008k7, false);
            CheckBox checkBox = this.f30360c;
            if (checkBox != null) {
                if (x02 == this.f30363n) {
                    if (x03 != this.f30364r) {
                    }
                }
                this.f30363n = x02;
                this.f30364r = x03;
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
