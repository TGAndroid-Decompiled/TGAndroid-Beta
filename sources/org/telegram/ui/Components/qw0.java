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
import org.telegram.ui.ua1;
public class qw0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public int B;
    public int C;
    public ValueAnimator D;
    public float E;
    public boolean F;
    public final ua1 f32119a;
    public final t9 f32120b;
    public final RadialProgressView f32121c;
    public final gh.s d;
    public final y80 f32122e;
    public final nh.d f32123f;
    public boolean h;
    public final org.telegram.ui.ActionBar.c6 f32124n;
    public int f32125r;
    public final View f32126s;
    public int v;
    public final int f32127w;
    public boolean f32128x;
    public final rk0 f32129y;

    public qw0(Context context) {
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
            float f9 = i12 + i11;
            RadialProgressView radialProgressView = this.f32121c;
            ua1 ua1Var = this.f32119a;
            if (z10) {
                ViewPropertyAnimator translationY = ua1Var.animate().translationY(f9);
                jr jrVar = jr.f29800f;
                translationY.setInterpolator(jrVar).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f9).setInterpolator(jrVar).setDuration(250L);
                    return;
                }
                return;
            }
            ua1Var.setTranslationY(f9);
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(f9);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i10;
        int i11 = this.f32125r;
        t9 t9Var = this.f32120b;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i12 = this.f32127w;
                if (i11 == 16) {
                    document = MediaDataController.getInstance(i12).getEmojiAnimatedSticker("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByName("tg_placeholders_android");
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByEmojiOrName("tg_placeholders_android");
                    }
                    if (stickerSetByName != null && (i10 = this.f32125r) >= 0 && i10 < stickerSetByName.documents.size()) {
                        document2 = stickerSetByName.documents.get(this.f32125r);
                    }
                    obj = stickerSetByName;
                    document = document2;
                    str = "130_130";
                }
                if (!LiteMode.isEnabled(3)) {
                    str = u3.c.k(str, "_firstframe");
                }
                if (document != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, this.C, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    t9Var.i(ImageLocation.getForDocument(document), str, "tgs", svgThumb, obj);
                    int i13 = this.f32125r;
                    if (i13 != 9 && i13 != 0) {
                        t9Var.getImageReceiver().setAutoRepeat(2);
                        return;
                    } else {
                        t9Var.getImageReceiver().setAutoRepeat(1);
                        return;
                    }
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                if (obj != null) {
                    z10 = false;
                }
                mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z10);
                t9Var.getImageReceiver().clearImage();
                return;
            }
        }
        t9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
    }

    public final void d(int i10, boolean z10) {
        boolean z11;
        float f9;
        float f10;
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.F != z11) {
            this.F = z11;
            setEnabled(z11);
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.D = null;
            }
            if (!z10) {
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.E = f10;
                a();
            } else {
                float f11 = this.E;
                if (z11) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f9);
                this.D = ofFloat;
                ofFloat.setDuration(480L);
                this.D.setInterpolator(jr.h);
                this.D.addUpdateListener(new d70(this, 24));
                this.D.start();
            }
        }
        int visibility = getVisibility();
        t9 t9Var = this.f32120b;
        RadialProgressView radialProgressView = this.f32121c;
        ua1 ua1Var = this.f32119a;
        View view = this.f32126s;
        if (visibility != i10 && i10 == 0) {
            if (this.h) {
                ua1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                ua1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new pw0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                t9Var.getImageReceiver().startAnimation();
            }
        }
        super.setVisibility(i10);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.B = 0;
        ua1Var.setAlpha(0.0f);
        ua1Var.setScaleX(0.8f);
        ua1Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new pw0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        t9Var.getImageReceiver().stopAnimation();
        t9Var.getImageReceiver().clearImage();
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
                RadialProgressView radialProgressView = this.f32121c;
                View view = this.f32126s;
                ua1 ua1Var = this.f32119a;
                if (z11) {
                    if (z10) {
                        ua1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.f32129y.run();
                        return;
                    }
                    ua1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new pw0(this, 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.f32120b.getImageReceiver().startAnimation();
                } else if (z10) {
                    ua1Var.animate().cancel();
                    ua1Var.setAlpha(0.0f);
                    ua1Var.setScaleX(0.8f);
                    ua1Var.setScaleY(0.8f);
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
                    ua1Var.animate().cancel();
                    ua1Var.setAlpha(1.0f);
                    ua1Var.setScaleX(1.0f);
                    ua1Var.setScaleY(1.0f);
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
        return this.E;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            c();
        }
        NotificationCenter.getInstance(this.f32127w).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f32127w).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if ((this.A || this.f32128x) && (i14 = this.B) > 0 && i14 != getMeasuredHeight()) {
            float measuredHeight = (this.B - getMeasuredHeight()) / 2.0f;
            ua1 ua1Var = this.f32119a;
            ua1Var.setTranslationY(ua1Var.getTranslationY() + measuredHeight);
            if (!this.f32128x) {
                ua1Var.animate().translationY(0.0f).setInterpolator(jr.f29800f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f32121c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f32128x) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(jr.f29800f).setDuration(250L);
                }
            }
        }
        this.B = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.A = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.f32128x = z10;
        if (!z10) {
            this.f32119a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.f32121c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i10) {
        if (this.f32125r != i10) {
            this.f32125r = i10;
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
        this.f32122e.setText(charSequence);
    }

    @Override
    public void setVisibility(int i10) {
        d(i10, true);
    }

    public qw0(Context context, View view, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f32127w = UserConfig.selectedAccount;
        this.f32129y = new rk0(this, 4);
        this.C = org.telegram.ui.ActionBar.g6.f23045c7;
        this.f32124n = c6Var;
        this.f32126s = view;
        this.f32125r = i10;
        ua1 ua1Var = new ua1(this, context, 12);
        this.f32119a = ua1Var;
        ua1Var.setOrientation(1);
        t9 t9Var = new t9(context);
        this.f32120b = t9Var;
        t9Var.setOnClickListener(new u70(this, 18));
        gh.s sVar = new gh.s(context);
        this.d = sVar;
        sVar.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        sVar.setTag(Integer.valueOf(i11));
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        sVar.setTextSize(1, 20.0f);
        sVar.setGravity(17);
        y80 y80Var = new y80(context, null);
        this.f32122e = y80Var;
        int i12 = org.telegram.ui.ActionBar.g6.f23433y6;
        y80Var.setTag(Integer.valueOf(i12));
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, c6Var));
        y80Var.setTextSize(1, 14.0f);
        y80Var.setGravity(17);
        nh.d dVar = new nh.d(context, c6Var, true);
        dVar.setRoundRadius(24);
        this.f32123f = dVar;
        dVar.setVisibility(8);
        ua1Var.addView(t9Var, i7.f6.q(117, 117, 1));
        ua1Var.addView(sVar, i7.f6.t(-2, -2, 1, 0, 12, 0, 0));
        ua1Var.addView(y80Var, i7.f6.t(-2, -2, 1, 0, 8, 0, 0));
        ua1Var.addView(dVar, i7.f6.t(-1, 48, 1, 28, 16, 28, 0));
        addView(ua1Var, i7.f6.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, c6Var);
            this.f32121c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, i7.f6.e(-2, -2, 17));
        }
    }
}
