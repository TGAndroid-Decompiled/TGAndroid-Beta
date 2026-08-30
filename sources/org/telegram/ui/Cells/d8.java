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
import org.telegram.ui.Components.nr;
public class d8 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, bg.d {
    public static final AccelerateInterpolator K = new AccelerateInterpolator(0.5f);
    public final int B;
    public final boolean C;
    public boolean D;
    public final float E;
    public boolean F;
    public final ImageView G;
    public int H;
    public boolean I;
    public final org.telegram.ui.ActionBar.f6 J;
    public final c8 f20948a;
    public final eg.s1 f20949b;
    public TLRPC.Document f20950c;
    public SendMessagesHelper.ImportingSticker d;
    public Object e;
    public String f20951f;
    public final TextView h;
    public float f20952n;
    public boolean f20953r;
    public long f20954s;
    public boolean v;
    public float f20955w;
    public long f20956x;
    public boolean f20957y;

    public d8(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        this.f20952n = 1.0f;
        this.B = UserConfig.selectedAccount;
        this.E = 1.0f;
        this.J = f6Var;
        this.C = z4;
        c8 c8Var = new c8(this, f6Var);
        this.f20948a = c8Var;
        c8Var.setAspectFit(true);
        c8Var.setAllowLoadingOnAttachedOnly(true);
        c8Var.setLayerNum(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
        eg.s1 s1Var = new eg.s1(context, 1, null);
        this.f20949b = s1Var;
        s1Var.setImageReceiver(c8Var);
        s1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        s1Var.setImageReceiver(c8Var);
        addView(s1Var, k7.b6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.G = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20139q5, f6Var)));
        imageView.setAlpha(0.0f);
        addView(imageView, k7.b6.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z4) {
        ImageView imageView = this.G;
        if (z4) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(nr.f27346f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, View view) {
        boolean z4;
        boolean z10 = this.f20953r;
        float f10 = this.E;
        c8 c8Var = this.f20948a;
        if (z10 || (((z4 = this.v) && this.f20955w != 0.8f) || (!z4 && this.f20955w != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f20954s;
            this.f20954s = currentTimeMillis;
            if (this.f20953r) {
                long j11 = this.f20956x + j10;
                this.f20956x = j11;
                if (j11 > 1050) {
                    this.f20956x = 1050L;
                }
                float interpolation = (K.getInterpolation(((float) this.f20956x) / 150.0f) * 0.5f) + 0.5f;
                this.f20952n = interpolation;
                if (interpolation >= 1.0f) {
                    this.f20953r = false;
                    this.f20952n = 1.0f;
                }
                c8Var.setAlpha(this.f20952n * f10);
            } else {
                if (this.v) {
                    float f11 = this.f20955w;
                    if (f11 != 0.8f) {
                        float f12 = f11 - (((float) j10) / 400.0f);
                        this.f20955w = f12;
                        if (f12 < 0.8f) {
                            this.f20955w = 0.8f;
                        }
                    }
                }
                float f13 = (((float) j10) / 400.0f) + this.f20955w;
                this.f20955w = f13;
                if (f13 > 1.0f) {
                    this.f20955w = 1.0f;
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
        c8Var.setAlpha(this.f20952n * f10);
        if (this.f20955w != 1.0f) {
            canvas.save();
            float f16 = this.f20955w;
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
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(nr.f27346f).start();
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
        this.f20951f = str;
        this.D = MessageObject.isPremiumSticker(document);
        this.I = false;
        c8 c8Var = this.f20948a;
        c8Var.setColorFilter(null);
        this.H = 0;
        this.G.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20139q5, false)));
        if (z10) {
            c(false);
        } else {
            a(false);
        }
        if (this.D) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false);
            eg.s1 s1Var = this.f20949b;
            s1Var.setColor(w02);
            s1Var.E = true;
            s1Var.F = false;
            s1Var.invalidate();
        }
        TextView textView2 = this.h;
        if (importingSticker != null) {
            this.d = importingSticker;
            if (importingSticker.validated) {
                ImageLocation forPath = ImageLocation.getForPath(importingSticker.path);
                SvgHelper.SvgDrawable svgRectThumb = DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.j6.f19995i5, 1.0f);
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
                SvgHelper.SvgDrawable svgRectThumb2 = DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.j6.f19995i5, 1.0f);
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
                this.f20950c = document;
                this.e = obj;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                boolean z12 = this.C;
                if (z12) {
                    i10 = org.telegram.ui.ActionBar.j6.f19889c7;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f19852a7;
                }
                if (z12) {
                    f10 = 0.2f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.ui.ActionBar.f6 f6Var = this.J;
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, i10, f10, 1.0f, f6Var);
                if (z12) {
                    str2 = "66_66_pcache_compress";
                } else {
                    str2 = "66_66";
                }
                String str5 = str2;
                if (MessageObject.isTextColorEmoji(document)) {
                    c8Var.setColorFilter(org.telegram.ui.ActionBar.j6.n0(f6Var));
                }
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (z12) {
                        this.I = true;
                    }
                    if (svgThumb != null) {
                        c8Var.setImage(ImageLocation.getForDocument(document), str5, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, svgThumb, 0L, null, this.e, 1);
                    } else if (closestPhotoSizeWithSize != null) {
                        c8Var.setImage(ImageLocation.getForDocument(document), str5, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, (String) null, this.e, 1);
                    } else {
                        c8Var.setImage(ImageLocation.getForDocument(document), str5, null, null, this.e, 1);
                    }
                } else if (svgThumb != null) {
                    if (closestPhotoSizeWithSize != null) {
                        c8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str5, svgThumb, "webp", this.e, 1);
                    } else {
                        c8Var.setImage(ImageLocation.getForDocument(document), str5, svgThumb, "webp", this.e, 1);
                    }
                } else if (closestPhotoSizeWithSize != null) {
                    c8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str5, null, "webp", this.e, 1);
                } else {
                    c8Var.setImage(ImageLocation.getForDocument(document), str5, null, "webp", this.e, 1);
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
                    textView2.setText(Emoji.replaceEmoji(MediaDataController.getInstance(this.B).getEmojiForSticker(this.f20950c.f19190id), textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(4);
                }
            }
        }
        e(false);
        c8Var.setAlpha(this.f20952n * this.E);
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
        eg.s1 s1Var = this.f20949b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s1Var.getLayoutParams();
        int i10 = this.B;
        if (!UserConfig.getInstance(i10).isPremium()) {
            int dp = AndroidUtilities.dp(24.0f);
            layoutParams.width = dp;
            layoutParams.height = dp;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            s1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            layoutParams.width = dp2;
            layoutParams.height = dp2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            s1Var.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        }
        s1Var.setLocked(!UserConfig.getInstance(i10).isPremium());
        AndroidUtilities.updateViewVisibilityAnimated(s1Var, this.F, 0.9f, z4);
        invalidate();
    }

    public String getEmoji() {
        return this.f20951f;
    }

    public ImageReceiver getImageView() {
        return this.f20948a;
    }

    public Object getParentObject() {
        return this.e;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        c8 c8Var = this.f20948a;
        if (!c8Var.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        sendAnimationData.f16667x = c8Var.getCenterX() + iArr[0];
        sendAnimationData.f16668y = c8Var.getCenterY() + iArr[1];
        sendAnimationData.width = c8Var.getImageWidth();
        sendAnimationData.height = c8Var.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f20950c;
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
        c8 c8Var = this.f20948a;
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
        this.f20948a.onDetachedFromWindow();
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string = LocaleController.getString(R.string.AttachSticker);
        if (this.f20950c != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f20950c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.f20950c.attributes.get(i10);
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
        this.f20957y = z4;
    }

    public void setScaled(boolean z4) {
        this.v = z4;
        this.f20954s = System.currentTimeMillis();
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
