package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ub1;
public class jx0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public int G;
    public ValueAnimator H;
    public float I;
    public boolean J;
    public final ub1 f25544a;
    public final w9 f25545b;
    public final RadialProgressView f25546c;
    public final vh.n d;
    public final o90 e;
    public final ci.d f25547f;
    public boolean h;
    public final org.telegram.ui.ActionBar.d6 f25548n;
    public int f25549r;
    public final View f25550s;
    public int v;
    public final int f25551w;
    public boolean f25552x;
    public final org.telegram.ui.Cells.t6 f25553y;

    public jx0(Context context) {
        this(context, null, 1, null);
    }

    public void a() {
        invalidate();
    }

    public final void b(int i10, boolean z10) {
        if (this.v != i10) {
            int i11 = 0;
            if (getVisibility() != 0) {
                z10 = false;
            }
            this.v = i10;
            int i12 = -(i10 >> 1);
            if (i10 > 0) {
                i11 = AndroidUtilities.dp(20.0f);
            }
            float f7 = i12 + i11;
            RadialProgressView radialProgressView = this.f25546c;
            ub1 ub1Var = this.f25544a;
            if (z10) {
                ViewPropertyAnimator translationY = ub1Var.animate().translationY(f7);
                sr srVar = sr.f28339f;
                translationY.setInterpolator(srVar).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f7).setInterpolator(srVar).setDuration(250L);
                    return;
                }
                return;
            }
            ub1Var.setTranslationY(f7);
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(f7);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i10;
        int i11 = this.f25549r;
        w9 w9Var = this.f25545b;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i12 = this.f25551w;
                if (i11 == 16) {
                    document = MediaDataController.getInstance(i12).getEmojiAnimatedSticker("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByName("tg_placeholders_android");
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByEmojiOrName("tg_placeholders_android");
                    }
                    if (stickerSetByName != null && (i10 = this.f25549r) >= 0 && i10 < stickerSetByName.documents.size()) {
                        document2 = stickerSetByName.documents.get(this.f25549r);
                    }
                    obj = stickerSetByName;
                    document = document2;
                    str = "130_130";
                }
                if (!LiteMode.isEnabled(3)) {
                    str = v7.j.t(str, "_firstframe");
                }
                if (document != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, this.G, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    w9Var.i(ImageLocation.getForDocument(document), str, "tgs", svgThumb, obj);
                    int i13 = this.f25549r;
                    if (i13 != 9 && i13 != 0) {
                        w9Var.getImageReceiver().setAutoRepeat(2);
                        return;
                    } else {
                        w9Var.getImageReceiver().setAutoRepeat(1);
                        return;
                    }
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                if (obj != null) {
                    z10 = false;
                }
                mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z10);
                w9Var.getImageReceiver().clearImage();
                return;
            }
        }
        w9Var.setImageDrawable(new jj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
    }

    public final void d(int i10, boolean z10) {
        boolean z11;
        float f7;
        float f10;
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.J != z11) {
            this.J = z11;
            setEnabled(z11);
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            if (!z10) {
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.I = f10;
                a();
            } else {
                float f11 = this.I;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f7);
                this.H = ofFloat;
                ofFloat.setDuration(480L);
                this.H.setInterpolator(sr.h);
                this.H.addUpdateListener(new t70(this, 24));
                this.H.start();
            }
        }
        int visibility = getVisibility();
        w9 w9Var = this.f25545b;
        RadialProgressView radialProgressView = this.f25546c;
        ub1 ub1Var = this.f25544a;
        View view = this.f25550s;
        if (visibility != i10 && i10 == 0) {
            if (this.h) {
                ub1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                ub1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new ix0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                w9Var.getImageReceiver().startAnimation();
            }
        }
        super.setVisibility(i10);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.F = 0;
        ub1Var.setAlpha(0.0f);
        ub1Var.setScaleX(0.8f);
        ub1Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new ix0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        w9Var.getImageReceiver().stopAnimation();
        w9Var.getImageReceiver().clearImage();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            c();
        }
    }

    public void e(boolean z10, boolean z11) {
        if (this.h != z10) {
            this.h = z10;
            if (getVisibility() == 0) {
                RadialProgressView radialProgressView = this.f25546c;
                View view = this.f25550s;
                ub1 ub1Var = this.f25544a;
                if (z11) {
                    if (z10) {
                        ub1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.f25553y.run();
                        return;
                    }
                    ub1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new ix0(this, 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.f25545b.getImageReceiver().startAnimation();
                } else if (z10) {
                    ub1Var.animate().cancel();
                    ub1Var.setAlpha(0.0f);
                    ub1Var.setScaleX(0.8f);
                    ub1Var.setScaleY(0.8f);
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.setAlpha(1.0f);
                        view.setVisibility(0);
                        return;
                    }
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setScaleX(1.0f);
                    radialProgressView.setScaleY(1.0f);
                } else {
                    ub1Var.animate().cancel();
                    ub1Var.setAlpha(1.0f);
                    ub1Var.setScaleX(1.0f);
                    ub1Var.setScaleY(1.0f);
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.setVisibility(8);
                        return;
                    }
                    radialProgressView.setAlpha(0.0f);
                    radialProgressView.setScaleX(0.5f);
                    radialProgressView.setScaleY(0.5f);
                }
            }
        }
    }

    public float getVisibilityFactor() {
        return this.I;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            c();
        }
        NotificationCenter.getInstance(this.f25551w).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f25551w).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if ((this.E || this.f25552x) && (i14 = this.F) > 0 && i14 != getMeasuredHeight()) {
            float measuredHeight = (this.F - getMeasuredHeight()) / 2.0f;
            ub1 ub1Var = this.f25544a;
            ub1Var.setTranslationY(ub1Var.getTranslationY() + measuredHeight);
            if (!this.f25552x) {
                ub1Var.animate().translationY(0.0f).setInterpolator(sr.f28339f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f25546c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f25552x) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(sr.f28339f).setDuration(250L);
                }
            }
        }
        this.F = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.E = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.f25552x = z10;
        if (!z10) {
            this.f25544a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.f25546c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i10) {
        if (this.f25549r != i10) {
            this.f25549r = i10;
            c();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (Character.isWhitespace(charSequence.charAt(i11))) {
                i10++;
            }
        }
        if (i10 > 4 && charSequence.length() > 20) {
            int length = charSequence.length() >> 1;
            int i12 = -1;
            int i13 = 0;
            for (int i14 = 0; i14 < charSequence.length(); i14++) {
                if (Character.isWhitespace(charSequence.charAt(i14))) {
                    int abs = Math.abs(length - i14);
                    if (i12 == -1 || abs < i13) {
                        i12 = i14;
                        i13 = abs;
                    }
                }
            }
            if (i12 > 0) {
                charSequence = ((Object) charSequence.subSequence(0, i12)) + "\n" + ((Object) charSequence.subSequence(i12 + 1, charSequence.length()));
            }
        }
        this.e.setText(charSequence);
    }

    @Override
    public void setVisibility(int i10) {
        d(i10, true);
    }

    public jx0(Context context, View view, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f25551w = UserConfig.selectedAccount;
        this.f25553y = new org.telegram.ui.Cells.t6(this, 25);
        this.G = org.telegram.ui.ActionBar.h6.f19042c7;
        this.f25548n = d6Var;
        this.f25550s = view;
        this.f25549r = i10;
        ub1 ub1Var = new ub1(this, context, 10);
        this.f25544a = ub1Var;
        ub1Var.setOrientation(1);
        w9 w9Var = new w9(context);
        this.f25545b = w9Var;
        w9Var.setOnClickListener(new j80(this, 18));
        vh.n nVar = new vh.n(context);
        this.d = nVar;
        nVar.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        nVar.setTag(Integer.valueOf(i11));
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        nVar.setTextSize(1, 20.0f);
        nVar.setGravity(17);
        o90 o90Var = new o90(context, null);
        this.e = o90Var;
        int i12 = org.telegram.ui.ActionBar.h6.f19442y6;
        o90Var.setTag(Integer.valueOf(i12));
        o90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        o90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        o90Var.setTextSize(1, 14.0f);
        o90Var.setGravity(17);
        ci.d dVar = new ci.d(context, d6Var, true);
        dVar.setRoundRadius(24);
        this.f25547f = dVar;
        dVar.setVisibility(8);
        ub1Var.addView(w9Var, w7.y5.q(117, 117, 1));
        ub1Var.addView(nVar, w7.y5.t(-2, -2, 1, 0, 12, 0, 0));
        ub1Var.addView(o90Var, w7.y5.t(-2, -2, 1, 0, 8, 0, 0));
        ub1Var.addView(dVar, w7.y5.t(-1, 48, 1, 28, 16, 28, 0));
        addView(ub1Var, w7.y5.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, d6Var);
            this.f25546c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, w7.y5.e(-2, -2, 17));
        }
    }
}
