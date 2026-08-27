package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class j51 extends View {
    public Drawable A;
    public Rect B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public i51 F;
    public Emoji.EmojiDrawable G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public int L;
    public boolean M;
    public float N;
    public float O;
    public float P;
    public final d50 Q;
    public final a61 R;

    public boolean f39256a;

    public boolean f39257b;

    public int f39258c;
    public TLRPC.Document d;

    public org.telegram.ui.Components.t5 f39259e;

    public final ImageReceiver.BackgroundThreadDrawHolder[] f39260f;
    public ImageReceiver h;

    public final ImageReceiver f39261n;

    public ImageReceiver f39262r;

    public boolean f39263s;
    public TL_stars.TL_starGiftUnique v;

    public Integer f39264w;

    public ig.q0 f39265x;

    public boolean f39266y;

    public j51(a61 a61Var, Context context) {
        super(context);
        this.R = a61Var;
        this.f39256a = false;
        this.f39257b = false;
        this.f39260f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f39261n = imageReceiver;
        this.P = 1.0f;
        this.Q = new d50(this, 1);
        imageReceiver.ignoreNotifications = true;
        setFocusable(true);
    }

    public final void a(View view) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.h = imageReceiver;
            imageReceiver.setLayerNum(7);
            if (this.D) {
                this.h.onAttachedToWindow();
            }
            this.h.setAspectFit(true);
        }
    }

    public final void b() {
        Paint paint;
        i51 i51Var = this.F;
        if (i51Var != null) {
            i51Var.h = false;
            i51Var.f534n = -1;
            if (i51Var.f529a != 2 || (paint = i51Var.f538x) == null) {
                return;
            }
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
            return;
        }
        Context context = getContext();
        int i10 = ag.k2.H;
        this.F = new i51(this, context);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824);
        this.F.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        i51 i51Var2 = this.F;
        i51Var2.layout(0, 0, i51Var2.getMeasuredWidth(), this.F.getMeasuredHeight());
    }

    public final void c(TLRPC.Document document, c51 c51Var) {
        this.d = document;
        a(c51Var);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f);
        if (this.R.S == 6) {
            this.h.setImage(ImageLocation.getForDocument(document), !LiteMode.isEnabled(16388) ? "34_34_firstframe" : "34_34", null, null, svgThumb, document.size, null, document, 0);
        } else {
            this.h.setImage(ImageLocation.getForDocument(document), "100_100_firstframe", null, null, svgThumb, 0L, "tgs", document, 0);
        }
        this.M = true;
        this.f39259e = null;
    }

    public final void d(boolean z10, boolean z11) {
        if (this.H != z10) {
            this.H = z10;
            if (z11) {
                return;
            }
            this.N = z10 ? 1.0f : 0.0f;
            this.O = z10 ? 1.0f : 0.0f;
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (this.H || !z10 || !z11 || this.R.S == 14) {
            this.I = false;
            d(z10, z11);
            return;
        }
        this.I = true;
        this.O = 1.0f;
        this.N = 1.0f;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.E.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.J, 1.6f, 0.7f);
        this.E = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new g51(this, 2));
        this.E.addListener(new h51(this, 2));
        this.E.setInterpolator(new LinearInterpolator());
        this.E.setDuration(200L);
        this.E.start();
    }

    public final void f() {
        if (!this.H || this.R.S == 14) {
            return;
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.E.cancel();
        }
        this.J = 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.E = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new g51(this, 1));
        this.E.addListener(new h51(this, 1));
        this.E.setInterpolator(new OvershootInterpolator(5.0f));
        this.E.setDuration(350L);
        this.E.start();
        d(false, true);
    }

    public float getAnimatedScale() {
        return this.P;
    }

    @Override
    public final void invalidate() {
        if (ig.g0.f11303b || getParent() == null) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D) {
            return;
        }
        this.D = true;
        Drawable drawable = this.A;
        if (drawable instanceof org.telegram.ui.Components.k5) {
            ((org.telegram.ui.Components.k5) drawable).b(this.Q);
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.setParentView((View) getParent());
            this.h.onAttachedToWindow();
        }
        this.f39261n.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.D) {
            this.D = false;
            Drawable drawable = this.A;
            if (drawable instanceof org.telegram.ui.Components.k5) {
                ((org.telegram.ui.Components.k5) drawable).p(this.Q);
                jh.y2 y2Var = ((org.telegram.ui.Components.k5) this.A).f29961k;
                if (y2Var != null) {
                    y2Var.setEmojiPaused(false);
                }
            }
            ImageReceiver imageReceiver = this.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.h.setEmojiPaused(false);
            }
            this.f39261n.onDetachedFromWindow();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String strFindAnimatedEmojiEmoticon;
        org.telegram.ui.Components.t5 t5Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f39256a) {
            strFindAnimatedEmojiEmoticon = LocaleController.getString(R.string.RemoveStatus);
        } else {
            ig.q0 q0Var = this.f39265x;
            if (q0Var == null || (strFindAnimatedEmojiEmoticon = q0Var.f11412f) == null) {
                TLRPC.Document documentF = this.d;
                if (documentF == null && (t5Var = this.f39259e) != null && (documentF = t5Var.document) == null) {
                    documentF = org.telegram.ui.Components.k5.f(this.R.R, t5Var.getDocumentId());
                }
                strFindAnimatedEmojiEmoticon = documentF != null ? MessageObject.findAnimatedEmojiEmoticon(documentF, null) : null;
            }
        }
        if (strFindAnimatedEmojiEmoticon != null) {
            accessibilityNodeInfo.setContentDescription(strFindAnimatedEmojiEmoticon);
        }
        accessibilityNodeInfo.setSelected(this.H);
        accessibilityNodeInfo.setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    public void setAnimatedScale(float f10) {
        this.P = f10;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.A;
        if (drawable2 != drawable) {
            boolean z10 = this.D;
            d50 d50Var = this.Q;
            if (z10 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.k5)) {
                ((org.telegram.ui.Components.k5) drawable2).p(d50Var);
            }
            this.A = drawable;
            if (this.D && (drawable instanceof org.telegram.ui.Components.k5)) {
                ((org.telegram.ui.Components.k5) drawable).b(d50Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.G = null;
        } else {
            this.G = Emoji.getEmojiDrawable(str);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.E) != null) {
                valueAnimator.removeAllListeners();
                this.E.cancel();
            }
            if (z10) {
                return;
            }
            float f10 = this.J;
            if (f10 == 0.0f || this.R.S == 14) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f);
            this.E = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new g51(this, 0));
            this.E.addListener(new h51(this, 0));
            this.E.setInterpolator(new OvershootInterpolator(5.0f));
            this.E.setDuration(350L);
            this.E.start();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ig.g0.f11303b) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
