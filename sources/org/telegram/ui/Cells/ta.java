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
import org.telegram.ui.Components.qa0;
import org.telegram.ui.pc1;
import org.telegram.ui.qc1;
public final class ta extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final di.c4 f30544a;
    public final ImageView f30545b;
    public final CheckBox f30546c;
    public final View d;
    public boolean f30547e;
    public AnimatorSet f30548f;
    public Object h;
    public int f30549n;
    public int f30550r;
    public final ua f30551s;

    public ta(ua uaVar, Context context) {
        super(context);
        this.f30551s = uaVar;
        setWillNotDraw(false);
        di.c4 c4Var = new di.c4(4, context, this);
        this.f30544a = c4Var;
        addView(c4Var, c8.ha.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f30545b = imageView;
        imageView.setImageResource(2131231272);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
        addView(view, c8.ha.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, 2131232676);
        this.f30546c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27982k7, false));
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
        org.telegram.ui.Components.l9 l9Var2 = this.f30544a;
        int i7 = 0;
        l9Var2.setVisibility(0);
        this.f30545b.setVisibility(4);
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
        this.f30547e = z9;
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
                    qa0 qa0Var = new qa0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.k6.I.q()) {
                        l9Var2.getImageReceiver().m0(qa0Var.f37260k);
                    } else {
                        l9Var2.setBackground(qa0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            l9Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    V02 = qa0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    l9Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.a1(wallPaperSettings.background_color));
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
        } else if (obj instanceof pc1) {
            pc1 pc1Var = (pc1) obj;
            File file = pc1Var.f48799i;
            int i10 = pc1Var.d;
            int i11 = pc1Var.f48795c;
            int i12 = pc1Var.f48794b;
            if (file == null && pc1Var.f48798g == null && !"d".equals(pc1Var.f48793a)) {
                l9Var2.setImageBitmap(null);
                if (pc1Var.f48801k) {
                    l9Var2.setBackground(new qa0(true, pc1Var.f48794b, pc1Var.f48795c, pc1Var.d, pc1Var.f48796e));
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
                qa0 qa0Var2 = new qa0(true, pc1Var.f48794b, pc1Var.f48795c, pc1Var.d, pc1Var.f48796e);
                if (pc1Var.h >= 0.0f) {
                    l9Var2.setBackground(new qa0(true, pc1Var.f48794b, pc1Var.f48795c, pc1Var.d, pc1Var.f48796e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        l9Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    l9Var2.getImageReceiver().m0(qa0Var2.f37260k);
                }
                V0 = qa0.g(i12, i11, i10, pc1Var.f48796e);
            } else {
                V0 = org.telegram.messenger.g0.V0(i12, false);
            }
            int i13 = V0;
            if ("d".equals(pc1Var.f48793a)) {
                if (pc1Var.f48803m == null) {
                    pc1Var.f48803m = sz.d(2131623997, 100, 180, -16777216);
                }
                l9Var2.setImageBitmap(pc1Var.f48803m);
                l9Var2.getImageReceiver().setAlpha(Math.abs(pc1Var.h));
            } else if (file != null) {
                l9Var2.h(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(pc1Var.f48798g.document.thumbs, 100, false, null, false);
                if (w12 != null) {
                    j3 = w12.size;
                } else {
                    j3 = pc1Var.f48798g.document.size;
                }
                l9Var2.g(1, j3, pc1Var.f48798g, "180_180", null, "jpg", hc.c(w12, pc1Var.f48798g.document), null);
                l9Var2.getImageReceiver().setAlpha(Math.abs(pc1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i10 != 0) {
                    return;
                }
                l9Var2.getImageReceiver().f21209o1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(i13, false), PorterDuff.Mode.SRC_IN);
            }
        } else if (obj instanceof qc1) {
            qc1 qc1Var = (qc1) obj;
            File file2 = qc1Var.f49203e;
            if (file2 != null) {
                l9Var2.h(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = qc1Var.d;
            if (file3 != null) {
                l9Var2.h(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(qc1Var.f49200a)) {
                l9Var2.setImageDrawable(org.telegram.ui.ActionBar.k6.Z0(l9Var2, true));
            } else {
                l9Var2.setImageResource(qc1Var.f49202c);
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
            this.f30547e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f30548f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f30548f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f30544a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ua uaVar = this.f30551s;
        if (!uaVar.f30594b || !this.f30546c.f31248y) {
            di.c4 c4Var = this.f30544a;
            if (c4Var.getImageReceiver().I() && c4Var.getImageReceiver().f21197h1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), uaVar.f30600s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i7, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27982k7, false);
            CheckBox checkBox = this.f30546c;
            if (checkBox != null) {
                if (x02 == this.f30549n) {
                    if (x03 != this.f30550r) {
                    }
                }
                this.f30549n = x02;
                this.f30550r = x03;
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
