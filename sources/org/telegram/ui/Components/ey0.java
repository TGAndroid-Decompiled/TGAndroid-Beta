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
public class ey0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public int G;
    public ValueAnimator H;
    public float I;
    public boolean J;
    public final org.telegram.ui.xa1 f28014a;
    public final y9 f28015b;
    public final RadialProgressView f28016c;
    public final xh.n d;
    public final z90 e;
    public final fi.d f28017f;
    public boolean h;
    public final org.telegram.ui.ActionBar.u6 f28018n;
    public int f28019r;
    public final View f28020s;
    public int v;
    public final int f28021w;
    public boolean f28022x;
    public final cy0 f28023y;

    public ey0(Context context) {
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
            RadialProgressView radialProgressView = this.f28016c;
            org.telegram.ui.xa1 xa1Var = this.f28014a;
            if (z10) {
                ViewPropertyAnimator translationY = xa1Var.animate().translationY(f7);
                ds dsVar = ds.f27586f;
                translationY.setInterpolator(dsVar).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f7).setInterpolator(dsVar).setDuration(250L);
                    return;
                }
                return;
            }
            xa1Var.setTranslationY(f7);
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(f7);
            }
        }
    }

    public final void c() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.Document document;
        int i10;
        int i11 = this.f28019r;
        y9 y9Var = this.f28015b;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i12 = this.f28021w;
                if (i11 == 16) {
                    document = MediaDataController.getInstance(i12).getEmojiAnimatedSticker("👍");
                    tL_messages_stickerSet = null;
                } else {
                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByName("tg_placeholders_android");
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByEmojiOrName("tg_placeholders_android");
                    }
                    if (stickerSetByName != null && (i10 = this.f28019r) >= 0 && i10 < stickerSetByName.documents.size()) {
                        document2 = stickerSetByName.documents.get(this.f28019r);
                    }
                    tL_messages_stickerSet = stickerSetByName;
                    document = document2;
                    str = "130_130";
                }
                if (!LiteMode.isEnabled(3)) {
                    str = b10.u(str, "_firstframe");
                }
                String str2 = str;
                if (document != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, this.G, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    this.f28015b.i(ImageLocation.getForDocument(document), str2, "tgs", svgThumb, tL_messages_stickerSet);
                    int i13 = this.f28019r;
                    if (i13 != 9 && i13 != 0) {
                        y9Var.getImageReceiver().setAutoRepeat(2);
                        return;
                    } else {
                        y9Var.getImageReceiver().setAutoRepeat(1);
                        return;
                    }
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                if (tL_messages_stickerSet != null) {
                    z10 = false;
                }
                mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z10);
                y9Var.getImageReceiver().clearImage();
                return;
            }
        }
        y9Var.setImageDrawable(new xj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
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
                this.H.setInterpolator(ds.h);
                this.H.addUpdateListener(new e80(this, 24));
                this.H.start();
            }
        }
        int visibility = getVisibility();
        y9 y9Var = this.f28015b;
        RadialProgressView radialProgressView = this.f28016c;
        org.telegram.ui.xa1 xa1Var = this.f28014a;
        View view = this.f28020s;
        if (visibility != i10 && i10 == 0) {
            if (this.h) {
                xa1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                xa1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new dy0(this, 0)).alpha(0.0f).setDuration(150L).start();
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
        xa1Var.setAlpha(0.0f);
        xa1Var.setScaleX(0.8f);
        xa1Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new dy0(this, 1)).alpha(0.0f).setDuration(150L).start();
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
                RadialProgressView radialProgressView = this.f28016c;
                View view = this.f28020s;
                org.telegram.ui.xa1 xa1Var = this.f28014a;
                if (z11) {
                    if (z10) {
                        xa1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.f28023y.run();
                        return;
                    }
                    xa1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new dy0(this, 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.f28015b.getImageReceiver().startAnimation();
                } else if (z10) {
                    xa1Var.animate().cancel();
                    xa1Var.setAlpha(0.0f);
                    xa1Var.setScaleX(0.8f);
                    xa1Var.setScaleY(0.8f);
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
                    xa1Var.animate().cancel();
                    xa1Var.setAlpha(1.0f);
                    xa1Var.setScaleX(1.0f);
                    xa1Var.setScaleY(1.0f);
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
        NotificationCenter.getInstance(this.f28021w).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f28021w).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if ((this.E || this.f28022x) && (i14 = this.F) > 0 && i14 != getMeasuredHeight()) {
            float measuredHeight = (this.F - getMeasuredHeight()) / 2.0f;
            org.telegram.ui.xa1 xa1Var = this.f28014a;
            xa1Var.setTranslationY(xa1Var.getTranslationY() + measuredHeight);
            if (!this.f28022x) {
                xa1Var.animate().translationY(0.0f).setInterpolator(ds.f27586f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f28016c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f28022x) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(ds.f27586f).setDuration(250L);
                }
            }
        }
        this.F = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.E = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.f28022x = z10;
        if (!z10) {
            this.f28014a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.f28016c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i10) {
        if (this.f28019r != i10) {
            this.f28019r = i10;
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
        this.e.setText(charSequence);
    }

    @Override
    public void setVisibility(int i10) {
        d(i10, true);
    }

    public ey0(Context context, View view, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f28021w = UserConfig.selectedAccount;
        this.f28023y = new cy0(this, 0);
        this.G = org.telegram.ui.ActionBar.y6.f23338c7;
        this.f28018n = u6Var;
        this.f28020s = view;
        this.f28019r = i10;
        org.telegram.ui.xa1 xa1Var = new org.telegram.ui.xa1(this, context, 13);
        this.f28014a = xa1Var;
        xa1Var.setOrientation(1);
        y9 y9Var = new y9(context);
        this.f28015b = y9Var;
        y9Var.setOnClickListener(new w80(this, 16));
        xh.n nVar = new xh.n(context);
        this.d = nVar;
        nVar.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        nVar.setTag(Integer.valueOf(i11));
        org.telegram.ui.ActionBar.f7.V(nVar, i11, u6Var);
        nVar.setTextSize(1, 20.0f);
        nVar.setGravity(17);
        z90 z90Var = new z90(context, null);
        this.e = z90Var;
        int i12 = org.telegram.ui.ActionBar.y6.f23748y6;
        z90Var.setTag(Integer.valueOf(i12));
        org.telegram.ui.ActionBar.f7.V(z90Var, i12, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.J6, u6Var);
        z90Var.setTextSize(1, 14.0f);
        z90Var.setGravity(17);
        fi.d f7 = org.telegram.messenger.vh.f(24, context, u6Var, true);
        this.f28017f = f7;
        f7.setVisibility(8);
        xa1Var.addView(y9Var, gb1.u(117, 117, 1));
        xa1Var.addView(nVar, gb1.x(-2, -2, 1, 0, 12, 0, 0));
        xa1Var.addView(z90Var, gb1.x(-2, -2, 1, 0, 8, 0, 0));
        xa1Var.addView(f7, gb1.x(-1, 48, 1, 28, 16, 28, 0));
        addView(xa1Var, gb1.h(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, u6Var);
            this.f28016c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, gb1.i(-2, -2, 17));
        }
    }
}
