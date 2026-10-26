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
public final class l51 extends View {
    public Drawable E;
    public Rect F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public k51 J;
    public Emoji.EmojiDrawable K;
    public boolean L;
    public boolean M;
    public float N;
    public float O;
    public int P;
    public boolean Q;
    public float R;
    public float S;
    public float T;
    public final g50 U;
    public final c61 V;
    public boolean f41141a;
    public boolean f41142b;
    public int f41143c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.c6 e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f41144f;
    public ImageReceiver h;
    public final ImageReceiver f41145n;
    public ImageReceiver f41146r;
    public boolean f41147s;
    public TL_stars.TL_starGiftUnique v;
    public Integer f41148w;
    public bh.x0 f41149x;
    public boolean f41150y;

    public l51(c61 c61Var, Context context) {
        super(context);
        this.V = c61Var;
        this.f41141a = false;
        this.f41142b = false;
        this.f41144f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f41145n = imageReceiver;
        this.T = 1.0f;
        this.U = new g50(this, 1);
        imageReceiver.ignoreNotifications = true;
        setFocusable(true);
    }

    public final void a(View view) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.h = imageReceiver;
            imageReceiver.setLayerNum(7);
            if (this.H) {
                this.h.onAttachedToWindow();
            }
            this.h.setAspectFit(true);
        }
    }

    public final void b() {
        Paint paint;
        k51 k51Var = this.J;
        if (k51Var == null) {
            Context context = getContext();
            int i10 = tg.c1.L;
            this.J = new k51(this, context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824);
            this.J.measure(makeMeasureSpec, makeMeasureSpec);
            k51 k51Var2 = this.J;
            k51Var2.layout(0, 0, k51Var2.getMeasuredWidth(), this.J.getMeasuredHeight());
            return;
        }
        k51Var.h = false;
        k51Var.f48834n = -1;
        if (k51Var.f48830a == 2 && (paint = k51Var.f48838x) != null) {
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23299a7, false));
        }
    }

    public final void c(TLRPC.Document document, e51 e51Var) {
        String str;
        this.d = document;
        a(e51Var);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.y6.f23520m6, 0.2f);
        if (this.V.W == 6) {
            ImageReceiver imageReceiver = this.h;
            ImageLocation forDocument = ImageLocation.getForDocument(document);
            if (!LiteMode.isEnabled(16388)) {
                str = "34_34_firstframe";
            } else {
                str = "34_34";
            }
            imageReceiver.setImage(forDocument, str, null, null, svgThumb, document.size, null, document, 0);
        } else {
            this.h.setImage(ImageLocation.getForDocument(document), "100_100_firstframe", null, null, svgThumb, 0L, "tgs", document, 0);
        }
        this.Q = true;
        this.e = null;
    }

    public final void d(boolean z10, boolean z11) {
        float f7;
        if (this.L != z10) {
            this.L = z10;
            if (!z11) {
                float f10 = 0.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.R = f7;
                if (z10) {
                    f10 = 1.0f;
                }
                this.S = f10;
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (!this.L && z10 && z11 && this.V.W != 14) {
            this.M = true;
            this.S = 1.0f;
            this.R = 1.0f;
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, 1.6f, 0.7f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new i51(this, 2));
            this.I.addListener(new j51(this, 2));
            this.I.setInterpolator(new LinearInterpolator());
            this.I.setDuration(200L);
            this.I.start();
            return;
        }
        this.M = false;
        d(z10, z11);
    }

    public final void f() {
        if (this.L && this.V.W != 14) {
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            this.N = 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new i51(this, 1));
            this.I.addListener(new j51(this, 1));
            d3.m(5.0f, this.I);
            this.I.setDuration(350L);
            this.I.start();
            d(false, true);
        }
    }

    public float getAnimatedScale() {
        return this.T;
    }

    @Override
    public final void invalidate() {
        if (bh.m0.f4082b || getParent() == null) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H) {
            return;
        }
        this.H = true;
        Drawable drawable = this.E;
        if (drawable instanceof org.telegram.ui.Components.t5) {
            ((org.telegram.ui.Components.t5) drawable).b(this.U);
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.setParentView((View) getParent());
            this.h.onAttachedToWindow();
        }
        this.f41145n.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.H) {
            return;
        }
        this.H = false;
        Drawable drawable = this.E;
        if (drawable instanceof org.telegram.ui.Components.t5) {
            ((org.telegram.ui.Components.t5) drawable).p(this.U);
            di.f3 f3Var = ((org.telegram.ui.Components.t5) this.E).f32852k;
            if (f3Var != null) {
                f3Var.setEmojiPaused(false);
            }
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.h.setEmojiPaused(false);
        }
        this.f41145n.onDetachedFromWindow();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        org.telegram.ui.Components.c6 c6Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f41141a) {
            str = LocaleController.getString(R.string.RemoveStatus);
        } else {
            bh.x0 x0Var = this.f41149x;
            if (x0Var == null || (str = x0Var.f4208f) == null) {
                TLRPC.Document document = this.d;
                if (document == null && (c6Var = this.e) != null && (document = c6Var.document) == null) {
                    document = org.telegram.ui.Components.t5.f(this.V.V, c6Var.getDocumentId());
                }
                if (document != null) {
                    str = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    str = null;
                }
            }
        }
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
        accessibilityNodeInfo.setSelected(this.L);
        accessibilityNodeInfo.setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    public void setAnimatedScale(float f7) {
        this.T = f7;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != drawable) {
            boolean z10 = this.H;
            g50 g50Var = this.U;
            if (z10 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.t5)) {
                ((org.telegram.ui.Components.t5) drawable2).p(g50Var);
            }
            this.E = drawable;
            if (this.H && (drawable instanceof org.telegram.ui.Components.t5)) {
                ((org.telegram.ui.Components.t5) drawable).b(g50Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.K = null;
        } else {
            this.K = Emoji.getEmojiDrawable(str);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.I) != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            if (!z10) {
                float f7 = this.N;
                if (f7 != 0.0f && this.V.W != 14) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.I = ofFloat;
                    ofFloat.addUpdateListener(new i51(this, 0));
                    this.I.addListener(new j51(this, 0));
                    d3.m(5.0f, this.I);
                    this.I.setDuration(350L);
                    this.I.start();
                }
            }
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (bh.m0.f4082b) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
