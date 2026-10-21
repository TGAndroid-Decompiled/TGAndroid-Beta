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
public final class g51 extends View {
    public Drawable E;
    public Rect F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public f51 J;
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
    public final c50 U;
    public final x51 V;
    public boolean f37189a;
    public boolean f37190b;
    public int f37191c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.a6 e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f37192f;
    public ImageReceiver h;
    public final ImageReceiver f37193n;
    public ImageReceiver f37194r;
    public boolean f37195s;
    public TL_stars.TL_starGiftUnique v;
    public Integer f37196w;
    public ah.i1 f37197x;
    public boolean f37198y;

    public g51(x51 x51Var, Context context) {
        super(context);
        this.V = x51Var;
        this.f37189a = false;
        this.f37190b = false;
        this.f37192f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f37193n = imageReceiver;
        this.T = 1.0f;
        this.U = new c50(this, 1);
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
        f51 f51Var = this.J;
        if (f51Var == null) {
            Context context = getContext();
            int i10 = sg.c1.L;
            this.J = new f51(this, context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824);
            this.J.measure(makeMeasureSpec, makeMeasureSpec);
            f51 f51Var2 = this.J;
            f51Var2.layout(0, 0, f51Var2.getMeasuredWidth(), this.J.getMeasuredHeight());
            return;
        }
        f51Var.h = false;
        f51Var.f46229n = -1;
        if (f51Var.f46225a == 2 && (paint = f51Var.f46233x) != null) {
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false));
        }
    }

    public final void c(TLRPC.Document document, z41 z41Var) {
        String str;
        this.d = document;
        a(z41Var);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.h6.f21153m6, 0.2f);
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
            ofFloat.addUpdateListener(new d51(this, 2));
            this.I.addListener(new e51(this, 2));
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
            ofFloat.addUpdateListener(new d51(this, 1));
            this.I.addListener(new e51(this, 1));
            org.telegram.messenger.mk.l(5.0f, this.I);
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
        if (ah.x0.f901b || getParent() == null) {
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
        if (drawable instanceof org.telegram.ui.Components.r5) {
            ((org.telegram.ui.Components.r5) drawable).b(this.U);
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.setParentView((View) getParent());
            this.h.onAttachedToWindow();
        }
        this.f37193n.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.H) {
            return;
        }
        this.H = false;
        Drawable drawable = this.E;
        if (drawable instanceof org.telegram.ui.Components.r5) {
            ((org.telegram.ui.Components.r5) drawable).p(this.U);
            ci.g3 g3Var = ((org.telegram.ui.Components.r5) this.E).f29838k;
            if (g3Var != null) {
                g3Var.setEmojiPaused(false);
            }
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.h.setEmojiPaused(false);
        }
        this.f37193n.onDetachedFromWindow();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        org.telegram.ui.Components.a6 a6Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f37189a) {
            str = LocaleController.getString(R.string.RemoveStatus);
        } else {
            ah.i1 i1Var = this.f37197x;
            if (i1Var == null || (str = i1Var.f783f) == null) {
                TLRPC.Document document = this.d;
                if (document == null && (a6Var = this.e) != null && (document = a6Var.document) == null) {
                    document = org.telegram.ui.Components.r5.f(this.V.V, a6Var.getDocumentId());
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
            c50 c50Var = this.U;
            if (z10 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.r5)) {
                ((org.telegram.ui.Components.r5) drawable2).p(c50Var);
            }
            this.E = drawable;
            if (this.H && (drawable instanceof org.telegram.ui.Components.r5)) {
                ((org.telegram.ui.Components.r5) drawable).b(c50Var);
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
                    ofFloat.addUpdateListener(new d51(this, 0));
                    this.I.addListener(new e51(this, 0));
                    org.telegram.messenger.mk.l(5.0f, this.I);
                    this.I.setDuration(350L);
                    this.I.start();
                }
            }
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ah.x0.f901b) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
