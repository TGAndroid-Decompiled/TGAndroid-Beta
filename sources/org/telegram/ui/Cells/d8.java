package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pr;
public class d8 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, cg.d {
    public static final AccelerateInterpolator K = new AccelerateInterpolator(0.5f);
    public final int B;
    public final boolean C;
    public boolean D;
    public final float E;
    public boolean F;
    public final ImageView G;
    public int H;
    public boolean I;
    public final org.telegram.ui.ActionBar.g6 J;
    public final c8 f22685a;
    public final fg.r1 f22686b;
    public TLRPC.Document f22687c;
    public SendMessagesHelper.ImportingSticker d;
    public Object f22688e;
    public String f22689f;
    public final TextView h;
    public float f22690n;
    public boolean f22691r;
    public long f22692s;
    public boolean v;
    public float f22693w;
    public long f22694x;
    public boolean f22695y;

    public d8(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.f22690n = 1.0f;
        this.B = UserConfig.selectedAccount;
        this.E = 1.0f;
        this.J = g6Var;
        this.C = z4;
        c8 c8Var = new c8(this, g6Var);
        this.f22685a = c8Var;
        c8Var.setAspectFit(true);
        c8Var.setAllowLoadingOnAttachedOnly(true);
        c8Var.setLayerNum(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false));
        fg.r1 r1Var = new fg.r1(context, 1, null);
        this.f22686b = r1Var;
        r1Var.setImageReceiver(c8Var);
        r1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        r1Var.setImageReceiver(c8Var);
        addView(r1Var, k7.c6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.G = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21895q5, g6Var)));
        imageView.setAlpha(0.0f);
        addView(imageView, k7.c6.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z4) {
        ImageView imageView = this.G;
        if (z4) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(pr.f30168f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, View view) {
        boolean z4;
        boolean z10 = this.f22691r;
        float f10 = this.E;
        c8 c8Var = this.f22685a;
        if (z10 || (((z4 = this.v) && this.f22693w != 0.8f) || (!z4 && this.f22693w != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f22692s;
            this.f22692s = currentTimeMillis;
            if (this.f22691r) {
                long j11 = this.f22694x + j10;
                this.f22694x = j11;
                if (j11 > 1050) {
                    this.f22694x = 1050L;
                }
                float interpolation = (K.getInterpolation(((float) this.f22694x) / 150.0f) * 0.5f) + 0.5f;
                this.f22690n = interpolation;
                if (interpolation >= 1.0f) {
                    this.f22691r = false;
                    this.f22690n = 1.0f;
                }
                c8Var.setAlpha(this.f22690n * f10);
            } else {
                if (this.v) {
                    float f11 = this.f22693w;
                    if (f11 != 0.8f) {
                        float f12 = f11 - (((float) j10) / 400.0f);
                        this.f22693w = f12;
                        if (f12 < 0.8f) {
                            this.f22693w = 0.8f;
                        }
                    }
                }
                float f13 = (((float) j10) / 400.0f) + this.f22693w;
                this.f22693w = f13;
                if (f13 > 1.0f) {
                    this.f22693w = 1.0f;
                }
            }
            view.invalidate();
        }
        int min = Math.min(AndroidUtilities.dp(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f14 = min;
        float f15 = f14 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        c8Var.setImageCoords(measuredWidth - f15, measuredHeight - f15, f14, f14);
        c8Var.setAlpha(this.f22690n * f10);
        if (this.f22693w != 1.0f) {
            canvas.save();
            float f16 = this.f22693w;
            canvas.scale(f16, f16, measuredWidth, measuredHeight);
            c8Var.draw(canvas);
            canvas.restore();
            return;
        }
        c8Var.draw(canvas);
    }

    public final void c(boolean z4) {
        ImageView imageView = this.G;
        if (z4) {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(pr.f30168f).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    public final void d(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, Object obj, String str, boolean z4, boolean z10) {
        boolean z11;
        int i10;
        float f10;
        String str2;
        TextView textView;
        int i11;
        String str3;
        String str4;
        this.f22689f = str;
        this.D = MessageObject.isPremiumSticker(document);
        this.I = false;
        c8 c8Var = this.f22685a;
        c8Var.setColorFilter(null);
        this.H = 0;
        this.G.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q5, false)));
        if (z10) {
            c(false);
        } else {
            a(false);
        }
        if (this.D) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false);
            fg.r1 r1Var = this.f22686b;
            r1Var.setColor(w02);
            r1Var.E = true;
            r1Var.F = false;
            r1Var.invalidate();
        }
        TextView textView2 = this.h;
        if (importingSticker != null) {
            this.d = importingSticker;
            if (importingSticker.validated) {
                ImageLocation forPath = ImageLocation.getForPath(importingSticker.path);
                SvgHelper.SvgDrawable svgRectThumb = DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.k6.f21751i5, 1.0f);
                if (importingSticker.animated) {
                    str4 = "tgs";
                } else {
                    str4 = null;
                }
                textView = textView2;
                i11 = 4;
                z11 = true;
                c8Var.setImage(forPath, "80_80", null, null, svgRectThumb, 0L, str4, 0, 1);
            } else {
                textView = textView2;
                i11 = 4;
                SvgHelper.SvgDrawable svgRectThumb2 = DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.k6.f21751i5, 1.0f);
                if (importingSticker.animated) {
                    str3 = "tgs";
                } else {
                    str3 = null;
                }
                z11 = true;
                c8Var.setImage(null, null, null, null, svgRectThumb2, 0L, str3, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i11);
            }
        } else {
            z11 = true;
            if (document != null) {
                this.f22687c = document;
                this.f22688e = obj;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                boolean z12 = this.C;
                if (z12) {
                    i10 = org.telegram.ui.ActionBar.k6.f21644c7;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.f21607a7;
                }
                if (z12) {
                    f10 = 0.2f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.ui.ActionBar.g6 g6Var = this.J;
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, i10, f10, 1.0f, g6Var);
                if (z12) {
                    str2 = "66_66_pcache_compress";
                } else {
                    str2 = "66_66";
                }
                String str5 = str2;
                if (MessageObject.isTextColorEmoji(document)) {
                    c8Var.setColorFilter(org.telegram.ui.ActionBar.k6.n0(g6Var));
                }
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (z12) {
                        this.I = true;
                    }
                    if (svgThumb != null) {
                        c8Var.setImage(ImageLocation.getForDocument(document), str5, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, svgThumb, 0L, null, this.f22688e, 1);
                    } else if (closestPhotoSizeWithSize != null) {
                        c8Var.setImage(ImageLocation.getForDocument(document), str5, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, (String) null, this.f22688e, 1);
                    } else {
                        c8Var.setImage(ImageLocation.getForDocument(document), str5, null, null, this.f22688e, 1);
                    }
                } else if (svgThumb != null) {
                    if (closestPhotoSizeWithSize != null) {
                        c8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str5, svgThumb, "webp", this.f22688e, 1);
                    } else {
                        c8Var.setImage(ImageLocation.getForDocument(document), str5, svgThumb, "webp", this.f22688e, 1);
                    }
                } else if (closestPhotoSizeWithSize != null) {
                    c8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str5, null, "webp", this.f22688e, 1);
                } else {
                    c8Var.setImage(ImageLocation.getForDocument(document), str5, null, "webp", this.f22688e, 1);
                }
                if (str != null) {
                    textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else if (z4) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= document.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            String str6 = documentAttribute.alt;
                            if (str6 != null && str6.length() > 0) {
                                textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                            }
                        } else {
                            i12++;
                        }
                    }
                    textView2.setText(Emoji.replaceEmoji(MediaDataController.getInstance(this.B).getEmojiForSticker(this.f22687c.f20851id), textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(4);
                }
            }
        }
        e(false);
        c8Var.setAlpha(this.f22690n * this.E);
        if (this.I) {
            c8Var.setInvalidateAll(z11);
            c8Var.setParentView((View) getParent());
            return;
        }
        c8Var.setParentView(this);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.I) {
            b(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z4) {
        if (this.D) {
            this.F = true;
        } else {
            this.F = false;
        }
        fg.r1 r1Var = this.f22686b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r1Var.getLayoutParams();
        int i10 = this.B;
        if (!UserConfig.getInstance(i10).isPremium()) {
            int dp = AndroidUtilities.dp(24.0f);
            layoutParams.width = dp;
            layoutParams.height = dp;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            r1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            layoutParams.width = dp2;
            layoutParams.height = dp2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            r1Var.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        }
        r1Var.setLocked(!UserConfig.getInstance(i10).isPremium());
        AndroidUtilities.updateViewVisibilityAnimated(r1Var, this.F, 0.9f, z4);
        invalidate();
    }

    public String getEmoji() {
        return this.f22689f;
    }

    public ImageReceiver getImageView() {
        return this.f22685a;
    }

    public Object getParentObject() {
        return this.f22688e;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        c8 c8Var = this.f22685a;
        if (!c8Var.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        sendAnimationData.f18055x = c8Var.getCenterX() + iArr[0];
        sendAnimationData.f18056y = c8Var.getCenterY() + iArr[1];
        sendAnimationData.width = c8Var.getImageWidth();
        sendAnimationData.height = c8Var.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f22687c;
    }

    public SendMessagesHelper.ImportingSticker getStickerPath() {
        SendMessagesHelper.ImportingSticker importingSticker = this.d;
        if (importingSticker != null && importingSticker.validated) {
            return importingSticker;
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (this.I && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.h.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z4 = this.I;
        c8 c8Var = this.f22685a;
        if (z4) {
            c8Var.setInvalidateAll(true);
            c8Var.setParentView((View) getParent());
        } else {
            c8Var.setParentView(this);
        }
        c8Var.onAttachedToWindow();
        NotificationCenter.getInstance(this.B).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22685a.onDetachedFromWindow();
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string = LocaleController.getString(R.string.AttachSticker);
        if (this.f22687c != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f22687c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.f22687c.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
                        string = android.support.v4.media.a.p(documentAttribute.alt, " ", string, new StringBuilder());
                    }
                } else {
                    i10++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(string);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z4) {
        this.f22695y = z4;
    }

    public void setScaled(boolean z4) {
        this.v = z4;
        this.f22692s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(SendMessagesHelper.ImportingSticker importingSticker) {
        boolean z4;
        String str = importingSticker.emoji;
        if (str != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        d(null, importingSticker, null, str, z4, false);
    }
}
