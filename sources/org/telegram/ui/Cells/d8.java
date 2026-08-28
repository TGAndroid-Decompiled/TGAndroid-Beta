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
import org.telegram.ui.Components.gr;
public class d8 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, wf.c {
    public static final AccelerateInterpolator J = new AccelerateInterpolator(0.5f);
    public final int A;
    public final boolean B;
    public boolean C;
    public final float D;
    public boolean E;
    public final ImageView F;
    public int G;
    public boolean H;
    public final org.telegram.ui.ActionBar.b6 I;
    public final c8 f24229a;
    public final zf.b1 f24230b;
    public TLRPC.Document f24231c;
    public SendMessagesHelper.ImportingSticker d;
    public Object f24232e;
    public String f24233f;
    public final TextView h;
    public float f24234n;
    public boolean f24235r;
    public long f24236s;
    public boolean v;
    public float f24237w;
    public long f24238x;
    public boolean f24239y;

    public d8(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.f24234n = 1.0f;
        this.A = UserConfig.selectedAccount;
        this.D = 1.0f;
        this.I = b6Var;
        this.B = z10;
        c8 c8Var = new c8(this, b6Var);
        this.f24229a = c8Var;
        c8Var.setAspectFit(true);
        c8Var.setAllowLoadingOnAttachedOnly(true);
        c8Var.setLayerNum(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false));
        zf.b1 b1Var = new zf.b1(context, 1, null);
        this.f24230b = b1Var;
        b1Var.setImageReceiver(c8Var);
        b1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        b1Var.setImageReceiver(c8Var);
        addView(b1Var, g7.e6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.F = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23228q5, b6Var)));
        imageView.setAlpha(0.0f);
        addView(imageView, g7.e6.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z10) {
        ImageView imageView = this.F;
        if (z10) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(gr.f28844f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, View view) {
        boolean z10;
        boolean z11 = this.f24235r;
        float f10 = this.D;
        c8 c8Var = this.f24229a;
        if (z11 || (((z10 = this.v) && this.f24237w != 0.8f) || (!z10 && this.f24237w != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f24236s;
            this.f24236s = currentTimeMillis;
            if (this.f24235r) {
                long j11 = this.f24238x + j10;
                this.f24238x = j11;
                if (j11 > 1050) {
                    this.f24238x = 1050L;
                }
                float interpolation = (J.getInterpolation(((float) this.f24238x) / 150.0f) * 0.5f) + 0.5f;
                this.f24234n = interpolation;
                if (interpolation >= 1.0f) {
                    this.f24235r = false;
                    this.f24234n = 1.0f;
                }
                c8Var.setAlpha(this.f24234n * f10);
            } else {
                if (this.v) {
                    float f11 = this.f24237w;
                    if (f11 != 0.8f) {
                        float f12 = f11 - (((float) j10) / 400.0f);
                        this.f24237w = f12;
                        if (f12 < 0.8f) {
                            this.f24237w = 0.8f;
                        }
                    }
                }
                float f13 = (((float) j10) / 400.0f) + this.f24237w;
                this.f24237w = f13;
                if (f13 > 1.0f) {
                    this.f24237w = 1.0f;
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
        c8Var.setAlpha(this.f24234n * f10);
        if (this.f24237w != 1.0f) {
            canvas.save();
            float f16 = this.f24237w;
            canvas.scale(f16, f16, measuredWidth, measuredHeight);
            c8Var.draw(canvas);
            canvas.restore();
            return;
        }
        c8Var.draw(canvas);
    }

    public final void c(boolean z10) {
        ImageView imageView = this.F;
        if (z10) {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(gr.f28844f).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    public final void d(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, Object obj, String str, boolean z10, boolean z11) {
        boolean z12;
        int i9;
        float f10;
        String str2;
        TextView textView;
        int i10;
        String str3;
        String str4;
        this.f24233f = str;
        this.C = MessageObject.isPremiumSticker(document);
        this.H = false;
        c8 c8Var = this.f24229a;
        c8Var.setColorFilter(null);
        this.G = 0;
        this.F.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23228q5, false)));
        if (z11) {
            c(false);
        } else {
            a(false);
        }
        if (this.C) {
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false);
            zf.b1 b1Var = this.f24230b;
            b1Var.setColor(w02);
            b1Var.D = true;
            b1Var.E = false;
            b1Var.invalidate();
        }
        TextView textView2 = this.h;
        if (importingSticker != null) {
            this.d = importingSticker;
            if (importingSticker.validated) {
                ImageLocation forPath = ImageLocation.getForPath(importingSticker.path);
                SvgHelper.SvgDrawable svgRectThumb = DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.f6.f23091i5, 1.0f);
                if (importingSticker.animated) {
                    str4 = "tgs";
                } else {
                    str4 = null;
                }
                textView = textView2;
                i10 = 4;
                z12 = true;
                c8Var.setImage(forPath, "80_80", null, null, svgRectThumb, 0L, str4, 0, 1);
            } else {
                textView = textView2;
                i10 = 4;
                SvgHelper.SvgDrawable svgRectThumb2 = DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.f6.f23091i5, 1.0f);
                if (importingSticker.animated) {
                    str3 = "tgs";
                } else {
                    str3 = null;
                }
                z12 = true;
                c8Var.setImage(null, null, null, null, svgRectThumb2, 0L, str3, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i10);
            }
        } else {
            z12 = true;
            if (document != null) {
                this.f24231c = document;
                this.f24232e = obj;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                boolean z13 = this.B;
                if (z13) {
                    i9 = org.telegram.ui.ActionBar.f6.f22984c7;
                } else {
                    i9 = org.telegram.ui.ActionBar.f6.f22947a7;
                }
                if (z13) {
                    f10 = 0.2f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.ui.ActionBar.b6 b6Var = this.I;
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, i9, f10, 1.0f, b6Var);
                if (z13) {
                    str2 = "66_66_pcache_compress";
                } else {
                    str2 = "66_66";
                }
                String str5 = str2;
                if (MessageObject.isTextColorEmoji(document)) {
                    c8Var.setColorFilter(org.telegram.ui.ActionBar.f6.n0(b6Var));
                }
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (z13) {
                        this.H = true;
                    }
                    if (svgThumb != null) {
                        c8Var.setImage(ImageLocation.getForDocument(document), str5, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, svgThumb, 0L, null, this.f24232e, 1);
                    } else if (closestPhotoSizeWithSize != null) {
                        c8Var.setImage(ImageLocation.getForDocument(document), str5, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, (String) null, this.f24232e, 1);
                    } else {
                        c8Var.setImage(ImageLocation.getForDocument(document), str5, null, null, this.f24232e, 1);
                    }
                } else if (svgThumb != null) {
                    if (closestPhotoSizeWithSize != null) {
                        c8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str5, svgThumb, "webp", this.f24232e, 1);
                    } else {
                        c8Var.setImage(ImageLocation.getForDocument(document), str5, svgThumb, "webp", this.f24232e, 1);
                    }
                } else if (closestPhotoSizeWithSize != null) {
                    c8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str5, null, "webp", this.f24232e, 1);
                } else {
                    c8Var.setImage(ImageLocation.getForDocument(document), str5, null, "webp", this.f24232e, 1);
                }
                if (str != null) {
                    textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else if (z10) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= document.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            String str6 = documentAttribute.alt;
                            if (str6 != null && str6.length() > 0) {
                                textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                            }
                        } else {
                            i11++;
                        }
                    }
                    textView2.setText(Emoji.replaceEmoji(MediaDataController.getInstance(this.A).getEmojiForSticker(this.f24231c.f22386id), textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(4);
                }
            }
        }
        e(false);
        c8Var.setAlpha(this.f24234n * this.D);
        if (this.H) {
            c8Var.setInvalidateAll(z12);
            c8Var.setParentView((View) getParent());
            return;
        }
        c8Var.setParentView(this);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
            e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.H) {
            b(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10) {
        if (this.C) {
            this.E = true;
        } else {
            this.E = false;
        }
        zf.b1 b1Var = this.f24230b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b1Var.getLayoutParams();
        int i9 = this.A;
        if (!UserConfig.getInstance(i9).isPremium()) {
            int dp = AndroidUtilities.dp(24.0f);
            layoutParams.width = dp;
            layoutParams.height = dp;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            b1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            layoutParams.width = dp2;
            layoutParams.height = dp2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            b1Var.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        }
        b1Var.setLocked(!UserConfig.getInstance(i9).isPremium());
        AndroidUtilities.updateViewVisibilityAnimated(b1Var, this.E, 0.9f, z10);
        invalidate();
    }

    public String getEmoji() {
        return this.f24233f;
    }

    public ImageReceiver getImageView() {
        return this.f24229a;
    }

    public Object getParentObject() {
        return this.f24232e;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        c8 c8Var = this.f24229a;
        if (!c8Var.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        sendAnimationData.f19647x = c8Var.getCenterX() + iArr[0];
        sendAnimationData.f19648y = c8Var.getCenterY() + iArr[1];
        sendAnimationData.width = c8Var.getImageWidth();
        sendAnimationData.height = c8Var.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f24231c;
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
        if (this.H && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.h.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = this.H;
        c8 c8Var = this.f24229a;
        if (z10) {
            c8Var.setInvalidateAll(true);
            c8Var.setParentView((View) getParent());
        } else {
            c8Var.setParentView(this);
        }
        c8Var.onAttachedToWindow();
        NotificationCenter.getInstance(this.A).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24229a.onDetachedFromWindow();
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string = LocaleController.getString(R.string.AttachSticker);
        if (this.f24231c != null) {
            int i9 = 0;
            while (true) {
                if (i9 >= this.f24231c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.f24231c.attributes.get(i9);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
                        string = aa.d.p(documentAttribute.alt, " ", string, new StringBuilder());
                    }
                } else {
                    i9++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(string);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z10) {
        this.f24239y = z10;
    }

    public void setScaled(boolean z10) {
        this.v = z10;
        this.f24236s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(SendMessagesHelper.ImportingSticker importingSticker) {
        boolean z10;
        String str = importingSticker.emoji;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d(null, importingSticker, null, str, z10, false);
    }
}
