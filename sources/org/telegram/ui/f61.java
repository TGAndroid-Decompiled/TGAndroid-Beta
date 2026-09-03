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
    public final p50 R;
    public final w61 S;
    public boolean f36677a;
    public boolean f36678b;
    public int f36679c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.u5 f36680e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f36681f;
    public ImageReceiver h;
    public final ImageReceiver f36682n;
    public ImageReceiver f36683r;
    public boolean f36684s;
    public TL_stars.TL_starGiftUnique v;
    public Integer f36685w;
    public ng.q0 f36686x;
    public boolean f36687y;

    public f61(w61 w61Var, Context context) {
        super(context);
        this.S = w61Var;
        this.f36677a = false;
        this.f36678b = false;
        this.f36681f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f36682n = imageReceiver;
        this.Q = 1.0f;
        this.R = new p50(this, 1);
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
            int i10 = fg.r1.I;
            this.G = new e61(this, context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824);
            this.G.measure(makeMeasureSpec, makeMeasureSpec);
            e61 e61Var2 = this.G;
            e61Var2.layout(0, 0, e61Var2.getMeasuredWidth(), this.G.getMeasuredHeight());
            return;
        }
        e61Var.h = false;
        e61Var.f6536n = -1;
        if (e61Var.f6531a == 2 && (paint = e61Var.f6540x) != null) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        }
    }

    public final void c(TLRPC.Document document, y51 y51Var) {
        String str;
        this.d = document;
        a(y51Var);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.k6.f21823m6, 0.2f);
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
        this.f36680e = null;
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
        if (ng.g0.f16070b || getParent() == null) {
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
        this.f36682n.onAttachedToWindow();
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
            oh.z2 z2Var = ((org.telegram.ui.Components.l5) this.B).f28637k;
            if (z2Var != null) {
                z2Var.setEmojiPaused(false);
            }
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.h.setEmojiPaused(false);
        }
        this.f36682n.onDetachedFromWindow();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        org.telegram.ui.Components.u5 u5Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f36677a) {
            str = LocaleController.getString(R.string.RemoveStatus);
        } else {
            ng.q0 q0Var = this.f36686x;
            if (q0Var == null || (str = q0Var.f16180f) == null) {
                TLRPC.Document document = this.d;
                if (document == null && (u5Var = this.f36680e) != null && (document = u5Var.document) == null) {
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
            p50 p50Var = this.R;
            if (z4 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.l5)) {
                ((org.telegram.ui.Components.l5) drawable2).p(p50Var);
            }
            this.B = drawable;
            if (this.E && (drawable instanceof org.telegram.ui.Components.l5)) {
                ((org.telegram.ui.Components.l5) drawable).b(p50Var);
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
        if (ng.g0.f16070b) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
