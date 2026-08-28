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
import org.telegram.ui.ta1;
public class gw0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public int B;
    public int C;
    public ValueAnimator D;
    public float E;
    public boolean F;
    public final ta1 f28882a;
    public final o9 f28883b;
    public final RadialProgressView f28884c;
    public final dh.u d;
    public final l80 f28885e;
    public final kh.d f28886f;
    public boolean h;
    public final org.telegram.ui.ActionBar.b6 f28887n;
    public int f28888r;
    public final View f28889s;
    public int v;
    public final int f28890w;
    public boolean f28891x;
    public final ju0 f28892y;

    public gw0(Context context) {
        this(context, null, 1, null);
    }

    public void a() {
        invalidate();
    }

    public final void b(int i9, boolean z10) {
        if (this.v != i9) {
            int i10 = 0;
            if (getVisibility() != 0) {
                z10 = false;
            }
            this.v = i9;
            int i11 = -(i9 >> 1);
            if (i9 > 0) {
                i10 = AndroidUtilities.dp(20.0f);
            }
            float f10 = i11 + i10;
            RadialProgressView radialProgressView = this.f28884c;
            ta1 ta1Var = this.f28882a;
            if (z10) {
                ViewPropertyAnimator translationY = ta1Var.animate().translationY(f10);
                gr grVar = gr.f28844f;
                translationY.setInterpolator(grVar).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f10).setInterpolator(grVar).setDuration(250L);
                    return;
                }
                return;
            }
            ta1Var.setTranslationY(f10);
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(f10);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i9;
        int i10 = this.f28888r;
        o9 o9Var = this.f28883b;
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i11 = this.f28890w;
                if (i10 == 16) {
                    document = MediaDataController.getInstance(i11).getEmojiAnimatedSticker("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i11).getStickerSetByName("tg_placeholders_android");
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(i11).getStickerSetByEmojiOrName("tg_placeholders_android");
                    }
                    if (stickerSetByName != null && (i9 = this.f28888r) >= 0 && i9 < stickerSetByName.documents.size()) {
                        document2 = stickerSetByName.documents.get(this.f28888r);
                    }
                    obj = stickerSetByName;
                    document = document2;
                    str = "130_130";
                }
                if (!LiteMode.isEnabled(3)) {
                    str = ta.b.j(str, "_firstframe");
                }
                if (document != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, this.C, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    o9Var.i(ImageLocation.getForDocument(document), str, "tgs", svgThumb, obj);
                    int i12 = this.f28888r;
                    if (i12 != 9 && i12 != 0) {
                        o9Var.getImageReceiver().setAutoRepeat(2);
                        return;
                    } else {
                        o9Var.getImageReceiver().setAutoRepeat(1);
                        return;
                    }
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i11);
                if (obj != null) {
                    z10 = false;
                }
                mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z10);
                o9Var.getImageReceiver().clearImage();
                return;
            }
        }
        o9Var.setImageDrawable(new mi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
    }

    public final void d(int i9, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        if (i9 == 0) {
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
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                this.E = f11;
                a();
            } else {
                float f12 = this.E;
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
                this.D = ofFloat;
                ofFloat.setDuration(480L);
                this.D.setInterpolator(gr.h);
                this.D.addUpdateListener(new q60(this, 24));
                this.D.start();
            }
        }
        int visibility = getVisibility();
        o9 o9Var = this.f28883b;
        RadialProgressView radialProgressView = this.f28884c;
        ta1 ta1Var = this.f28882a;
        View view = this.f28889s;
        if (visibility != i9 && i9 == 0) {
            if (this.h) {
                ta1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                ta1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new fw0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                o9Var.getImageReceiver().startAnimation();
            }
        }
        super.setVisibility(i9);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.B = 0;
        ta1Var.setAlpha(0.0f);
        ta1Var.setScaleX(0.8f);
        ta1Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new fw0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        o9Var.getImageReceiver().stopAnimation();
        o9Var.getImageReceiver().clearImage();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            c();
        }
    }

    public void e(boolean z10, boolean z11) {
        if (this.h != z10) {
            this.h = z10;
            if (getVisibility() == 0) {
                RadialProgressView radialProgressView = this.f28884c;
                View view = this.f28889s;
                ta1 ta1Var = this.f28882a;
                if (z11) {
                    if (z10) {
                        ta1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.f28892y.run();
                        return;
                    }
                    ta1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new fw0(this, 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.f28883b.getImageReceiver().startAnimation();
                } else if (z10) {
                    ta1Var.animate().cancel();
                    ta1Var.setAlpha(0.0f);
                    ta1Var.setScaleX(0.8f);
                    ta1Var.setScaleY(0.8f);
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
                    ta1Var.animate().cancel();
                    ta1Var.setAlpha(1.0f);
                    ta1Var.setScaleX(1.0f);
                    ta1Var.setScaleY(1.0f);
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
        NotificationCenter.getInstance(this.f28890w).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f28890w).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i9, i10, i11, i12);
        if ((this.A || this.f28891x) && (i13 = this.B) > 0 && i13 != getMeasuredHeight()) {
            float measuredHeight = (this.B - getMeasuredHeight()) / 2.0f;
            ta1 ta1Var = this.f28882a;
            ta1Var.setTranslationY(ta1Var.getTranslationY() + measuredHeight);
            if (!this.f28891x) {
                ta1Var.animate().translationY(0.0f).setInterpolator(gr.f28844f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f28884c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f28891x) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(gr.f28844f).setDuration(250L);
                }
            }
        }
        this.B = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.A = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.f28891x = z10;
        if (!z10) {
            this.f28882a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.f28884c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i9) {
        if (this.f28888r != i9) {
            this.f28888r = i9;
            c();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i9 = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (Character.isWhitespace(charSequence.charAt(i10))) {
                i9++;
            }
        }
        if (i9 > 4 && charSequence.length() > 20) {
            int length = charSequence.length() >> 1;
            int i11 = -1;
            int i12 = 0;
            for (int i13 = 0; i13 < charSequence.length(); i13++) {
                if (Character.isWhitespace(charSequence.charAt(i13))) {
                    int abs = Math.abs(length - i13);
                    if (i11 == -1 || abs < i12) {
                        i11 = i13;
                        i12 = abs;
                    }
                }
            }
            if (i11 > 0) {
                charSequence = ((Object) charSequence.subSequence(0, i11)) + "\n" + ((Object) charSequence.subSequence(i11 + 1, charSequence.length()));
            }
        }
        this.f28885e.setText(charSequence);
    }

    @Override
    public void setVisibility(int i9) {
        d(i9, true);
    }

    public gw0(Context context, View view, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f28890w = UserConfig.selectedAccount;
        this.f28892y = new ju0(this, 1);
        this.C = org.telegram.ui.ActionBar.f6.f22984c7;
        this.f28887n = b6Var;
        this.f28889s = view;
        this.f28888r = i9;
        ta1 ta1Var = new ta1(this, context, 11);
        this.f28882a = ta1Var;
        ta1Var.setOrientation(1);
        o9 o9Var = new o9(context);
        this.f28883b = o9Var;
        o9Var.setOnClickListener(new h70(this, 18));
        dh.u uVar = new dh.u(context);
        this.d = uVar;
        uVar.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        uVar.setTag(Integer.valueOf(i10));
        uVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        uVar.setTextSize(1, 20.0f);
        uVar.setGravity(17);
        l80 l80Var = new l80(context, null);
        this.f28885e = l80Var;
        int i11 = org.telegram.ui.ActionBar.f6.f23369y6;
        l80Var.setTag(Integer.valueOf(i11));
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J6, b6Var));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setGravity(17);
        kh.d dVar = new kh.d(context, b6Var, true);
        dVar.setRoundRadius(24);
        this.f28886f = dVar;
        dVar.setVisibility(8);
        ta1Var.addView(o9Var, g7.e6.q(117, 117, 1));
        ta1Var.addView(uVar, g7.e6.t(-2, -2, 1, 0, 12, 0, 0));
        ta1Var.addView(l80Var, g7.e6.t(-2, -2, 1, 0, 8, 0, 0));
        ta1Var.addView(dVar, g7.e6.t(-1, 48, 1, 28, 16, 28, 0));
        addView(ta1Var, g7.e6.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, b6Var);
            this.f28884c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, g7.e6.e(-2, -2, 17));
        }
    }
}
