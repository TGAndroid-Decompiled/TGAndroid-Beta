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
import org.telegram.ui.cc1;
public class by0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public int G;
    public ValueAnimator H;
    public float I;
    public boolean J;
    public final cc1 f25120a;
    public final y9 f25121b;
    public final RadialProgressView f25122c;
    public final vh.n d;
    public final ea0 f25123e;
    public final ci.d f25124f;
    public boolean h;
    public final org.telegram.ui.ActionBar.d6 f25125n;
    public int f25126r;
    public final View f25127s;
    public int v;
    public final int f25128w;
    public boolean f25129x;
    public final org.telegram.ui.Cells.t6 f25130y;

    public by0(Context context) {
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
            RadialProgressView radialProgressView = this.f25122c;
            cc1 cc1Var = this.f25120a;
            if (z10) {
                ViewPropertyAnimator translationY = cc1Var.animate().translationY(f7);
                is isVar = is.f27500f;
                translationY.setInterpolator(isVar).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f7).setInterpolator(isVar).setDuration(250L);
                    return;
                }
                return;
            }
            cc1Var.setTranslationY(f7);
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(f7);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i10;
        int i11 = this.f25126r;
        y9 y9Var = this.f25121b;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i12 = this.f25128w;
                if (i11 == 16) {
                    document = MediaDataController.getInstance(i12).getEmojiAnimatedSticker("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByName("tg_placeholders_android");
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByEmojiOrName("tg_placeholders_android");
                    }
                    if (stickerSetByName != null && (i10 = this.f25126r) >= 0 && i10 < stickerSetByName.documents.size()) {
                        document2 = stickerSetByName.documents.get(this.f25126r);
                    }
                    obj = stickerSetByName;
                    document = document2;
                    str = "130_130";
                }
                if (!LiteMode.isEnabled(3)) {
                    str = sc.v.v(str, "_firstframe");
                }
                if (document != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, this.G, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    y9Var.i(ImageLocation.getForDocument(document), str, "tgs", svgThumb, obj);
                    int i13 = this.f25126r;
                    if (i13 != 9 && i13 != 0) {
                        y9Var.getImageReceiver().setAutoRepeat(2);
                        return;
                    } else {
                        y9Var.getImageReceiver().setAutoRepeat(1);
                        return;
                    }
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                if (obj != null) {
                    z10 = false;
                }
                mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z10);
                y9Var.getImageReceiver().clearImage();
                return;
            }
        }
        y9Var.setImageDrawable(new dk0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
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
                this.H.setInterpolator(is.h);
                this.H.addUpdateListener(new j80(this, 25));
                this.H.start();
            }
        }
        int visibility = getVisibility();
        y9 y9Var = this.f25121b;
        RadialProgressView radialProgressView = this.f25122c;
        cc1 cc1Var = this.f25120a;
        View view = this.f25127s;
        if (visibility != i10 && i10 == 0) {
            if (this.h) {
                cc1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                cc1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new ay0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                y9Var.getImageReceiver().startAnimation();
            }
        }
        super.setVisibility(i10);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.F = 0;
        cc1Var.setAlpha(0.0f);
        cc1Var.setScaleX(0.8f);
        cc1Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new ay0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        y9Var.getImageReceiver().stopAnimation();
        y9Var.getImageReceiver().clearImage();
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
                RadialProgressView radialProgressView = this.f25122c;
                View view = this.f25127s;
                cc1 cc1Var = this.f25120a;
                if (z11) {
                    if (z10) {
                        cc1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.f25130y.run();
                        return;
                    }
                    cc1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new ay0(this, 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.f25121b.getImageReceiver().startAnimation();
                } else if (z10) {
                    cc1Var.animate().cancel();
                    cc1Var.setAlpha(0.0f);
                    cc1Var.setScaleX(0.8f);
                    cc1Var.setScaleY(0.8f);
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
                    cc1Var.animate().cancel();
                    cc1Var.setAlpha(1.0f);
                    cc1Var.setScaleX(1.0f);
                    cc1Var.setScaleY(1.0f);
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
        NotificationCenter.getInstance(this.f25128w).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f25128w).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if ((this.E || this.f25129x) && (i14 = this.F) > 0 && i14 != getMeasuredHeight()) {
            float measuredHeight = (this.F - getMeasuredHeight()) / 2.0f;
            cc1 cc1Var = this.f25120a;
            cc1Var.setTranslationY(cc1Var.getTranslationY() + measuredHeight);
            if (!this.f25129x) {
                cc1Var.animate().translationY(0.0f).setInterpolator(is.f27500f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f25122c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f25129x) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(is.f27500f).setDuration(250L);
                }
            }
        }
        this.F = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.E = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.f25129x = z10;
        if (!z10) {
            this.f25120a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.f25122c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i10) {
        if (this.f25126r != i10) {
            this.f25126r = i10;
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
            int i12 = 0;
            int i13 = -1;
            for (int i14 = 0; i14 < charSequence.length(); i14++) {
                if (Character.isWhitespace(charSequence.charAt(i14))) {
                    int abs = Math.abs(length - i14);
                    if (i13 == -1 || abs < i12) {
                        i13 = i14;
                        i12 = abs;
                    }
                }
            }
            if (i13 > 0) {
                charSequence = ((Object) charSequence.subSequence(0, i13)) + "\n" + ((Object) charSequence.subSequence(i13 + 1, charSequence.length()));
            }
        }
        this.f25123e.setText(charSequence);
    }

    @Override
    public void setVisibility(int i10) {
        d(i10, true);
    }

    public by0(Context context, View view, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f25128w = UserConfig.selectedAccount;
        this.f25130y = new org.telegram.ui.Cells.t6(this, 24);
        this.G = org.telegram.ui.ActionBar.h6.f20806c7;
        this.f25125n = d6Var;
        this.f25127s = view;
        this.f25126r = i10;
        cc1 cc1Var = new cc1(this, context, 10);
        this.f25120a = cc1Var;
        cc1Var.setOrientation(1);
        y9 y9Var = new y9(context);
        this.f25121b = y9Var;
        y9Var.setOnClickListener(new b90(this, 17));
        vh.n nVar = new vh.n(context);
        this.d = nVar;
        nVar.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        nVar.setTag(Integer.valueOf(i11));
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        nVar.setTextSize(1, 20.0f);
        nVar.setGravity(17);
        ea0 ea0Var = new ea0(context, null);
        this.f25123e = ea0Var;
        int i12 = org.telegram.ui.ActionBar.h6.f21207y6;
        ea0Var.setTag(Integer.valueOf(i12));
        ea0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setGravity(17);
        ci.d dVar = new ci.d(context, d6Var, true);
        dVar.setRoundRadius(24);
        this.f25124f = dVar;
        dVar.setVisibility(8);
        cc1Var.addView(y9Var, w7.x5.q(117, 117, 1));
        cc1Var.addView(nVar, w7.x5.t(-2, -2, 1, 0, 12, 0, 0));
        cc1Var.addView(ea0Var, w7.x5.t(-2, -2, 1, 0, 8, 0, 0));
        cc1Var.addView(dVar, w7.x5.t(-1, 48, 1, 28, 16, 28, 0));
        addView(cc1Var, w7.x5.a(-2.0f, 46.0f, 0.0f, 46.0f, 30.0f, -2, 17));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, d6Var);
            this.f25122c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, w7.x5.e(-2, -2, 17));
        }
    }
}
