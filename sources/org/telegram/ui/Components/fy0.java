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
public class fy0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public int G;
    public ValueAnimator H;
    public float I;
    public boolean J;
    public final org.telegram.ui.za1 f28312a;
    public final y9 f28313b;
    public final RadialProgressView f28314c;
    public final xh.n d;
    public final aa0 e;
    public final fi.d f28315f;
    public boolean h;
    public final org.telegram.ui.ActionBar.u6 f28316n;
    public int f28317r;
    public final View f28318s;
    public int v;
    public final int f28319w;
    public boolean f28320x;
    public final dy0 f28321y;

    public fy0(Context context) {
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
            RadialProgressView radialProgressView = this.f28314c;
            org.telegram.ui.za1 za1Var = this.f28312a;
            if (z10) {
                ViewPropertyAnimator translationY = za1Var.animate().translationY(f7);
                ds dsVar = ds.f27530f;
                translationY.setInterpolator(dsVar).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f7).setInterpolator(dsVar).setDuration(250L);
                    return;
                }
                return;
            }
            za1Var.setTranslationY(f7);
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(f7);
            }
        }
    }

    public final void c() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.Document document;
        int i10;
        int i11 = this.f28317r;
        y9 y9Var = this.f28313b;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i12 = this.f28319w;
                if (i11 == 16) {
                    document = MediaDataController.getInstance(i12).getEmojiAnimatedSticker("👍");
                    tL_messages_stickerSet = null;
                } else {
                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByName("tg_placeholders_android");
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByEmojiOrName("tg_placeholders_android");
                    }
                    if (stickerSetByName != null && (i10 = this.f28317r) >= 0 && i10 < stickerSetByName.documents.size()) {
                        document2 = stickerSetByName.documents.get(this.f28317r);
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
                    this.f28313b.i(ImageLocation.getForDocument(document), str2, "tgs", svgThumb, tL_messages_stickerSet);
                    int i13 = this.f28317r;
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
        y9Var.setImageDrawable(new yj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
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
                this.H.addUpdateListener(new f80(this, 24));
                this.H.start();
            }
        }
        int visibility = getVisibility();
        y9 y9Var = this.f28313b;
        RadialProgressView radialProgressView = this.f28314c;
        org.telegram.ui.za1 za1Var = this.f28312a;
        View view = this.f28318s;
        if (visibility != i10 && i10 == 0) {
            if (this.h) {
                za1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                za1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new ey0(this, 0)).alpha(0.0f).setDuration(150L).start();
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
        za1Var.setAlpha(0.0f);
        za1Var.setScaleX(0.8f);
        za1Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new ey0(this, 1)).alpha(0.0f).setDuration(150L).start();
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
                RadialProgressView radialProgressView = this.f28314c;
                View view = this.f28318s;
                org.telegram.ui.za1 za1Var = this.f28312a;
                if (z11) {
                    if (z10) {
                        za1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.f28321y.run();
                        return;
                    }
                    za1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new ey0(this, 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.f28313b.getImageReceiver().startAnimation();
                } else if (z10) {
                    za1Var.animate().cancel();
                    za1Var.setAlpha(0.0f);
                    za1Var.setScaleX(0.8f);
                    za1Var.setScaleY(0.8f);
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
                    za1Var.animate().cancel();
                    za1Var.setAlpha(1.0f);
                    za1Var.setScaleX(1.0f);
                    za1Var.setScaleY(1.0f);
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
        NotificationCenter.getInstance(this.f28319w).addWeakObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f28319w).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if ((this.E || this.f28320x) && (i14 = this.F) > 0 && i14 != getMeasuredHeight()) {
            float measuredHeight = (this.F - getMeasuredHeight()) / 2.0f;
            org.telegram.ui.za1 za1Var = this.f28312a;
            za1Var.setTranslationY(za1Var.getTranslationY() + measuredHeight);
            if (!this.f28320x) {
                za1Var.animate().translationY(0.0f).setInterpolator(ds.f27530f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f28314c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f28320x) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(ds.f27530f).setDuration(250L);
                }
            }
        }
        this.F = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.E = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.f28320x = z10;
        if (!z10) {
            this.f28312a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.f28314c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i10) {
        if (this.f28317r != i10) {
            this.f28317r = i10;
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

    public fy0(Context context, View view, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f28319w = UserConfig.selectedAccount;
        this.f28321y = new dy0(this, 0);
        this.G = org.telegram.ui.ActionBar.y6.f23339c7;
        this.f28316n = u6Var;
        this.f28318s = view;
        this.f28317r = i10;
        org.telegram.ui.za1 za1Var = new org.telegram.ui.za1(this, context, 13);
        this.f28312a = za1Var;
        za1Var.setOrientation(1);
        y9 y9Var = new y9(context);
        this.f28313b = y9Var;
        y9Var.setOnClickListener(new x80(this, 16));
        xh.n nVar = new xh.n(context);
        this.d = nVar;
        nVar.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        nVar.setTag(Integer.valueOf(i11));
        org.telegram.ui.ActionBar.f7.V(nVar, i11, u6Var);
        nVar.setTextSize(1, 20.0f);
        nVar.setGravity(17);
        aa0 aa0Var = new aa0(context, null);
        this.e = aa0Var;
        int i12 = org.telegram.ui.ActionBar.y6.f23749y6;
        aa0Var.setTag(Integer.valueOf(i12));
        org.telegram.ui.ActionBar.f7.V(aa0Var, i12, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.J6, u6Var);
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setGravity(17);
        fi.d f7 = org.telegram.messenger.wh.f(24, context, u6Var, true);
        this.f28315f = f7;
        f7.setVisibility(8);
        za1Var.addView(y9Var, kb1.u(117, 117, 1));
        za1Var.addView(nVar, kb1.x(-2, -2, 1, 0, 12, 0, 0));
        za1Var.addView(aa0Var, kb1.x(-2, -2, 1, 0, 8, 0, 0));
        za1Var.addView(f7, kb1.x(-1, 48, 1, 28, 16, 28, 0));
        addView(za1Var, kb1.h(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, u6Var);
            this.f28314c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, kb1.i(-2, -2, 17));
        }
    }
}
