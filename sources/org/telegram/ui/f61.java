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
public final class f61 extends View {
    public Drawable B;
    public Rect C;
    public float D;
    public boolean E;
    public ValueAnimator F;
    public e61 G;
    public Emoji.EmojiDrawable H;
    public boolean I;
    public boolean J;
    public float K;
    public float L;
    public int M;
    public boolean N;
    public float O;
    public float P;
    public float Q;
    public final q50 R;
    public final x61 S;
    public boolean f33963a;
    public boolean f33964b;
    public int f33965c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.u5 e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f33966f;
    public ImageReceiver h;
    public final ImageReceiver f33967n;
    public ImageReceiver f33968r;
    public boolean f33969s;
    public TL_stars.TL_starGiftUnique v;
    public Integer f33970w;
    public mg.q0 f33971x;
    public boolean f33972y;

    public f61(x61 x61Var, Context context) {
        super(context);
        this.S = x61Var;
        this.f33963a = false;
        this.f33964b = false;
        this.f33966f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f33967n = imageReceiver;
        this.Q = 1.0f;
        this.R = new q50(this, 1);
        imageReceiver.ignoreNotifications = true;
        setFocusable(true);
    }

    public final void a(View view) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.h = imageReceiver;
            imageReceiver.setLayerNum(7);
            if (this.E) {
                this.h.onAttachedToWindow();
            }
            this.h.setAspectFit(true);
        }
    }

    public final void b() {
        Paint paint;
        e61 e61Var = this.G;
        if (e61Var == null) {
            Context context = getContext();
            int i10 = eg.s1.I;
            this.G = new e61(this, context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824);
            this.G.measure(makeMeasureSpec, makeMeasureSpec);
            e61 e61Var2 = this.G;
            e61Var2.layout(0, 0, e61Var2.getMeasuredWidth(), this.G.getMeasuredHeight());
            return;
        }
        e61Var.h = false;
        e61Var.f5488n = -1;
        if (e61Var.f5484a == 2 && (paint = e61Var.f5492x) != null) {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        }
    }

    public final void c(TLRPC.Document document, y51 y51Var) {
        String str;
        this.d = document;
        a(y51Var);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.f20042m6, 0.2f);
        if (this.S.T == 6) {
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
        this.N = true;
        this.e = null;
    }

    public final void d(boolean z4, boolean z10) {
        float f10;
        if (this.I != z4) {
            this.I = z4;
            if (!z10) {
                float f11 = 0.0f;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.O = f10;
                if (z4) {
                    f11 = 1.0f;
                }
                this.P = f11;
            }
        }
    }

    public final void e(boolean z4, boolean z10) {
        if (!this.I && z4 && z10 && this.S.T != 14) {
            this.J = true;
            this.P = 1.0f;
            this.O = 1.0f;
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.F.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 1.6f, 0.7f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new c61(this, 2));
            this.F.addListener(new d61(this, 2));
            this.F.setInterpolator(new LinearInterpolator());
            this.F.setDuration(200L);
            this.F.start();
            return;
        }
        this.J = false;
        d(z4, z10);
    }

    public final void f() {
        if (this.I && this.S.T != 14) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.F.cancel();
            }
            this.K = 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new c61(this, 1));
            this.F.addListener(new d61(this, 1));
            this.F.setInterpolator(new OvershootInterpolator(5.0f));
            this.F.setDuration(350L);
            this.F.start();
            d(false, true);
        }
    }

    public float getAnimatedScale() {
        return this.Q;
    }

    @Override
    public final void invalidate() {
        if (mg.g0.f13992b || getParent() == null) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E) {
            return;
        }
        this.E = true;
        Drawable drawable = this.B;
        if (drawable instanceof org.telegram.ui.Components.l5) {
            ((org.telegram.ui.Components.l5) drawable).b(this.R);
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.setParentView((View) getParent());
            this.h.onAttachedToWindow();
        }
        this.f33967n.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.E) {
            return;
        }
        this.E = false;
        Drawable drawable = this.B;
        if (drawable instanceof org.telegram.ui.Components.l5) {
            ((org.telegram.ui.Components.l5) drawable).p(this.R);
            nh.y2 y2Var = ((org.telegram.ui.Components.l5) this.B).f26587k;
            if (y2Var != null) {
                y2Var.setEmojiPaused(false);
            }
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.h.setEmojiPaused(false);
        }
        this.f33967n.onDetachedFromWindow();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        org.telegram.ui.Components.u5 u5Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f33963a) {
            str = LocaleController.getString(R.string.RemoveStatus);
        } else {
            mg.q0 q0Var = this.f33971x;
            if (q0Var == null || (str = q0Var.f14095f) == null) {
                TLRPC.Document document = this.d;
                if (document == null && (u5Var = this.e) != null && (document = u5Var.document) == null) {
                    document = org.telegram.ui.Components.l5.f(this.S.S, u5Var.getDocumentId());
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
        accessibilityNodeInfo.setSelected(this.I);
        accessibilityNodeInfo.setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    public void setAnimatedScale(float f10) {
        this.Q = f10;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != drawable) {
            boolean z4 = this.E;
            q50 q50Var = this.R;
            if (z4 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.l5)) {
                ((org.telegram.ui.Components.l5) drawable2).p(q50Var);
            }
            this.B = drawable;
            if (this.E && (drawable instanceof org.telegram.ui.Components.l5)) {
                ((org.telegram.ui.Components.l5) drawable).b(q50Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.H = null;
        } else {
            this.H = Emoji.getEmojiDrawable(str);
        }
    }

    @Override
    public void setPressed(boolean z4) {
        ValueAnimator valueAnimator;
        if (isPressed() != z4) {
            super.setPressed(z4);
            invalidate();
            if (z4 && (valueAnimator = this.F) != null) {
                valueAnimator.removeAllListeners();
                this.F.cancel();
            }
            if (!z4) {
                float f10 = this.K;
                if (f10 != 0.0f && this.S.T != 14) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.F = ofFloat;
                    ofFloat.addUpdateListener(new c61(this, 0));
                    this.F.addListener(new d61(this, 0));
                    this.F.setInterpolator(new OvershootInterpolator(5.0f));
                    this.F.setDuration(350L);
                    this.F.start();
                }
            }
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (mg.g0.f13992b) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
