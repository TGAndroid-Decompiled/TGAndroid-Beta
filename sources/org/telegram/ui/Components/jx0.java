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
import org.telegram.ui.gc1;
public class jx0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public int G;
    public ValueAnimator H;
    public float I;
    public boolean J;
    public final gc1 f24509a;
    public final w9 f24510b;
    public final RadialProgressView f24511c;
    public final uh.o d;
    public final m90 e;
    public final bi.d f24512f;
    public boolean h;
    public final org.telegram.ui.ActionBar.f6 f24513n;
    public int f24514r;
    public final View f24515s;
    public int v;
    public final int f24516w;
    public boolean f24517x;
    public final org.telegram.ui.Cells.l9 f24518y;

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
            RadialProgressView radialProgressView = this.f24511c;
            gc1 gc1Var = this.f24509a;
            if (z10) {
                ViewPropertyAnimator translationY = gc1Var.animate().translationY(f7);
                wr wrVar = wr.f28819f;
                translationY.setInterpolator(wrVar).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f7).setInterpolator(wrVar).setDuration(250L);
                    return;
                }
                return;
            }
            gc1Var.setTranslationY(f7);
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(f7);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i10;
        int i11 = this.f24514r;
        w9 w9Var = this.f24510b;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i12 = this.f24516w;
                if (i11 == 16) {
                    document = MediaDataController.getInstance(i12).getEmojiAnimatedSticker("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByName("tg_placeholders_android");
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByEmojiOrName("tg_placeholders_android");
                    }
                    if (stickerSetByName != null && (i10 = this.f24514r) >= 0 && i10 < stickerSetByName.documents.size()) {
                        document2 = stickerSetByName.documents.get(this.f24514r);
                    }
                    obj = stickerSetByName;
                    document = document2;
                    str = "130_130";
                }
                if (!LiteMode.isEnabled(3)) {
                    str = org.telegram.ui.Cells.r6.t(str, "_firstframe");
                }
                if (document != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, this.G, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    w9Var.i(ImageLocation.getForDocument(document), str, "tgs", svgThumb, obj);
                    int i13 = this.f24514r;
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
        w9Var.setImageDrawable(new hj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
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
                this.H.setInterpolator(wr.h);
                this.H.addUpdateListener(new q70(this, 24));
                this.H.start();
            }
        }
        int visibility = getVisibility();
        w9 w9Var = this.f24510b;
        RadialProgressView radialProgressView = this.f24511c;
        gc1 gc1Var = this.f24509a;
        View view = this.f24515s;
        if (visibility != i10 && i10 == 0) {
            if (this.h) {
                gc1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                gc1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
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
        gc1Var.setAlpha(0.0f);
        gc1Var.setScaleX(0.8f);
        gc1Var.setScaleY(0.8f);
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
                RadialProgressView radialProgressView = this.f24511c;
                View view = this.f24515s;
                gc1 gc1Var = this.f24509a;
                if (z11) {
                    if (z10) {
                        gc1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.f24518y.run();
                        return;
                    }
                    gc1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new ix0(this, 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.f24510b.getImageReceiver().startAnimation();
                } else if (z10) {
                    gc1Var.animate().cancel();
                    gc1Var.setAlpha(0.0f);
                    gc1Var.setScaleX(0.8f);
                    gc1Var.setScaleY(0.8f);
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
                    gc1Var.animate().cancel();
                    gc1Var.setAlpha(1.0f);
                    gc1Var.setScaleX(1.0f);
                    gc1Var.setScaleY(1.0f);
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
        NotificationCenter.getInstance(this.f24516w).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f24516w).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if ((this.E || this.f24517x) && (i14 = this.F) > 0 && i14 != getMeasuredHeight()) {
            float measuredHeight = (this.F - getMeasuredHeight()) / 2.0f;
            gc1 gc1Var = this.f24509a;
            gc1Var.setTranslationY(gc1Var.getTranslationY() + measuredHeight);
            if (!this.f24517x) {
                gc1Var.animate().translationY(0.0f).setInterpolator(wr.f28819f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f24511c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f24517x) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(wr.f28819f).setDuration(250L);
                }
            }
        }
        this.F = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.E = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.f24517x = z10;
        if (!z10) {
            this.f24509a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.f24511c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i10) {
        if (this.f24514r != i10) {
            this.f24514r = i10;
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

    public jx0(Context context, View view, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f24516w = UserConfig.selectedAccount;
        this.f24518y = new org.telegram.ui.Cells.l9(this, 22);
        this.G = org.telegram.ui.ActionBar.j6.f17911c7;
        this.f24513n = f6Var;
        this.f24515s = view;
        this.f24514r = i10;
        gc1 gc1Var = new gc1(this, context, 10);
        this.f24509a = gc1Var;
        gc1Var.setOrientation(1);
        w9 w9Var = new w9(context);
        this.f24510b = w9Var;
        w9Var.setOnClickListener(new g80(this, 18));
        uh.o oVar = new uh.o(context);
        this.d = oVar;
        oVar.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        oVar.setTag(Integer.valueOf(i11));
        oVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        oVar.setTextSize(1, 20.0f);
        oVar.setGravity(17);
        m90 m90Var = new m90(context, null);
        this.e = m90Var;
        int i12 = org.telegram.ui.ActionBar.j6.f18306y6;
        m90Var.setTag(Integer.valueOf(i12));
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setGravity(17);
        bi.d dVar = new bi.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        this.f24512f = dVar;
        dVar.setVisibility(8);
        gc1Var.addView(w9Var, w7.a6.q(117, 117, 1));
        gc1Var.addView(oVar, w7.a6.t(-2, -2, 1, 0, 12, 0, 0));
        gc1Var.addView(m90Var, w7.a6.t(-2, -2, 1, 0, 8, 0, 0));
        gc1Var.addView(dVar, w7.a6.t(-1, 48, 1, 28, 16, 28, 0));
        addView(gc1Var, w7.a6.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, f6Var);
            this.f24511c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, w7.a6.e(-2, -2, 17));
        }
    }
}
