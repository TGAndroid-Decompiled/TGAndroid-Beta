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
import org.telegram.ui.dc1;
public class ay0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public int G;
    public ValueAnimator H;
    public float I;
    public boolean J;
    public final dc1 f24799a;
    public final y9 f24800b;
    public final RadialProgressView f24801c;
    public final vh.n d;
    public final ea0 f24802e;
    public final ci.d f24803f;
    public boolean h;
    public final org.telegram.ui.ActionBar.e6 f24804n;
    public int f24805r;
    public final View f24806s;
    public int v;
    public final int f24807w;
    public boolean f24808x;
    public final org.telegram.ui.Cells.t6 f24809y;

    public ay0(Context context) {
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
            RadialProgressView radialProgressView = this.f24801c;
            dc1 dc1Var = this.f24799a;
            if (z10) {
                ViewPropertyAnimator translationY = dc1Var.animate().translationY(f7);
                hs hsVar = hs.f27118f;
                translationY.setInterpolator(hsVar).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f7).setInterpolator(hsVar).setDuration(250L);
                    return;
                }
                return;
            }
            dc1Var.setTranslationY(f7);
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(f7);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i10;
        int i11 = this.f24805r;
        y9 y9Var = this.f24800b;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i12 = this.f24807w;
                if (i11 == 16) {
                    document = MediaDataController.getInstance(i12).getEmojiAnimatedSticker("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByName("tg_placeholders_android");
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByEmojiOrName("tg_placeholders_android");
                    }
                    if (stickerSetByName != null && (i10 = this.f24805r) >= 0 && i10 < stickerSetByName.documents.size()) {
                        document2 = stickerSetByName.documents.get(this.f24805r);
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
                    int i13 = this.f24805r;
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
        y9Var.setImageDrawable(new ck0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
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
                this.H.setInterpolator(hs.h);
                this.H.addUpdateListener(new j80(this, 25));
                this.H.start();
            }
        }
        int visibility = getVisibility();
        y9 y9Var = this.f24800b;
        RadialProgressView radialProgressView = this.f24801c;
        dc1 dc1Var = this.f24799a;
        View view = this.f24806s;
        if (visibility != i10 && i10 == 0) {
            if (this.h) {
                dc1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                dc1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new zx0(this, 0)).alpha(0.0f).setDuration(150L).start();
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
        dc1Var.setAlpha(0.0f);
        dc1Var.setScaleX(0.8f);
        dc1Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new zx0(this, 1)).alpha(0.0f).setDuration(150L).start();
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
                RadialProgressView radialProgressView = this.f24801c;
                View view = this.f24806s;
                dc1 dc1Var = this.f24799a;
                if (z11) {
                    if (z10) {
                        dc1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.f24809y.run();
                        return;
                    }
                    dc1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new zx0(this, 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.f24800b.getImageReceiver().startAnimation();
                } else if (z10) {
                    dc1Var.animate().cancel();
                    dc1Var.setAlpha(0.0f);
                    dc1Var.setScaleX(0.8f);
                    dc1Var.setScaleY(0.8f);
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
                    dc1Var.animate().cancel();
                    dc1Var.setAlpha(1.0f);
                    dc1Var.setScaleX(1.0f);
                    dc1Var.setScaleY(1.0f);
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
        NotificationCenter.getInstance(this.f24807w).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f24807w).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if ((this.E || this.f24808x) && (i14 = this.F) > 0 && i14 != getMeasuredHeight()) {
            float measuredHeight = (this.F - getMeasuredHeight()) / 2.0f;
            dc1 dc1Var = this.f24799a;
            dc1Var.setTranslationY(dc1Var.getTranslationY() + measuredHeight);
            if (!this.f24808x) {
                dc1Var.animate().translationY(0.0f).setInterpolator(hs.f27118f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f24801c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f24808x) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(hs.f27118f).setDuration(250L);
                }
            }
        }
        this.F = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.E = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.f24808x = z10;
        if (!z10) {
            this.f24799a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.f24801c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i10) {
        if (this.f24805r != i10) {
            this.f24805r = i10;
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
        this.f24802e.setText(charSequence);
    }

    @Override
    public void setVisibility(int i10) {
        d(i10, true);
    }

    public ay0(Context context, View view, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f24807w = UserConfig.selectedAccount;
        this.f24809y = new org.telegram.ui.Cells.t6(this, 24);
        this.G = org.telegram.ui.ActionBar.i6.f20781c7;
        this.f24804n = e6Var;
        this.f24806s = view;
        this.f24805r = i10;
        dc1 dc1Var = new dc1(this, context, 10);
        this.f24799a = dc1Var;
        dc1Var.setOrientation(1);
        y9 y9Var = new y9(context);
        this.f24800b = y9Var;
        y9Var.setOnClickListener(new b90(this, 17));
        vh.n nVar = new vh.n(context);
        this.d = nVar;
        nVar.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        nVar.setTag(Integer.valueOf(i11));
        nVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        nVar.setTextSize(1, 20.0f);
        nVar.setGravity(17);
        ea0 ea0Var = new ea0(context, null);
        this.f24802e = ea0Var;
        int i12 = org.telegram.ui.ActionBar.i6.f21181y6;
        ea0Var.setTag(Integer.valueOf(i12));
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.J6, e6Var));
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setGravity(17);
        ci.d dVar = new ci.d(context, e6Var, true);
        dVar.setRoundRadius(24);
        this.f24803f = dVar;
        dVar.setVisibility(8);
        dc1Var.addView(y9Var, w7.x5.q(117, 117, 1));
        dc1Var.addView(nVar, w7.x5.t(-2, -2, 1, 0, 12, 0, 0));
        dc1Var.addView(ea0Var, w7.x5.t(-2, -2, 1, 0, 8, 0, 0));
        dc1Var.addView(dVar, w7.x5.t(-1, 48, 1, 28, 16, 28, 0));
        addView(dc1Var, w7.x5.a(-2.0f, 46.0f, 0.0f, 46.0f, 30.0f, -2, 17));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, e6Var);
            this.f24801c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, w7.x5.e(-2, -2, 17));
        }
    }
}
