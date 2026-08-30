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
import org.telegram.ui.hb1;
public class zw0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public int C;
    public int D;
    public ValueAnimator E;
    public float F;
    public boolean G;
    public final hb1 f31454a;
    public final p9 f31455b;
    public final RadialProgressView f31456c;
    public final ih.s d;
    public final e90 e;
    public final ph.d f31457f;
    public boolean h;
    public final org.telegram.ui.ActionBar.f6 f31458n;
    public int f31459r;
    public final View f31460s;
    public int v;
    public final int f31461w;
    public boolean f31462x;
    public final tl0 f31463y;

    public zw0(Context context) {
        this(context, null, 1, null);
    }

    public void a() {
        invalidate();
    }

    public final void b(int i10, boolean z4) {
        if (this.v != i10) {
            int i11 = 0;
            if (getVisibility() != 0) {
                z4 = false;
            }
            this.v = i10;
            int i12 = -(i10 >> 1);
            if (i10 > 0) {
                i11 = AndroidUtilities.dp(20.0f);
            }
            float f10 = i12 + i11;
            RadialProgressView radialProgressView = this.f31456c;
            hb1 hb1Var = this.f31454a;
            if (z4) {
                ViewPropertyAnimator translationY = hb1Var.animate().translationY(f10);
                nr nrVar = nr.f27346f;
                translationY.setInterpolator(nrVar).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f10).setInterpolator(nrVar).setDuration(250L);
                    return;
                }
                return;
            }
            hb1Var.setTranslationY(f10);
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(f10);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i10;
        int i11 = this.f31459r;
        p9 p9Var = this.f31455b;
        if (i11 != 0) {
            boolean z4 = true;
            if (i11 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i12 = this.f31461w;
                if (i11 == 16) {
                    document = MediaDataController.getInstance(i12).getEmojiAnimatedSticker("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByName("tg_placeholders_android");
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByEmojiOrName("tg_placeholders_android");
                    }
                    if (stickerSetByName != null && (i10 = this.f31459r) >= 0 && i10 < stickerSetByName.documents.size()) {
                        document2 = stickerSetByName.documents.get(this.f31459r);
                    }
                    obj = stickerSetByName;
                    document = document2;
                    str = "130_130";
                }
                if (!LiteMode.isEnabled(3)) {
                    str = vh.v2.k(str, "_firstframe");
                }
                if (document != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, this.D, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    p9Var.i(ImageLocation.getForDocument(document), str, "tgs", svgThumb, obj);
                    int i13 = this.f31459r;
                    if (i13 != 9 && i13 != 0) {
                        p9Var.getImageReceiver().setAutoRepeat(2);
                        return;
                    } else {
                        p9Var.getImageReceiver().setAutoRepeat(1);
                        return;
                    }
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                if (obj != null) {
                    z4 = false;
                }
                mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z4);
                p9Var.getImageReceiver().clearImage();
                return;
            }
        }
        p9Var.setImageDrawable(new gj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
    }

    public final void d(int i10, boolean z4) {
        boolean z10;
        float f10;
        float f11;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.G != z10) {
            this.G = z10;
            setEnabled(z10);
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            if (!z4) {
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                this.F = f11;
                a();
            } else {
                float f12 = this.F;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
                this.E = ofFloat;
                ofFloat.setDuration(480L);
                this.E.setInterpolator(nr.h);
                this.E.addUpdateListener(new i70(this, 24));
                this.E.start();
            }
        }
        int visibility = getVisibility();
        p9 p9Var = this.f31455b;
        RadialProgressView radialProgressView = this.f31456c;
        hb1 hb1Var = this.f31454a;
        View view = this.f31460s;
        if (visibility != i10 && i10 == 0) {
            if (this.h) {
                hb1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                hb1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new yw0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                p9Var.getImageReceiver().startAnimation();
            }
        }
        super.setVisibility(i10);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.C = 0;
        hb1Var.setAlpha(0.0f);
        hb1Var.setScaleX(0.8f);
        hb1Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new yw0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        p9Var.getImageReceiver().stopAnimation();
        p9Var.getImageReceiver().clearImage();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            c();
        }
    }

    public void e(boolean z4, boolean z10) {
        if (this.h != z4) {
            this.h = z4;
            if (getVisibility() == 0) {
                RadialProgressView radialProgressView = this.f31456c;
                View view = this.f31460s;
                hb1 hb1Var = this.f31454a;
                if (z10) {
                    if (z4) {
                        hb1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.f31463y.run();
                        return;
                    }
                    hb1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new yw0(this, 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.f31455b.getImageReceiver().startAnimation();
                } else if (z4) {
                    hb1Var.animate().cancel();
                    hb1Var.setAlpha(0.0f);
                    hb1Var.setScaleX(0.8f);
                    hb1Var.setScaleY(0.8f);
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
                    hb1Var.animate().cancel();
                    hb1Var.setAlpha(1.0f);
                    hb1Var.setScaleX(1.0f);
                    hb1Var.setScaleY(1.0f);
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
        return this.F;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            c();
        }
        NotificationCenter.getInstance(this.f31461w).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f31461w).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        if ((this.B || this.f31462x) && (i14 = this.C) > 0 && i14 != getMeasuredHeight()) {
            float measuredHeight = (this.C - getMeasuredHeight()) / 2.0f;
            hb1 hb1Var = this.f31454a;
            hb1Var.setTranslationY(hb1Var.getTranslationY() + measuredHeight);
            if (!this.f31462x) {
                hb1Var.animate().translationY(0.0f).setInterpolator(nr.f27346f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f31456c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f31462x) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(nr.f27346f).setDuration(250L);
                }
            }
        }
        this.C = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z4) {
        this.B = z4;
    }

    public void setPreventMoving(boolean z4) {
        this.f31462x = z4;
        if (!z4) {
            this.f31454a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.f31456c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i10) {
        if (this.f31459r != i10) {
            this.f31459r = i10;
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

    public zw0(Context context, View view, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f31461w = UserConfig.selectedAccount;
        this.f31463y = new tl0(this, 3);
        this.D = org.telegram.ui.ActionBar.j6.f19889c7;
        this.f31458n = f6Var;
        this.f31460s = view;
        this.f31459r = i10;
        hb1 hb1Var = new hb1(this, context, 11);
        this.f31454a = hb1Var;
        hb1Var.setOrientation(1);
        p9 p9Var = new p9(context);
        this.f31455b = p9Var;
        p9Var.setOnClickListener(new z70(this, 18));
        ih.s sVar = new ih.s(context);
        this.d = sVar;
        sVar.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        sVar.setTag(Integer.valueOf(i11));
        sVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        sVar.setTextSize(1, 20.0f);
        sVar.setGravity(17);
        e90 e90Var = new e90(context, null);
        this.e = e90Var;
        int i12 = org.telegram.ui.ActionBar.j6.f20281y6;
        e90Var.setTag(Integer.valueOf(i12));
        e90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        e90Var.setTextSize(1, 14.0f);
        e90Var.setGravity(17);
        ph.d dVar = new ph.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        this.f31457f = dVar;
        dVar.setVisibility(8);
        hb1Var.addView(p9Var, k7.b6.q(117, 117, 1));
        hb1Var.addView(sVar, k7.b6.t(-2, -2, 1, 0, 12, 0, 0));
        hb1Var.addView(e90Var, k7.b6.t(-2, -2, 1, 0, 8, 0, 0));
        hb1Var.addView(dVar, k7.b6.t(-1, 48, 1, 28, 16, 28, 0));
        addView(hb1Var, k7.b6.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, f6Var);
            this.f31456c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, k7.b6.e(-2, -2, 17));
        }
    }
}
