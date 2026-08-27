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
import org.telegram.ui.ra1;

public class iw0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public int B;
    public int C;
    public ValueAnimator D;
    public float E;
    public boolean F;

    public final ra1 f29503a;

    public final n9 f29504b;

    public final RadialProgressView f29505c;
    public final eh.s d;

    public final p80 f29506e;

    public final lh.d f29507f;
    public boolean h;

    public final org.telegram.ui.ActionBar.c6 f29508n;

    public int f29509r;

    public final View f29510s;
    public int v;

    public final int f29511w;

    public boolean f29512x;

    public final mu0 f29513y;

    public iw0(Context context) {
        this(context, null, 1, null);
    }

    public void a() {
        invalidate();
    }

    public final void b(int i10, boolean z10) {
        if (this.v != i10) {
            if (getVisibility() != 0) {
                z10 = false;
            }
            this.v = i10;
            float fDp = (-(i10 >> 1)) + (i10 > 0 ? AndroidUtilities.dp(20.0f) : 0);
            RadialProgressView radialProgressView = this.f29505c;
            ra1 ra1Var = this.f29503a;
            if (!z10) {
                ra1Var.setTranslationY(fDp);
                if (radialProgressView != null) {
                    radialProgressView.setTranslationY(fDp);
                    return;
                }
                return;
            }
            ViewPropertyAnimator viewPropertyAnimatorTranslationY = ra1Var.animate().translationY(fDp);
            er erVar = er.f28122f;
            viewPropertyAnimatorTranslationY.setInterpolator(erVar).setDuration(250L);
            if (radialProgressView != null) {
                radialProgressView.animate().translationY(fDp).setInterpolator(erVar).setDuration(250L);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document emojiAnimatedSticker;
        int i10;
        int i11 = this.f29509r;
        n9 n9Var = this.f29504b;
        if (i11 != 0) {
            if (i11 != 1) {
                TLRPC.Document document = null;
                String strL = null;
                document = null;
                document = null;
                int i12 = this.f29511w;
                if (i11 == 16) {
                    emojiAnimatedSticker = MediaDataController.getInstance(i12).getEmojiAnimatedSticker("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByName("tg_placeholders_android");
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByEmojiOrName("tg_placeholders_android");
                    }
                    if (stickerSetByName != null && (i10 = this.f29509r) >= 0 && i10 < stickerSetByName.documents.size()) {
                        document = stickerSetByName.documents.get(this.f29509r);
                    }
                    obj = stickerSetByName;
                    emojiAnimatedSticker = document;
                    strL = "130_130";
                }
                if (!LiteMode.isEnabled(3)) {
                    strL = s3.c.l(strL, "_firstframe");
                }
                if (emojiAnimatedSticker == null) {
                    MediaDataController.getInstance(i12).loadStickersByEmojiOrName("tg_placeholders_android", false, obj == null);
                    n9Var.getImageReceiver().clearImage();
                    return;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(emojiAnimatedSticker.thumbs, this.C, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                n9Var.i(ImageLocation.getForDocument(emojiAnimatedSticker), strL, "tgs", svgThumb, obj);
                int i13 = this.f29509r;
                if (i13 == 9 || i13 == 0) {
                    n9Var.getImageReceiver().setAutoRepeat(1);
                    return;
                } else {
                    n9Var.getImageReceiver().setAutoRepeat(2);
                    return;
                }
            }
        }
        n9Var.setImageDrawable(new oi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
    }

    public final void d(int i10, boolean z10) {
        boolean z11 = i10 == 0;
        if (this.F != z11) {
            this.F = z11;
            setEnabled(z11);
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.D = null;
            }
            if (z10) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.E, z11 ? 1.0f : 0.0f);
                this.D = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(480L);
                this.D.setInterpolator(er.h);
                this.D.addUpdateListener(new v60(this, 24));
                this.D.start();
            } else {
                this.E = z11 ? 1.0f : 0.0f;
                a();
            }
        }
        int visibility = getVisibility();
        n9 n9Var = this.f29504b;
        RadialProgressView radialProgressView = this.f29505c;
        ra1 ra1Var = this.f29503a;
        View view = this.f29510s;
        if (visibility != i10 && i10 == 0) {
            if (this.h) {
                ra1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                ra1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new hw0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                n9Var.getImageReceiver().startAnimation();
            }
        }
        super.setVisibility(i10);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.B = 0;
        ra1Var.setAlpha(0.0f);
        ra1Var.setScaleX(0.8f);
        ra1Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new hw0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        n9Var.getImageReceiver().stopAnimation();
        n9Var.getImageReceiver().clearImage();
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
            if (getVisibility() != 0) {
                return;
            }
            RadialProgressView radialProgressView = this.f29505c;
            View view = this.f29510s;
            ra1 ra1Var = this.f29503a;
            if (z11) {
                if (z10) {
                    ra1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                    this.f29513y.run();
                    return;
                }
                ra1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new hw0(this, 2)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                this.f29504b.getImageReceiver().startAnimation();
                return;
            }
            if (!z10) {
                ra1Var.animate().cancel();
                ra1Var.setAlpha(1.0f);
                ra1Var.setScaleX(1.0f);
                ra1Var.setScaleY(1.0f);
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.setVisibility(8);
                    return;
                } else {
                    radialProgressView.setAlpha(0.0f);
                    radialProgressView.setScaleX(0.5f);
                    radialProgressView.setScaleY(0.5f);
                    return;
                }
            }
            ra1Var.animate().cancel();
            ra1Var.setAlpha(0.0f);
            ra1Var.setScaleX(0.8f);
            ra1Var.setScaleY(0.8f);
            if (view != null) {
                view.animate().setListener(null).cancel();
                view.setAlpha(1.0f);
                view.setVisibility(0);
            } else {
                radialProgressView.setAlpha(1.0f);
                radialProgressView.setScaleX(1.0f);
                radialProgressView.setScaleY(1.0f);
            }
        }
    }

    public float getVisibilityFactor() {
        return this.E;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            c();
        }
        NotificationCenter.getInstance(this.f29511w).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f29511w).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if ((this.A || this.f29512x) && (i14 = this.B) > 0 && i14 != getMeasuredHeight()) {
            float measuredHeight = (this.B - getMeasuredHeight()) / 2.0f;
            ra1 ra1Var = this.f29503a;
            ra1Var.setTranslationY(ra1Var.getTranslationY() + measuredHeight);
            if (!this.f29512x) {
                ra1Var.animate().translationY(0.0f).setInterpolator(er.f28122f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f29505c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f29512x) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(er.f28122f).setDuration(250L);
                }
            }
        }
        this.B = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.A = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.f29512x = z10;
        if (z10) {
            return;
        }
        this.f29503a.setTranslationY(0.0f);
        RadialProgressView radialProgressView = this.f29505c;
        if (radialProgressView != null) {
            radialProgressView.setTranslationY(0.0f);
        }
    }

    public void setStickerType(int i10) {
        if (this.f29509r != i10) {
            this.f29509r = i10;
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
                    int iAbs = Math.abs(length - i14);
                    if (i12 == -1 || iAbs < i13) {
                        i12 = i14;
                        i13 = iAbs;
                    }
                }
            }
            if (i12 > 0) {
                charSequence = ((Object) charSequence.subSequence(0, i12)) + "\n" + ((Object) charSequence.subSequence(i12 + 1, charSequence.length()));
            }
        }
        this.f29506e.setText(charSequence);
    }

    @Override
    public void setVisibility(int i10) {
        d(i10, true);
    }

    public iw0(Context context, View view, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f29511w = UserConfig.selectedAccount;
        this.f29513y = new mu0(this, 1);
        this.C = org.telegram.ui.ActionBar.g6.f23037c7;
        this.f29508n = c6Var;
        this.f29510s = view;
        this.f29509r = i10;
        ra1 ra1Var = new ra1(this, context, 12);
        this.f29503a = ra1Var;
        ra1Var.setOrientation(1);
        n9 n9Var = new n9(context);
        this.f29504b = n9Var;
        n9Var.setOnClickListener(new l70(this, 18));
        eh.s sVar = new eh.s(context);
        this.d = sVar;
        sVar.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        sVar.setTag(Integer.valueOf(i11));
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        sVar.setTextSize(1, 20.0f);
        sVar.setGravity(17);
        p80 p80Var = new p80(context, null);
        this.f29506e = p80Var;
        int i12 = org.telegram.ui.ActionBar.g6.f23423y6;
        p80Var.setTag(Integer.valueOf(i12));
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, c6Var));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(17);
        lh.d dVar = new lh.d(context, c6Var, true);
        dVar.setRoundRadius(24);
        this.f29507f = dVar;
        dVar.setVisibility(8);
        ra1Var.addView(n9Var, h7.z5.q(117, 117, 1));
        ra1Var.addView(sVar, h7.z5.t(-2, -2, 1, 0, 12, 0, 0));
        ra1Var.addView(p80Var, h7.z5.t(-2, -2, 1, 0, 8, 0, 0));
        ra1Var.addView(dVar, h7.z5.t(-1, 48, 1, 28, 16, 28, 0));
        addView(ra1Var, h7.z5.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, c6Var);
            this.f29505c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, h7.z5.e(-2, -2, 17));
        }
    }
}
