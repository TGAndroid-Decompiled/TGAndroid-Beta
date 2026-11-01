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
import org.telegram.messenger.e00;
import org.telegram.messenger.jc;
import org.telegram.messenger.jf;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.ke1;
import org.telegram.ui.le1;
public final class ta extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final ag.d2 f23111a;
    public final ImageView f23112b;
    public final CheckBox f23113c;
    public final View d;
    public boolean e;
    public AnimatorSet f23114f;
    public Object h;
    public int f23115n;
    public int f23116r;
    public final ua f23117s;

    public ta(ua uaVar, Context context) {
        super(context);
        this.f23117s = uaVar;
        setWillNotDraw(false);
        ag.d2 d2Var = new ag.d2(this, context, 3);
        this.f23111a = d2Var;
        addView(d2Var, w7.b6.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f23112b = imageView;
        imageView.setImageResource(2131231273);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.b6.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
        addView(view, w7.b6.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, 2131232673);
        this.f23113c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21022i7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21060k7, false));
        addView(checkBox, w7.b6.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int V0;
        long j10;
        long j11;
        int V02;
        org.telegram.ui.Components.g9 g9Var;
        this.h = obj;
        org.telegram.ui.Components.g9 g9Var2 = this.f23111a;
        int i10 = 0;
        g9Var2.setVisibility(0);
        this.f23112b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        g9Var2.setBackgroundDrawable(null);
        g9Var2.getImageReceiver().f14398o1 = null;
        g9Var2.getImageReceiver().setAlpha(1.0f);
        g9Var2.getImageReceiver().Z(null);
        g9Var2.getImageReceiver().m0(null);
        if (obj == obj2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(tL_wallPaper.document.thumbs, org.telegram.messenger.i0.L(100), false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(tL_wallPaper.document.thumbs, org.telegram.messenger.i0.L(180), false, null, false);
            if (w10 != w9) {
                photoSize = w10;
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
                    jb0 jb0Var = new jb0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.t6.I.q()) {
                        g9Var2.getImageReceiver().m0(jb0Var.f27342k);
                    } else {
                        g9Var2.setBackground(jb0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g9Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    V02 = jb0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    g9Var2.setBackgroundColor(org.telegram.ui.ActionBar.t6.a1(wallPaperSettings.background_color));
                    V02 = org.telegram.messenger.i0.V0(tL_wallPaper.settings.background_color, false);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    g9Var2.getImageReceiver().f14398o1 = new PorterDuffColorFilter(org.telegram.messenger.i0.V0(V02, false), PorterDuff.Mode.SRC_IN);
                }
                if (photoSize != null) {
                    jc c10 = jc.c(photoSize, tL_wallPaper.document);
                    jc c11 = jc.c(w9, tL_wallPaper.document);
                    g9Var = g9Var2;
                    g9Var.g(1, j11, tL_wallPaper, "180_180", null, "jpg", c10, c11);
                } else {
                    jc c12 = jc.c(w9, tL_wallPaper.document);
                    g9Var = g9Var2;
                    g9Var.g(1, j11, tL_wallPaper, "180_180", null, "jpg", c12, null);
                }
                g9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                g9Var2.g(1, j11, tL_wallPaper, "180_180", "100_100_b", "jpg", jc.c(photoSize, tL_wallPaper.document), jc.c(w9, tL_wallPaper.document));
            } else {
                g9Var2.g(1, j11, tL_wallPaper, "180_180", "100_100_b", "jpg", jc.b(tL_wallPaper.document), jc.c(w9, tL_wallPaper.document));
            }
        } else if (obj instanceof ke1) {
            ke1 ke1Var = (ke1) obj;
            File file = ke1Var.f38864i;
            int i11 = ke1Var.d;
            int i12 = ke1Var.f38861c;
            int i13 = ke1Var.f38860b;
            if (file == null && ke1Var.f38863g == null && !"d".equals(ke1Var.f38859a)) {
                g9Var2.setImageBitmap(null);
                if (ke1Var.f38866k) {
                    g9Var2.setBackground(new jb0(true, ke1Var.f38860b, ke1Var.f38861c, ke1Var.d, ke1Var.e));
                    return;
                } else if (i12 != 0) {
                    g9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i13 | (-16777216), i12 | (-16777216)}));
                    return;
                } else {
                    g9Var2.setBackgroundColor(i13 | (-16777216));
                    return;
                }
            }
            if (i11 != 0) {
                jb0 jb0Var2 = new jb0(true, ke1Var.f38860b, ke1Var.f38861c, ke1Var.d, ke1Var.e);
                if (ke1Var.h >= 0.0f) {
                    g9Var2.setBackground(new jb0(true, ke1Var.f38860b, ke1Var.f38861c, ke1Var.d, ke1Var.e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        g9Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    g9Var2.getImageReceiver().m0(jb0Var2.f27342k);
                }
                V0 = jb0.g(i13, i12, i11, ke1Var.e);
            } else {
                V0 = org.telegram.messenger.i0.V0(i13, false);
            }
            int i14 = V0;
            if ("d".equals(ke1Var.f38859a)) {
                if (ke1Var.f38868m == null) {
                    ke1Var.f38868m = e00.d(2131623997, 100, 180, -16777216);
                }
                g9Var2.setImageBitmap(ke1Var.f38868m);
                g9Var2.getImageReceiver().setAlpha(Math.abs(ke1Var.h));
            } else if (file != null) {
                g9Var2.h(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize w11 = org.telegram.messenger.b8.w(ke1Var.f38863g.document.thumbs, 100, false, null, false);
                if (w11 != null) {
                    j10 = w11.size;
                } else {
                    j10 = ke1Var.f38863g.document.size;
                }
                g9Var2.g(1, j10, ke1Var.f38863g, "180_180", null, "jpg", jc.c(w11, ke1Var.f38863g.document), null);
                g9Var2.getImageReceiver().setAlpha(Math.abs(ke1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i11 != 0) {
                    return;
                }
                g9Var2.getImageReceiver().f14398o1 = new PorterDuffColorFilter(org.telegram.messenger.i0.V0(i14, false), PorterDuff.Mode.SRC_IN);
            }
        } else if (obj instanceof le1) {
            le1 le1Var = (le1) obj;
            File file2 = le1Var.e;
            if (file2 != null) {
                g9Var2.h(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = le1Var.d;
            if (file3 != null) {
                g9Var2.h(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(le1Var.f39263a)) {
                g9Var2.setImageDrawable(org.telegram.ui.ActionBar.t6.Z0(g9Var2, true));
            } else {
                g9Var2.setImageResource(le1Var.f39265c);
            }
        } else if (obj instanceof jf) {
            jf jfVar = (jf) obj;
            TLRPC.Photo photo = jfVar.K;
            if (photo != null) {
                TLRPC.PhotoSize w12 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.L(100), false, null, false);
                TLRPC.PhotoSize w13 = org.telegram.messenger.b8.w(jfVar.K.sizes, org.telegram.messenger.i0.L(180), false, null, false);
                if (w13 == w12) {
                    w13 = null;
                }
                if (w13 != null) {
                    i10 = w13.size;
                }
                g9Var2.g(1, i10, jfVar, "180_180", "100_100_b", "jpg", jc.i(w13, jfVar.K), jc.i(w12, jfVar.K));
                return;
            }
            g9Var2.h(jfVar.D, "180_180", null);
        } else {
            this.e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f23114f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f23114f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f23111a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ua uaVar = this.f23117s;
        if (!uaVar.f23152b || !this.f23113c.f23906y) {
            ag.d2 d2Var = this.f23111a;
            if (d2Var.getImageReceiver().I() && d2Var.getImageReceiver().f14385h1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), uaVar.f23157s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21022i7, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21060k7, false);
            CheckBox checkBox = this.f23113c;
            if (checkBox != null) {
                if (x02 == this.f23115n) {
                    if (x03 != this.f23116r) {
                    }
                }
                this.f23115n = x02;
                this.f23116r = x03;
                checkBox.c(x02, x03);
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
